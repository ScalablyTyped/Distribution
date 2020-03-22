package typings.storybookComponents.withTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithHideFn extends js.Object {
  def onHide(): Unit = js.native
}

object WithHideFn {
  @scala.inline
  def apply(onHide: () => Unit): WithHideFn = {
    val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
  
    __obj.asInstanceOf[WithHideFn]
  }
}

