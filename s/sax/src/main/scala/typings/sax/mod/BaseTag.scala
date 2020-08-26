package typings.sax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTag extends js.Object {
  var isSelfClosing: Boolean = js.native
  var name: String = js.native
}

object BaseTag {
  @scala.inline
  def apply(isSelfClosing: Boolean, name: String): BaseTag = {
    val __obj = js.Dynamic.literal(isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTag]
  }
  @scala.inline
  implicit class BaseTagOps[Self <: BaseTag] (val x: Self) extends AnyVal {
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
    def setIsSelfClosing(value: Boolean): Self = this.set("isSelfClosing", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

