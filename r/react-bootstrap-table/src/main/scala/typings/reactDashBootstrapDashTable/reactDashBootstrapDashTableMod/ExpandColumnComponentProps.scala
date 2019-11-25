package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandColumnComponentProps extends js.Object {
  /**
  	 * True if the current row is able to be expanded.
  	 */
  var isExpandableRow: Boolean
  /**
  	 * True if the current row is currently expanded.
  	 */
  var isExpanded: Boolean
}

object ExpandColumnComponentProps {
  @scala.inline
  def apply(isExpandableRow: Boolean, isExpanded: Boolean): ExpandColumnComponentProps = {
    val __obj = js.Dynamic.literal(isExpandableRow = isExpandableRow.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExpandColumnComponentProps]
  }
}

