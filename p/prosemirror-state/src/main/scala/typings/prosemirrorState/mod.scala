package typings.prosemirrorState

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Mark
import typings.prosemirrorModel.mod.MarkType
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorState.anon.Destroy
import typings.prosemirrorState.anon.Doc
import typings.prosemirrorState.anon.Instantiable
import typings.prosemirrorState.anon.Plugins
import typings.prosemirrorState.anon.State
import typings.prosemirrorTransform.mod.Mappable
import typings.prosemirrorTransform.mod.Mapping
import typings.prosemirrorTransform.mod.Transform
import typings.prosemirrorView.mod.EditorProps
import typings.prosemirrorView.mod.EditorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-state", "AllSelection")
  @js.native
  class AllSelection[S /* <: Schema[js.Any, js.Any] */] protected () extends Selection[S] {
    /**
      * Create an all-selection over the given document.
      */
    def this(doc: Node[S]) = this()
  }
  
  @JSImport("prosemirror-state", "EditorState")
  @js.native
  class EditorState[S /* <: Schema[js.Any, js.Any] */] () extends StObject {
    
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
    var plugins: js.Array[Plugin[js.Any, S]] = js.native
    
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
    def toJSON(pluginFields: StringDictionary[Plugin[js.Any, S]]): StringDictionary[js.Any] = js.native
    def toJSON(pluginFields: Double): StringDictionary[js.Any] = js.native
    
    /**
      * Start a [transaction](#state.Transaction) from this state.
      */
    var tr: Transaction[S] = js.native
  }
  /* static members */
  object EditorState {
    
    @JSImport("prosemirror-state", "EditorState")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new state.
      */
    inline def create[S /* <: Schema[js.Any, js.Any] */](config: Doc[S]): EditorState[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[EditorState[S]]
    
    /**
      * Deserialize a JSON representation of a state. `config` should
      * have at least a `schema` field, and should contain array of
      * plugins to initialize the state with. `pluginFields` can be used
      * to deserialize the state of plugins, by associating plugin
      * instances with the property names they use in the JSON object.
      */
    inline def fromJSON[S /* <: Schema[js.Any, js.Any] */](config: typings.prosemirrorState.anon.Schema[S], json: StringDictionary[js.Any]): EditorState[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(config.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[EditorState[S]]
    inline def fromJSON[S /* <: Schema[js.Any, js.Any] */](
      config: typings.prosemirrorState.anon.Schema[S],
      json: StringDictionary[js.Any],
      pluginFields: StringDictionary[Plugin[js.Any, S]]
    ): EditorState[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(config.asInstanceOf[js.Any], json.asInstanceOf[js.Any], pluginFields.asInstanceOf[js.Any])).asInstanceOf[EditorState[S]]
  }
  
  @JSImport("prosemirror-state", "NodeSelection")
  @js.native
  class NodeSelection[S /* <: Schema[js.Any, js.Any] */] protected () extends Selection[S] {
    /**
      * Create a node selection. Does not verify the validity of its
      * argument.
      */
    def this($pos: ResolvedPos[S]) = this()
    
    /**
      * The selected node.
      */
    var node: Node[S] = js.native
  }
  /* static members */
  object NodeSelection {
    
    @JSImport("prosemirror-state", "NodeSelection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a node selection from non-resolved positions.
      */
    inline def create[S /* <: Schema[js.Any, js.Any] */](doc: Node[S], from: Double): NodeSelection[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[NodeSelection[S]]
    
    /**
      * Determines whether the given node may be selected as a node
      * selection.
      */
    inline def isSelectable(node: Node[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelectable")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("prosemirror-state", "Plugin")
  @js.native
  class Plugin[T, S /* <: Schema[js.Any, js.Any] */] protected () extends StObject {
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
  
  @JSImport("prosemirror-state", "PluginKey")
  @js.native
  /**
    * Create a plugin key.
    */
  class PluginKey[T, S /* <: Schema[js.Any, js.Any] */] () extends StObject {
    def this(name: String) = this()
    
    /**
      * Get the active plugin with this key, if any, from an editor
      * state.
      */
    def get(state: EditorState[S]): js.UndefOr[(Plugin[T, S]) | Null] = js.native
    
    /**
      * Get the plugin's state from an editor state.
      */
    def getState(state: EditorState[S]): js.UndefOr[T | Null] = js.native
  }
  
  @JSImport("prosemirror-state", "Selection")
  @js.native
  class Selection[S /* <: Schema[js.Any, js.Any] */] protected () extends StObject {
    /**
      * Initialize a selection with the head and anchor and ranges. If no
      * ranges are given, constructs a single range across `$anchor` and
      * `$head`.
      */
    def this($anchor: ResolvedPos[S], $head: ResolvedPos[S]) = this()
    def this($anchor: ResolvedPos[S], $head: ResolvedPos[S], ranges: js.Array[SelectionRange[S]]) = this()
    
    /**
      * The resolved anchor of the selection (the side that stays in
      * place when the selection is modified).
      */
    @JSName("$anchor")
    var $anchor: ResolvedPos[S] = js.native
    
    /**
      * The resolved lower  bound of the selection's main range.
      */
    @JSName("$from")
    var $from: ResolvedPos[S] = js.native
    
    /**
      * The resolved head of the selection (the side that moves when
      * the selection is modified).
      */
    @JSName("$head")
    var $head: ResolvedPos[S] = js.native
    
    /**
      * The resolved upper bound of the selection's main range.
      */
    @JSName("$to")
    var $to: ResolvedPos[S] = js.native
    
    /**
      * The selection's anchor, as an unresolved position.
      */
    var anchor: Double = js.native
    
    /**
      * Get the content of this selection as a slice.
      */
    def content(): Slice[S] = js.native
    
    /**
      * Indicates whether the selection contains any content.
      */
    var empty: Boolean = js.native
    
    /**
      * Test whether the selection is the same as another selection.
      */
    def eq(p: Selection[S]): Boolean = js.native
    
    /**
      * The lower bound of the selection's main range.
      */
    var from: Double = js.native
    
    /**
      * Get a [bookmark](#state.SelectionBookmark) for this selection,
      * which is a value that can be mapped without having access to a
      * current document, and later resolved to a real selection for a
      * given document again. (This is used mostly by the history to
      * track and restore old selections.) The default implementation of
      * this method just converts the selection to a text selection and
      * returns the bookmark for that.
      */
    def getBookmark(): SelectionBookmark[S] = js.native
    
    /**
      * The selection's head.
      */
    var head: Double = js.native
    
    /**
      * Map this selection through a [mappable](#transform.Mappable) thing. `doc`
      * should be the new document to which we are mapping.
      */
    def map(doc: Node[S], mapping: Mappable): Selection[S] = js.native
    
    /**
      * The ranges covered by the selection.
      */
    var ranges: js.Array[SelectionRange[S]] = js.native
    
    /**
      * Replace the selection with a slice or, if no slice is given,
      * delete the selection. Will append to the given transaction.
      */
    def replace(tr: Transaction[S]): Unit = js.native
    def replace(tr: Transaction[S], content: Slice[S]): Unit = js.native
    
    /**
      * Replace the selection with the given node, appending the changes
      * to the given transaction.
      */
    def replaceWith(tr: Transaction[S], node: Node[S]): Unit = js.native
    
    /**
      * The upper bound of the selection's main range.
      */
    var to: Double = js.native
    
    /**
      * Convert the selection to a JSON representation. When implementing
      * this for a custom selection class, make sure to give the object a
      * `type` property whose value matches the ID under which you
      * [registered](#state.Selection^jsonID) your class.
      */
    def toJSON(): StringDictionary[js.Any] = js.native
    
    /**
      * Controls whether, when a selection of this type is active in the
      * browser, the selected range should be visible to the user. Defaults
      * to `true`.
      */
    var visible: Boolean = js.native
  }
  /* static members */
  object Selection {
    
    @JSImport("prosemirror-state", "Selection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Find the cursor or leaf node selection closest to the end of the
      * given document.
      */
    inline def atEnd[S /* <: Schema[js.Any, js.Any] */](doc: Node[S]): Selection[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("atEnd")(doc.asInstanceOf[js.Any]).asInstanceOf[Selection[S]]
    
    /**
      * Find the cursor or leaf node selection closest to the start of
      * the given document. Will return an
      * [`AllSelection`](#state.AllSelection) if no valid position
      * exists.
      */
    inline def atStart[S /* <: Schema[js.Any, js.Any] */](doc: Node[S]): Selection[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("atStart")(doc.asInstanceOf[js.Any]).asInstanceOf[Selection[S]]
    
    /**
      * Find a valid cursor or leaf node selection starting at the given
      * position and searching back if `dir` is negative, and forward if
      * positive. When `textOnly` is true, only consider cursor
      * selections. Will return null when no valid selection position is
      * found.
      */
    inline def findFrom[S /* <: Schema[js.Any, js.Any] */]($pos: ResolvedPos[S], dir: Double): js.UndefOr[Selection[S] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFrom")($pos.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Selection[S] | Null]]
    inline def findFrom[S /* <: Schema[js.Any, js.Any] */]($pos: ResolvedPos[S], dir: Double, textOnly: Boolean): js.UndefOr[Selection[S] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFrom")($pos.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], textOnly.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Selection[S] | Null]]
    
    /**
      * Deserialize the JSON representation of a selection. Must be
      * implemented for custom classes (as a static class method).
      */
    inline def fromJSON[S /* <: Schema[js.Any, js.Any] */](doc: Node[S], json: StringDictionary[js.Any]): Selection[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(doc.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Selection[S]]
    
    /**
      * To be able to deserialize selections from JSON, custom selection
      * classes must register themselves with an ID string, so that they
      * can be disambiguated. Try to pick something that's unlikely to
      * clash with classes from other modules.
      */
    inline def jsonID(id: String, selectionClass: Instantiable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonID")(id.asInstanceOf[js.Any], selectionClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Find a valid cursor or leaf node selection near the given
      * position. Searches forward first by default, but if `bias` is
      * negative, it will search backwards first.
      */
    inline def near[S /* <: Schema[js.Any, js.Any] */]($pos: ResolvedPos[S]): Selection[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("near")($pos.asInstanceOf[js.Any]).asInstanceOf[Selection[S]]
    inline def near[S /* <: Schema[js.Any, js.Any] */]($pos: ResolvedPos[S], bias: Double): Selection[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("near")($pos.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Selection[S]]
  }
  
  @JSImport("prosemirror-state", "SelectionRange")
  @js.native
  class SelectionRange[S /* <: Schema[js.Any, js.Any] */] protected () extends StObject {
    def this($from: ResolvedPos[S], $to: ResolvedPos[S]) = this()
    
    /**
      * The lower bound of the range.
      */
    @JSName("$from")
    var $from: ResolvedPos[S] = js.native
    
    /**
      * The upper bound of the range.
      */
    @JSName("$to")
    var $to: ResolvedPos[S] = js.native
  }
  
  @JSImport("prosemirror-state", "TextSelection")
  @js.native
  class TextSelection[S /* <: Schema[js.Any, js.Any] */] protected () extends Selection[S] {
    /**
      * Construct a text selection between the given points.
      */
    def this($anchor: ResolvedPos[S]) = this()
    def this($anchor: ResolvedPos[S], $head: ResolvedPos[S]) = this()
    
    /**
      * Returns a resolved position if this is a cursor selection (an
      * empty text selection), and null otherwise.
      */
    @JSName("$cursor")
    var $cursor: js.UndefOr[ResolvedPos[S] | Null] = js.native
  }
  /* static members */
  object TextSelection {
    
    @JSImport("prosemirror-state", "TextSelection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Return a text selection that spans the given positions or, if
      * they aren't text positions, find a text selection near them.
      * `bias` determines whether the method searches forward (default)
      * or backwards (negative number) first. Will fall back to calling
      * [`Selection.near`](#state.Selection^near) when the document
      * doesn't contain a valid text position.
      */
    inline def between[S /* <: Schema[js.Any, js.Any] */]($anchor: ResolvedPos[S], $head: ResolvedPos[S]): Selection[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("between")($anchor.asInstanceOf[js.Any], $head.asInstanceOf[js.Any])).asInstanceOf[Selection[S]]
    inline def between[S /* <: Schema[js.Any, js.Any] */]($anchor: ResolvedPos[S], $head: ResolvedPos[S], bias: Double): Selection[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("between")($anchor.asInstanceOf[js.Any], $head.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Selection[S]]
    
    /**
      * Create a text selection from non-resolved positions.
      */
    inline def create[S /* <: Schema[js.Any, js.Any] */](doc: Node[S], anchor: Double): TextSelection[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[TextSelection[S]]
    inline def create[S /* <: Schema[js.Any, js.Any] */](doc: Node[S], anchor: Double, head: Double): TextSelection[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], head.asInstanceOf[js.Any])).asInstanceOf[TextSelection[S]]
  }
  
  @JSImport("prosemirror-state", "Transaction")
  @js.native
  class Transaction[S /* <: Schema[js.Any, js.Any] */] protected () extends Transform[S] {
    /**
      * Create a transform that starts with the given document.
      */
    def this(doc: Node[S]) = this()
    
    /**
      * Add a mark to the set of stored marks.
      */
    def addStoredMark(mark: Mark[js.Any]): Transaction[js.Any] = js.native
    
    /**
      * Delete the selection.
      */
    def deleteSelection(): Transaction[js.Any] = js.native
    
    /**
      * Make sure the current stored marks or, if that is null, the marks
      * at the selection, match the given set of marks. Does nothing if
      * this is already the case.
      */
    def ensureMarks(marks: js.Array[Mark[js.Any]]): Transaction[js.Any] = js.native
    
    /**
      * Retrieve a metadata property for a given name or plugin.
      */
    def getMeta(key: String): js.Any = js.native
    def getMeta(key: Plugin[js.Any, S]): js.Any = js.native
    def getMeta(key: PluginKey[js.Any, S]): js.Any = js.native
    
    /**
      * Replace the given range, or the selection if no range is given,
      * with a text node containing the given string.
      */
    def insertText(text: String): Transaction[js.Any] = js.native
    def insertText(text: String, from: Double): Transaction[js.Any] = js.native
    def insertText(text: String, from: Double, to: Double): Transaction[js.Any] = js.native
    def insertText(text: String, from: Unit, to: Double): Transaction[js.Any] = js.native
    
    /**
      * Returns true if this transaction doesn't contain any metadata,
      * and can thus safely be extended.
      */
    var isGeneric: Boolean = js.native
    
    /**
      * Remove a mark or mark type from the set of stored marks.
      */
    def removeStoredMark(mark: Mark[js.Any]): Transaction[js.Any] = js.native
    def removeStoredMark(mark: MarkType[js.Any]): Transaction[js.Any] = js.native
    
    /**
      * Replace the current selection with the given slice.
      */
    def replaceSelection(slice: Slice[js.Any]): Transaction[js.Any] = js.native
    
    /**
      * Replace the selection with the given node. When `inheritMarks` is
      * true and the content is inline, it inherits the marks from the
      * place where it is inserted.
      */
    def replaceSelectionWith(node: Node[js.Any]): Transaction[js.Any] = js.native
    def replaceSelectionWith(node: Node[js.Any], inheritMarks: Boolean): Transaction[js.Any] = js.native
    
    /**
      * Indicate that the editor should scroll the selection into view
      * when updated to the state produced by this transaction.
      */
    def scrollIntoView(): Transaction[js.Any] = js.native
    
    /**
      * The transaction's current selection. This defaults to the editor
      * selection [mapped](#state.Selection.map) through the steps in the
      * transaction, but can be overwritten with
      * [`setSelection`](#state.Transaction.setSelection).
      */
    var selection: Selection[js.Any] = js.native
    
    /**
      * Whether the selection was explicitly updated by this transaction.
      */
    var selectionSet: Boolean = js.native
    
    /**
      * Store a metadata property in this transaction, keyed either by
      * name or by plugin.
      */
    def setMeta(key: String, value: js.Any): Transaction[js.Any] = js.native
    def setMeta(key: PluginKey[js.Any, S], value: js.Any): Transaction[js.Any] = js.native
    def setMeta(key: Plugin[js.Any, S], value: js.Any): Transaction[js.Any] = js.native
    
    /**
      * Update the transaction's current selection. Will determine the
      * selection that the editor gets when the transaction is applied.
      */
    def setSelection(selection: Selection[js.Any]): Transaction[js.Any] = js.native
    
    /**
      * Set the current stored marks.
      */
    def setStoredMarks(): Transaction[js.Any] = js.native
    def setStoredMarks(marks: js.Array[Mark[js.Any]]): Transaction[js.Any] = js.native
    
    /**
      * Update the timestamp for the transaction.
      */
    def setTime(time: Double): Transaction[js.Any] = js.native
    
    /**
      * The stored marks set by this transaction, if any.
      */
    var storedMarks: js.UndefOr[js.Array[Mark[js.Any]] | Null] = js.native
    
    /**
      * Whether the stored marks were explicitly set for this transaction.
      */
    var storedMarksSet: Boolean = js.native
    
    /**
      * The timestamp associated with this transaction, in the same
      * format as `Date.now()`.
      */
    var time: Double = js.native
  }
  
  trait PluginSpec[T, S /* <: Schema[js.Any, js.Any] */] extends StObject {
    
    /**
      * Allows the plugin to append another transaction to be applied
      * after the given array of transactions. When another plugin
      * appends a transaction after this was called, it is called again
      * with the new state and new transactions—but only the new
      * transactions, i.e. it won't be passed transactions that it
      * already saw.
      */
    var appendTransaction: js.UndefOr[
        (js.Function3[
          /* transactions */ js.Array[Transaction[S]], 
          /* oldState */ EditorState[S], 
          /* newState */ EditorState[S], 
          js.UndefOr[Transaction[S] | Null | Unit]
        ]) | Null
      ] = js.undefined
    
    /**
      * When present, this will be called before a transaction is
      * applied by the state, allowing the plugin to cancel it (by
      * returning false).
      */
    var filterTransaction: js.UndefOr[(js.Function2[/* p1 */ Transaction[S], /* p2 */ EditorState[S], Boolean]) | Null] = js.undefined
    
    /**
      * Can be used to make this a keyed plugin. You can have only one
      * plugin with a given key in a given state, but it is possible to
      * access the plugin's configuration and state through the key,
      * without having access to the plugin instance object.
      */
    var key: js.UndefOr[(PluginKey[T, S]) | Null] = js.undefined
    
    /**
      * The [view props](#view.EditorProps) added by this plugin. Props
      * that are functions will be bound to have the plugin instance as
      * their `this` binding.
      */
    var props: js.UndefOr[(EditorProps[Plugin[T, S], S]) | Null] = js.undefined
    
    /**
      * Allows a plugin to define a [state field](#state.StateField), an
      * extra slot in the state object in which it can keep its own data.
      */
    var state: js.UndefOr[(StateField[T, S]) | Null] = js.undefined
    
    /**
      * When the plugin needs to interact with the editor view, or
      * set something up in the DOM, use this field. The function
      * will be called when the plugin's state is associated with an
      * editor view.
      */
    var view: js.UndefOr[(js.Function1[/* p */ EditorView[S], Destroy[S]]) | Null] = js.undefined
  }
  object PluginSpec {
    
    inline def apply[T, S /* <: Schema[js.Any, js.Any] */](): PluginSpec[T, S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginSpec[T, S]]
    }
    
    extension [Self <: PluginSpec[?, ?], T, S /* <: Schema[js.Any, js.Any] */](x: Self & (PluginSpec[T, S])) {
      
      inline def setAppendTransaction(
        value: (/* transactions */ js.Array[Transaction[S]], /* oldState */ EditorState[S], /* newState */ EditorState[S]) => js.UndefOr[Transaction[S] | Null | Unit]
      ): Self = StObject.set(x, "appendTransaction", js.Any.fromFunction3(value))
      
      inline def setAppendTransactionNull: Self = StObject.set(x, "appendTransaction", null)
      
      inline def setAppendTransactionUndefined: Self = StObject.set(x, "appendTransaction", js.undefined)
      
      inline def setFilterTransaction(value: (/* p1 */ Transaction[S], /* p2 */ EditorState[S]) => Boolean): Self = StObject.set(x, "filterTransaction", js.Any.fromFunction2(value))
      
      inline def setFilterTransactionNull: Self = StObject.set(x, "filterTransaction", null)
      
      inline def setFilterTransactionUndefined: Self = StObject.set(x, "filterTransaction", js.undefined)
      
      inline def setKey(value: PluginKey[T, S]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setProps(value: EditorProps[Plugin[T, S], S]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsNull: Self = StObject.set(x, "props", null)
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setState(value: StateField[T, S]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateNull: Self = StObject.set(x, "state", null)
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setView(value: /* p */ EditorView[S] => Destroy[S]): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
      
      inline def setViewNull: Self = StObject.set(x, "view", null)
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  trait SelectionBookmark[S /* <: Schema[js.Any, js.Any] */] extends StObject {
    
    /**
      * Map the bookmark through a set of changes.
      */
    def map(mapping: Mapping): SelectionBookmark[S]
    
    /**
      * Resolve the bookmark to a real selection again. This may need to
      * do some error checking and may fall back to a default (usually
      * [`TextSelection.between`](#state.TextSelection^between)) if
      * mapping made the bookmark invalid.
      */
    def resolve(doc: Node[S]): Selection[S]
  }
  object SelectionBookmark {
    
    inline def apply[S /* <: Schema[js.Any, js.Any] */](map: Mapping => SelectionBookmark[S], resolve: Node[S] => Selection[S]): SelectionBookmark[S] = {
      val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[SelectionBookmark[S]]
    }
    
    extension [Self <: SelectionBookmark[?], S /* <: Schema[js.Any, js.Any] */](x: Self & SelectionBookmark[S]) {
      
      inline def setMap(value: Mapping => SelectionBookmark[S]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setResolve(value: Node[S] => Selection[S]): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  trait StateField[T, S /* <: Schema[js.Any, js.Any] */] extends StObject {
    
    /**
      * Apply the given transaction to this state field, producing a new
      * field value. Note that the `newState` argument is again a partially
      * constructed state does not yet contain the state from plugins
      * coming after this one.
      */
    @JSName("apply")
    def apply(tr: Transaction[S], value: T, oldState: EditorState[S], newState: EditorState[S]): T
    
    /**
      * Deserialize the JSON representation of this field. Note that the
      * `state` argument is again a half-initialized state.
      */
    var fromJSON: js.UndefOr[
        (js.ThisFunction3[
          /* this */ Plugin[T, S], 
          /* config */ StringDictionary[js.Any], 
          /* value */ js.Any, 
          /* state */ EditorState[S], 
          T
        ]) | Null
      ] = js.undefined
    
    /**
      * Initialize the value of the field. `config` will be the object
      * passed to [`EditorState.create`](#state.EditorState^create). Note
      * that `instance` is a half-initialized state instance, and will
      * not have values for plugin fields initialized after this one.
      */
    def init(config: StringDictionary[js.Any], instance: EditorState[S]): T
    
    /**
      * Convert this field to JSON. Optional, can be left off to disable
      * JSON serialization for the field.
      */
    var toJSON: js.UndefOr[(js.ThisFunction1[/* this */ Plugin[T, S], /* value */ T, js.Any]) | Null] = js.undefined
  }
  object StateField {
    
    inline def apply[T, S /* <: Schema[js.Any, js.Any] */](
      apply: (Transaction[S], T, EditorState[S], EditorState[S]) => T,
      init: (StringDictionary[js.Any], EditorState[S]) => T
    ): StateField[T, S] = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction4(apply), init = js.Any.fromFunction2(init))
      __obj.asInstanceOf[StateField[T, S]]
    }
    
    extension [Self <: StateField[?, ?], T, S /* <: Schema[js.Any, js.Any] */](x: Self & (StateField[T, S])) {
      
      inline def setApply(value: (Transaction[S], T, EditorState[S], EditorState[S]) => T): Self = StObject.set(x, "apply", js.Any.fromFunction4(value))
      
      inline def setFromJSON(
        value: js.ThisFunction3[
              /* this */ Plugin[T, S], 
              /* config */ StringDictionary[js.Any], 
              /* value */ js.Any, 
              /* state */ EditorState[S], 
              T
            ]
      ): Self = StObject.set(x, "fromJSON", value.asInstanceOf[js.Any])
      
      inline def setFromJSONNull: Self = StObject.set(x, "fromJSON", null)
      
      inline def setFromJSONUndefined: Self = StObject.set(x, "fromJSON", js.undefined)
      
      inline def setInit(value: (StringDictionary[js.Any], EditorState[S]) => T): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
      
      inline def setToJSON(value: js.ThisFunction1[/* this */ Plugin[T, S], /* value */ T, js.Any]): Self = StObject.set(x, "toJSON", value.asInstanceOf[js.Any])
      
      inline def setToJSONNull: Self = StObject.set(x, "toJSON", null)
      
      inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    }
  }
}
