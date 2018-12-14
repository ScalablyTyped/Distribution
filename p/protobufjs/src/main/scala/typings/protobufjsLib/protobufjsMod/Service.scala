package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "Service")
@js.native
class Service protected () extends NamespaceBase {
  /**
       * Constructs a new service instance.
       * @param name Service name
       * @param [options] Service options
       * @throws {TypeError} If arguments are invalid
       */
  def this(name: java.lang.String) = this()
  /**
       * Constructs a new service instance.
       * @param name Service name
       * @param [options] Service options
       * @throws {TypeError} If arguments are invalid
       */
  def this(name: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  /** Service methods. */
  var methods: org.scalablytyped.runtime.StringDictionary[Method] = js.native
  /** Methods of this service as an array for iteration. */
  val methodsArray: js.Array[Method] = js.native
  /**
       * Creates a runtime service using the specified rpc implementation.
       * @param rpcImpl RPC implementation
       * @param [requestDelimited=false] Whether requests are length-delimited
       * @param [responseDelimited=false] Whether responses are length-delimited
       * @returns RPC service. Useful where requests and/or responses are streamed.
       */
  def create(rpcImpl: protobufjsLib.RPCImpl): protobufjsLib.protobufjsMod.rpcNs.Service = js.native
  /**
       * Creates a runtime service using the specified rpc implementation.
       * @param rpcImpl RPC implementation
       * @param [requestDelimited=false] Whether requests are length-delimited
       * @param [responseDelimited=false] Whether responses are length-delimited
       * @returns RPC service. Useful where requests and/or responses are streamed.
       */
  def create(rpcImpl: protobufjsLib.RPCImpl, requestDelimited: scala.Boolean): protobufjsLib.protobufjsMod.rpcNs.Service = js.native
  /**
       * Creates a runtime service using the specified rpc implementation.
       * @param rpcImpl RPC implementation
       * @param [requestDelimited=false] Whether requests are length-delimited
       * @param [responseDelimited=false] Whether responses are length-delimited
       * @returns RPC service. Useful where requests and/or responses are streamed.
       */
  def create(rpcImpl: protobufjsLib.RPCImpl, requestDelimited: scala.Boolean, responseDelimited: scala.Boolean): protobufjsLib.protobufjsMod.rpcNs.Service = js.native
}

@JSImport("protobufjs", "Service")
@js.native
object Service extends js.Object {
  /**
       * Constructs a service from a service descriptor.
       * @param name Service name
       * @param json Service descriptor
       * @returns Created service
       * @throws {TypeError} If arguments are invalid
       */
  def fromJSON(name: java.lang.String, json: protobufjsLib.protobufjsMod.IService): protobufjsLib.protobufjsMod.Service = js.native
}

