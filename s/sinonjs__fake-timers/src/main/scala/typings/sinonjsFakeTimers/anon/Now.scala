package typings.sinonjsFakeTimers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Now extends js.Object {
  def now(): Double = js.native
}

object Now {
  @scala.inline
  def apply(now: () => Double): Now = {
    val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
    __obj.asInstanceOf[Now]
  }
  @scala.inline
  implicit class NowOps[Self <: Now] (val x: Self) extends AnyVal {
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
    def setNow(value: () => Double): Self = this.set("now", js.Any.fromFunction0(value))
  }
  
}

