package typings.reduxFirstRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-first-router", "pathToAction")
@js.native
object pathToAction extends js.Object {
  
  def apply[TKeys, TState](pathname: String, routesMap: RoutesMap[TKeys, TState]): ReceivedAction = js.native
  def apply[TKeys, TState](pathname: String, routesMap: RoutesMap[TKeys, TState], querySerializer: QuerySerializer): ReceivedAction = js.native
}
