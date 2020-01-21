package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.sharedAction
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
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (activityType != null) __obj.updateDynamic("activityType")(activityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareSharedAction]
  }
}

