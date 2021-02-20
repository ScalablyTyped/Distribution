package typings.sentryBrowser

import typings.sentryTypes.transportMod.TransportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportsMod {
  
  @JSImport("@sentry/browser/dist/transports", "BaseTransport")
  @js.native
  abstract class BaseTransport protected ()
    extends typings.sentryBrowser.baseMod.BaseTransport {
    def this(options: TransportOptions) = this()
  }
  
  @JSImport("@sentry/browser/dist/transports", "FetchTransport")
  @js.native
  class FetchTransport protected ()
    extends typings.sentryBrowser.fetchMod.FetchTransport {
    def this(options: TransportOptions) = this()
  }
  
  @JSImport("@sentry/browser/dist/transports", "XHRTransport")
  @js.native
  class XHRTransport protected ()
    extends typings.sentryBrowser.xhrMod.XHRTransport {
    def this(options: TransportOptions) = this()
  }
}
