package typings.relayRuntime.mod

import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "createRequestDescriptor")
@js.native
object createRequestDescriptor extends js.Object {
  def apply(request: ConcreteRequest, variables: Variables): RequestDescriptor = js.native
}

