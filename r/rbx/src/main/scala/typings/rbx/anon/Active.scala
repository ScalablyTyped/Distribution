package typings.rbx.anon

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Active extends js.Object {
  var active: Requireable[Boolean] = js.native
  var clipped: Requireable[Boolean] = js.native
  var closeOnBlur: Requireable[Boolean] = js.native
  var closeOnEsc: Requireable[Boolean] = js.native
  var containerClassName: Requireable[String] = js.native
  var document: Requireable[js.Object] = js.native
  var onClose: Requireable[js.Function1[/* repeated */ _, _]] = js.native
}

object Active {
  @scala.inline
  def apply(
    active: Requireable[Boolean],
    clipped: Requireable[Boolean],
    closeOnBlur: Requireable[Boolean],
    closeOnEsc: Requireable[Boolean],
    containerClassName: Requireable[String],
    document: Requireable[js.Object],
    onClose: Requireable[js.Function1[/* repeated */ _, _]]
  ): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], clipped = clipped.asInstanceOf[js.Any], closeOnBlur = closeOnBlur.asInstanceOf[js.Any], closeOnEsc = closeOnEsc.asInstanceOf[js.Any], containerClassName = containerClassName.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  @scala.inline
  implicit class ActiveOps[Self <: Active] (val x: Self) extends AnyVal {
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
    def setActive(value: Requireable[Boolean]): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setClipped(value: Requireable[Boolean]): Self = this.set("clipped", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseOnBlur(value: Requireable[Boolean]): Self = this.set("closeOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseOnEsc(value: Requireable[Boolean]): Self = this.set("closeOnEsc", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerClassName(value: Requireable[String]): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocument(value: Requireable[js.Object]): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClose(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onClose", value.asInstanceOf[js.Any])
  }
  
}

