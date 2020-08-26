package typings.primereact.editorMod

import typings.primereact.anon.HtmlValue
import typings.primereact.anon.OldRange
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var formats: js.UndefOr[js.Array[_]] = js.native
  var headerTemplate: js.UndefOr[Element] = js.native
  var id: js.UndefOr[String] = js.native
  var modules: js.UndefOr[js.Any] = js.native
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ OldRange, Unit]] = js.native
  var onTextChange: js.UndefOr[js.Function1[/* e */ HtmlValue, Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var theme: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object EditorProps {
  @scala.inline
  def apply(): EditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorProps]
  }
  @scala.inline
  implicit class EditorPropsOps[Self <: EditorProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setFormatsVarargs(value: js.Any*): Self = this.set("formats", js.Array(value :_*))
    @scala.inline
    def setFormats(value: js.Array[_]): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    @scala.inline
    def setHeaderTemplate(value: Element): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setModules(value: js.Any): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    @scala.inline
    def setOnSelectionChange(value: /* e */ OldRange => Unit): Self = this.set("onSelectionChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    @scala.inline
    def setOnTextChange(value: /* e */ HtmlValue => Unit): Self = this.set("onTextChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTextChange: Self = this.set("onTextChange", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

