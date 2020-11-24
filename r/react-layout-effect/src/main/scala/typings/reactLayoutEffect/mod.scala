package typings.reactLayoutEffect

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-layout-effect", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object useLayoutEffect extends js.Object {
    
    def apply(effect: EffectCallback): Unit = js.native
    def apply(effect: EffectCallback, deps: DependencyList): Unit = js.native
  }
}
