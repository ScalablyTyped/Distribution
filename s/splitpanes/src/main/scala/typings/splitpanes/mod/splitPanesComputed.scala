package typings.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait splitPanesComputed extends js.Object {
  def defaultWidth(): Double = js.native
}

object splitPanesComputed {
  @scala.inline
  def apply(defaultWidth: () => Double): splitPanesComputed = {
    val __obj = js.Dynamic.literal(defaultWidth = js.Any.fromFunction0(defaultWidth))
    __obj.asInstanceOf[splitPanesComputed]
  }
  @scala.inline
  implicit class splitPanesComputedOps[Self <: splitPanesComputed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultWidth(value: () => Double): Self = this.set("defaultWidth", js.Any.fromFunction0(value))
  }
  
}

