package typings.rcNotification.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Right extends js.Object {
  var right: String = js.native
}

object Right {
  @scala.inline
  def apply(right: String): Right = {
    val __obj = js.Dynamic.literal(right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Right]
  }
  @scala.inline
  implicit class RightOps[Self <: Right] (val x: Self) extends AnyVal {
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
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
  }
  
}

