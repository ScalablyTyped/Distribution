package typings.select2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reset extends js.Object {
  def reset(): Unit = js.native
  def set(key: String, value: js.Any): Unit = js.native
}

object Reset {
  @scala.inline
  def apply(reset: () => Unit, set: (String, js.Any) => Unit): Reset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Reset]
  }
  @scala.inline
  implicit class ResetOps[Self <: Reset] (val x: Self) extends AnyVal {
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
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

