package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldMask extends js.Object {
  var input_path: js.Array[String] = js.native
  var mask: js.UndefOr[FieldMaskMask] = js.native
}

object FieldMask {
  @scala.inline
  def apply(input_path: js.Array[String]): FieldMask = {
    val __obj = js.Dynamic.literal(input_path = input_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMask]
  }
  @scala.inline
  implicit class FieldMaskOps[Self <: FieldMask] (val x: Self) extends AnyVal {
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
    def setInput_pathVarargs(value: String*): Self = this.set("input_path", js.Array(value :_*))
    @scala.inline
    def setInput_path(value: js.Array[String]): Self = this.set("input_path", value.asInstanceOf[js.Any])
    @scala.inline
    def setMask(value: FieldMaskMask): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
  }
  
}

