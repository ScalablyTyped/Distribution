package typings.reactRte.mod

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.ContentBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.native
  var blockStyleFn: js.UndefOr[js.Function1[/* block */ ContentBlock, js.UndefOr[String]]] = js.native
  var className: js.UndefOr[String] = js.native
  var customControls: js.UndefOr[js.Array[CustomControl]] = js.native
  var customStyleMap: js.UndefOr[StringDictionary[StringDictionary[js.Any]]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var editorClassName: js.UndefOr[String] = js.native
  var editorStyle: js.UndefOr[js.Object] = js.native
  var handleReturn: js.UndefOr[js.Function1[/* event */ js.Object, Boolean]] = js.native
  var keyBindingFn: js.UndefOr[js.Function1[/* event */ js.Object, js.UndefOr[String]]] = js.native
  var onChange: js.UndefOr[ChangeHandler] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var rootStyle: js.UndefOr[js.Object] = js.native
  var toolbarClassName: js.UndefOr[String] = js.native
   // Alias of readOnly
  var toolbarConfig: js.UndefOr[ToolbarConfig] = js.native
  var toolbarStyle: js.UndefOr[js.Object] = js.native
  var value: EditorValue = js.native
}

object Props {
  @scala.inline
  def apply(value: EditorValue): Props = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setValue(value: EditorValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setBlockStyleFn(value: /* block */ ContentBlock => js.UndefOr[String]): Self = this.set("blockStyleFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBlockStyleFn: Self = this.set("blockStyleFn", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCustomControlsVarargs(value: CustomControl*): Self = this.set("customControls", js.Array(value :_*))
    @scala.inline
    def setCustomControls(value: js.Array[CustomControl]): Self = this.set("customControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomControls: Self = this.set("customControls", js.undefined)
    @scala.inline
    def setCustomStyleMap(value: StringDictionary[StringDictionary[js.Any]]): Self = this.set("customStyleMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomStyleMap: Self = this.set("customStyleMap", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEditorClassName(value: String): Self = this.set("editorClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorClassName: Self = this.set("editorClassName", js.undefined)
    @scala.inline
    def setEditorStyle(value: js.Object): Self = this.set("editorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorStyle: Self = this.set("editorStyle", js.undefined)
    @scala.inline
    def setHandleReturn(value: /* event */ js.Object => Boolean): Self = this.set("handleReturn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandleReturn: Self = this.set("handleReturn", js.undefined)
    @scala.inline
    def setKeyBindingFn(value: /* event */ js.Object => js.UndefOr[String]): Self = this.set("keyBindingFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeyBindingFn: Self = this.set("keyBindingFn", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ EditorValue => js.Any): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRootStyle(value: js.Object): Self = this.set("rootStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootStyle: Self = this.set("rootStyle", js.undefined)
    @scala.inline
    def setToolbarClassName(value: String): Self = this.set("toolbarClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarClassName: Self = this.set("toolbarClassName", js.undefined)
    @scala.inline
    def setToolbarConfig(value: ToolbarConfig): Self = this.set("toolbarConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarConfig: Self = this.set("toolbarConfig", js.undefined)
    @scala.inline
    def setToolbarStyle(value: js.Object): Self = this.set("toolbarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarStyle: Self = this.set("toolbarStyle", js.undefined)
  }
  
}

