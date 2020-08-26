package typings.ratelimiter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limiter extends js.Object {
  def get(fn: js.Function2[/* err */ js.Any, /* info */ LimiterInfo, Unit]): Unit = js.native
  def inspect(): String = js.native
}

object Limiter {
  @scala.inline
  def apply(get: js.Function2[/* err */ js.Any, /* info */ LimiterInfo, Unit] => Unit, inspect: () => String): Limiter = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), inspect = js.Any.fromFunction0(inspect))
    __obj.asInstanceOf[Limiter]
  }
  @scala.inline
  implicit class LimiterOps[Self <: Limiter] (val x: Self) extends AnyVal {
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
    def setGet(value: js.Function2[/* err */ js.Any, /* info */ LimiterInfo, Unit] => Unit): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInspect(value: () => String): Self = this.set("inspect", js.Any.fromFunction0(value))
  }
  
}

