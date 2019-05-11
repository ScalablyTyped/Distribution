package typings
package protobufjsLib.minimalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "rpc")
@js.native
object rpcNs extends js.Object {
  /** An RPC service as returned by {@link Service#create}. */
  @js.native
  class Service protected ()
    extends protobufjsLib.protobufjsMod.rpcNs.Service {
    /**
      * Constructs a new RPC service instance.
      * @param rpcImpl RPC implementation
      * @param [requestDelimited=false] Whether requests are length-delimited
      * @param [responseDelimited=false] Whether responses are length-delimited
      */
    def this(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl) = this()
    def this(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl, requestDelimited: scala.Boolean) = this()
    def this(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl, requestDelimited: scala.Boolean, responseDelimited: scala.Boolean) = this()
  }
  
}

