package typings.reactSyntaxHighlighter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLProps
import typings.reactSyntaxHighlighter.lineTagPropsFunction
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxHighlighterProps
  extends /* spread */ StringDictionary[js.Any] {
  var codeTagProps: js.UndefOr[HTMLProps[HTMLElement]] = js.native
  var customStyle: js.UndefOr[js.Any] = js.native
  var language: js.UndefOr[String] = js.native
  var lineNumberStyle: js.UndefOr[js.Any] = js.native
  var lineProps: js.UndefOr[lineTagPropsFunction | HTMLProps[HTMLElement]] = js.native
  var showLineNumbers: js.UndefOr[Boolean] = js.native
  var startingLineNumber: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Any] = js.native
  var useInlineStyles: js.UndefOr[Boolean] = js.native
}

object SyntaxHighlighterProps {
  @scala.inline
  def apply(): SyntaxHighlighterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntaxHighlighterProps]
  }
  @scala.inline
  implicit class SyntaxHighlighterPropsOps[Self <: SyntaxHighlighterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCodeTagProps(value: HTMLProps[HTMLElement]): Self = this.set("codeTagProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeTagProps: Self = this.set("codeTagProps", js.undefined)
    @scala.inline
    def setCustomStyle(value: js.Any): Self = this.set("customStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomStyle: Self = this.set("customStyle", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLineNumberStyle(value: js.Any): Self = this.set("lineNumberStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineNumberStyle: Self = this.set("lineNumberStyle", js.undefined)
    @scala.inline
    def setLinePropsFunction1(value: /* lineNumber */ Double => HTMLProps[HTMLElement]): Self = this.set("lineProps", js.Any.fromFunction1(value))
    @scala.inline
    def setLineProps(value: lineTagPropsFunction | HTMLProps[HTMLElement]): Self = this.set("lineProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineProps: Self = this.set("lineProps", js.undefined)
    @scala.inline
    def setShowLineNumbers(value: Boolean): Self = this.set("showLineNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLineNumbers: Self = this.set("showLineNumbers", js.undefined)
    @scala.inline
    def setStartingLineNumber(value: Double): Self = this.set("startingLineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartingLineNumber: Self = this.set("startingLineNumber", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setUseInlineStyles(value: Boolean): Self = this.set("useInlineStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseInlineStyles: Self = this.set("useInlineStyles", js.undefined)
  }
  
}

