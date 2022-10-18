package typings.reactNativeReanimated

import typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.EntryExitAnimationFunction
import typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.ILayoutAnimationBuilder
import typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.LayoutAnimationFunction
import typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderMod.BaseAnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2LayoutReanimationDefaultTransitionsSequencedTransitionMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions/SequencedTransition", "SequencedTransition")
  @js.native
  open class SequencedTransition ()
    extends BaseAnimationBuilder
       with ILayoutAnimationBuilder {
    
    /* InferMemberOverrides */
    override def build(): (EntryExitAnimationFunction | LayoutAnimationFunction) & LayoutAnimationFunction = js.native
    
    def reverse(): SequencedTransition = js.native
    
    var reversed: Boolean = js.native
  }
  /* static members */
  object SequencedTransition {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions/SequencedTransition", "SequencedTransition")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): SequencedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[SequencedTransition]
    
    inline def reverse(): SequencedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[SequencedTransition]
  }
}
