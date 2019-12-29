package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.ActionType
import typings.reactDashTable.reactDashTableMod.Column
import typings.reactDashTable.reactDashTableMod.IdType
import typings.reactDashTable.reactDashTableMod.Meta
import typings.reactDashTable.reactDashTableMod.MetaBase
import typings.reactDashTable.reactDashTableMod.TableState
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action[D /* <: js.Object */] extends js.Object {
  var defaultColumn: Partial[Column[D]]
  var initialRowStateKey: IdType[D]
  var initialState: Partial[TableState[D]]
  def getRowId(originalRow: D, relativeIndex: Double): IdType[D]
  def getSubRows(originalRow: D, relativeIndex: Double): js.Array[D]
  def reducer(newState: TableState[D], action: ActionType, previousState: TableState[D]): TableState[D]
  def useControlledState(state: TableState[D], meta: Meta[D, scala.Nothing, MetaBase[D]]): TableState[D]
}

object Anon_Action {
  @scala.inline
  def apply[D /* <: js.Object */](
    defaultColumn: Partial[Column[D]],
    getRowId: (D, Double) => IdType[D],
    getSubRows: (D, Double) => js.Array[D],
    initialRowStateKey: IdType[D],
    initialState: Partial[TableState[D]],
    reducer: (TableState[D], ActionType, TableState[D]) => TableState[D],
    useControlledState: (TableState[D], Meta[D, scala.Nothing, MetaBase[D]]) => TableState[D]
  ): Anon_Action[D] = {
    val __obj = js.Dynamic.literal(defaultColumn = defaultColumn.asInstanceOf[js.Any], getRowId = js.Any.fromFunction2(getRowId), getSubRows = js.Any.fromFunction2(getSubRows), initialRowStateKey = initialRowStateKey.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], reducer = js.Any.fromFunction3(reducer), useControlledState = js.Any.fromFunction2(useControlledState))
  
    __obj.asInstanceOf[Anon_Action[D]]
  }
}

