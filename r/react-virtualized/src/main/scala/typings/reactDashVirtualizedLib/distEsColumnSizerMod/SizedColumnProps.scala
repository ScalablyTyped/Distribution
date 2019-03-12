package typings
package reactDashVirtualizedLib.distEsColumnSizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizedColumnProps extends js.Object {
  var adjustedWidth: scala.Double
  var columnWidth: scala.Double
  var registerChild: js.Any
  def getColumnWidth(): scala.Double
}

object SizedColumnProps {
  @scala.inline
  def apply(
    adjustedWidth: scala.Double,
    columnWidth: scala.Double,
    getColumnWidth: () => scala.Double,
    registerChild: js.Any
  ): SizedColumnProps = {
    val __obj = js.Dynamic.literal(adjustedWidth = adjustedWidth, columnWidth = columnWidth, getColumnWidth = js.Any.fromFunction0(getColumnWidth), registerChild = registerChild)
  
    __obj.asInstanceOf[SizedColumnProps]
  }
}

