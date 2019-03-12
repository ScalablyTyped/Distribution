package typings
package simplebarLib.simplebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleBar extends js.Object {
  def getContentElement(): stdLib.Element
  def getScrollElement(): stdLib.Element
  def recalculate(): scala.Unit
}

object SimpleBar {
  @scala.inline
  def apply(
    getContentElement: () => stdLib.Element,
    getScrollElement: () => stdLib.Element,
    recalculate: () => scala.Unit
  ): SimpleBar = {
    val __obj = js.Dynamic.literal(getContentElement = js.Any.fromFunction0(getContentElement), getScrollElement = js.Any.fromFunction0(getScrollElement), recalculate = js.Any.fromFunction0(recalculate))
  
    __obj.asInstanceOf[SimpleBar]
  }
}

