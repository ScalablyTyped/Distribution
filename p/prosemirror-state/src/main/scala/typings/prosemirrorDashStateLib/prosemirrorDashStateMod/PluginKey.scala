package typings
package prosemirrorDashStateLib.prosemirrorDashStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-state", "PluginKey")
@js.native
/**
  * Create a plugin key.
  */
class PluginKey[T, S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] () extends js.Object {
  def this(name: java.lang.String) = this()
  /**
    * Get the active plugin with this key, if any, from an editor
    * state.
    */
  def get(state: EditorState[S]): js.UndefOr[(Plugin[T, S]) | scala.Null] = js.native
  /**
    * Get the plugin's state from an editor state.
    */
  def getState(state: EditorState[S]): js.UndefOr[js.Any | scala.Null] = js.native
}

