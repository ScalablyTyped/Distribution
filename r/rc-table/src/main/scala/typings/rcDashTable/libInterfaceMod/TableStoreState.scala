package typings.rcDashTable.libInterfaceMod

import typings.rcDashTable.rcDashTableStrings.auto
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableStoreState extends js.Object {
  var currentHoverKey: Key
  var expandedRowKeys: js.Array[Key]
  var expandedRowsHeight: Record[Key, Double]
  var fixedColumnsBodyRowsHeight: Record[Key, Double]
  var fixedColumnsHeadRowsHeight: Record[Key, Double | auto]
}

object TableStoreState {
  @scala.inline
  def apply(
    currentHoverKey: Key,
    expandedRowKeys: js.Array[Key],
    expandedRowsHeight: Record[Key, Double],
    fixedColumnsBodyRowsHeight: Record[Key, Double],
    fixedColumnsHeadRowsHeight: Record[Key, Double | auto]
  ): TableStoreState = {
    val __obj = js.Dynamic.literal(currentHoverKey = currentHoverKey.asInstanceOf[js.Any], expandedRowKeys = expandedRowKeys, expandedRowsHeight = expandedRowsHeight, fixedColumnsBodyRowsHeight = fixedColumnsBodyRowsHeight, fixedColumnsHeadRowsHeight = fixedColumnsHeadRowsHeight)
  
    __obj.asInstanceOf[TableStoreState]
  }
}

