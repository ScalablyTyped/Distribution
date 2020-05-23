package typings.rcEasyui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colspan extends js.Object {
  var colspan: Double
  var defaultFilterOperator: String
  var editable: Boolean
  var expander: Boolean
  var filterOperators: js.Array[_]
  var filterable: Boolean
  var frozen: Boolean
  var order: String
  var rowspan: Double
  var sortable: Boolean
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
}

