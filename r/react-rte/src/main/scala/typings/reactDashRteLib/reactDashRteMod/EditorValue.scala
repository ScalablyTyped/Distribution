package typings
package reactDashRteLib.reactDashRteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-rte", "EditorValue")
@js.native
class EditorValue protected () extends js.Object {
  def this(editorState: draftDashJsLib.draftDashJsMod.EditorState, cache: StringMap) = this()
  def getEditorState(): draftDashJsLib.draftDashJsMod.EditorState = js.native
  def setContentFromString(markup: java.lang.String, format: java.lang.String): EditorValue = js.native
  def setContentFromString(markup: java.lang.String, format: java.lang.String, options: ImportOptions): EditorValue = js.native
  def setEditorState(editorState: draftDashJsLib.draftDashJsMod.EditorState): EditorValue = js.native
  def toString(format: java.lang.String): java.lang.String = js.native
  def toString(format: java.lang.String, options: ExportOptions): java.lang.String = js.native
}

/* static members */
@JSImport("react-rte", "EditorValue")
@js.native
object EditorValue extends js.Object {
  def createEmpty(): reactDashRteLib.reactDashRteMod.EditorValue = js.native
  def createEmpty(decorator: js.Any): reactDashRteLib.reactDashRteMod.EditorValue = js.native
  def createFromState(editorState: draftDashJsLib.draftDashJsMod.EditorState): reactDashRteLib.reactDashRteMod.EditorValue = js.native
  def createFromString(markup: java.lang.String, format: java.lang.String): reactDashRteLib.reactDashRteMod.EditorValue = js.native
  def createFromString(markup: java.lang.String, format: java.lang.String, decorator: js.Any): reactDashRteLib.reactDashRteMod.EditorValue = js.native
  def createFromString(
    markup: java.lang.String,
    format: java.lang.String,
    decorator: js.Any,
    options: reactDashRteLib.reactDashRteMod.ImportOptions
  ): reactDashRteLib.reactDashRteMod.EditorValue = js.native
}

