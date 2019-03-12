package typings
package reactDashVirtualizedLib.distEsArrowKeyStepperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildProps extends js.Object {
  var scrollToColumn: scala.Double
  var scrollToRow: scala.Double
  def onSectionRendered(params: reactDashVirtualizedLib.distEsGridMod.RenderedSection): scala.Unit
}

object ChildProps {
  @scala.inline
  def apply(
    onSectionRendered: reactDashVirtualizedLib.distEsGridMod.RenderedSection => scala.Unit,
    scrollToColumn: scala.Double,
    scrollToRow: scala.Double
  ): ChildProps = {
    val __obj = js.Dynamic.literal(onSectionRendered = js.Any.fromFunction1(onSectionRendered), scrollToColumn = scrollToColumn, scrollToRow = scrollToRow)
  
    __obj.asInstanceOf[ChildProps]
  }
}

