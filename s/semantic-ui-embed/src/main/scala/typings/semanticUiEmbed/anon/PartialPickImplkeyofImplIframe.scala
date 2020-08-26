package typings.semanticUiEmbed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplIframe extends js.Object {
  var iframe: js.UndefOr[js.Function2[/* url */ String, /* parameters */ String, String]] = js.native
  var placeholder: js.UndefOr[js.Function2[/* image */ String, /* icon */ String, String]] = js.native
}

object PartialPickImplkeyofImplIframe {
  @scala.inline
  def apply(): PartialPickImplkeyofImplIframe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplIframe]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplIframeOps[Self <: PartialPickImplkeyofImplIframe] (val x: Self) extends AnyVal {
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
    def setIframe(value: (/* url */ String, /* parameters */ String) => String): Self = this.set("iframe", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIframe: Self = this.set("iframe", js.undefined)
    @scala.inline
    def setPlaceholder(value: (/* image */ String, /* icon */ String) => String): Self = this.set("placeholder", js.Any.fromFunction2(value))
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
  }
  
}

