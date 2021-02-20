package typings.restartHooks

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useIsomorphicEffectMod {
  
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useeffect
    */
  /* was `typeof useEffect` */
  @JSImport("@restart/hooks/cjs/useIsomorphicEffect", JSImport.Default)
  @js.native
  def default(effect: EffectCallback): Unit = js.native
  /* was `typeof useEffect` */
  @JSImport("@restart/hooks/cjs/useIsomorphicEffect", JSImport.Default)
  @js.native
  def default(effect: EffectCallback, deps: DependencyList): Unit = js.native
}
