package typings
package reactDashSyntaxDashHighlighterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxHighlighterProps
  extends /* spread */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var codeTagProps: js.UndefOr[reactLib.reactMod.ReactNs.DOMAttributes[stdLib.HTMLElement]] = js.undefined
  var customStyle: js.UndefOr[js.Any] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var lineNumberStyle: js.UndefOr[js.Any] = js.undefined
  var lineProps: js.UndefOr[
    lineTagPropsFunction | reactLib.reactMod.ReactNs.DOMAttributes[stdLib.HTMLElement]
  ] = js.undefined
  var showLineNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var startingLineNumber: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var useInlineStyles: js.UndefOr[scala.Boolean] = js.undefined
}

object SyntaxHighlighterProps {
  @scala.inline
  def apply(
    StringDictionary: /* spread */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    codeTagProps: reactLib.reactMod.ReactNs.DOMAttributes[stdLib.HTMLElement] = null,
    customStyle: js.Any = null,
    language: java.lang.String = null,
    lineNumberStyle: js.Any = null,
    lineProps: lineTagPropsFunction | reactLib.reactMod.ReactNs.DOMAttributes[stdLib.HTMLElement] = null,
    showLineNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    startingLineNumber: scala.Int | scala.Double = null,
    style: js.Any = null,
    useInlineStyles: js.UndefOr[scala.Boolean] = js.undefined
  ): SyntaxHighlighterProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (codeTagProps != null) __obj.updateDynamic("codeTagProps")(codeTagProps)
    if (customStyle != null) __obj.updateDynamic("customStyle")(customStyle)
    if (language != null) __obj.updateDynamic("language")(language)
    if (lineNumberStyle != null) __obj.updateDynamic("lineNumberStyle")(lineNumberStyle)
    if (lineProps != null) __obj.updateDynamic("lineProps")(lineProps.asInstanceOf[js.Any])
    if (!js.isUndefined(showLineNumbers)) __obj.updateDynamic("showLineNumbers")(showLineNumbers)
    if (startingLineNumber != null) __obj.updateDynamic("startingLineNumber")(startingLineNumber.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(useInlineStyles)) __obj.updateDynamic("useInlineStyles")(useInlineStyles)
    __obj.asInstanceOf[SyntaxHighlighterProps]
  }
}

