package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'html'> */
@js.native
trait PickImplhtml extends js.Object {
  var html: String | JQuery = js.native
}

object PickImplhtml {
  @scala.inline
  def apply(html: String | JQuery): PickImplhtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhtml]
  }
  @scala.inline
  implicit class PickImplhtmlOps[Self <: PickImplhtml] (val x: Self) extends AnyVal {
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
    def setHtml(value: String | JQuery): Self = this.set("html", value.asInstanceOf[js.Any])
  }
  
}

