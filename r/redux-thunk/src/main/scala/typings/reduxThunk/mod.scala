package typings.reduxThunk

import org.scalablytyped.runtime.Shortcut
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Middleware
import typings.reduxThunk.anon.WithExtraArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("redux-thunk", JSImport.Default)
  @js.native
  val default: (ThunkMiddleware[js.Object, AnyAction, Unit]) & WithExtraArgument = js.native
  
  type ThunkAction[R, S, E, A /* <: Action[js.Any] */] = js.Function3[
    /* dispatch */ ThunkDispatch[S, E, A], 
    /* getState */ js.Function0[S], 
    /* extraArgument */ E, 
    R
  ]
  
  @js.native
  trait ThunkDispatch[S, E, A /* <: Action[js.Any] */] extends StObject {
    
    def apply[T /* <: A */](action: T): T = js.native
    def apply[R](asyncAction: ThunkAction[R, S, E, A]): R = js.native
  }
  
  type ThunkMiddleware[S, A /* <: Action[js.Any] */, E] = Middleware[ThunkDispatch[S, E, A], S, ThunkDispatch[S, E, A]]
  
  type _To = (ThunkMiddleware[js.Object, AnyAction, Unit]) & WithExtraArgument
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (ThunkMiddleware[js.Object, AnyAction, Unit]) & WithExtraArgument = default
}
