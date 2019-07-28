package typings.reactDashMonacoDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMonacoDashEditorMod {
  type ChangeHandler = js.Function2[
    /* value */ String, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify monacoEditor.editor.IModelContentChangedEvent */ /* event */ js.Any, 
    Unit
  ]
  type DiffChangeHandler = js.Function1[/* value */ String, Unit]
  type DiffEditorDidMount = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify monacoEditor.editor.IStandaloneDiffEditor */ /* editor */ js.Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof monacoEditor */ /* monaco */ js.Any, 
    Unit
  ]
  type DiffEditorWillMount = js.Function1[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof monacoEditor */ /* monaco */ js.Any, 
    Unit
  ]
  type EditorDidMount = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify monacoEditor.editor.IStandaloneCodeEditor */ /* editor */ js.Any, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof monacoEditor */ /* monaco */ js.Any, 
    Unit
  ]
  type EditorWillMount = js.Function1[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof monacoEditor */ /* monaco */ js.Any, 
    Unit | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify monacoEditor.editor.IEditorConstructionOptions */ js.Any)
  ]
}
