package typings.reduxThunk

import typings.redux.mod.Action
import typings.redux.mod.Middleware
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ThunkAction[ReturnType, State, ExtraThunkArg, BasicAction /* <: Action[Any] */] = js.Function3[
    /* dispatch */ ThunkDispatch[State, ExtraThunkArg, BasicAction], 
    /* getState */ js.Function0[State], 
    /* extraArgument */ ExtraThunkArg, 
    ReturnType
  ]
  
  type ThunkActionDispatch[ActionCreator /* <: js.Function1[/* repeated */ Any, ThunkAction[Any, Any, Any, Any]] */] = js.Function1[/* args */ Parameters[ActionCreator], ReturnType[ReturnType[ActionCreator]]]
  
  @js.native
  trait ThunkDispatch[State, ExtraThunkArg, BasicAction /* <: Action[Any] */] extends StObject {
    
    /** Accepts a standard action object, and returns that action object */
    def apply[Action /* <: BasicAction */](action: Action): Action = js.native
    /** Accepts a thunk function, runs it, and returns whatever the thunk itself returns */
    def apply[ReturnType](thunkAction: ThunkAction[ReturnType, State, ExtraThunkArg, BasicAction]): ReturnType = js.native
  }
  
  type ThunkMiddleware[State, BasicAction /* <: Action[Any] */, ExtraThunkArg] = Middleware[
    ThunkDispatch[State, ExtraThunkArg, BasicAction], 
    State, 
    ThunkDispatch[State, ExtraThunkArg, BasicAction]
  ]
}
