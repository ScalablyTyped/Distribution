package typings.reactDashTooltip.reactDashTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SanitizeHtmlOptions extends js.Object {
  var allowedAttributes: js.UndefOr[js.Any] = js.undefined
  var allowedSchemes: js.UndefOr[js.Array[String]] = js.undefined
  var allowedTags: js.UndefOr[js.Array[String]] = js.undefined
  var parser: js.UndefOr[SanitizeHtmlParserOptions] = js.undefined
  var selfClosing: js.UndefOr[js.Array[String]] = js.undefined
}

object SanitizeHtmlOptions {
  @scala.inline
  def apply(
    allowedAttributes: js.Any = null,
    allowedSchemes: js.Array[String] = null,
    allowedTags: js.Array[String] = null,
    parser: SanitizeHtmlParserOptions = null,
    selfClosing: js.Array[String] = null
  ): SanitizeHtmlOptions = {
    val __obj = js.Dynamic.literal()
    if (allowedAttributes != null) __obj.updateDynamic("allowedAttributes")(allowedAttributes.asInstanceOf[js.Any])
    if (allowedSchemes != null) __obj.updateDynamic("allowedSchemes")(allowedSchemes.asInstanceOf[js.Any])
    if (allowedTags != null) __obj.updateDynamic("allowedTags")(allowedTags.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (selfClosing != null) __obj.updateDynamic("selfClosing")(selfClosing.asInstanceOf[js.Any])
    __obj.asInstanceOf[SanitizeHtmlOptions]
  }
}

