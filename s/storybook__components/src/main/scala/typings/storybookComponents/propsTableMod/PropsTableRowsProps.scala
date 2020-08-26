package typings.storybookComponents.propsTableMod

import typings.storybookComponents.propDefMod.PropDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsTableRowsProps extends PropsTableProps {
  var rows: js.Array[PropDef] = js.native
}

object PropsTableRowsProps {
  @scala.inline
  def apply(rows: js.Array[PropDef]): PropsTableRowsProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsTableRowsProps]
  }
  @scala.inline
  implicit class PropsTableRowsPropsOps[Self <: PropsTableRowsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRowsVarargs(value: PropDef*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[PropDef]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

