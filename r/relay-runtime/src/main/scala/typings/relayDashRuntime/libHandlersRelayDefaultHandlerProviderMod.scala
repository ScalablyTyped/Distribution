package typings.relayDashRuntime

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/handlers/RelayDefaultHandlerProvider", JSImport.Namespace)
@js.native
object libHandlersRelayDefaultHandlerProviderMod extends js.Object {
  def RelayDefaultHandlerProvider(handle: String): Handler = js.native
  type HandlerProvider = js.Function1[/* handle */ String, js.Any]
}

