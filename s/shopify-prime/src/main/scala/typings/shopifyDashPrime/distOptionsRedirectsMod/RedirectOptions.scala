package typings.shopifyDashPrime.distOptionsRedirectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectOptions extends js.Object {
  /**
    * Filter Redirects with given path
    */
  var path: String
  /**
    * Filter Redirects with given target
    */
  var target: String
}

object RedirectOptions {
  @scala.inline
  def apply(path: String, target: String): RedirectOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RedirectOptions]
  }
}

