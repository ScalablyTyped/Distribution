package typings.semanticUiEmbed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplEmbed extends js.Object {
  var embed: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var play: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplEmbed {
  @scala.inline
  def apply(embed: String = null, placeholder: String = null, play: String = null): PartialPickImplkeyofImplEmbed = {
    val __obj = js.Dynamic.literal()
    if (embed != null) __obj.updateDynamic("embed")(embed.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (play != null) __obj.updateDynamic("play")(play.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplEmbed]
  }
}

