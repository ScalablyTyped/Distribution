package typings.rcTrigger.legacyUtilMod

import typings.rcTrigger.interfaceMod.AnimationType
import typings.rcTrigger.interfaceMod.MotionType
import typings.rcTrigger.interfaceMod.TransitionNameType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMotionProps extends js.Object {
  var animation: AnimationType = js.native
  var motion: MotionType = js.native
  var prefixCls: String = js.native
  var transitionName: TransitionNameType = js.native
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
  @scala.inline
  implicit class GetMotionPropsOps[Self <: GetMotionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimation(value: AnimationType): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMotion(value: MotionType): Self = this.set("motion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionName(value: TransitionNameType): Self = this.set("transitionName", value.asInstanceOf[js.Any])
  }
  
}

