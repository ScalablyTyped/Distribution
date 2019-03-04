package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareSharedAction extends ShareAction {
  var action: reactDashNativeLib.reactDashNativeLibStrings.sharedAction
  var activityType: js.UndefOr[java.lang.String] = js.undefined
}

object ShareSharedAction {
  @scala.inline
  def apply(
    action: reactDashNativeLib.reactDashNativeLibStrings.sharedAction,
    activityType: java.lang.String = null
  ): ShareSharedAction = {
    val __obj = js.Dynamic.literal(action = action)
    if (activityType != null) __obj.updateDynamic("activityType")(activityType)
    __obj.asInstanceOf[ShareSharedAction]
  }
}

