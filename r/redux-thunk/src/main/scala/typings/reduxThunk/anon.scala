package typings.reduxThunk

import typings.redux.mod.Action
import typings.reduxThunk.esTypesMod.ThunkMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait WithExtraArgument extends StObject {
    
    def withExtraArgument[ExtraThunkArg, State, BasicAction /* <: Action[Any] */](extraArgument: ExtraThunkArg): ThunkMiddleware[State, BasicAction, ExtraThunkArg]
  }
  object WithExtraArgument {
    
    inline def apply(withExtraArgument: Any => ThunkMiddleware[Any, Any, Any]): WithExtraArgument = {
      val __obj = js.Dynamic.literal(withExtraArgument = js.Any.fromFunction1(withExtraArgument))
      __obj.asInstanceOf[WithExtraArgument]
    }
    
    extension [Self <: WithExtraArgument](x: Self) {
      
      inline def setWithExtraArgument(value: Any => ThunkMiddleware[Any, Any, Any]): Self = StObject.set(x, "withExtraArgument", js.Any.fromFunction1(value))
    }
  }
}
