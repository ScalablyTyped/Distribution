package typings.prosemirrorDashState.prosemirrorDashStateMod

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-state", "PluginKey")
@js.native
/**
  * Create a plugin key.
  */
class PluginKey[T, S /* <: Schema[_, _] */] () extends js.Object {
  def this(name: String) = this()
  /**
    * Get the active plugin with this key, if any, from an editor
    * state.
    */
  def get(state: EditorState[S]): js.UndefOr[(Plugin[T, S]) | Null] = js.native
  /**
    * Get the plugin's state from an editor state.
    */
  def getState(state: EditorState[S]): js.UndefOr[js.Any | Null] = js.native
}

