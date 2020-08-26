package typings.reactTextMask.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SomeCharsRejected extends js.Object {
  var someCharsRejected: Boolean = js.native
}

object SomeCharsRejected {
  @scala.inline
  def apply(someCharsRejected: Boolean): SomeCharsRejected = {
    val __obj = js.Dynamic.literal(someCharsRejected = someCharsRejected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeCharsRejected]
  }
  @scala.inline
  implicit class SomeCharsRejectedOps[Self <: SomeCharsRejected] (val x: Self) extends AnyVal {
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
    def setSomeCharsRejected(value: Boolean): Self = this.set("someCharsRejected", value.asInstanceOf[js.Any])
  }
  
}

