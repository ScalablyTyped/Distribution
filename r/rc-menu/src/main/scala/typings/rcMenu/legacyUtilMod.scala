package typings.rcMenu

import typings.rcMenu.anon.PartialkeyinMenuModeother
import typings.rcMenu.interfaceMod.MenuMode
import typings.rcMenu.interfaceMod.OpenAnimation
import typings.rcMotion.cssmotionMod.CSSMotionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyUtilMod {
  
  @JSImport("rc-menu/es/utils/legacyUtil", "getMotion")
  @js.native
  def getMotion(
    hasPrefixClsMotionDefaultMotionsOpenAnimationOpenTransitionName: GetMotionProps,
    hasSwitchingModeFromInline: GetMotionState,
    menuMode: MenuMode
  ): CSSMotionProps = js.native
  
  @js.native
  trait GetMotionProps extends StObject {
    
    var defaultMotions: js.UndefOr[PartialkeyinMenuModeother] = js.native
    
    var motion: js.UndefOr[CSSMotionProps] = js.native
    
    var openAnimation: js.UndefOr[OpenAnimation] = js.native
    
    var openTransitionName: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object GetMotionProps {
    
    @scala.inline
    def apply(): GetMotionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetMotionProps]
    }
    
    @scala.inline
    implicit class GetMotionPropsMutableBuilder[Self <: GetMotionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultMotions(value: PartialkeyinMenuModeother): Self = StObject.set(x, "defaultMotions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMotionsUndefined: Self = StObject.set(x, "defaultMotions", js.undefined)
      
      @scala.inline
      def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      @scala.inline
      def setOpenAnimation(value: OpenAnimation): Self = StObject.set(x, "openAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenAnimationUndefined: Self = StObject.set(x, "openAnimation", js.undefined)
      
      @scala.inline
      def setOpenTransitionName(value: String): Self = StObject.set(x, "openTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenTransitionNameUndefined: Self = StObject.set(x, "openTransitionName", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  @js.native
  trait GetMotionState extends StObject {
    
    var switchingModeFromInline: Boolean = js.native
  }
  object GetMotionState {
    
    @scala.inline
    def apply(switchingModeFromInline: Boolean): GetMotionState = {
      val __obj = js.Dynamic.literal(switchingModeFromInline = switchingModeFromInline.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMotionState]
    }
    
    @scala.inline
    implicit class GetMotionStateMutableBuilder[Self <: GetMotionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSwitchingModeFromInline(value: Boolean): Self = StObject.set(x, "switchingModeFromInline", value.asInstanceOf[js.Any])
    }
  }
}
