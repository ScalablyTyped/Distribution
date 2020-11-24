package typings.restartHooks.useCustomEffectMod

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@restart/hooks/cjs/useCustomEffect", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * a useEffect() hook with customized depedency comparision
    *
    * @param effect The effect callback
    * @param dependencies A list of dependencies
    * @param isEqual A function comparing the next and previous dependencyLists
    */
  def apply[TDeps /* <: DependencyList */](effect: EffectCallback, dependencies: TDeps, isEqual: IsEqual[TDeps]): Unit = js.native
  /**
    * a useEffect() hook with customized depedency comparision
    *
    * @param effect The effect callback
    * @param dependencies A list of dependencies
    * @param options
    * @param options.isEqual A function comparing the next and previous dependencyLists
    * @param options.effectHook the underlying effect hook used, defaults to useEffect
    */
  def apply[TDeps /* <: DependencyList */](effect: EffectCallback, dependencies: TDeps, options: CustomEffectOptions[TDeps]): Unit = js.native
}
