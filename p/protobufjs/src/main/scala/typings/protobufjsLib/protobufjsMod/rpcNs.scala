package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "rpc")
@js.native
object rpcNs extends js.Object {
  /** An RPC service as returned by {@link Service#create}. */
  @js.native
  class Service protected ()
    extends protobufjsLib.protobufjsMod.utilNs.EventEmitter {
    /**
             * Constructs a new RPC service instance.
             * @param rpcImpl RPC implementation
             * @param [requestDelimited=false] Whether requests are length-delimited
             * @param [responseDelimited=false] Whether responses are length-delimited
             */
    def this(rpcImpl: protobufjsLib.RPCImpl) = this()
    /**
             * Constructs a new RPC service instance.
             * @param rpcImpl RPC implementation
             * @param [requestDelimited=false] Whether requests are length-delimited
             * @param [responseDelimited=false] Whether responses are length-delimited
             */
    def this(rpcImpl: protobufjsLib.RPCImpl, requestDelimited: scala.Boolean) = this()
    /**
             * Constructs a new RPC service instance.
             * @param rpcImpl RPC implementation
             * @param [requestDelimited=false] Whether requests are length-delimited
             * @param [responseDelimited=false] Whether responses are length-delimited
             */
    def this(rpcImpl: protobufjsLib.RPCImpl, requestDelimited: scala.Boolean, responseDelimited: scala.Boolean) = this()
    /** Whether requests are length-delimited. */
    var requestDelimited: scala.Boolean = js.native
    /** Whether responses are length-delimited. */
    var responseDelimited: scala.Boolean = js.native
    /** RPC implementation. Becomes `null` once the service is ended. */
    var rpcImpl: protobufjsLib.RPCImpl | scala.Null = js.native
    /**
             * Ends this service and emits the `end` event.
             * @param [endedByRPC=false] Whether the service has been ended by the RPC implementation.
             * @returns `this`
             */
    def end(): Service = js.native
    /**
             * Ends this service and emits the `end` event.
             * @param [endedByRPC=false] Whether the service has been ended by the RPC implementation.
             * @returns `this`
             */
    def end(endedByRPC: scala.Boolean): Service = js.native
    /**
             * Calls a service method through {@link rpc.Service#rpcImpl|rpcImpl}.
             * @param method Reflected or static method
             * @param requestCtor Request constructor
             * @param responseCtor Response constructor
             * @param request Request message or plain object
             * @param callback Service callback
             */
    def rpcCall[TReq /* <: protobufjsLib.protobufjsMod.Message[TReq] */, TRes /* <: protobufjsLib.protobufjsMod.Message[TRes] */](
      method: protobufjsLib.protobufjsMod.Method,
      requestCtor: protobufjsLib.protobufjsMod.Constructor[TReq],
      responseCtor: protobufjsLib.protobufjsMod.Constructor[TRes],
      request: TReq,
      callback: ServiceMethodCallback[TRes]
    ): scala.Unit = js.native
    /**
             * Calls a service method through {@link rpc.Service#rpcImpl|rpcImpl}.
             * @param method Reflected or static method
             * @param requestCtor Request constructor
             * @param responseCtor Response constructor
             * @param request Request message or plain object
             * @param callback Service callback
             */
    def rpcCall[TReq /* <: protobufjsLib.protobufjsMod.Message[TReq] */, TRes /* <: protobufjsLib.protobufjsMod.Message[TRes] */](
      method: protobufjsLib.protobufjsMod.Method,
      requestCtor: protobufjsLib.protobufjsMod.Constructor[TReq],
      responseCtor: protobufjsLib.protobufjsMod.Constructor[TRes],
      request: protobufjsLib.Properties[TReq],
      callback: ServiceMethodCallback[TRes]
    ): scala.Unit = js.native
    /**
             * Calls a service method through {@link rpc.Service#rpcImpl|rpcImpl}.
             * @param method Reflected or static method
             * @param requestCtor Request constructor
             * @param responseCtor Response constructor
             * @param request Request message or plain object
             * @param callback Service callback
             */
    def rpcCall[TReq /* <: protobufjsLib.protobufjsMod.Message[TReq] */, TRes /* <: protobufjsLib.protobufjsMod.Message[TRes] */](
      method: ServiceMethod[TReq, TRes],
      requestCtor: protobufjsLib.protobufjsMod.Constructor[TReq],
      responseCtor: protobufjsLib.protobufjsMod.Constructor[TRes],
      request: TReq,
      callback: ServiceMethodCallback[TRes]
    ): scala.Unit = js.native
    /**
             * Calls a service method through {@link rpc.Service#rpcImpl|rpcImpl}.
             * @param method Reflected or static method
             * @param requestCtor Request constructor
             * @param responseCtor Response constructor
             * @param request Request message or plain object
             * @param callback Service callback
             */
    def rpcCall[TReq /* <: protobufjsLib.protobufjsMod.Message[TReq] */, TRes /* <: protobufjsLib.protobufjsMod.Message[TRes] */](
      method: ServiceMethod[TReq, TRes],
      requestCtor: protobufjsLib.protobufjsMod.Constructor[TReq],
      responseCtor: protobufjsLib.protobufjsMod.Constructor[TRes],
      request: protobufjsLib.Properties[TReq],
      callback: ServiceMethodCallback[TRes]
    ): scala.Unit = js.native
  }
  
  /**
       * A service method part of a {@link rpc.Service} as created by {@link Service.create}.
       * @param request Request message or plain object
       * @param [callback] Node-style callback called with the error, if any, and the response message
       * @returns Promise if `callback` has been omitted, otherwise `undefined`
       */
  type ServiceMethod[TReq /* <: protobufjsLib.protobufjsMod.Message[TReq] */, TRes /* <: protobufjsLib.protobufjsMod.Message[TRes] */] = js.Function2[
    /* request */ TReq | protobufjsLib.Properties[TReq], 
    /* callback */ js.UndefOr[ServiceMethodCallback[TRes]], 
    js.Promise[protobufjsLib.protobufjsMod.Message[TRes]]
  ]
  /**
       * A service method callback as used by {@link rpc.ServiceMethod|ServiceMethod}.
       *
       * Differs from {@link RPCImplCallback} in that it is an actual callback of a service method which may not return `response = null`.
       * @param error Error, if any
       * @param [response] Response message
       */
  type ServiceMethodCallback[TRes /* <: protobufjsLib.protobufjsMod.Message[TRes] */] = js.Function2[/* error */ nodeLib.Error | scala.Null, /* response */ js.UndefOr[TRes], scala.Unit]
}

