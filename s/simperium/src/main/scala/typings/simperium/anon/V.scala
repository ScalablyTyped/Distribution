package typings.simperium.anon

import typings.simperium.mod.DiffOp
import typings.simperium.simperiumStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait V[T] extends DiffOp[T] {
  var o: r = js.native
  var v: T = js.native
}

object V {
  @scala.inline
  def apply[T](o: r, v: T): V[T] = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[V[T]]
  }
  @scala.inline
  implicit class VOps[Self <: V[_], T] (val x: Self with V[T]) extends AnyVal {
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
    def setO(value: r): Self = this.set("o", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: T): Self = this.set("v", value.asInstanceOf[js.Any])
  }
  
}

