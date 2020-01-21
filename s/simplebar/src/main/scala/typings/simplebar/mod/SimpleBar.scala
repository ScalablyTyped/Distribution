package typings.simplebar.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleBar extends js.Object {
  def getContentElement(): Element
  def getScrollElement(): Element
  def recalculate(): Unit
}

object SimpleBar {
  @scala.inline
  def apply(getContentElement: () => Element, getScrollElement: () => Element, recalculate: () => Unit): SimpleBar = {
    val __obj = js.Dynamic.literal(getContentElement = js.Any.fromFunction0(getContentElement), getScrollElement = js.Any.fromFunction0(getScrollElement), recalculate = js.Any.fromFunction0(recalculate))
  
    __obj.asInstanceOf[SimpleBar]
  }
}

