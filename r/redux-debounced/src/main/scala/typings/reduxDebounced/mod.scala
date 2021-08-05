package typings.reduxDebounced

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-debounced", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
}
