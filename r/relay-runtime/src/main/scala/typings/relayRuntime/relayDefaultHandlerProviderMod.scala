package typings.relayRuntime

import typings.relayRuntime.relayStoreTypesMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayDefaultHandlerProviderMod {
  
  @JSImport("relay-runtime/lib/handlers/RelayDefaultHandlerProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RelayDefaultHandlerProvider(handle: String): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("RelayDefaultHandlerProvider")(handle.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  type HandlerProvider = js.Function1[/* handle */ String, js.Any]
}
