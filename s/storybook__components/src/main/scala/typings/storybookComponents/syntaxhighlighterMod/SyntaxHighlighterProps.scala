package typings.storybookComponents.syntaxhighlighterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxHighlighterProps extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var copyable: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[Boolean] = js.native
  var language: String = js.native
  var padded: js.UndefOr[Boolean] = js.native
}

object SyntaxHighlighterProps {
  @scala.inline
  def apply(language: String): SyntaxHighlighterProps = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCopyable(value: Boolean): Self = this.set("copyable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyable: Self = this.set("copyable", js.undefined)
    @scala.inline
    def setFormat(value: Boolean): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setPadded(value: Boolean): Self = this.set("padded", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadded: Self = this.set("padded", js.undefined)
  }
  
}

