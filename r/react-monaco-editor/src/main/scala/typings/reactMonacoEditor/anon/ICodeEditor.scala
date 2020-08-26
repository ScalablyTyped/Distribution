package typings.reactMonacoEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICodeEditor extends js.Object {
  var ICodeEditor: String = js.native
  var IDiffEditor: String = js.native
}

object ICodeEditor {
  @scala.inline
  def apply(ICodeEditor: String, IDiffEditor: String): ICodeEditor = {
    val __obj = js.Dynamic.literal(ICodeEditor = ICodeEditor.asInstanceOf[js.Any], IDiffEditor = IDiffEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeEditor]
  }
  @scala.inline
  implicit class ICodeEditorOps[Self <: ICodeEditor] (val x: Self) extends AnyVal {
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
    def setICodeEditor(value: String): Self = this.set("ICodeEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setIDiffEditor(value: String): Self = this.set("IDiffEditor", value.asInstanceOf[js.Any])
  }
  
}

