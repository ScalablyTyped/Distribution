package typings.reactNativeReanimated

import typings.reactNativeReanimated.animationBuilderCommonTypesMod.EntryExitAnimationFunction
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.ILayoutAnimationBuilder
import typings.reactNativeReanimated.animationBuilderCommonTypesMod.LayoutAnimationFunction
import typings.reactNativeReanimated.animationBuilderMod.BaseAnimationBuilder
import typings.reactNativeReanimated.anon.TypeofBaseAnimationBuildeInstantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryExitTransitionMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions/EntryExitTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions/EntryExitTransition", "EntryExitTransition")
  @js.native
  open class EntryExitTransition ()
    extends BaseAnimationBuilder
       with ILayoutAnimationBuilder {
    
    /* InferMemberOverrides */
    override def build(): (EntryExitAnimationFunction | LayoutAnimationFunction) & LayoutAnimationFunction = js.native
    
    def entering(animation: BaseAnimationBuilder): EntryExitTransition = js.native
    def entering(animation: TypeofBaseAnimationBuildeInstantiable): EntryExitTransition = js.native
    
    var enteringV: BaseAnimationBuilder | TypeofBaseAnimationBuildeInstantiable = js.native
    
    def exiting(animation: BaseAnimationBuilder): EntryExitTransition = js.native
    def exiting(animation: TypeofBaseAnimationBuildeInstantiable): EntryExitTransition = js.native
    
    var exitingV: BaseAnimationBuilder | TypeofBaseAnimationBuildeInstantiable = js.native
  }
  /* static members */
  object EntryExitTransition {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/layoutReanimation/defaultTransitions/EntryExitTransition", "EntryExitTransition")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(): EntryExitTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[EntryExitTransition]
    
    inline def entering(animation: BaseAnimationBuilder): EntryExitTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("entering")(animation.asInstanceOf[js.Any]).asInstanceOf[EntryExitTransition]
    inline def entering(animation: TypeofBaseAnimationBuildeInstantiable): EntryExitTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("entering")(animation.asInstanceOf[js.Any]).asInstanceOf[EntryExitTransition]
    
    inline def exiting(animation: BaseAnimationBuilder): EntryExitTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("exiting")(animation.asInstanceOf[js.Any]).asInstanceOf[EntryExitTransition]
    inline def exiting(animation: TypeofBaseAnimationBuildeInstantiable): EntryExitTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("exiting")(animation.asInstanceOf[js.Any]).asInstanceOf[EntryExitTransition]
  }
  
  inline def combineTransition(exiting: BaseAnimationBuilder, entering: BaseAnimationBuilder): EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[EntryExitTransition]
  inline def combineTransition(exiting: BaseAnimationBuilder, entering: TypeofBaseAnimationBuildeInstantiable): EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[EntryExitTransition]
  inline def combineTransition(exiting: TypeofBaseAnimationBuildeInstantiable, entering: BaseAnimationBuilder): EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[EntryExitTransition]
  inline def combineTransition(exiting: TypeofBaseAnimationBuildeInstantiable, entering: TypeofBaseAnimationBuildeInstantiable): EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[EntryExitTransition]
}
