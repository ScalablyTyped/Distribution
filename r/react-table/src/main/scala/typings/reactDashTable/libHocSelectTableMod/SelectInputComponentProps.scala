package typings.reactDashTable.libHocSelectTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectInputComponentProps extends js.Object {
  var checked: Boolean
  var id: String
  var row: js.Any
  var selectType: SelectType
  def onClick(key: String, shiftKeyPressed: Boolean, row: js.Any): js.Any
}

object SelectInputComponentProps {
  @scala.inline
  def apply(
    checked: Boolean,
    id: String,
    onClick: (String, Boolean, js.Any) => js.Any,
    row: js.Any,
    selectType: SelectType
  ): SelectInputComponentProps = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction3(onClick), row = row.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectInputComponentProps]
  }
}

