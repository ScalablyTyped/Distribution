package typings.relayRuntime

import typings.relayRuntime.relayStoreTypesMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayDefaultHandlerProviderMod {
  
  @JSImport("relay-runtime/lib/handlers/RelayDefaultHandlerProvider", "RelayDefaultHandlerProvider")
  @js.native
  def RelayDefaultHandlerProvider(handle: String): Handler = js.native
  
  type HandlerProvider = js.Function1[/* handle */ String, js.Any]
}
