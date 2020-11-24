package typings.reduxDoghouse.mod

import typings.redux.mod.ActionCreator
import typings.redux.mod.ActionCreatorsMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-doghouse", "scopeActionCreators")
@js.native
object scopeActionCreators extends js.Object {
  
  def apply[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */](actionCreator: A, scopeID: String): A = js.native
  def apply[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */](actionCreator: A, scopeID: Double): A = js.native
}
