package typings.reactDashMotionDashUiDashPack.reactDashMotionDashUiDashPackMod.TransitionNs

import typings.react.reactMod.ReactElement
import typings.reactDashMotion.reactDashMotionMod.PlainStyle
import typings.reactDashMotion.reactDashMotionMod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionProps extends js.Object {
  var appear: js.UndefOr[Style] = js.undefined
  var component: js.UndefOr[String | Boolean | ReactElement] = js.undefined
  var enter: js.UndefOr[Style] = js.undefined
  var leave: js.UndefOr[Style] = js.undefined
  var onEnter: js.UndefOr[js.Function1[/* style */ PlainStyle, Unit]] = js.undefined
  var onLeave: js.UndefOr[js.Function1[/* style */ Style, Unit]] = js.undefined
  var runOnMount: js.UndefOr[Boolean] = js.undefined
}

object TransitionProps {
  @scala.inline
  def apply(
    appear: Style = null,
    component: String | Boolean | ReactElement = null,
    enter: Style = null,
    leave: Style = null,
    onEnter: /* style */ PlainStyle => Unit = null,
    onLeave: /* style */ Style => Unit = null,
    runOnMount: js.UndefOr[Boolean] = js.undefined
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

