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
    val __obj = js.Dynamic.literal(enter = enter, leave = leave)
    if (appear != null) __obj.updateDynamic("appear")(appear)
    if (appearActive != null) __obj.updateDynamic("appearActive")(appearActive)
    if (enterActive != null) __obj.updateDynamic("enterActive")(enterActive)
    if (leaveActive != null) __obj.updateDynamic("leaveActive")(leaveActive)
    __obj.asInstanceOf[CSSTransitionGroupTransitionName]
  }
}

