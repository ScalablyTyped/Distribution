package typings
package reduxDashFirstDashRouterDashLinkLib.reduxDashFirstDashRouterDashLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match[P] extends js.Object {
  var isExact: scala.Boolean
  var params: P
  var path: java.lang.String
  var url: java.lang.String
}

object Match {
  @scala.inline
  def apply[P](isExact: scala.Boolean, params: P, path: java.lang.String, url: java.lang.String): Match[P] = {
    val __obj = js.Dynamic.literal(isExact = isExact, params = params.asInstanceOf[js.Any], path = path, url = url)
  
    __obj.asInstanceOf[Match[P]]
  }
}

