package typings.prosemirrorState.mod

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorView.mod.EditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-state", "Plugin")
@js.native
class Plugin[T, S /* <: Schema[_, _] */] protected () extends js.Object {
  /**
    * Create a plugin.
    */
  def this(spec: PluginSpec[T, S]) = this()
  
  /**
    * Extract the plugin's state field from an editor state.
    */
  def getState(state: EditorState[S]): T = js.native
  
  /**
    * The [props](#view.EditorProps) exported by this plugin.
    */
  var props: EditorProps[Plugin[T, S], S] = js.native
  
  /**
    * The plugin's [spec object](#state.PluginSpec).
    */
  var spec: PluginSpec[T, S] = js.native
}
