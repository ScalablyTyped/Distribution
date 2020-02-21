package typings.reactDevUtils

import typings.express.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dev-utils/redirectServedPathMiddleware", JSImport.Namespace)
@js.native
object redirectServedPathMiddlewareMod extends js.Object {
  /**
    * Returns Express middleware that redirects to `${servedPath}/${req.url}`
    * if path does not start with `servedPath`
    * Useful for development.
    */
  def apply(servedPath: String): Handler = js.native
}

