package typings.rcTrigger

import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.rcTrigger.interfaceMod.AnimationType
import typings.rcTrigger.interfaceMod.TransitionNameType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyUtilMod {
  
  @JSImport("rc-trigger/es/utils/legacyUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMotion(hasPrefixClsMotionAnimationTransitionName: GetMotionProps): CSSMotionProps = ^.asInstanceOf[js.Dynamic].applyDynamic("getMotion")(hasPrefixClsMotionAnimationTransitionName.asInstanceOf[js.Any]).asInstanceOf[CSSMotionProps]
  
  trait GetMotionProps extends StObject {
    
    var animation: AnimationType
    
    var motion: CSSMotionProps
    
    var prefixCls: String
    
    var transitionName: TransitionNameType
  }
  object GetMotionProps {
    
    inline def apply(
      animation: AnimationType,
      motion: CSSMotionProps,
      prefixCls: String,
      transitionName: TransitionNameType
    ): GetMotionProps = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMotionProps]
    }
    
    extension [Self <: GetMotionProps](x: Self) {
      
      inline def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setTransitionName(value: TransitionNameType): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
    }
  }
}
