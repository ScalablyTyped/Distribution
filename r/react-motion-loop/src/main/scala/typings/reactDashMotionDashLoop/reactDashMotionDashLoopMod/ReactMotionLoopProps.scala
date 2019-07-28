package typings.reactDashMotionDashLoop.reactDashMotionDashLoopMod

import typings.react.reactMod.ReactElement
import typings.reactDashMotion.reactDashMotionMod.PlainStyle
import typings.reactDashMotion.reactDashMotionMod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-motion.react-motion.MotionProps ]:? react-motion.react-motion.MotionProps[P]} */ trait ReactMotionLoopProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* interpolatedStyle */ PlainStyle, ReactElement]] = js.undefined
  var styleFrom: Style
  var styleTo: Style
}

object ReactMotionLoopProps {
  @scala.inline
  def apply(
    styleFrom: Style,
    styleTo: Style,
    children: /* interpolatedStyle */ PlainStyle => ReactElement = null
  ): ReactMotionLoopProps = {
    val __obj = js.Dynamic.literal(styleFrom = styleFrom, styleTo = styleTo)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    __obj.asInstanceOf[ReactMotionLoopProps]
  }
}

