package typings
package rcDashEditorDashCoreLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-editor-core/lib", "EditorCore")
@js.native
class EditorCore protected ()
  extends rcDashEditorDashCoreLib.libEditorCoreMod.default {
  def this(props: rcDashEditorDashCoreLib.libEditorCoreMod.EditorProps) = this()
}

/* static members */
@JSImport("rc-editor-core/lib", "EditorCore")
@js.native
object EditorCore extends js.Object {
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

