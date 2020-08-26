package typings.reactNativeZssRichTextEditor.anon

import typings.reactNativeZssRichTextEditor.mod.ContentInset
import typings.reactNativeZssRichTextEditor.mod.FunctionWithZeroArgs
import typings.reactNativeZssRichTextEditor.mod.RichTextStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextEditorProps> */
@js.native
trait PartialRichTextEditorProp extends js.Object {
  var contentInset: js.UndefOr[ContentInset] = js.native
  var contentPlaceholder: js.UndefOr[String] = js.native
  var customCSS: js.UndefOr[RichTextStyles] = js.native
  var editorInitializedCallback: js.UndefOr[FunctionWithZeroArgs] = js.native
  var enableOnChange: js.UndefOr[Boolean] = js.native
  var footerHeight: js.UndefOr[Double] = js.native
  var hiddenTitle: js.UndefOr[Boolean] = js.native
  var initialContentHTML: js.UndefOr[String] = js.native
  var initialTitleHTML: js.UndefOr[String] = js.native
  var titlePlaceholder: js.UndefOr[String] = js.native
}

object PartialRichTextEditorProp {
  @scala.inline
  def apply(): PartialRichTextEditorProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRichTextEditorProp]
  }
  @scala.inline
  implicit class PartialRichTextEditorPropOps[Self <: PartialRichTextEditorProp] (val x: Self) extends AnyVal {
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
    def setContentInset(value: ContentInset): Self = this.set("contentInset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentInset: Self = this.set("contentInset", js.undefined)
    @scala.inline
    def setContentPlaceholder(value: String): Self = this.set("contentPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentPlaceholder: Self = this.set("contentPlaceholder", js.undefined)
    @scala.inline
    def setCustomCSS(value: RichTextStyles): Self = this.set("customCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomCSS: Self = this.set("customCSS", js.undefined)
    @scala.inline
    def setEditorInitializedCallback(value: () => Unit): Self = this.set("editorInitializedCallback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEditorInitializedCallback: Self = this.set("editorInitializedCallback", js.undefined)
    @scala.inline
    def setEnableOnChange(value: Boolean): Self = this.set("enableOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableOnChange: Self = this.set("enableOnChange", js.undefined)
    @scala.inline
    def setFooterHeight(value: Double): Self = this.set("footerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterHeight: Self = this.set("footerHeight", js.undefined)
    @scala.inline
    def setHiddenTitle(value: Boolean): Self = this.set("hiddenTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenTitle: Self = this.set("hiddenTitle", js.undefined)
    @scala.inline
    def setInitialContentHTML(value: String): Self = this.set("initialContentHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialContentHTML: Self = this.set("initialContentHTML", js.undefined)
    @scala.inline
    def setInitialTitleHTML(value: String): Self = this.set("initialTitleHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialTitleHTML: Self = this.set("initialTitleHTML", js.undefined)
    @scala.inline
    def setTitlePlaceholder(value: String): Self = this.set("titlePlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitlePlaceholder: Self = this.set("titlePlaceholder", js.undefined)
  }
  
}

