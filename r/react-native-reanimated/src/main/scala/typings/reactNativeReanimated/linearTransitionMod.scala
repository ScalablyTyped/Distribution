package typings.reactNativeReanimated

import typings.reactNativeReanimated.animationBuilderCommonTypesMod.EntryExitAnimationFunction
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.ILayoutAnimationBuilder
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.LayoutAnimationFunction
import typings.reactNativeReanimated.complexAnimationBuilderMod.ComplexAnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearTransitionMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions/LinearTransition", "Layout")
  @js.native
  open class Layout () extends LinearTransition
  object Layout {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions/LinearTransition", "Layout")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): LinearTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[LinearTransition]
  }
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions/LinearTransition", "LinearTransition")
  @js.native
  open class LinearTransition ()
    extends ComplexAnimationBuilder
       with ILayoutAnimationBuilder {
    
    /* InferMemberOverrides */
    override def build(): (EntryExitAnimationFunction | LayoutAnimationFunction) & LayoutAnimationFunction = js.native
  }
  /* static members */
  object LinearTransition {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions/LinearTransition", "LinearTransition")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): LinearTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[LinearTransition]
  }
}
