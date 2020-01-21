package typings.relayRuntime.mod

import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "createOperationDescriptor")
@js.native
object createOperationDescriptor extends js.Object {
  def apply(request: ConcreteRequest, variables: Variables): OperationDescriptor = js.native
}

