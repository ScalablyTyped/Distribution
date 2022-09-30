package typings.reduxReactSession

import typings.redux.mod.Action
import typings.reduxReactSession.reducerMod.SessionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object immutableReducerMod {
  
  @JSImport("redux-react-session/immutableReducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(state: SessionState, action: Action[Any]): SessionState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[SessionState]
  
  @JSImport("redux-react-session/immutableReducer", "initialState")
  @js.native
  val initialState: SessionState = js.native
}
