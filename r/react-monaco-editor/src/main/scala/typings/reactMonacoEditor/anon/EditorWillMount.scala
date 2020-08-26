package typings.reactMonacoEditor.anon

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorWillMount extends js.Object {
  var defaultValue: Requireable[String] = js.native
  var editorDidMount: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var editorWillMount: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var height: Requireable[String | Double] = js.native
  var language: Requireable[String] = js.native
  var onChange: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var options: Requireable[js.Object] = js.native
  var overrideServices: Requireable[js.Object] = js.native
  var theme: Requireable[String] = js.native
  var value: Requireable[String] = js.native
  var width: Requireable[String | Double] = js.native
}

object EditorWillMount {
  @scala.inline
  def apply(
    defaultValue: Requireable[String],
    editorDidMount: Requireable[js.Function1[/* repeated */ _, _]],
    editorWillMount: Requireable[js.Function1[/* repeated */ _, _]],
    height: Requireable[String | Double],
    language: Requireable[String],
    onChange: Requireable[js.Function1[/* repeated */ _, _]],
    options: Requireable[js.Object],
    overrideServices: Requireable[js.Object],
    theme: Requireable[String],
    value: Requireable[String],
    width: Requireable[String | Double]
  ): EditorWillMount = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], editorDidMount = editorDidMount.asInstanceOf[js.Any], editorWillMount = editorWillMount.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], overrideServices = overrideServices.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorWillMount]
  }
  @scala.inline
  implicit class EditorWillMountOps[Self <: EditorWillMount] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: Requireable[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditorDidMount(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("editorDidMount", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditorWillMount(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("editorWillMount", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Requireable[String | Double]): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: Requireable[String]): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Requireable[js.Object]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverrideServices(value: Requireable[js.Object]): Self = this.set("overrideServices", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: Requireable[String]): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Requireable[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Requireable[String | Double]): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

