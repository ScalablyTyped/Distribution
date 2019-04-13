package typings
package reactDashMotionDashLoopLib.reactDashMotionDashLoopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-motion.react-motion.MotionProps ]:? react-motion.react-motion.MotionProps[P]} */ trait ReactMotionLoopProps extends js.Object {
  var children: js.UndefOr[
    js.Function1[
      /* interpolatedStyle */ reactDashMotionLib.reactDashMotionMod.PlainStyle, 
      reactLib.reactMod.ReactElement[_]
    ]
  ] = js.undefined
  var styleFrom: reactDashMotionLib.reactDashMotionMod.Style
  var styleTo: reactDashMotionLib.reactDashMotionMod.Style
}

object ReactMotionLoopProps {
  @scala.inline
  def apply(
    styleFrom: reactDashMotionLib.reactDashMotionMod.Style,
    styleTo: reactDashMotionLib.reactDashMotionMod.Style,
    children: /* interpolatedStyle */ reactDashMotionLib.reactDashMotionMod.PlainStyle => reactLib.reactMod.ReactElement[_] = null
  ): ReactMotionLoopProps = {
    val __obj = js.Dynamic.literal(styleFrom = styleFrom, styleTo = styleTo)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    __obj.asInstanceOf[ReactMotionLoopProps]
  }
}

