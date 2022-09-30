package typings.reactRedux

import typings.reactRedux.contextMod.ReactReduxContextValue
import typings.redux.mod.AnyAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useReduxContextMod {
  
  @JSImport("react-redux/es/hooks/useReduxContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useReduxContext(): (ReactReduxContextValue[Any, AnyAction]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useReduxContext")().asInstanceOf[(ReactReduxContextValue[Any, AnyAction]) | Null]
}
