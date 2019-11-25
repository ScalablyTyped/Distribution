package typings.reactDashVirtualized.distEsColumnSizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizedColumnProps extends js.Object {
  var adjustedWidth: Double
  var columnWidth: Double
  var registerChild: js.Any
  def getColumnWidth(): Double
}

object SizedColumnProps {
  @scala.inline
  def apply(adjustedWidth: Double, columnWidth: Double, getColumnWidth: () => Double, registerChild: js.Any): SizedColumnProps = {
    val __obj = js.Dynamic.literal(adjustedWidth = adjustedWidth.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], getColumnWidth = js.Any.fromFunction0(getColumnWidth), registerChild = registerChild.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SizedColumnProps]
  }
}

