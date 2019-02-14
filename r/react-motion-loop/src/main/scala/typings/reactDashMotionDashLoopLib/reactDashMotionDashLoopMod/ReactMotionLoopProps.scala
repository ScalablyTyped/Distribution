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
      reactLib.reactMod.ReactNs.ReactElement
    ]
  ] = js.undefined
  var styleFrom: reactDashMotionLib.reactDashMotionMod.Style
  var styleTo: reactDashMotionLib.reactDashMotionMod.Style
}

