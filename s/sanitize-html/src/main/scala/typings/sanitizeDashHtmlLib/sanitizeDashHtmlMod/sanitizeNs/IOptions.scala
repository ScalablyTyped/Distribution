package typings
package sanitizeDashHtmlLib.sanitizeDashHtmlMod.sanitizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOptions extends js.Object {
  var allowProtocolRelative: js.UndefOr[scala.Boolean] = js.undefined
  var allowedAttributes: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]] | scala.Boolean
  ] = js.undefined
  var allowedClasses: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]] | scala.Boolean
  ] = js.undefined
  var allowedIframeHostnames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var allowedSchemes: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
  var allowedSchemesAppliedToAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var allowedSchemesByTag: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]] | scala.Boolean
  ] = js.undefined
  var allowedStyles: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[ScalablyTyped.runtime.StringDictionary[js.Array[stdLib.RegExp]]]
  ] = js.undefined
  var allowedTags: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
  var exclusiveFilter: js.UndefOr[js.Function1[/* frame */ IFrame, scala.Boolean]] = js.undefined
  var nonTextTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var parser: js.UndefOr[htmlparser2Lib.htmlparser2Mod.Options] = js.undefined
  var selfClosing: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var transformTags: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String | Transformer]] = js.undefined
}

