package typings.atStorybookComponents.distTooltipWithTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithHideFn extends js.Object {
  def onHide(): Unit
}

object WithHideFn {
  @scala.inline
  def apply(onHide: () => Unit): WithHideFn = {
    val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
  
    __obj.asInstanceOf[WithHideFn]
  }
}

