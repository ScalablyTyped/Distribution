package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColHTMLAttributes[T] extends HTMLAttributes[T] {
  var span: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object ColHTMLAttributes {
  @scala.inline
  def apply[T](): ColHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColHTMLAttributes[T]]
  }
  @scala.inline
  implicit class ColHTMLAttributesOps[Self <: ColHTMLAttributes[_], T] (val x: Self with ColHTMLAttributes[T]) extends AnyVal {
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
    def setSpan(value: Double): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

