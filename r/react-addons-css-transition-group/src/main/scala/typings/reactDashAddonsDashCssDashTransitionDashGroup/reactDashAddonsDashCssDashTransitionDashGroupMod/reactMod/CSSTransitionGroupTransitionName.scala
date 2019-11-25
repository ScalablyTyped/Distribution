package typings.reactDashAddonsDashCssDashTransitionDashGroup.reactDashAddonsDashCssDashTransitionDashGroupMod.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSTransitionGroupTransitionName extends js.Object {
  var appear: js.UndefOr[String] = js.undefined
  var appearActive: js.UndefOr[String] = js.undefined
  var enter: String
  var enterActive: js.UndefOr[String] = js.undefined
  var leave: String
  var leaveActive: js.UndefOr[String] = js.undefined
}

object CSSTransitionGroupTransitionName {
  @scala.inline
  def apply(
    enter: String,
    leave: String,
    appear: String = null,
    appearActive: String = null,
    enterActive: String = null,
    leaveActive: String = null
  ): CSSTransitionGroupTransitionName = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], leave = leave.asInstanceOf[js.Any])
    if (appear != null) __obj.updateDynamic("appear")(appear.asInstanceOf[js.Any])
    if (appearActive != null) __obj.updateDynamic("appearActive")(appearActive.asInstanceOf[js.Any])
    if (enterActive != null) __obj.updateDynamic("enterActive")(enterActive.asInstanceOf[js.Any])
    if (leaveActive != null) __obj.updateDynamic("leaveActive")(leaveActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTransitionGroupTransitionName]
  }
}

