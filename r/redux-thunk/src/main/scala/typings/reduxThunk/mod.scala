package typings.reduxThunk

import org.scalablytyped.runtime.Shortcut
import typings.redux.mod.AnyAction
import typings.reduxThunk.anon.WithExtraArgument
import typings.reduxThunk.esTypesMod.ThunkMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("redux-thunk", JSImport.Default)
  @js.native
  val default: (ThunkMiddleware[Any, AnyAction, Unit]) & WithExtraArgument = js.native
  
  type _To = (ThunkMiddleware[Any, AnyAction, Unit]) & WithExtraArgument
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (ThunkMiddleware[Any, AnyAction, Unit]) & WithExtraArgument = default
}
