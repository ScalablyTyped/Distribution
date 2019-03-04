package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationResetActionPayload extends js.Object {
  var actions: js.Array[NavigationNavigateAction]
  var index: scala.Double
  var key: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object NavigationResetActionPayload {
  @scala.inline
  def apply(actions: js.Array[NavigationNavigateAction], index: scala.Double, key: java.lang.String = null): NavigationResetActionPayload = {
    val __obj = js.Dynamic.literal(actions = actions, index = index)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[NavigationResetActionPayload]
  }
}

