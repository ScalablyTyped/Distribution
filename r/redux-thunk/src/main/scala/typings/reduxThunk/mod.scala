package typings.reduxThunk

import org.scalablytyped.runtime.Shortcut
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Middleware
import typings.reduxThunk.anon.WithExtraArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("redux-thunk", JSImport.Default)
  @js.native
  val default: (ThunkMiddleware[js.Object, AnyAction, js.UndefOr[scala.Nothing]]) with WithExtraArgument = js.native
  
  type ThunkAction[R, S, E, A /* <: Action[_] */] = js.Function3[
    /* dispatch */ ThunkDispatch[S, E, A], 
    /* getState */ js.Function0[S], 
    /* extraArgument */ E, 
    R
  ]
  
  @js.native
  trait ThunkDispatch[S, E, A /* <: Action[_] */] extends StObject {
    
    def apply[T /* <: A */](action: T): T = js.native
    def apply[R](asyncAction: ThunkAction[R, S, E, A]): R = js.native
  }
  
  type ThunkMiddleware[S, A /* <: Action[_] */, E] = Middleware[ThunkDispatch[S, E, A], S, ThunkDispatch[S, E, A]]
  
  type _To = (ThunkMiddleware[js.Object, AnyAction, js.UndefOr[scala.Nothing]]) with WithExtraArgument
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (ThunkMiddleware[js.Object, AnyAction, js.UndefOr[scala.Nothing]]) with WithExtraArgument = default
}
