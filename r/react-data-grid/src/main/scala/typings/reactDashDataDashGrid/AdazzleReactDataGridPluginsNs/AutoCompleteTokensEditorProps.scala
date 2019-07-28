package typings.reactDashDataDashGrid.AdazzleReactDataGridPluginsNs

import typings.reactDashDataDashGrid.AdazzleReactDataGridNs.ExcelColumn
import typings.reactDashDataDashGrid.Anon_Caption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteTokensEditorProps extends js.Object {
  var column: js.UndefOr[ExcelColumn] = js.undefined
  var options: js.Array[String | Anon_Caption]
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object AutoCompleteTokensEditorProps {
  @scala.inline
  def apply(options: js.Array[String | Anon_Caption], column: ExcelColumn = null, value: js.Array[_] = null): AutoCompleteTokensEditorProps = {
    val __obj = js.Dynamic.literal(options = options)
    if (column != null) __obj.updateDynamic("column")(column)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AutoCompleteTokensEditorProps]
  }
}

