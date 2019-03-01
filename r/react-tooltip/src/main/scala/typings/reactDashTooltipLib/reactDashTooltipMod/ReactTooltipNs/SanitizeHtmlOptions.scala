package typings
package reactDashTooltipLib.reactDashTooltipMod.ReactTooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SanitizeHtmlOptions extends js.Object {
  var allowedAttributes: js.UndefOr[js.Any] = js.undefined
  var allowedSchemes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var allowedTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var parser: js.UndefOr[SanitizeHtmlParserOptions] = js.undefined
  var selfClosing: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SanitizeHtmlOptions {
  @scala.inline
  def apply(
    allowedAttributes: js.Any = null,
    allowedSchemes: js.Array[java.lang.String] = null,
    allowedTags: js.Array[java.lang.String] = null,
    parser: SanitizeHtmlParserOptions = null,
    selfClosing: js.Array[java.lang.String] = null
  ): SanitizeHtmlOptions = {
    val __obj = js.Dynamic.literal()
    if (allowedAttributes != null) __obj.updateDynamic("allowedAttributes")(allowedAttributes)
    if (allowedSchemes != null) __obj.updateDynamic("allowedSchemes")(allowedSchemes)
    if (allowedTags != null) __obj.updateDynamic("allowedTags")(allowedTags)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (selfClosing != null) __obj.updateDynamic("selfClosing")(selfClosing)
    __obj.asInstanceOf[SanitizeHtmlOptions]
  }
}

