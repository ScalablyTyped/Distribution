package typings.rcMenu

import typings.rcMenu.anon.PartialkeyinMenuModeother
import typings.rcMenu.interfaceMod.MenuMode
import typings.rcMenu.interfaceMod.OpenAnimation
import typings.rcMotion.cssmotionMod.CSSMotionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyUtilMod {
  
  @JSImport("rc-menu/es/utils/legacyUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMotion(
    hasPrefixClsMotionDefaultMotionsOpenAnimationOpenTransitionName: GetMotionProps,
    hasSwitchingModeFromInline: GetMotionState,
    menuMode: MenuMode
  ): CSSMotionProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getMotion")(hasPrefixClsMotionDefaultMotionsOpenAnimationOpenTransitionName.asInstanceOf[js.Any], hasSwitchingModeFromInline.asInstanceOf[js.Any], menuMode.asInstanceOf[js.Any])).asInstanceOf[CSSMotionProps]
  
  trait GetMotionProps extends StObject {
    
    var defaultMotions: js.UndefOr[PartialkeyinMenuModeother] = js.undefined
    
    var motion: js.UndefOr[CSSMotionProps] = js.undefined
    
    var openAnimation: js.UndefOr[OpenAnimation] = js.undefined
    
    var openTransitionName: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object GetMotionProps {
    
    inline def apply(): GetMotionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetMotionProps]
    }
    
    extension [Self <: GetMotionProps](x: Self) {
      
      inline def setDefaultMotions(value: PartialkeyinMenuModeother): Self = StObject.set(x, "defaultMotions", value.asInstanceOf[js.Any])
      
      inline def setDefaultMotionsUndefined: Self = StObject.set(x, "defaultMotions", js.undefined)
      
      inline def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setOpenAnimation(value: OpenAnimation): Self = StObject.set(x, "openAnimation", value.asInstanceOf[js.Any])
      
      inline def setOpenAnimationUndefined: Self = StObject.set(x, "openAnimation", js.undefined)
      
      inline def setOpenTransitionName(value: String): Self = StObject.set(x, "openTransitionName", value.asInstanceOf[js.Any])
      
      inline def setOpenTransitionNameUndefined: Self = StObject.set(x, "openTransitionName", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  trait GetMotionState extends StObject {
    
    var switchingModeFromInline: Boolean
  }
  object GetMotionState {
    
    inline def apply(switchingModeFromInline: Boolean): GetMotionState = {
      val __obj = js.Dynamic.literal(switchingModeFromInline = switchingModeFromInline.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMotionState]
    }
    
    extension [Self <: GetMotionState](x: Self) {
      
      inline def setSwitchingModeFromInline(value: Boolean): Self = StObject.set(x, "switchingModeFromInline", value.asInstanceOf[js.Any])
    }
  }
}
