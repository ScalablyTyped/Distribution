package typings.rcDashEditorDashCore

import typings.draftDashJs.draftDashJsMod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EditorState extends js.Object {
  var handleKeyBinding: js.UndefOr[js.Function] = js.undefined
  var handleReturn: js.UndefOr[js.Function] = js.undefined
  var onDownArrow: js.UndefOr[js.Function] = js.undefined
  var onUpArrow: js.UndefOr[js.Function] = js.undefined
  def getEditorState(): EditorState
  def setEditorState(editorState: EditorState): Unit
}

object Anon_EditorState {
  @scala.inline
  def apply(
    getEditorState: () => EditorState,
    setEditorState: EditorState => Unit,
    handleKeyBinding: js.Function = null,
    handleReturn: js.Function = null,
    onDownArrow: js.Function = null,
    onUpArrow: js.Function = null
  ): Anon_EditorState = {
    val __obj = js.Dynamic.literal(getEditorState = js.Any.fromFunction0(getEditorState), setEditorState = js.Any.fromFunction1(setEditorState))
    if (handleKeyBinding != null) __obj.updateDynamic("handleKeyBinding")(handleKeyBinding.asInstanceOf[js.Any])
    if (handleReturn != null) __obj.updateDynamic("handleReturn")(handleReturn.asInstanceOf[js.Any])
    if (onDownArrow != null) __obj.updateDynamic("onDownArrow")(onDownArrow.asInstanceOf[js.Any])
    if (onUpArrow != null) __obj.updateDynamic("onUpArrow")(onUpArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EditorState]
  }
}

