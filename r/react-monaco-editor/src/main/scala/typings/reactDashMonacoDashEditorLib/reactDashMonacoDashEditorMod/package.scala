package typings
package reactDashMonacoDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMonacoDashEditorMod {
  type ChangeHandler = js.Function2[
    /* value */ java.lang.String, 
    /* event */ monacoDashEditorLib.monacoDashEditorMod.editorNs.IModelContentChangedEvent, 
    scala.Unit
  ]
  type DiffChangeHandler = js.Function1[/* value */ java.lang.String, scala.Unit]
  type DiffEditorDidMount = js.Function2[
    /* editor */ monacoDashEditorLib.monacoDashEditorMod.editorNs.IStandaloneDiffEditor, 
    /* monaco */ js.Any, 
    scala.Unit
  ]
  type DiffEditorWillMount = js.Function1[/* monaco */ js.Any, scala.Unit]
  type EditorDidMount = js.Function2[
    /* editor */ monacoDashEditorLib.monacoDashEditorMod.editorNs.IStandaloneCodeEditor, 
    /* monaco */ js.Any, 
    scala.Unit
  ]
  type EditorWillMount = js.Function1[/* monaco */ js.Any, scala.Unit]
  type MonacoEditor = reactLib.reactMod.Component[MonacoEditorProps, js.Object, js.Any]
}
