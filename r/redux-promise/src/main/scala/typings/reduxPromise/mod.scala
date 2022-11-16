package typings.reduxPromise

import org.scalablytyped.runtime.Shortcut
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.reduxPromise.mod.ReduxPromise.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("redux-promise", JSImport.Namespace)
  @js.native
  val ^ : Promise = js.native
  
  object ReduxPromise {
    
    type Promise = Middleware[js.Object, Any, Dispatch[AnyAction]]
  }
  
  type _To = Promise
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Promise = ^
  
  /* augmented module */
  object reduxAugmentingMod {
    
    type Dispatch[S] = js.Function1[/* asyncAction */ PromiseAction[S], Any]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type PromiseAction = (dispatch : redux-promise.redux-promise.redux.Dispatch<S>, getState : (): S | undefined): any
    }}}
    to avoid circular code involving: 
    - redux-promise.redux-promise.redux.Dispatch
    - redux-promise.redux-promise.redux.PromiseAction
    */
    @js.native
    trait PromiseAction[S] extends StObject {
      
      def apply(dispatch: typings.reduxPromise.mod.reduxAugmentingMod.Dispatch[S]): Any = js.native
      def apply(dispatch: typings.reduxPromise.mod.reduxAugmentingMod.Dispatch[S], getState: js.Function0[S]): Any = js.native
    }
  }
}
