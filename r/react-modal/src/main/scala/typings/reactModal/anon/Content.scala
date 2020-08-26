package typings.reactModal.anon

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content extends js.Object {
  var content: Null | HTMLDivElement = js.native
  var overlay: Null | HTMLDivElement = js.native
}

object Content {
  @scala.inline
  def apply(): Content = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
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
    def setContent(value: HTMLDivElement): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    @scala.inline
    def setOverlay(value: HTMLDivElement): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayNull: Self = this.set("overlay", null)
  }
  
}

