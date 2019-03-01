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
    getContentElement: js.Function0[stdLib.Element],
    getScrollElement: js.Function0[stdLib.Element],
    recalculate: js.Function0[scala.Unit]
  ): SimpleBar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContentElement")(getContentElement)
    __obj.updateDynamic("getScrollElement")(getScrollElement)
    __obj.updateDynamic("recalculate")(recalculate)
    __obj.asInstanceOf[SimpleBar]
  }
}

