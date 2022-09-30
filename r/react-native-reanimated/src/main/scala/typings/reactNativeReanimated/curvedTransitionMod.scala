package typings.reactNativeReanimated

import typings.reactNativeReanimated.animationBuilderCommonTypesMod.EntryExitAnimationFunction
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.ILayoutAnimationBuilder
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.LayoutAnimationFunction
import typings.reactNativeReanimated.animationBuilderMod.BaseAnimationBuilder
import typings.reactNativeReanimated.easingMod.EasingFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curvedTransitionMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions/CurvedTransition", "CurvedTransition")
  @js.native
  open class CurvedTransition ()
    extends BaseAnimationBuilder
       with ILayoutAnimationBuilder {
    
    /* InferMemberOverrides */
    override def build(): (EntryExitAnimationFunction | LayoutAnimationFunction) & LayoutAnimationFunction = js.native
    
    def easingHeight(easing: EasingFn): CurvedTransition = js.native
    
    var easingHeightV: EasingFn = js.native
    
    def easingWidth(easing: EasingFn): CurvedTransition = js.native
    
    var easingWidthV: EasingFn = js.native
    
    def easingX(easing: EasingFn): CurvedTransition = js.native
    
    var easingXV: EasingFn = js.native
    
    def easingY(easing: EasingFn): CurvedTransition = js.native
    
    var easingYV: EasingFn = js.native
  }
  /* static members */
  object CurvedTransition {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions/CurvedTransition", "CurvedTransition")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): CurvedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[CurvedTransition]
    
    inline def easingHeight(easing: EasingFn): CurvedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("easingHeight")(easing.asInstanceOf[js.Any]).asInstanceOf[CurvedTransition]
    
    inline def easingWidth(easing: EasingFn): CurvedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("easingWidth")(easing.asInstanceOf[js.Any]).asInstanceOf[CurvedTransition]
    
    inline def easingX(easing: EasingFn): CurvedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("easingX")(easing.asInstanceOf[js.Any]).asInstanceOf[CurvedTransition]
    
    inline def easingY(easing: EasingFn): CurvedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("easingY")(easing.asInstanceOf[js.Any]).asInstanceOf[CurvedTransition]
  }
}
