package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorBaseProps extends js.Object {
  var column: ExcelColumn
  var height: scala.Double
  var rowData: js.Any
  var rowMetaData: js.Any
  var value: js.Any
  def onBlur(): scala.Unit
  def onCommit(): scala.Unit
  def onCommitCancel(): scala.Unit
}

object EditorBaseProps {
  @scala.inline
  def apply(
    column: ExcelColumn,
    height: scala.Double,
    onBlur: () => scala.Unit,
    onCommit: () => scala.Unit,
    onCommitCancel: () => scala.Unit,
    rowData: js.Any,
    rowMetaData: js.Any,
    value: js.Any
  ): EditorBaseProps = {
    val __obj = js.Dynamic.literal(column = column, height = height, onBlur = js.Any.fromFunction0(onBlur), onCommit = js.Any.fromFunction0(onCommit), onCommitCancel = js.Any.fromFunction0(onCommitCancel), rowData = rowData, rowMetaData = rowMetaData, value = value)
  
    __obj.asInstanceOf[EditorBaseProps]
  }
}

