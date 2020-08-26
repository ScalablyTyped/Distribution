package typings.rcFieldForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Max extends js.Object {
  var len: String = js.native
  var max: String = js.native
  var min: String = js.native
  var range: String = js.native
}

object Max {
  @scala.inline
  def apply(len: String, max: String, min: String, range: String): Max = {
    val __obj = js.Dynamic.literal(len = len.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
  @scala.inline
  implicit class MaxOps[Self <: Max] (val x: Self) extends AnyVal {
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
    def setLen(value: String): Self = this.set("len", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
  }
  
}

