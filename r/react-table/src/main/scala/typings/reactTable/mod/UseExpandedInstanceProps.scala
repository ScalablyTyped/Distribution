package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseExpandedInstanceProps[D /* <: js.Object */] extends js.Object {
  var expandedDepth: Double
  var rows: js.Array[Row[D]]
  def toggleExpanded(id: js.Array[IdType[D]], isExpanded: Boolean): Unit
}

object UseExpandedInstanceProps {
  @scala.inline
  def apply[D /* <: js.Object */](
    expandedDepth: Double,
    rows: js.Array[Row[D]],
    toggleExpanded: (js.Array[IdType[D]], Boolean) => Unit
  ): UseExpandedInstanceProps[D] = {
    val __obj = js.Dynamic.literal(expandedDepth = expandedDepth.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], toggleExpanded = js.Any.fromFunction2(toggleExpanded))
  
    __obj.asInstanceOf[UseExpandedInstanceProps[D]]
  }
}

