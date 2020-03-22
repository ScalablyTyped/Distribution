package typings.rcTrigger.legacyUtilMod

import typings.rcTrigger.interfaceMod.AnimationType
import typings.rcTrigger.interfaceMod.MotionType
import typings.rcTrigger.interfaceMod.TransitionNameType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMotionProps extends js.Object {
  var animation: AnimationType
  var motion: MotionType
  var prefixCls: String
  var transitionName: TransitionNameType
}

object GetMotionProps {
  @scala.inline
  def apply(
    animation: AnimationType,
    motion: MotionType,
    prefixCls: String,
    transitionName: TransitionNameType
  ): GetMotionProps = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMotionProps]
  }
}

