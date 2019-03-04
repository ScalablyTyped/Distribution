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
    onBlur: js.Function0[scala.Unit],
    onCommit: js.Function0[scala.Unit],
    onCommitCancel: js.Function0[scala.Unit],
    rowData: js.Any,
    rowMetaData: js.Any,
    value: js.Any
  ): EditorBaseProps = {
    val __obj = js.Dynamic.literal(column = column, height = height, onBlur = onBlur, onCommit = onCommit, onCommitCancel = onCommitCancel, rowData = rowData, rowMetaData = rowMetaData, value = value)
  
    __obj.asInstanceOf[EditorBaseProps]
  }
}

