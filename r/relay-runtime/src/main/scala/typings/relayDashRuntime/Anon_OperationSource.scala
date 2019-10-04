package typings.relayDashRuntime

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typings.relayDashRuntime.libNetworkRelayObservableMod.RelayObservable
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OperationSource extends js.Object {
  var operation: OperationDescriptor
  var source: RelayObservable[GraphQLResponse]
}

object Anon_OperationSource {
  @scala.inline
  def apply(operation: OperationDescriptor, source: RelayObservable[GraphQLResponse]): Anon_OperationSource = {
    val __obj = js.Dynamic.literal(operation = operation, source = source)
  
    __obj.asInstanceOf[Anon_OperationSource]
  }
}

