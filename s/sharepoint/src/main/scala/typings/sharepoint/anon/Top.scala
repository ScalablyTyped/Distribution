package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Top extends js.Object {
  var left: js.Any = js.native
  var top: js.Any = js.native
}

object Top {
  @scala.inline
  def apply(left: js.Any, top: js.Any): Top = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Top]
  }
  @scala.inline
  implicit class TopOps[Self <: Top] (val x: Self) extends AnyVal {
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
    def setLeft(value: js.Any): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: js.Any): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

