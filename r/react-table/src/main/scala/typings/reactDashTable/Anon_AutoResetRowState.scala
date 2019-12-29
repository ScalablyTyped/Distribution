package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.Row
import typings.reactDashTable.reactDashTableMod.TableInstance
import typings.reactDashTable.reactDashTableMod.UseRowStateLocalState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoResetRowState[D /* <: js.Object */] extends js.Object {
  var autoResetRowState: js.UndefOr[Boolean] = js.undefined
  def getResetRowStateDeps(instance: TableInstance[D]): js.Array[_]
  def initialRowStateAccessor(row: Row[D]): UseRowStateLocalState[D, _]
}

object Anon_AutoResetRowState {
  @scala.inline
  def apply[D /* <: js.Object */](
    getResetRowStateDeps: TableInstance[D] => js.Array[_],
    initialRowStateAccessor: Row[D] => UseRowStateLocalState[D, _],
    autoResetRowState: js.UndefOr[Boolean] = js.undefined
  ): Anon_AutoResetRowState[D] = {
    val __obj = js.Dynamic.literal(getResetRowStateDeps = js.Any.fromFunction1(getResetRowStateDeps), initialRowStateAccessor = js.Any.fromFunction1(initialRowStateAccessor))
    if (!js.isUndefined(autoResetRowState)) __obj.updateDynamic("autoResetRowState")(autoResetRowState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoResetRowState[D]]
  }
}

