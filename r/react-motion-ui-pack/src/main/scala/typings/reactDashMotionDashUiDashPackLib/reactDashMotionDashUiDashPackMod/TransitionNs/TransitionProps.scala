package typings
package reactDashMotionDashUiDashPackLib.reactDashMotionDashUiDashPackMod.TransitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionProps extends js.Object {
  var appear: js.UndefOr[reactDashMotionLib.reactDashMotionMod.Style] = js.undefined
  var component: js.UndefOr[java.lang.String | scala.Boolean | reactLib.reactMod.ReactElement] = js.undefined
  var enter: js.UndefOr[reactDashMotionLib.reactDashMotionMod.Style] = js.undefined
  var leave: js.UndefOr[reactDashMotionLib.reactDashMotionMod.Style] = js.undefined
  var onEnter: js.UndefOr[
    js.Function1[/* style */ reactDashMotionLib.reactDashMotionMod.PlainStyle, scala.Unit]
  ] = js.undefined
  var onLeave: js.UndefOr[
    js.Function1[/* style */ reactDashMotionLib.reactDashMotionMod.Style, scala.Unit]
  ] = js.undefined
  var runOnMount: js.UndefOr[scala.Boolean] = js.undefined
}

object TransitionProps {
  @scala.inline
  def apply(
    appear: reactDashMotionLib.reactDashMotionMod.Style = null,
    component: java.lang.String | scala.Boolean | reactLib.reactMod.ReactElement = null,
    enter: reactDashMotionLib.reactDashMotionMod.Style = null,
    leave: reactDashMotionLib.reactDashMotionMod.Style = null,
    onEnter: /* style */ reactDashMotionLib.reactDashMotionMod.PlainStyle => scala.Unit = null,
    onLeave: /* style */ reactDashMotionLib.reactDashMotionMod.Style => scala.Unit = null,
    runOnMount: js.UndefOr[scala.Boolean] = js.undefined
  ): TransitionProps = {
    val __obj = js.Dynamic.literal()
    if (appear != null) __obj.updateDynamic("appear")(appear)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (enter != null) __obj.updateDynamic("enter")(enter)
    if (leave != null) __obj.updateDynamic("leave")(leave)
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction1(onLeave))
    if (!js.isUndefined(runOnMount)) __obj.updateDynamic("runOnMount")(runOnMount)
    __obj.asInstanceOf[TransitionProps]
  }
}

