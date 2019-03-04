package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandColumnComponentProps extends js.Object {
  /**
  	 * True if the current row is able to be expanded.
  	 */
  var isExpandableRow: scala.Boolean
  /**
  	 * True if the current row is currently expanded.
  	 */
  var isExpanded: scala.Boolean
}

object ExpandColumnComponentProps {
  @scala.inline
  def apply(isExpandableRow: scala.Boolean, isExpanded: scala.Boolean): ExpandColumnComponentProps = {
    val __obj = js.Dynamic.literal(isExpandableRow = isExpandableRow, isExpanded = isExpanded)
  
    __obj.asInstanceOf[ExpandColumnComponentProps]
  }
}

