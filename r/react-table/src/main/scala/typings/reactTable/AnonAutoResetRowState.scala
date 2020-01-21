package typings.reactTable

import typings.reactTable.mod.Row
import typings.reactTable.mod.TableInstance
import typings.reactTable.mod.UseRowStateLocalState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoResetRowState[D /* <: js.Object */] extends js.Object {
  var autoResetRowState: js.UndefOr[Boolean] = js.undefined
  def getResetRowStateDeps(instance: TableInstance[D]): js.Array[_]
  def initialRowStateAccessor(row: Row[D]): UseRowStateLocalState[D, _]
}

object AnonAutoResetRowState {
  @scala.inline
  def apply[D /* <: js.Object */](
    getResetRowStateDeps: TableInstance[D] => js.Array[_],
    initialRowStateAccessor: Row[D] => UseRowStateLocalState[D, _],
    autoResetRowState: js.UndefOr[Boolean] = js.undefined
  ): AnonAutoResetRowState[D] = {
    val __obj = js.Dynamic.literal(getResetRowStateDeps = js.Any.fromFunction1(getResetRowStateDeps), initialRowStateAccessor = js.Any.fromFunction1(initialRowStateAccessor))
    if (!js.isUndefined(autoResetRowState)) __obj.updateDynamic("autoResetRowState")(autoResetRowState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoResetRowState[D]]
  }
}

