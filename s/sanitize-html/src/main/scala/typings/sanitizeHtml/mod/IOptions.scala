package typings.sanitizeHtml.mod

import org.scalablytyped.runtime.StringDictionary
import typings.htmlparser2.mod.Options
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var allowIframeRelativeUrls: js.UndefOr[Boolean] = js.undefined
  var allowProtocolRelative: js.UndefOr[Boolean] = js.undefined
  var allowedAttributes: js.UndefOr[StringDictionary[js.Array[AllowedAttribute]] | Boolean] = js.undefined
  var allowedClasses: js.UndefOr[StringDictionary[js.Array[String]] | Boolean] = js.undefined
  var allowedIframeHostnames: js.UndefOr[js.Array[String]] = js.undefined
  var allowedSchemes: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var allowedSchemesAppliedToAttributes: js.UndefOr[js.Array[String]] = js.undefined
  var allowedSchemesByTag: js.UndefOr[StringDictionary[js.Array[String]] | Boolean] = js.undefined
  var allowedStyles: js.UndefOr[StringDictionary[StringDictionary[js.Array[RegExp]]]] = js.undefined
  var allowedTags: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var disallowedTagsMode: js.UndefOr[DisallowedTagsModes] = js.undefined
  var exclusiveFilter: js.UndefOr[js.Function1[/* frame */ IFrame, Boolean]] = js.undefined
  var nonTextTags: js.UndefOr[js.Array[String]] = js.undefined
  var parser: js.UndefOr[Options] = js.undefined
  var selfClosing: js.UndefOr[js.Array[String]] = js.undefined
  var textFilter: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
  var transformTags: js.UndefOr[StringDictionary[String | Transformer]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    allowIframeRelativeUrls: js.UndefOr[Boolean] = js.undefined,
    allowProtocolRelative: js.UndefOr[Boolean] = js.undefined,
    allowedAttributes: StringDictionary[js.Array[AllowedAttribute]] | Boolean = null,
    allowedClasses: StringDictionary[js.Array[String]] | Boolean = null,
    allowedIframeHostnames: js.Array[String] = null,
    allowedSchemes: js.Array[String] | Boolean = null,
    allowedSchemesAppliedToAttributes: js.Array[String] = null,
    allowedSchemesByTag: StringDictionary[js.Array[String]] | Boolean = null,
    allowedStyles: StringDictionary[StringDictionary[js.Array[RegExp]]] = null,
    allowedTags: js.Array[String] | Boolean = null,
    disallowedTagsMode: DisallowedTagsModes = null,
    exclusiveFilter: /* frame */ IFrame => Boolean = null,
    nonTextTags: js.Array[String] = null,
    parser: Options = null,
    selfClosing: js.Array[String] = null,
    textFilter: /* text */ String => String = null,
    transformTags: StringDictionary[String | Transformer] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowIframeRelativeUrls)) __obj.updateDynamic("allowIframeRelativeUrls")(allowIframeRelativeUrls.asInstanceOf[js.Any])
    if (!js.isUndefined(allowProtocolRelative)) __obj.updateDynamic("allowProtocolRelative")(allowProtocolRelative.asInstanceOf[js.Any])
    if (allowedAttributes != null) __obj.updateDynamic("allowedAttributes")(allowedAttributes.asInstanceOf[js.Any])
    if (allowedClasses != null) __obj.updateDynamic("allowedClasses")(allowedClasses.asInstanceOf[js.Any])
    if (allowedIframeHostnames != null) __obj.updateDynamic("allowedIframeHostnames")(allowedIframeHostnames.asInstanceOf[js.Any])
    if (allowedSchemes != null) __obj.updateDynamic("allowedSchemes")(allowedSchemes.asInstanceOf[js.Any])
    if (allowedSchemesAppliedToAttributes != null) __obj.updateDynamic("allowedSchemesAppliedToAttributes")(allowedSchemesAppliedToAttributes.asInstanceOf[js.Any])
    if (allowedSchemesByTag != null) __obj.updateDynamic("allowedSchemesByTag")(allowedSchemesByTag.asInstanceOf[js.Any])
    if (allowedStyles != null) __obj.updateDynamic("allowedStyles")(allowedStyles.asInstanceOf[js.Any])
    if (allowedTags != null) __obj.updateDynamic("allowedTags")(allowedTags.asInstanceOf[js.Any])
    if (disallowedTagsMode != null) __obj.updateDynamic("disallowedTagsMode")(disallowedTagsMode.asInstanceOf[js.Any])
    if (exclusiveFilter != null) __obj.updateDynamic("exclusiveFilter")(js.Any.fromFunction1(exclusiveFilter))
    if (nonTextTags != null) __obj.updateDynamic("nonTextTags")(nonTextTags.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (selfClosing != null) __obj.updateDynamic("selfClosing")(selfClosing.asInstanceOf[js.Any])
    if (textFilter != null) __obj.updateDynamic("textFilter")(js.Any.fromFunction1(textFilter))
    if (transformTags != null) __obj.updateDynamic("transformTags")(transformTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

