package typings
package reactDashMonacoDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMonacoDashEditorMod {
  type ChangeHandler = js.Function2[
    /* value */ java.lang.String, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify monacoEditor.editor.IModelContentChangedEvent */ /* event */ js.Any, 
    scala.Unit
  ]
  type DiffChangeHandler = js.Function1[/* value */ java.lang.String, scala.Unit]
  type DiffEditorDidMount = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify monacoEditor.editor.IStandaloneDiffEditor */ /* editor */ js.Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof monacoEditor */ /* monaco */ js.Any, 
    scala.Unit
  ]
  type DiffEditorWillMount = js.Function1[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof monacoEditor */ /* monaco */ js.Any, 
    scala.Unit
  ]
  type EditorDidMount = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify monacoEditor.editor.IStandaloneCodeEditor */ /* editor */ js.Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof monacoEditor */ /* monaco */ js.Any, 
    scala.Unit
  ]
  type EditorWillMount = js.Function1[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof monacoEditor */ /* monaco */ js.Any, 
    scala.Unit
  ]
  type MonacoEditor = reactLib.reactMod.Component[MonacoEditorProps, js.Object, js.Any]
}
