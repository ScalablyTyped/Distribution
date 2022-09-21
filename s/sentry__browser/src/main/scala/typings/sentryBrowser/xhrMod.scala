package typings.sentryBrowser

import typings.sentryBrowser.typesMod.BrowserTransportOptions
import typings.sentryTypes.transportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xhrMod {
  
  @JSImport("@sentry/browser/types/transports/xhr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeXHRTransport(options: BrowserTransportOptions): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("makeXHRTransport")(options.asInstanceOf[js.Any]).asInstanceOf[Transport]
}
