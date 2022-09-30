package typings.reactRedux

import typings.redux.mod.ActionCreatorsMapObject
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindActionCreatorsMod {
  
  @JSImport("react-redux/es/utils/bindActionCreators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(actionCreators: ActionCreatorsMapObject[Any], dispatch: Dispatch[AnyAction]): ActionCreatorsMapObject[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(actionCreators.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[ActionCreatorsMapObject[Any]]
}
