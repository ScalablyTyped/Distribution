package typings.reactNativeReanimated

import typings.reactNativeReanimated.animationBuilderCommonTypesMod.EntryExitAnimationFunction
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.IEntryExitAnimationBuilder
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.LayoutAnimationFunction
import typings.reactNativeReanimated.animationBuilderMod.ComplexAnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinwheelMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultAnimations/Pinwheel", "PinwheelIn")
  @js.native
  open class PinwheelIn ()
    extends ComplexAnimationBuilder
       with IEntryExitAnimationBuilder {
    
    /* InferMemberOverrides */
    override def build(): (EntryExitAnimationFunction | LayoutAnimationFunction) & EntryExitAnimationFunction = js.native
  }
  /* static members */
  object PinwheelIn {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultAnimations/Pinwheel", "PinwheelIn")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): PinwheelIn = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[PinwheelIn]
  }
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultAnimations/Pinwheel", "PinwheelOut")
  @js.native
  open class PinwheelOut ()
    extends ComplexAnimationBuilder
       with IEntryExitAnimationBuilder {
    
    /* InferMemberOverrides */
    override def build(): (EntryExitAnimationFunction | LayoutAnimationFunction) & EntryExitAnimationFunction = js.native
  }
  /* static members */
  object PinwheelOut {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultAnimations/Pinwheel", "PinwheelOut")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): PinwheelOut = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[PinwheelOut]
  }
}
