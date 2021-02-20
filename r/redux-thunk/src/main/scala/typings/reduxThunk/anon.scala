package typings.reduxThunk

import typings.redux.mod.AnyAction
import typings.reduxThunk.mod.ThunkMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait WithExtraArgument extends StObject {
    
    def withExtraArgument[E](extraArgument: E): ThunkMiddleware[js.Object, AnyAction, E] = js.native
  }
  object WithExtraArgument {
    
    @scala.inline
    def apply(withExtraArgument: js.Any => ThunkMiddleware[js.Object, AnyAction, js.Any]): WithExtraArgument = {
      val __obj = js.Dynamic.literal(withExtraArgument = js.Any.fromFunction1(withExtraArgument))
      __obj.asInstanceOf[WithExtraArgument]
    }
    
    @scala.inline
    implicit class WithExtraArgumentMutableBuilder[Self <: WithExtraArgument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWithExtraArgument(value: js.Any => ThunkMiddleware[js.Object, AnyAction, js.Any]): Self = StObject.set(x, "withExtraArgument", js.Any.fromFunction1(value))
    }
  }
}
