package typings.sentryBrowser

import typings.sentryBrowser.typesTransportsTypesMod.BrowserTransportOptions
import typings.sentryBrowser.typesTransportsUtilsMod.FetchImpl
import typings.sentryTypes.typesTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransportsFetchMod {
  
  @JSImport("@sentry/browser/types/transports/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeFetchTransport(options: BrowserTransportOptions): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFetchTransport")(options.asInstanceOf[js.Any]).asInstanceOf[Transport]
  inline def makeFetchTransport(options: BrowserTransportOptions, nativeFetch: FetchImpl): Transport = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFetchTransport")(options.asInstanceOf[js.Any], nativeFetch.asInstanceOf[js.Any])).asInstanceOf[Transport]
}
