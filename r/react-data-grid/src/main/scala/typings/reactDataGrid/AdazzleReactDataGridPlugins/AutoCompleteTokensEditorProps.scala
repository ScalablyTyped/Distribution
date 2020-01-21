package typings.reactDataGrid.AdazzleReactDataGridPlugins

import typings.reactDataGrid.AdazzleReactDataGrid.ExcelColumn
import typings.reactDataGrid.AnonCaption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteTokensEditorProps extends js.Object {
  var column: js.UndefOr[ExcelColumn] = js.undefined
  var options: js.Array[String | AnonCaption]
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object AutoCompleteTokensEditorProps {
  @scala.inline
  def apply(options: js.Array[String | AnonCaption], column: ExcelColumn = null, value: js.Array[_] = null): AutoCompleteTokensEditorProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteTokensEditorProps]
  }
}

