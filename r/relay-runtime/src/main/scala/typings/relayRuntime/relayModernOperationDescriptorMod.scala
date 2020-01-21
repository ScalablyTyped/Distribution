package typings.relayRuntime

import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", JSImport.Namespace)
@js.native
object relayModernOperationDescriptorMod extends js.Object {
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables): OperationDescriptor = js.native
  def createRequestDescriptor(request: ConcreteRequest, variables: Variables): RequestDescriptor = js.native
}

