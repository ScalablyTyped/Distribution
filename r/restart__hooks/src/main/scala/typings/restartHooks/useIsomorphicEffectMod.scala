package typings.restartHooks

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@restart/hooks/cjs/useIsomorphicEffect", JSImport.Namespace)
@js.native
object useIsomorphicEffectMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(effect: EffectCallback): Unit = js.native
    def apply(effect: EffectCallback, deps: DependencyList): Unit = js.native
  }
}
