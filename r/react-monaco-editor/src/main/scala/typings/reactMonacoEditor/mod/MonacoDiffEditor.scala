package typings.reactMonacoEditor.mod

import typings.monacoEditor.mod.editor.IStandaloneDiffEditor
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-monaco-editor", "MonacoDiffEditor")
@js.native
class MonacoDiffEditor ()
  extends Component[MonacoDiffEditorProps, js.Object, js.Any] {
  var editor: js.UndefOr[IStandaloneDiffEditor] = js.native
}

