package typings.relayRuntime

import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayObservableMod.RelayObservable
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSource extends js.Object {
  var operation: OperationDescriptor
  var source: RelayObservable[GraphQLResponse]
}

object AnonSource {
  @scala.inline
  def apply(operation: OperationDescriptor, source: RelayObservable[GraphQLResponse]): AnonSource = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSource]
  }
}

