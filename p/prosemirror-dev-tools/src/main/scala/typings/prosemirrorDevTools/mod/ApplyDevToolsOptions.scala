package typings.prosemirrorDevTools.mod

import typings.prosemirrorDevTools.anon.TypeofEditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var EditorState: TypeofEditorState = js.native
}

object ApplyDevToolsOptions {
  @scala.inline
  def apply(EditorState: TypeofEditorState): ApplyDevToolsOptions = {
    val __obj = js.Dynamic.literal(EditorState = EditorState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyDevToolsOptions]
  }
  @scala.inline
  implicit class ApplyDevToolsOptionsOps[Self <: ApplyDevToolsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEditorState(value: TypeofEditorState): Self = this.set("EditorState", value.asInstanceOf[js.Any])
  }
  
}

