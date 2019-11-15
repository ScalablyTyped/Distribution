package typings.atReactDashNavigationCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyParams extends js.Object {
  var key: String
  var params: js.UndefOr[js.Object] = js.undefined
  var preserveFocus: Boolean
  var routeName: String
  var `type`: String
}

object Anon_KeyParams {
  @scala.inline
  def apply(key: String, preserveFocus: Boolean, routeName: String, `type`: String, params: js.Object = null): Anon_KeyParams = {
    val __obj = js.Dynamic.literal(key = key, preserveFocus = preserveFocus, routeName = routeName)
    __obj.updateDynamic("type")(`type`)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_KeyParams]
  }
}

