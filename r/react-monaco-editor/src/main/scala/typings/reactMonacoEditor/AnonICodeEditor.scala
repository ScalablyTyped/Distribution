package typings.reactMonacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonICodeEditor extends js.Object {
  var ICodeEditor: String
  var IDiffEditor: String
}

object AnonICodeEditor {
  @scala.inline
  def apply(ICodeEditor: String, IDiffEditor: String): AnonICodeEditor = {
    val __obj = js.Dynamic.literal(ICodeEditor = ICodeEditor.asInstanceOf[js.Any], IDiffEditor = IDiffEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonICodeEditor]
  }
}

