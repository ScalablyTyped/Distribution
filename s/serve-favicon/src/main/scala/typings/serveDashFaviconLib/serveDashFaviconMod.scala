package typings
package serveDashFaviconLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serve-favicon", JSImport.Namespace)
@js.native
object serveDashFaviconMod extends js.Object {
  /**
    * Node.js middleware for serving a favicon.
    */
  def apply(path: java.lang.String): expressLib.expressMod.RequestHandler = js.native
  def apply(path: java.lang.String, options: serveDashFaviconLib.Anon_MaxAge): expressLib.expressMod.RequestHandler = js.native
}

