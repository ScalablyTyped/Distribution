package typings
package sanitizeDashHtmlLib.sanitizeDashHtmlMod.sanitizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var allowProtocolRelative: js.UndefOr[scala.Boolean] = js.undefined
  var allowedAttributes: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] | scala.Boolean
  ] = js.undefined
  var allowedClasses: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] | scala.Boolean
  ] = js.undefined
  var allowedIframeHostnames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var allowedSchemes: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
  var allowedSchemesAppliedToAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var allowedSchemesByTag: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] | scala.Boolean
  ] = js.undefined
  var allowedStyles: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Array[stdLib.RegExp]]]
  ] = js.undefined
  var allowedTags: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
  var exclusiveFilter: js.UndefOr[js.Function1[/* frame */ IFrame, scala.Boolean]] = js.undefined
  var nonTextTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var parser: js.UndefOr[htmlparser2Lib.htmlparser2Mod.Options] = js.undefined
  var selfClosing: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var transformTags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String | Transformer]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    allowProtocolRelative: js.UndefOr[scala.Boolean] = js.undefined,
    allowedAttributes: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] | scala.Boolean = null,
    allowedClasses: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] | scala.Boolean = null,
    allowedIframeHostnames: js.Array[java.lang.String] = null,
    allowedSchemes: js.Array[java.lang.String] | scala.Boolean = null,
    allowedSchemesAppliedToAttributes: js.Array[java.lang.String] = null,
    allowedSchemesByTag: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] | scala.Boolean = null,
    allowedStyles: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Array[stdLib.RegExp]]] = null,
    allowedTags: js.Array[java.lang.String] | scala.Boolean = null,
    exclusiveFilter: /* frame */ IFrame => scala.Boolean = null,
    nonTextTags: js.Array[java.lang.String] = null,
    parser: htmlparser2Lib.htmlparser2Mod.Options = null,
    selfClosing: js.Array[java.lang.String] = null,
    transformTags: org.scalablytyped.runtime.StringDictionary[java.lang.String | Transformer] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowProtocolRelative)) __obj.updateDynamic("allowProtocolRelative")(allowProtocolRelative)
    if (allowedAttributes != null) __obj.updateDynamic("allowedAttributes")(allowedAttributes.asInstanceOf[js.Any])
    if (allowedClasses != null) __obj.updateDynamic("allowedClasses")(allowedClasses.asInstanceOf[js.Any])
    if (allowedIframeHostnames != null) __obj.updateDynamic("allowedIframeHostnames")(allowedIframeHostnames)
    if (allowedSchemes != null) __obj.updateDynamic("allowedSchemes")(allowedSchemes.asInstanceOf[js.Any])
    if (allowedSchemesAppliedToAttributes != null) __obj.updateDynamic("allowedSchemesAppliedToAttributes")(allowedSchemesAppliedToAttributes)
    if (allowedSchemesByTag != null) __obj.updateDynamic("allowedSchemesByTag")(allowedSchemesByTag.asInstanceOf[js.Any])
    if (allowedStyles != null) __obj.updateDynamic("allowedStyles")(allowedStyles)
    if (allowedTags != null) __obj.updateDynamic("allowedTags")(allowedTags.asInstanceOf[js.Any])
    if (exclusiveFilter != null) __obj.updateDynamic("exclusiveFilter")(js.Any.fromFunction1(exclusiveFilter))
    if (nonTextTags != null) __obj.updateDynamic("nonTextTags")(nonTextTags)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (selfClosing != null) __obj.updateDynamic("selfClosing")(selfClosing)
    if (transformTags != null) __obj.updateDynamic("transformTags")(transformTags)
    __obj.asInstanceOf[IOptions]
  }
}

