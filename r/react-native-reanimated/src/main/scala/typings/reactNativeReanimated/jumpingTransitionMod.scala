package typings.reactNativeReanimated

import typings.reactNativeReanimated.animationBuilderCommonTypesMod.EntryExitAnimationFunction
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.ILayoutAnimationBuilder
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.LayoutAnimationFunction
import typings.reactNativeReanimated.animationBuilderMod.BaseAnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jumpingTransitionMod {
  
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
