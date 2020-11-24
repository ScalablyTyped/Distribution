package typings.prosemirrorState.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Mark
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.anon.Doc
import typings.prosemirrorState.anon.Plugins
import typings.prosemirrorState.anon.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-state", "EditorState")
@js.native
class EditorState[S /* <: Schema[_, _] */] () extends js.Object {
  
  /**
    * Apply the given transaction to produce a new state.
    */
  @JSName("apply")
  def apply(tr: Transaction[S]): EditorState[S] = js.native
  
  /**
    * Verbose variant of [`apply`](#state.EditorState.apply) that
    * returns the precise transactions that were applied (which might
    * be influenced by the [transaction
    * hooks](#state.PluginSpec.filterTransaction) of
    * plugins) along with the new state.
    */
  def applyTransaction(tr: Transaction[S]): State[S] = js.native
  
  /**
    * The current document.
    */
  var doc: Node[S] = js.native
  
  /**
    * The plugins that are active in this state.
    */
  var plugins: js.Array[Plugin[_, S]] = js.native
  
  /**
    * Create a new state based on this one, but with an adjusted set of
    * active plugins. State fields that exist in both sets of plugins
    * are kept unchanged. Those that no longer exist are dropped, and
    * those that are new are initialized using their
    * [`init`](#state.StateField.init) method, passing in the new
    * configuration object..
    */
  def reconfigure(config: Plugins[S]): EditorState[S] = js.native
  
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
  var storedMarks: js.UndefOr[js.Array[Mark[S]] | Null] = js.native
  
  /**
    * Serialize this state to JSON. If you want to serialize the state
    * of plugins, pass an object mapping property names to use in the
    * resulting JSON object to plugin objects.
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  def toJSON(pluginFields: String): StringDictionary[js.Any] = js.native
  def toJSON(pluginFields: StringDictionary[Plugin[_, S]]): StringDictionary[js.Any] = js.native
  def toJSON(pluginFields: Double): StringDictionary[js.Any] = js.native
  
  /**
    * Start a [transaction](#state.Transaction) from this state.
    */
  var tr: Transaction[S] = js.native
}
/* static members */
@JSImport("prosemirror-state", "EditorState")
@js.native
object EditorState extends js.Object {
  
  /**
    * Create a new state.
    */
  def create[S /* <: Schema[_, _] */](config: Doc[S]): EditorState[S] = js.native
  
  /**
    * Deserialize a JSON representation of a state. `config` should
    * have at least a `schema` field, and should contain array of
    * plugins to initialize the state with. `pluginFields` can be used
    * to deserialize the state of plugins, by associating plugin
    * instances with the property names they use in the JSON object.
    */
  def fromJSON[S /* <: Schema[_, _] */](config: typings.prosemirrorState.anon.Schema[S], json: StringDictionary[js.Any]): EditorState[S] = js.native
  def fromJSON[S /* <: Schema[_, _] */](
    config: typings.prosemirrorState.anon.Schema[S],
    json: StringDictionary[js.Any],
    pluginFields: StringDictionary[Plugin[_, S]]
  ): EditorState[S] = js.native
}
