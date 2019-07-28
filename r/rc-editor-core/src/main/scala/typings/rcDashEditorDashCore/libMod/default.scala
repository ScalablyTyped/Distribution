package typings.rcDashEditorDashCore.libMod

import typings.rcDashEditorDashCore.Anon_Encode
import typings.rcDashEditorDashCore.TypeofClassEditorCoreChildContextTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-editor-core/lib", JSImport.Default)
@js.native
object default extends js.Object {
  var EditorCore: TypeofClassEditorCoreChildContextTypes = js.native
  def GetHTML(editorState: js.Any): js.Any = js.native
  def GetText(editorState: js.Any): String = js.native
  def GetText(editorState: js.Any, options: Anon_Encode): String = js.native
  def toEditorState(text: String): js.Any = js.native
}

