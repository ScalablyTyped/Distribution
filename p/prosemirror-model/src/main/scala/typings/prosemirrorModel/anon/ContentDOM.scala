package typings.prosemirrorModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentDOM extends js.Object {
  var contentDOM: js.UndefOr[typings.std.Node | Null] = js.native
  var dom: typings.std.Node = js.native
}

object ContentDOM {
  @scala.inline
  def apply(dom: typings.std.Node): ContentDOM = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDOM]
  }
  @scala.inline
  implicit class ContentDOMOps[Self <: ContentDOM] (val x: Self) extends AnyVal {
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
    def setDom(value: typings.std.Node): Self = this.set("dom", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentDOM(value: typings.std.Node): Self = this.set("contentDOM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDOM: Self = this.set("contentDOM", js.undefined)
    @scala.inline
    def setContentDOMNull: Self = this.set("contentDOM", null)
  }
  
}

