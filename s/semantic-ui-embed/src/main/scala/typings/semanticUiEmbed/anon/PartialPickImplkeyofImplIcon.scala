package typings.semanticUiEmbed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.MetadataSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.MetadataSettings._Impl>> */
trait PartialPickImplkeyofImplIcon extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplIcon {
  @scala.inline
  def apply(
    icon: String = null,
    id: String = null,
    placeholder: String = null,
    source: String = null,
    url: String = null
  ): PartialPickImplkeyofImplIcon = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplIcon]
  }
}

