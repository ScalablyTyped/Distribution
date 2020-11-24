package typings.reactFns

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-fns/dist/ReducerComponent", JSImport.Namespace)
@js.native
object reducerComponentMod extends js.Object {
  
  @js.native
  class ReducerComponent[P, S, A] protected ()
    extends Component[P, S, js.Any] {
    def this(props: P) = this()
    
    def dispatch(action: A): Unit = js.native
    
    def reducer(state: S, action: A): S = js.native
  }
}
