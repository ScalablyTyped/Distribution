package typings.reactSyntaxHighlighter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLProps
import typings.reactSyntaxHighlighter.lineTagPropsFunction
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxHighlighterProps
  extends /* spread */ StringDictionary[js.Any] {
  var codeTagProps: js.UndefOr[HTMLProps[HTMLElement]] = js.undefined
  var customStyle: js.UndefOr[js.Any] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var lineNumberStyle: js.UndefOr[js.Any] = js.undefined
  var lineProps: js.UndefOr[lineTagPropsFunction | HTMLProps[HTMLElement]] = js.undefined
  var showLineNumbers: js.UndefOr[Boolean] = js.undefined
  var startingLineNumber: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var useInlineStyles: js.UndefOr[Boolean] = js.undefined
}

object SyntaxHighlighterProps {
  @scala.inline
  def apply(
    StringDictionary: /* spread */ StringDictionary[js.Any] = null,
    codeTagProps: HTMLProps[HTMLElement] = null,
    customStyle: js.Any = null,
    language: String = null,
    lineNumberStyle: js.Any = null,
    lineProps: lineTagPropsFunction | HTMLProps[HTMLElement] = null,
    showLineNumbers: js.UndefOr[Boolean] = js.undefined,
    startingLineNumber: Int | Double = null,
    style: js.Any = null,
    useInlineStyles: js.UndefOr[Boolean] = js.undefined
  ): SyntaxHighlighterProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (codeTagProps != null) __obj.updateDynamic("codeTagProps")(codeTagProps.asInstanceOf[js.Any])
    if (customStyle != null) __obj.updateDynamic("customStyle")(customStyle.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lineNumberStyle != null) __obj.updateDynamic("lineNumberStyle")(lineNumberStyle.asInstanceOf[js.Any])
    if (lineProps != null) __obj.updateDynamic("lineProps")(lineProps.asInstanceOf[js.Any])
    if (!js.isUndefined(showLineNumbers)) __obj.updateDynamic("showLineNumbers")(showLineNumbers.asInstanceOf[js.Any])
    if (startingLineNumber != null) __obj.updateDynamic("startingLineNumber")(startingLineNumber.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useInlineStyles)) __obj.updateDynamic("useInlineStyles")(useInlineStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxHighlighterProps]
  }
}

