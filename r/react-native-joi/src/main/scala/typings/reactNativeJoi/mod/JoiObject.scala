package typings.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoiObject extends js.Object {
  var isJoi: Boolean = js.native
}

object JoiObject {
  @scala.inline
  def apply(isJoi: Boolean): JoiObject = {
    val __obj = js.Dynamic.literal(isJoi = isJoi.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoiObject]
  }
  @scala.inline
  implicit class JoiObjectOps[Self <: JoiObject] (val x: Self) extends AnyVal {
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
    def setIsJoi(value: Boolean): Self = this.set("isJoi", value.asInstanceOf[js.Any])
  }
  
}

