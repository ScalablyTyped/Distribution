package typings
package reactDashRouterDashReduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsExact extends js.Object {
  var isExact: scala.Boolean
  var params: js.Any
  var path: java.lang.String
  var url: java.lang.String
}

object Anon_IsExact {
  @scala.inline
  def apply(isExact: scala.Boolean, params: js.Any, path: java.lang.String, url: java.lang.String): Anon_IsExact = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isExact")(isExact)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_IsExact]
  }
}

