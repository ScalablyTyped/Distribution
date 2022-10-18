package typings.reactNativeReanimated

import typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.EntryExitAnimationFunction
import typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.ILayoutAnimationBuilder
import typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.LayoutAnimationFunction
import typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderMod.BaseAnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2LayoutReanimationDefaultTransitionsJumpingTransitionMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions/JumpingTransition", "JumpingTransition")
  @js.native
  open class JumpingTransition ()
    extends BaseAnimationBuilder
       with ILayoutAnimationBuilder {
    
    /* InferMemberOverrides */
    override def build(): (EntryExitAnimationFunction | LayoutAnimationFunction) & LayoutAnimationFunction = js.native
  }
  /* static members */
  object JumpingTransition {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions/JumpingTransition", "JumpingTransition")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): JumpingTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[JumpingTransition]
  }
}
