package typings.semanticUiEmbed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl>> */
trait PartialPickImplkeyofImplIframe extends js.Object {
  var iframe: js.UndefOr[js.Function2[/* url */ String, /* parameters */ String, String]] = js.undefined
  var placeholder: js.UndefOr[js.Function2[/* image */ String, /* icon */ String, String]] = js.undefined
}

object PartialPickImplkeyofImplIframe {
  @scala.inline
  def apply(
    iframe: (/* url */ String, /* parameters */ String) => String = null,
    placeholder: (/* image */ String, /* icon */ String) => String = null
  ): PartialPickImplkeyofImplIframe = {
    val __obj = js.Dynamic.literal()
    if (iframe != null) __obj.updateDynamic("iframe")(js.Any.fromFunction2(iframe))
    if (placeholder != null) __obj.updateDynamic("placeholder")(js.Any.fromFunction2(placeholder))
    __obj.asInstanceOf[PartialPickImplkeyofImplIframe]
  }
}

