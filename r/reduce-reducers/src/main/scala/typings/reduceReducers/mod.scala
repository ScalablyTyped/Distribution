package typings.reduceReducers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reduce-reducers", JSImport.Default)
  @js.native
  def default[S](initialState: S, reducers: Reducer[S]*): Reducer[S] = js.native
  @JSImport("reduce-reducers", JSImport.Default)
  @js.native
  def default[S](initialState: Null, reducers: Reducer[S]*): Reducer[S] = js.native
  @JSImport("reduce-reducers", JSImport.Default)
  @js.native
  def default[S](reducers: Reducer[S]*): Reducer[S] = js.native
  
  @js.native
  trait Action extends StObject {
    
    var `type`: String = js.native
  }
  object Action {
    
    @scala.inline
    def apply(`type`: String): Action = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Reducer[S] = js.Function2[/* state */ S, /* action */ Action, S]
}
