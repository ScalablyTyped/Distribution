package typings
package prosemirrorDashStateLib.prosemirrorDashStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-state", "EditorState")
@js.native
class EditorState[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] () extends js.Object {
  /**
     * The current document.
     */
  var doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S] = js.native
  /**
     * The plugins that are active in this state.
     */
  var plugins: js.Array[Plugin[S]] = js.native
  /**
     * The schema of the state's document.
     */
  var schema: S = js.native
  /**
     * The selection.
     */
  var selection: Selection[S] = js.native
  /**
     * A set of marks to apply to the next input. Will be null when
     * no explicit marks have been set.
     */
  var storedMarks: js.UndefOr[js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[S]] | scala.Null] = js.native
  /**
     * Start a [transaction](#state.Transaction) from this state.
     */
  var tr: Transaction[_] = js.native
  /**
     * Apply the given transaction to produce a new state.
     */
  @JSName("apply")
  def apply(tr: Transaction[_]): EditorState[S] = js.native
  /**
     * Verbose variant of [`apply`](#state.EditorState.apply) that
     * returns the precise transactions that were applied (which might
     * be influenced by the [transaction
     * hooks](#state.PluginSpec.filterTransaction) of
     * plugins) along with the new state.
     */
  def applyTransaction(tr: Transaction[_]): prosemirrorDashStateLib.Anon_State[S] = js.native
  /**
     * Create a new state based on this one, but with an adjusted set of
     * active plugins. State fields that exist in both sets of plugins
     * are kept unchanged. Those that no longer exist are dropped, and
     * those that are new are initialized using their
     * [`init`](#state.StateField.init) method, passing in the new
     * configuration object..
     */
  def reconfigure(config: prosemirrorDashStateLib.Anon_PluginsSchema[S]): EditorState[S] = js.native
  /**
     * Serialize this state to JSON. If you want to serialize the state
     * of plugins, pass an object mapping property names to use in the
     * resulting JSON object to plugin objects.
     */
  def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
     * Serialize this state to JSON. If you want to serialize the state
     * of plugins, pass an object mapping property names to use in the
     * resulting JSON object to plugin objects.
     */
  def toJSON(pluginFields: ScalablyTyped.runtime.StringDictionary[Plugin[S]]): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
     * Serialize this state to JSON. If you want to serialize the state
     * of plugins, pass an object mapping property names to use in the
     * resulting JSON object to plugin objects.
     */
  def toJSON(pluginFields: java.lang.String): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
     * Serialize this state to JSON. If you want to serialize the state
     * of plugins, pass an object mapping property names to use in the
     * resulting JSON object to plugin objects.
     */
  def toJSON(pluginFields: scala.Double): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("prosemirror-state", "EditorState")
@js.native
object EditorState extends js.Object {
  /**
     * Create a new state.
     */
  def create[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](config: prosemirrorDashStateLib.Anon_PluginsDoc[S]): prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S] = js.native
  /**
     * Deserialize a JSON representation of a state. `config` should
     * have at least a `schema` field, and should contain array of
     * plugins to initialize the state with. `pluginFields` can be used
     * to deserialize the state of plugins, by associating plugin
     * instances with the property names they use in the JSON object.
     */
  def fromJSON[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    config: prosemirrorDashStateLib.Anon_Plugins[S],
    json: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S] = js.native
  /**
     * Deserialize a JSON representation of a state. `config` should
     * have at least a `schema` field, and should contain array of
     * plugins to initialize the state with. `pluginFields` can be used
     * to deserialize the state of plugins, by associating plugin
     * instances with the property names they use in the JSON object.
     */
  def fromJSON[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    config: prosemirrorDashStateLib.Anon_Plugins[S],
    json: ScalablyTyped.runtime.StringDictionary[js.Any],
    pluginFields: ScalablyTyped.runtime.StringDictionary[prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[S]]
  ): prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S] = js.native
}

