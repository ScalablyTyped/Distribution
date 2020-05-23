package typings.prosemirrorDevTools.mod

import typings.prosemirrorDevTools.anon.TypeofEditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyDevToolsOptions extends js.Object {
  /**
    * From version 1.3.1 it's required for UMD build to provide EditorState
    * class (not instance).
    *
    * Previously it was causing different artifacts when working with state
    * e.g. rolling back to some history checkpoint or when restoring from
    * snapshot due to EditorState classes were different in UMD bundle and in
    * actual client code.
    */
  var EditorState: TypeofEditorState
}

object ApplyDevToolsOptions {
  @scala.inline
  def apply(EditorState: TypeofEditorState): ApplyDevToolsOptions = {
    val __obj = js.Dynamic.literal(EditorState = EditorState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyDevToolsOptions]
  }
}

