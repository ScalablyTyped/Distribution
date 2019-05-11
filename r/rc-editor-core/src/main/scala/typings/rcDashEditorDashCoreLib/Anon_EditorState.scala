package typings
package rcDashEditorDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EditorState extends js.Object {
  var handleKeyBinding: js.UndefOr[js.Function] = js.undefined
  var handleReturn: js.UndefOr[js.Function] = js.undefined
  var onDownArrow: js.UndefOr[js.Function] = js.undefined
  var onUpArrow: js.UndefOr[js.Function] = js.undefined
  def getEditorState(): draftDashJsLib.draftDashJsMod.EditorState
  def setEditorState(editorState: draftDashJsLib.draftDashJsMod.EditorState): scala.Unit
}

object Anon_EditorState {
  @scala.inline
  def apply(
    getEditorState: () => draftDashJsLib.draftDashJsMod.EditorState,
    setEditorState: draftDashJsLib.draftDashJsMod.EditorState => scala.Unit,
    handleKeyBinding: js.Function = null,
    handleReturn: js.Function = null,
    onDownArrow: js.Function = null,
    onUpArrow: js.Function = null
  ): Anon_EditorState = {
    val __obj = js.Dynamic.literal(getEditorState = js.Any.fromFunction0(getEditorState), setEditorState = js.Any.fromFunction1(setEditorState))
    if (handleKeyBinding != null) __obj.updateDynamic("handleKeyBinding")(handleKeyBinding)
    if (handleReturn != null) __obj.updateDynamic("handleReturn")(handleReturn)
    if (onDownArrow != null) __obj.updateDynamic("onDownArrow")(onDownArrow)
    if (onUpArrow != null) __obj.updateDynamic("onUpArrow")(onUpArrow)
    __obj.asInstanceOf[Anon_EditorState]
  }
}

