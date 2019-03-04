package typings
package reactDashAddonsDashCssDashTransitionDashGroupLib.reactDashAddonsDashCssDashTransitionDashGroupMod.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSTransitionGroupTransitionName extends js.Object {
  var appear: js.UndefOr[java.lang.String] = js.undefined
  var appearActive: js.UndefOr[java.lang.String] = js.undefined
  var enter: java.lang.String
  var enterActive: js.UndefOr[java.lang.String] = js.undefined
  var leave: java.lang.String
  var leaveActive: js.UndefOr[java.lang.String] = js.undefined
}

object CSSTransitionGroupTransitionName {
  @scala.inline
  def apply(
    enter: java.lang.String,
    leave: java.lang.String,
    appear: java.lang.String = null,
    appearActive: java.lang.String = null,
    enterActive: java.lang.String = null,
    leaveActive: java.lang.String = null
  ): CSSTransitionGroupTransitionName = {
    val __obj = js.Dynamic.literal(enter = enter, leave = leave)
    if (appear != null) __obj.updateDynamic("appear")(appear)
    if (appearActive != null) __obj.updateDynamic("appearActive")(appearActive)
    if (enterActive != null) __obj.updateDynamic("enterActive")(enterActive)
    if (leaveActive != null) __obj.updateDynamic("leaveActive")(leaveActive)
    __obj.asInstanceOf[CSSTransitionGroupTransitionName]
  }
}

