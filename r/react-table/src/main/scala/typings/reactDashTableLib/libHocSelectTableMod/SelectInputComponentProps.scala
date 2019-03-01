package typings
package reactDashTableLib.libHocSelectTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectInputComponentProps extends js.Object {
  var checked: scala.Boolean
  var id: java.lang.String
  var row: js.Any
  var selectType: SelectType
  def onClick(key: java.lang.String, shiftKeyPressed: scala.Boolean, row: js.Any): js.Any
}

object SelectInputComponentProps {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    id: java.lang.String,
    onClick: js.Function3[java.lang.String, scala.Boolean, js.Any, js.Any],
    row: js.Any,
    selectType: SelectType
  ): SelectInputComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checked")(checked)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("onClick")(onClick)
    __obj.updateDynamic("row")(row)
    __obj.updateDynamic("selectType")(selectType)
    __obj.asInstanceOf[SelectInputComponentProps]
  }
}

