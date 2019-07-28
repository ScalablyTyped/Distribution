package typings.serveDashStatic.serveDashStaticMod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serve-static", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Create a new middleware function to serve files from within a given root directory.
    * The file to serve will be determined by combining req.url with the provided root directory.
    * When a file is not found, instead of sending a 404 response, this module will instead call next() to move on to the next middleware, allowing for stacking and fall-backs.
    */
  def apply(root: String): Handler = js.native
  def apply(root: String, options: ServeStaticOptions): Handler = js.native
  def serveStatic(root: String): Handler = js.native
  def serveStatic(root: String, options: ServeStaticOptions): Handler = js.native
}

