package typings.reactDataGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcelColumn extends js.Object {
  var editable: Boolean = js.native
  var filterable: Boolean = js.native
  var key: String = js.native
  var name: js.Any = js.native
  var resizeable: Boolean = js.native
  var width: Double = js.native
}

object ExcelColumn {
  @scala.inline
  def apply(
    editable: Boolean,
    filterable: Boolean,
    key: String,
    name: js.Any,
    resizeable: Boolean,
    width: Double
  ): ExcelColumn = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], filterable = filterable.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resizeable = resizeable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelColumn]
  }
  @scala.inline
  implicit class ExcelColumnOps[Self <: ExcelColumn] (val x: Self) extends AnyVal {
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
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterable(value: Boolean): Self = this.set("filterable", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResizeable(value: Boolean): Self = this.set("resizeable", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

