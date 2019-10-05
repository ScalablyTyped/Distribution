package typings.reduxDashDoghouse.reduxDashDoghouseMod

import typings.redux.reduxMod.ActionCreator
import typings.redux.reduxMod.ActionCreatorsMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-doghouse", "scopeActionCreators")
@js.native
object scopeActionCreators extends js.Object {
  def apply[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */](actionCreator: A, scopeID: String): A = js.native
  def apply[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */](actionCreator: A, scopeID: Double): A = js.native
}

