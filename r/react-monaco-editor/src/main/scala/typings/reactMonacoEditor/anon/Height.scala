package typings.reactMonacoEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Height extends js.Object {
  var defaultValue: String = js.native
  var editorDidMount: js.Function0[Unit] = js.native
  var editorWillMount: js.Function0[Unit] = js.native
  var height: String = js.native
  var language: String = js.native
  var onChange: js.Function0[Unit] = js.native
  var theme: js.Any = js.native
  var value: js.Any = js.native
  var width: String = js.native
}

object Height {
  @scala.inline
  def apply(
    defaultValue: String,
    editorDidMount: () => Unit,
    editorWillMount: () => Unit,
    height: String,
    language: String,
    onChange: () => Unit,
    theme: js.Any,
    value: js.Any,
    width: String
  ): Height = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], editorDidMount = js.Any.fromFunction0(editorDidMount), editorWillMount = js.Any.fromFunction0(editorWillMount), height = height.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), theme = theme.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  @scala.inline
  implicit class HeightOps[Self <: Height] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditorDidMount(value: () => Unit): Self = this.set("editorDidMount", js.Any.fromFunction0(value))
    @scala.inline
    def setEditorWillMount(value: () => Unit): Self = this.set("editorWillMount", js.Any.fromFunction0(value))
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def setTheme(value: js.Any): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

