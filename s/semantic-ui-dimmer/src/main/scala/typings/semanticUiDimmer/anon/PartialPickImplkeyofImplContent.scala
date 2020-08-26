package typings.semanticUiDimmer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplContent extends js.Object {
  var content: js.UndefOr[String] = js.native
  var dimmable: js.UndefOr[String] = js.native
  var dimmer: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplContent {
  @scala.inline
  def apply(): PartialPickImplkeyofImplContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplContent]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplContentOps[Self <: PartialPickImplkeyofImplContent] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDimmable(value: String): Self = this.set("dimmable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimmable: Self = this.set("dimmable", js.undefined)
    @scala.inline
    def setDimmer(value: String): Self = this.set("dimmer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimmer: Self = this.set("dimmer", js.undefined)
  }
  
}

