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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("onBlur")(onBlur)
    __obj.updateDynamic("onCommit")(onCommit)
    __obj.updateDynamic("onCommitCancel")(onCommitCancel)
    __obj.updateDynamic("rowData")(rowData)
    __obj.updateDynamic("rowMetaData")(rowMetaData)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EditorBaseProps]
  }
}

