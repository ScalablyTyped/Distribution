package typings
package rcDashEditorDashCoreLib.esEditorCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-editor-core/es/EditorCore", JSImport.Default)
@js.native
class default protected () extends EditorCore {
  def this(props: EditorProps) = this()
}

/* static members */
@JSImport("rc-editor-core/es/EditorCore", JSImport.Default)
@js.native
object default extends js.Object {
  var GetText: js.Function2[
    /* editorState */ draftDashJsLib.draftDashJsMod.EditorState, 
    /* options */ js.UndefOr[rcDashEditorDashCoreLib.Anon_Encode], 
    java.lang.String
  ] = js.native
  var childContextTypes: rcDashEditorDashCoreLib.Anon_GetEditorState = js.native
  var defaultProps: rcDashEditorDashCoreLib.Anon_MultiLines = js.native
  def GetHTML(editorState: js.Any): js.Any = js.native
  def ToEditorState(text: java.lang.String): draftDashJsLib.draftDashJsMod.EditorState = js.native
}

