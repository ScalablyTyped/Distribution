package typings.relayRuntime

import typings.relayRuntime.relayStoreTypesMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/handlers/RelayDefaultHandlerProvider", JSImport.Namespace)
@js.native
object relayDefaultHandlerProviderMod extends js.Object {
  def RelayDefaultHandlerProvider(handle: String): Handler = js.native
  type HandlerProvider = js.Function1[/* handle */ String, js.Any]
}

