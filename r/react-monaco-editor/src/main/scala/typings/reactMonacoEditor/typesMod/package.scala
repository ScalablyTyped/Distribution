package typings.reactMonacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ChangeHandler = js.Function2[
    /* value */ java.lang.String, 
    /* event */ typings.monacoEditor.mod.editor.IModelContentChangedEvent, 
    scala.Unit
  ]
  type DiffChangeHandler = typings.reactMonacoEditor.typesMod.ChangeHandler
  type DiffEditorDidMount = js.Function2[
    /* editor */ typings.monacoEditor.mod.editor.IStandaloneDiffEditor, 
    /* monaco */ typings.reactMonacoEditor.anon.TypeofmonacoEditor, 
    scala.Unit
  ]
  type DiffEditorWillMount = js.Function1[
    /* monaco */ typings.reactMonacoEditor.anon.TypeofmonacoEditor, 
    scala.Unit | typings.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
  ]
  type EditorConstructionOptions = typings.std.NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-monaco-editor.anon.FnCall>[1] */ js.Any
  ]
  type EditorDidMount = js.Function2[
    /* editor */ typings.monacoEditor.mod.editor.IStandaloneCodeEditor, 
    /* monaco */ typings.reactMonacoEditor.anon.TypeofmonacoEditor, 
    scala.Unit
  ]
  type EditorWillMount = js.Function1[
    /* monaco */ typings.reactMonacoEditor.anon.TypeofmonacoEditor, 
    scala.Unit | typings.reactMonacoEditor.typesMod.EditorConstructionOptions
  ]
}
