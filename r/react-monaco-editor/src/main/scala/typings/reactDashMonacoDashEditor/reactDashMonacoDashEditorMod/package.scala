package typings.reactDashMonacoDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMonacoDashEditorMod {
  import typings.monacoDashEditor.monacoDashEditorMod.editor.IEditorConstructionOptions
  import typings.monacoDashEditor.monacoDashEditorMod.editor.IModelContentChangedEvent
  import typings.monacoDashEditor.monacoDashEditorMod.editor.IStandaloneCodeEditor
  import typings.monacoDashEditor.monacoDashEditorMod.editor.IStandaloneDiffEditor
  import typings.reactDashMonacoDashEditor.TypeofmonacoEditor

  type ChangeHandler = js.Function2[/* value */ String, /* event */ IModelContentChangedEvent, Unit]
  type DiffChangeHandler = ChangeHandler
  type DiffEditorDidMount = js.Function2[/* editor */ IStandaloneDiffEditor, /* monaco */ TypeofmonacoEditor, Unit]
  type DiffEditorWillMount = js.Function1[/* monaco */ TypeofmonacoEditor, Unit]
  type EditorDidMount = js.Function2[/* editor */ IStandaloneCodeEditor, /* monaco */ TypeofmonacoEditor, Unit]
  type EditorWillMount = js.Function1[/* monaco */ TypeofmonacoEditor, Unit | IEditorConstructionOptions]
}
