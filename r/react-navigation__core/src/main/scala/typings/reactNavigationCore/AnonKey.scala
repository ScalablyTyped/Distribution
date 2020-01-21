package typings.reactNavigationCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: String
  var params: js.UndefOr[js.Object] = js.undefined
  var routeName: String
}

object AnonKey {
  @scala.inline
  def apply(key: String, routeName: String, params: js.Object = null): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

