package typings.reactTable

import typings.reactTable.mod.ActionType
import typings.reactTable.mod.Column
import typings.reactTable.mod.IdType
import typings.reactTable.mod.Meta
import typings.reactTable.mod.MetaBase
import typings.reactTable.mod.Row
import typings.reactTable.mod.TableState
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAction[D /* <: js.Object */] extends js.Object {
  var defaultColumn: Partial[Column[D]] = js.native
  var initialRowStateKey: IdType[D] = js.native
  var initialState: Partial[TableState[D]] = js.native
  def getRowId(originalRow: D, relativeIndex: Double): String = js.native
  def getRowId(originalRow: D, relativeIndex: Double, parent: Row[D]): String = js.native
  def getSubRows(originalRow: D, relativeIndex: Double): js.Array[D] = js.native
  def reducer(newState: TableState[D], action: ActionType, previousState: TableState[D]): TableState[D] = js.native
  def useControlledState(state: TableState[D], meta: Meta[D, scala.Nothing, MetaBase[D]]): TableState[D] = js.native
}

