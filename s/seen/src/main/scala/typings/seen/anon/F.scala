package typings.seen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait F extends js.Object {
  def f(f: js.Any): js.Any = js.native
  def v(v: js.Any): js.Any = js.native
}

object F {
  @scala.inline
  def apply(f: js.Any => js.Any, v: js.Any => js.Any): F = {
    val __obj = js.Dynamic.literal(f = js.Any.fromFunction1(f), v = js.Any.fromFunction1(v))
    __obj.asInstanceOf[F]
  }
  @scala.inline
  implicit class FOps[Self <: F] (val x: Self) extends AnyVal {
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
    def setF(value: js.Any => js.Any): Self = this.set("f", js.Any.fromFunction1(value))
    @scala.inline
    def setV(value: js.Any => js.Any): Self = this.set("v", js.Any.fromFunction1(value))
  }
  
}

