package typings.reactNativeReanimated

import typings.react.mod.MutableRefObject
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AdapterWorkletFunction
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatedStyle
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.BasicWorkletFunction
import typings.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.DependencyList
import typings.reactNativeReanimated.libTypesReanimated2ViewDescriptorsSetMod.ViewDescriptorsSet
import typings.reactNativeReanimated.libTypesReanimated2ViewDescriptorsSetMod.ViewRefSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2HookUseAnimatedStyleMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/useAnimatedStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnimatedStyle[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T]): AnimatedStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any]).asInstanceOf[AnimatedStyleResult]
  inline def useAnimatedStyle[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: Unit, adapters: js.Array[AdapterWorkletFunction]): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
  inline def useAnimatedStyle[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: Unit, adapters: AdapterWorkletFunction): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
  inline def useAnimatedStyle[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: DependencyList): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
  inline def useAnimatedStyle[T /* <: AnimatedStyle */](
    updater: BasicWorkletFunction[T],
    dependencies: DependencyList,
    adapters: js.Array[AdapterWorkletFunction]
  ): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
  inline def useAnimatedStyle[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: DependencyList, adapters: AdapterWorkletFunction): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
  
  trait AnimatedStyleResult extends StObject {
    
    var animatedStyle: js.UndefOr[MutableRefObject[AnimatedStyle]] = js.undefined
    
    var initial: AnimatedStyle
    
    var viewDescriptors: ViewDescriptorsSet
    
    var viewsRef: ViewRefSet[Any]
  }
  object AnimatedStyleResult {
    
    inline def apply(initial: AnimatedStyle, viewDescriptors: ViewDescriptorsSet, viewsRef: ViewRefSet[Any]): AnimatedStyleResult = {
      val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], viewDescriptors = viewDescriptors.asInstanceOf[js.Any], viewsRef = viewsRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimatedStyleResult]
    }
    
    extension [Self <: AnimatedStyleResult](x: Self) {
      
      inline def setAnimatedStyle(value: MutableRefObject[AnimatedStyle]): Self = StObject.set(x, "animatedStyle", value.asInstanceOf[js.Any])
      
      inline def setAnimatedStyleUndefined: Self = StObject.set(x, "animatedStyle", js.undefined)
      
      inline def setInitial(value: AnimatedStyle): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setViewDescriptors(value: ViewDescriptorsSet): Self = StObject.set(x, "viewDescriptors", value.asInstanceOf[js.Any])
      
      inline def setViewsRef(value: ViewRefSet[Any]): Self = StObject.set(x, "viewsRef", value.asInstanceOf[js.Any])
    }
  }
}
