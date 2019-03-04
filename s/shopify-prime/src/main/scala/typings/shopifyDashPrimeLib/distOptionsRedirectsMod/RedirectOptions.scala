package typings
package shopifyDashPrimeLib.distOptionsRedirectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectOptions extends js.Object {
  /**
    * Filter Redirects with given path
    */
  var path: java.lang.String
  /**
    * Filter Redirects with given target
    */
  var target: java.lang.String
}

object RedirectOptions {
  @scala.inline
  def apply(path: java.lang.String, target: java.lang.String): RedirectOptions = {
    val __obj = js.Dynamic.literal(path = path, target = target)
  
    __obj.asInstanceOf[RedirectOptions]
  }
}

