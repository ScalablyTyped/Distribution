package typings
package reactDashDevDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dev-utils/noopServiceWorkerMiddleware", JSImport.Namespace)
@js.native
object noopServiceWorkerMiddlewareMod extends js.Object {
  /**
    * Returns Express middleware that serves a `/service-worker.js` that resets
    * any previously set service worker configuration. Useful for development.
    */
  def apply(): expressLib.expressMod.eNs.Handler = js.native
}

