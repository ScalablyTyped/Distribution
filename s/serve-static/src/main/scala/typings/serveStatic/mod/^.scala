package typings.serveStatic.mod

import typings.expressServeStaticCore.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

