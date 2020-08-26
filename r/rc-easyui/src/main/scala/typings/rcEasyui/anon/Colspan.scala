package typings.rcEasyui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Colspan extends js.Object {
  var colspan: Double = js.native
  var defaultFilterOperator: String = js.native
  var editable: Boolean = js.native
  var expander: Boolean = js.native
  var filterOperators: js.Array[_] = js.native
  var filterable: Boolean = js.native
  var frozen: Boolean = js.native
  var order: String = js.native
  var rowspan: Double = js.native
  var sortable: Boolean = js.native
}

object Colspan {
  @scala.inline
  def apply(
    colspan: Double,
    defaultFilterOperator: String,
    editable: Boolean,
    expander: Boolean,
    filterOperators: js.Array[_],
    filterable: Boolean,
    frozen: Boolean,
    order: String,
    rowspan: Double,
    sortable: Boolean
  ): Colspan = {
    val __obj = js.Dynamic.literal(colspan = colspan.asInstanceOf[js.Any], defaultFilterOperator = defaultFilterOperator.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], expander = expander.asInstanceOf[js.Any], filterOperators = filterOperators.asInstanceOf[js.Any], filterable = filterable.asInstanceOf[js.Any], frozen = frozen.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], rowspan = rowspan.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colspan]
  }
  @scala.inline
  implicit class ColspanOps[Self <: Colspan] (val x: Self) extends AnyVal {
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
    def setColspan(value: Double): Self = this.set("colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultFilterOperator(value: String): Self = this.set("defaultFilterOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpander(value: Boolean): Self = this.set("expander", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterOperatorsVarargs(value: js.Any*): Self = this.set("filterOperators", js.Array(value :_*))
    @scala.inline
    def setFilterOperators(value: js.Array[_]): Self = this.set("filterOperators", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterable(value: Boolean): Self = this.set("filterable", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrozen(value: Boolean): Self = this.set("frozen", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowspan(value: Double): Self = this.set("rowspan", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
  }
  
}

