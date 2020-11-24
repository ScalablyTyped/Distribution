package typings.rcTrigger.mobilePopupInnerMod

import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.rcTrigger.interfaceMod.AnimationType
import typings.rcTrigger.interfaceMod.MobileConfig
import typings.rcTrigger.interfaceMod.TransitionNameType
import typings.rcTrigger.popupInnerMod.PopupInnerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobilePopupInnerProps extends PopupInnerProps {
  
  var mobile: js.UndefOr[MobileConfig] = js.native
}
object MobilePopupInnerProps {
  
  @scala.inline
  def apply(
    animation: AnimationType,
    motion: CSSMotionProps,
    prefixCls: String,
    transitionName: TransitionNameType
  ): MobilePopupInnerProps = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobilePopupInnerProps]
  }
  
  @scala.inline
  implicit class MobilePopupInnerPropsOps[Self <: MobilePopupInnerProps] (val x: Self) extends AnyVal {
    
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
    def setMobile(value: MobileConfig): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
  }
}
