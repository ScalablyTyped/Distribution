package typings.reactMonacoEditor.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonacoEditorBaseProps extends js.Object {
  /**
    * The initial value of the auto created model in the editor.
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * Height of editor. Defaults to 500.
    */
  var height: js.UndefOr[String | Double] = js.native
  /**
    * The initial language of the auto created model in the editor. Defaults to 'javascript'.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Theme to be used for rendering.
    * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black'.
    * You can create custom themes via `monaco.editor.defineTheme`.
    */
  var theme: js.UndefOr[String | Null] = js.native
  /**
    * Width of editor. Defaults to 100%.
    */
  var width: js.UndefOr[String | Double] = js.native
}

object MonacoEditorBaseProps {
  @scala.inline
  def apply(): MonacoEditorBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonacoEditorBaseProps]
  }
  @scala.inline
  implicit class MonacoEditorBasePropsOps[Self <: MonacoEditorBaseProps] (val x: Self) extends AnyVal {
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
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setThemeNull: Self = this.set("theme", null)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

