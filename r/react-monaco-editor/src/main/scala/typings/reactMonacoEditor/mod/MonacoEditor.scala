package typings.reactMonacoEditor.mod

import typings.monacoEditor.mod.editor.IStandaloneCodeEditor
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonacoEditor
  extends Component[MonacoEditorProps, js.Object, js.Any] {
  var editor: js.UndefOr[IStandaloneCodeEditor] = js.native
}

