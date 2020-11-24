package typings.reactRte.mod

import typings.draftJs.mod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-rte", "EditorValue")
@js.native
class EditorValue protected () extends js.Object {
  def this(editorState: EditorState, cache: StringMap) = this()
  
  def getEditorState(): EditorState = js.native
  
  def setContentFromString(markup: String, format: String): EditorValue = js.native
  def setContentFromString(markup: String, format: String, options: ImportOptions): EditorValue = js.native
  
  def setEditorState(editorState: EditorState): EditorValue = js.native
  
  def toString(format: String): String = js.native
  def toString(format: String, options: ExportOptions): String = js.native
}
/* static members */
@JSImport("react-rte", "EditorValue")
@js.native
object EditorValue extends js.Object {
  
  def createEmpty(): EditorValue = js.native
  def createEmpty(decorator: js.Any): EditorValue = js.native
  
  def createFromState(editorState: EditorState): EditorValue = js.native
  
  def createFromString(markup: String, format: String): EditorValue = js.native
  def createFromString(markup: String, format: String, decorator: js.UndefOr[scala.Nothing], options: ImportOptions): EditorValue = js.native
  def createFromString(markup: String, format: String, decorator: js.Any): EditorValue = js.native
  def createFromString(markup: String, format: String, decorator: js.Any, options: ImportOptions): EditorValue = js.native
}
