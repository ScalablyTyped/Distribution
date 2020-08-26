package typings.safariExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariExtensionGlobalPage extends js.Object {
  var contentWindow: Window = js.native
}

object SafariExtensionGlobalPage {
  @scala.inline
  def apply(contentWindow: Window): SafariExtensionGlobalPage = {
    val __obj = js.Dynamic.literal(contentWindow = contentWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariExtensionGlobalPage]
  }
  @scala.inline
  implicit class SafariExtensionGlobalPageOps[Self <: SafariExtensionGlobalPage] (val x: Self) extends AnyVal {
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
    def setContentWindow(value: Window): Self = this.set("contentWindow", value.asInstanceOf[js.Any])
  }
  
}

