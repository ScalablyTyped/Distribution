package typings.reduceReducers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reduce-reducers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S](initialState: S, reducers: Reducer[S]*): Reducer[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any], reducers.asInstanceOf[js.Any])).asInstanceOf[Reducer[S]]
  inline def default[S](initialState: Null, reducers: Reducer[S]*): Reducer[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any], reducers.asInstanceOf[js.Any])).asInstanceOf[Reducer[S]]
  inline def default[S](reducers: Reducer[S]*): Reducer[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[S]]
  
  trait Action extends StObject {
    
    var `type`: String
  }
  object Action {
    
    inline def apply(`type`: String): Action = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Reducer[S] = js.Function2[/* state */ S, /* action */ Action, S]
}
