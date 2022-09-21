package typings.sentryBrowser

import typings.sentryBrowser.typesMod.BrowserTransportOptions
import typings.sentryBrowser.utilsMod.FetchImpl
import typings.sentryTypes.transportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportsMod {
  
  @JSImport("@sentry/browser/types/transports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeFetchTransport(options: BrowserTransportOptions): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFetchTransport")(options.asInstanceOf[js.Any]).asInstanceOf[Transport]
  inline def makeFetchTransport(options: BrowserTransportOptions, nativeFetch: FetchImpl): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFetchTransport")(options.asInstanceOf[js.Any], nativeFetch.asInstanceOf[js.Any])).asInstanceOf[Transport]
  
  inline def makeXHRTransport(options: BrowserTransportOptions): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("makeXHRTransport")(options.asInstanceOf[js.Any]).asInstanceOf[Transport]
}
