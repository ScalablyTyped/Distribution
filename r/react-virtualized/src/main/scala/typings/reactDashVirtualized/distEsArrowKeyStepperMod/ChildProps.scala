package typings.reactDashVirtualized.distEsArrowKeyStepperMod

import typings.reactDashVirtualized.distEsGridMod.RenderedSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildProps extends js.Object {
  var scrollToColumn: Double
  var scrollToRow: Double
  def onSectionRendered(params: RenderedSection): Unit
}

object ChildProps {
  @scala.inline
  def apply(onSectionRendered: RenderedSection => Unit, scrollToColumn: Double, scrollToRow: Double): ChildProps = {
    val __obj = js.Dynamic.literal(onSectionRendered = js.Any.fromFunction1(onSectionRendered), scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChildProps]
  }
}

