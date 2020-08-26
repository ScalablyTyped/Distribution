package typings.reactInspector.mod

import typings.reactInspector.reactInspectorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InspectorAsTableProps
  extends TableInspectorProps
     with InspectorBaseProps
     with InspectorProps {
  @JSName("table")
  var table_InspectorAsTableProps: `true` = js.native
}

object InspectorAsTableProps {
  @scala.inline
  def apply(table: `true`): InspectorAsTableProps = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorAsTableProps]
  }
  @scala.inline
  implicit class InspectorAsTablePropsOps[Self <: InspectorAsTableProps] (val x: Self) extends AnyVal {
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
    def setTable(value: `true`): Self = this.set("table", value.asInstanceOf[js.Any])
  }
  
}

