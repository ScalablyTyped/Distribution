package typings.reactNativeReanimated

import typings.reactNativeReanimated.animationBuilderMod.BaseAnimationBuilder
import typings.reactNativeReanimated.anon.TypeofBaseAnimationBuildeInstantiable
import typings.reactNativeReanimated.easingMod.EasingFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultTransitionsMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions", "CurvedTransition")
  @js.native
  open class CurvedTransition ()
    extends typings.reactNativeReanimated.curvedTransitionMod.CurvedTransition
  /* static members */
  object CurvedTransition {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions", "CurvedTransition")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): typings.reactNativeReanimated.curvedTransitionMod.CurvedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typings.reactNativeReanimated.curvedTransitionMod.CurvedTransition]
    
    inline def easingHeight(easing: EasingFn): typings.reactNativeReanimated.curvedTransitionMod.CurvedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("easingHeight")(easing.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.curvedTransitionMod.CurvedTransition]
    
    inline def easingWidth(easing: EasingFn): typings.reactNativeReanimated.curvedTransitionMod.CurvedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("easingWidth")(easing.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.curvedTransitionMod.CurvedTransition]
    
    inline def easingX(easing: EasingFn): typings.reactNativeReanimated.curvedTransitionMod.CurvedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("easingX")(easing.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.curvedTransitionMod.CurvedTransition]
    
    inline def easingY(easing: EasingFn): typings.reactNativeReanimated.curvedTransitionMod.CurvedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("easingY")(easing.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.curvedTransitionMod.CurvedTransition]
  }
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions", "EntryExitTransition")
  @js.native
  open class EntryExitTransition ()
    extends typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition
  /* static members */
  object EntryExitTransition {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions", "EntryExitTransition")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition]
    
    inline def entering(animation: BaseAnimationBuilder): typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("entering")(animation.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition]
    inline def entering(animation: TypeofBaseAnimationBuildeInstantiable): typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("entering")(animation.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition]
    
    inline def exiting(animation: BaseAnimationBuilder): typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("exiting")(animation.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition]
    inline def exiting(animation: TypeofBaseAnimationBuildeInstantiable): typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("exiting")(animation.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition]
  }
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions", "FadingTransition")
  @js.native
  open class FadingTransition ()
    extends typings.reactNativeReanimated.fadingTransitionMod.FadingTransition
  /* static members */
  object FadingTransition {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions", "FadingTransition")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): typings.reactNativeReanimated.fadingTransitionMod.FadingTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typings.reactNativeReanimated.fadingTransitionMod.FadingTransition]
  }
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions", "JumpingTransition")
  @js.native
  open class JumpingTransition ()
    extends typings.reactNativeReanimated.jumpingTransitionMod.JumpingTransition
  /* static members */
  object JumpingTransition {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions", "JumpingTransition")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): typings.reactNativeReanimated.jumpingTransitionMod.JumpingTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typings.reactNativeReanimated.jumpingTransitionMod.JumpingTransition]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions", "Layout")
  @js.native
  open class Layout ()
    extends typings.reactNativeReanimated.linearTransitionMod.LinearTransition
  object Layout {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions", "Layout")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): typings.reactNativeReanimated.linearTransitionMod.LinearTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typings.reactNativeReanimated.linearTransitionMod.LinearTransition]
  }
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions", "LinearTransition")
  @js.native
  open class LinearTransition ()
    extends typings.reactNativeReanimated.linearTransitionMod.LinearTransition
  /* static members */
  object LinearTransition {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions", "LinearTransition")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): typings.reactNativeReanimated.linearTransitionMod.LinearTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typings.reactNativeReanimated.linearTransitionMod.LinearTransition]
  }
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions", "SequencedTransition")
  @js.native
  open class SequencedTransition ()
    extends typings.reactNativeReanimated.sequencedTransitionMod.SequencedTransition
  /* static members */
  object SequencedTransition {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions", "SequencedTransition")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): typings.reactNativeReanimated.sequencedTransitionMod.SequencedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typings.reactNativeReanimated.sequencedTransitionMod.SequencedTransition]
    
    inline def reverse(): typings.reactNativeReanimated.sequencedTransitionMod.SequencedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[typings.reactNativeReanimated.sequencedTransitionMod.SequencedTransition]
  }
  
  inline def combineTransition(exiting: BaseAnimationBuilder, entering: BaseAnimationBuilder): typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition]
  inline def combineTransition(exiting: BaseAnimationBuilder, entering: TypeofBaseAnimationBuildeInstantiable): typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition]
  inline def combineTransition(exiting: TypeofBaseAnimationBuildeInstantiable, entering: BaseAnimationBuilder): typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition]
  inline def combineTransition(exiting: TypeofBaseAnimationBuildeInstantiable, entering: TypeofBaseAnimationBuildeInstantiable): typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition]
}
