package typings.restartHooks

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCustomEffectMod {
  
  /**
    * a useEffect() hook with customized depedency comparision
    *
    * @param effect The effect callback
    * @param dependencies A list of dependencies
    * @param isEqual A function comparing the next and previous dependencyLists
    */
  @JSImport("@restart/hooks/cjs/useCustomEffect", JSImport.Default)
  @js.native
  def default[TDeps /* <: DependencyList */](effect: EffectCallback, dependencies: TDeps, isEqual: IsEqual[TDeps]): Unit = js.native
  /**
    * a useEffect() hook with customized depedency comparision
    *
    * @param effect The effect callback
    * @param dependencies A list of dependencies
    * @param options
    * @param options.isEqual A function comparing the next and previous dependencyLists
    * @param options.effectHook the underlying effect hook used, defaults to useEffect
    */
  @JSImport("@restart/hooks/cjs/useCustomEffect", JSImport.Default)
  @js.native
  def default[TDeps /* <: DependencyList */](effect: EffectCallback, dependencies: TDeps, options: CustomEffectOptions[TDeps]): Unit = js.native
  
  @js.native
  trait CustomEffectOptions[TDeps /* <: DependencyList */] extends StObject {
    
    var effectHook: js.UndefOr[EffectHook] = js.native
    
    var isEqual: IsEqual[TDeps] = js.native
  }
  object CustomEffectOptions {
    
    @scala.inline
    def apply[TDeps /* <: DependencyList */](isEqual: (TDeps, TDeps) => Boolean): CustomEffectOptions[TDeps] = {
      val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction2(isEqual))
      __obj.asInstanceOf[CustomEffectOptions[TDeps]]
    }
    
    @scala.inline
    implicit class CustomEffectOptionsMutableBuilder[Self <: CustomEffectOptions[_], TDeps /* <: DependencyList */] (val x: Self with CustomEffectOptions[TDeps]) extends AnyVal {
      
      @scala.inline
      def setEffectHook(value: (/* effect */ EffectCallback, /* deps */ js.UndefOr[DependencyList]) => Unit): Self = StObject.set(x, "effectHook", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEffectHookUndefined: Self = StObject.set(x, "effectHook", js.undefined)
      
      @scala.inline
      def setIsEqual(value: (TDeps, TDeps) => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction2(value))
    }
  }
  
  type EffectHook = js.Function2[/* effect */ EffectCallback, /* deps */ js.UndefOr[DependencyList], Unit]
  
  type IsEqual[TDeps /* <: DependencyList */] = js.Function2[/* nextDeps */ TDeps, /* prevDeps */ TDeps, Boolean]
}
