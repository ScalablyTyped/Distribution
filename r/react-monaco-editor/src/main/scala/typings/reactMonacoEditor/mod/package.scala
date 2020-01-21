package typings.reactMonacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChangeHandler = js.Function2[
    /* value */ java.lang.String, 
    /* event */ typings.monacoEditor.mod.editor.IModelContentChangedEvent, 
    scala.Unit
  ]
  type DiffChangeHandler = typings.reactMonacoEditor.mod.ChangeHandler
  type DiffEditorDidMount = js.Function2[
    /* editor */ typings.monacoEditor.mod.editor.IStandaloneDiffEditor, 
    /* monaco */ typings.reactMonacoEditor.TypeofmonacoEditor, 
    scala.Unit
  ]
  type DiffEditorWillMount = js.Function1[/* monaco */ typings.reactMonacoEditor.TypeofmonacoEditor, scala.Unit]
  type EditorDidMount = js.Function2[
    /* editor */ typings.monacoEditor.mod.editor.IStandaloneCodeEditor, 
    /* monaco */ typings.reactMonacoEditor.TypeofmonacoEditor, 
    scala.Unit
  ]
  type EditorWillMount = js.Function1[
    /* monaco */ typings.reactMonacoEditor.TypeofmonacoEditor, 
    scala.Unit | typings.monacoEditor.mod.editor.IEditorConstructionOptions
  ]
}
