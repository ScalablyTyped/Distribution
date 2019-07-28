package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.sharedAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareSharedAction extends ShareAction {
  var action: sharedAction
  var activityType: js.UndefOr[String] = js.undefined
}

object ShareSharedAction {
  @scala.inline
  def apply(action: sharedAction, activityType: String = null): ShareSharedAction = {
    val __obj = js.Dynamic.literal(action = action)
    if (activityType != null) __obj.updateDynamic("activityType")(activityType)
    __obj.asInstanceOf[ShareSharedAction]
  }
}

