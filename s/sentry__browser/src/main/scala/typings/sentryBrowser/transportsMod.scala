package typings.sentryBrowser

import typings.sentryTypes.transportMod.TransportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/browser/dist/transports", JSImport.Namespace)
@js.native
object transportsMod extends js.Object {
  
  @js.native
  abstract class BaseTransport protected ()
    extends typings.sentryBrowser.baseMod.BaseTransport {
    def this(options: TransportOptions) = this()
  }
  
  @js.native
  class FetchTransport ()
    extends typings.sentryBrowser.fetchMod.FetchTransport
  
  @js.native
  class XHRTransport ()
    extends typings.sentryBrowser.xhrMod.XHRTransport
}
