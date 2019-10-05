package typings.rcDashEditorDashCore

import typings.draftDashJs.draftDashJsMod.EditorState
import typings.rcDashEditorDashCore.libEditorCoreMod.EditorProps
import typings.rcDashEditorDashCore.libEditorCoreMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-editor-core/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class EditorCore protected () extends default {
    def this(props: EditorProps) = this()
  }
  
  val toEditorState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EditorCore.ToEditorState */ js.Any = js.native
  /* static members */
  @js.native
  object EditorCore extends js.Object {
    var GetText: js.Function2[/* editorState */ EditorState, /* options */ js.UndefOr[Anon_Encode], String] = js.native
    var childContextTypes: Anon_GetEditorState = js.native
    var defaultProps: Anon_MultiLines = js.native
    def GetHTML(editorState: js.Any): js.Any = js.native
    def ToEditorState(text: String): EditorState = js.native
  }
  
  @js.native
  object default extends js.Object {
    var EditorCore: TypeofClassEditorCoreChildContextTypes = js.native
    def GetHTML(editorState: js.Any): js.Any = js.native
    def GetText(editorState: js.Any): String = js.native
    def GetText(editorState: js.Any, options: Anon_Encode): String = js.native
    def toEditorState(text: String): js.Any = js.native
  }
  
}

