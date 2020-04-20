package typings.reactDataGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorBaseProps extends js.Object {
  var column: ExcelColumn
  var height: Double
  var rowData: js.Any
  var rowMetaData: js.Any
  var value: js.Any
  def onBlur(): Unit
  def onCommit(): Unit
  def onCommitCancel(): Unit
}

object EditorBaseProps {
  @scala.inline
  def apply(
    column: ExcelColumn,
    height: Double,
    onBlur: () => Unit,
    onCommit: () => Unit,
    onCommitCancel: () => Unit,
    rowData: js.Any,
    rowMetaData: js.Any,
    value: js.Any
  ): EditorBaseProps = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onCommit = js.Any.fromFunction0(onCommit), onCommitCancel = js.Any.fromFunction0(onCommitCancel), rowData = rowData.asInstanceOf[js.Any], rowMetaData = rowMetaData.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorBaseProps]
  }
}

