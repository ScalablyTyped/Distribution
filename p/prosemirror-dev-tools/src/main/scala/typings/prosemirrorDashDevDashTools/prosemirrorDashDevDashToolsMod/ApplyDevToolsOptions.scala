package typings.prosemirrorDashDevDashTools.prosemirrorDashDevDashToolsMod

import typings.prosemirrorDashDevDashTools.TypeofClassEditorState
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
  var EditorState: TypeofClassEditorState
}

object ApplyDevToolsOptions {
  @scala.inline
  def apply(EditorState: TypeofClassEditorState): ApplyDevToolsOptions = {
    val __obj = js.Dynamic.literal(EditorState = EditorState)
  
    __obj.asInstanceOf[ApplyDevToolsOptions]
  }
}

