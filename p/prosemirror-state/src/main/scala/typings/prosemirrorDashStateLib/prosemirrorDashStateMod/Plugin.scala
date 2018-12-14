package typings
package prosemirrorDashStateLib.prosemirrorDashStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-state", "Plugin")
@js.native
class Plugin[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] protected () extends js.Object {
  /**
     * Create a plugin.
     */
  def this(spec: PluginSpec[S]) = this()
  /**
     * The [props](#view.EditorProps) exported by this plugin.
     */
  var props: prosemirrorDashViewLib.prosemirrorDashViewMod.EditorProps[S] = js.native
  /**
     * The plugin's [spec object](#state.PluginSpec).
     */
  var spec: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
     * Extract the plugin's state field from an editor state.
     */
  def getState(state: EditorState[S]): js.Any = js.native
}

