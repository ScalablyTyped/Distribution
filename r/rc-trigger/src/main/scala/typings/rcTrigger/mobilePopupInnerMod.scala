package typings.rcTrigger

import org.scalablytyped.runtime.Shortcut
import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.rcTrigger.interfaceMod.AnimationType
import typings.rcTrigger.interfaceMod.MobileConfig
import typings.rcTrigger.interfaceMod.TransitionNameType
import typings.rcTrigger.popupInnerMod.PopupInnerProps
import typings.rcTrigger.popupInnerMod.PopupInnerRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobilePopupInnerMod extends Shortcut {
  
  @JSImport("rc-trigger/es/Popup/MobilePopupInner", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[MobilePopupInnerProps & RefAttributes[PopupInnerRef]] = js.native
  
  trait MobilePopupInnerProps
    extends StObject
       with PopupInnerProps {
    
    var mobile: js.UndefOr[MobileConfig] = js.undefined
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
    implicit class MobilePopupInnerPropsMutableBuilder[Self <: MobilePopupInnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMobile(value: MobileConfig): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[MobilePopupInnerProps & RefAttributes[PopupInnerRef]]
  
  /* This means you don't have to write `default`, but can instead just say `mobilePopupInnerMod.foo` */
  override def _to: ForwardRefExoticComponent[MobilePopupInnerProps & RefAttributes[PopupInnerRef]] = default
}
