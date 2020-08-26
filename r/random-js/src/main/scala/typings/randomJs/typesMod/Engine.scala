package typings.randomJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Engine extends js.Object {
  def next(): Double = js.native
}

object Engine {
  @scala.inline
  def apply(next: () => Double): Engine = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Engine]
  }
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
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
    def setNext(value: () => Double): Self = this.set("next", js.Any.fromFunction0(value))
  }
  
}

