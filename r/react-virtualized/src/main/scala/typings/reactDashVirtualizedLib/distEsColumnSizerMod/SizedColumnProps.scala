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
    getColumnWidth: js.Function0[scala.Double],
    registerChild: js.Any
  ): SizedColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adjustedWidth")(adjustedWidth)
    __obj.updateDynamic("columnWidth")(columnWidth)
    __obj.updateDynamic("getColumnWidth")(getColumnWidth)
    __obj.updateDynamic("registerChild")(registerChild)
    __obj.asInstanceOf[SizedColumnProps]
  }
}

