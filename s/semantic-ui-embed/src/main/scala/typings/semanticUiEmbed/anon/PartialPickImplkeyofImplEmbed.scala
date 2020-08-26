package typings.semanticUiEmbed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplEmbed extends js.Object {
  var embed: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var play: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplEmbed {
  @scala.inline
  def apply(): PartialPickImplkeyofImplEmbed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplEmbed]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplEmbedOps[Self <: PartialPickImplkeyofImplEmbed] (val x: Self) extends AnyVal {
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
    def setEmbed(value: String): Self = this.set("embed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbed: Self = this.set("embed", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlay(value: String): Self = this.set("play", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
  }
  
}

