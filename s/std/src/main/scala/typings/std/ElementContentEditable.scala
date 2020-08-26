package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementContentEditable extends js.Object {
  var contentEditable: java.lang.String = js.native
  var inputMode: java.lang.String = js.native
  val isContentEditable: scala.Boolean = js.native
}

object ElementContentEditable {
  @scala.inline
  def apply(contentEditable: java.lang.String, inputMode: java.lang.String, isContentEditable: scala.Boolean): ElementContentEditable = {
    val __obj = js.Dynamic.literal(contentEditable = contentEditable.asInstanceOf[js.Any], inputMode = inputMode.asInstanceOf[js.Any], isContentEditable = isContentEditable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementContentEditable]
  }
  @scala.inline
  implicit class ElementContentEditableOps[Self <: ElementContentEditable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentEditable(value: java.lang.String): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputMode(value: java.lang.String): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsContentEditable(value: scala.Boolean): Self = this.set("isContentEditable", value.asInstanceOf[js.Any])
  }
  
}

