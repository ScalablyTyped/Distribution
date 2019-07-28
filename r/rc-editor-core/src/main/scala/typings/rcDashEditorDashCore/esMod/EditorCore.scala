package typings.rcDashEditorDashCore.esMod

import typings.draftDashJs.draftDashJsMod.EditorState
import typings.rcDashEditorDashCore.Anon_Encode
import typings.rcDashEditorDashCore.Anon_GetEditorState
import typings.rcDashEditorDashCore.Anon_MultiLines
import typings.rcDashEditorDashCore.esEditorCoreMod.EditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-editor-core/es", "EditorCore")
@js.native
class EditorCore protected ()
  extends typings.rcDashEditorDashCore.esEditorCoreMod.default {
  def this(props: EditorProps) = this()
}

/* static members */
@JSImport("rc-editor-core/es", "EditorCore")
@js.native
object EditorCore extends js.Object {
  var GetText: js.Function2[/* editorState */ EditorState, /* options */ js.UndefOr[Anon_Encode], String] = js.native
  var childContextTypes: Anon_GetEditorState = js.native
  var defaultProps: Anon_MultiLines = js.native
  def GetHTML(editorState: js.Any): js.Any = js.native
  def ToEditorState(text: String): EditorState = js.native
}

