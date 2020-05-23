package typings.reactMonacoEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICodeEditor extends js.Object {
  var ICodeEditor: String
  var IDiffEditor: String
}

object ICodeEditor {
  @scala.inline
  def apply(ICodeEditor: String, IDiffEditor: String): ICodeEditor = {
    val __obj = js.Dynamic.literal(ICodeEditor = ICodeEditor.asInstanceOf[js.Any], IDiffEditor = IDiffEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeEditor]
  }
}

