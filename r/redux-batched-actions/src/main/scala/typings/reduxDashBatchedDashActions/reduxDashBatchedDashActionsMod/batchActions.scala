package typings.reduxDashBatchedDashActions.reduxDashBatchedDashActionsMod

import typings.redux.reduxMod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-batched-actions", "batchActions")
@js.native
object batchActions extends js.Object {
  def apply(actions: js.Array[AnyAction]): BatchAction = js.native
  def apply(actions: js.Array[AnyAction], `type`: String): BatchAction = js.native
}

