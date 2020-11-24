package typings.reactDraftWysiwyg.mod

import typings.react.mod.Component
import typings.reactDraftWysiwyg.anon.ReadonlyEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-draft-wysiwyg", "Editor")
@js.native
class Editor protected ()
  extends Component[EditorProps, js.Object, js.Any] {
  def this(props: ReadonlyEditorProps) = this()
  
  def focusEditor(): Unit = js.native
}
