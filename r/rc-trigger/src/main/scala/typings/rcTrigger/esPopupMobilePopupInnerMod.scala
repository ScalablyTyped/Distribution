package typings.rcTrigger

import org.scalablytyped.runtime.Shortcut
import typings.rcMotion.esCssmotionMod.CSSMotionProps
import typings.rcTrigger.esInterfaceMod.AnimationType
import typings.rcTrigger.esInterfaceMod.MobileConfig
import typings.rcTrigger.esInterfaceMod.TransitionNameType
import typings.rcTrigger.esPopupPopupInnerMod.PopupInnerProps
import typings.rcTrigger.esPopupPopupInnerMod.PopupInnerRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPopupMobilePopupInnerMod extends Shortcut {
  
  @JSImport("rc-trigger/es/Popup/MobilePopupInner", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[MobilePopupInnerProps & RefAttributes[PopupInnerRef]] = js.native
  
  trait MobilePopupInnerProps
    extends StObject
       with PopupInnerProps {
    
    var mobile: js.UndefOr[MobileConfig] = js.undefined
  }
  object MobilePopupInnerProps {
    
    inline def apply(
      animation: AnimationType,
      motion: CSSMotionProps,
      prefixCls: String,
      transitionName: TransitionNameType
    ): MobilePopupInnerProps = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MobilePopupInnerProps]
    }
    
    extension [Self <: MobilePopupInnerProps](x: Self) {
      
      inline def setMobile(value: MobileConfig): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[MobilePopupInnerProps & RefAttributes[PopupInnerRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esPopupMobilePopupInnerMod.foo` */
  override def _to: ForwardRefExoticComponent[MobilePopupInnerProps & RefAttributes[PopupInnerRef]] = default
}
