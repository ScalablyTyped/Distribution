package typings.reactFns

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReducerComponentMod {
  
  @JSImport("react-fns/dist/ReducerComponent", "ReducerComponent")
  @js.native
  open class ReducerComponent[P, S, A] protected () extends Component[P, S, Any] {
    def this(props: P) = this()
    
    def dispatch(action: A): Unit = js.native
    
    def reducer(state: S, action: A): S = js.native
  }
}
