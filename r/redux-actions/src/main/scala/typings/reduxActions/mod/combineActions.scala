package typings.reduxActions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-actions", "combineActions")
@js.native
object combineActions extends js.Object {
  def apply(actionTypes: (ActionFunctions[_] | String | js.Symbol)*): CombinedActionType = js.native
}

