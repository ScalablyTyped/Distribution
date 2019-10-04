package typings.relayDashRuntime

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", JSImport.Namespace)
@js.native
object libStoreRelayModernOperationDescriptorMod extends js.Object {
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables): OperationDescriptor = js.native
  def createRequestDescriptor(request: ConcreteRequest, variables: Variables): RequestDescriptor = js.native
}

