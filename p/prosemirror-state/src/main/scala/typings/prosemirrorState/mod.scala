package typings.prosemirrorState

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Mark
import typings.prosemirrorModel.mod.MarkType
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorState.anon.FromJSON
import typings.prosemirrorState.anon.Plugins
import typings.prosemirrorState.anon.State
import typings.prosemirrorState.anon.`0`
import typings.prosemirrorTransform.mod.Mappable
import typings.prosemirrorTransform.mod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  A selection type that represents selecting the whole document
  (which can not necessarily be expressed with a text selection, when
  there are for example leaf block nodes at the start or end of the
  document).
  */
  @JSImport("prosemirror-state", "AllSelection")
  @js.native
  open class AllSelection protected () extends Selection {
    /**
      Create an all-selection over the given document.
      */
    def this(doc: Node) = this()
    
    def map(doc: Node): AllSelection = js.native
  }
  
  /**
  The state of a ProseMirror editor is represented by an object of
  this type. A state is a persistent data structure—it isn't
  updated, but rather a new state value is computed from an old one
  using the [`apply`](https://prosemirror.net/docs/ref/#state.EditorState.apply) method.
  A state holds a number of built-in fields, and plugins can
  [define](https://prosemirror.net/docs/ref/#state.PluginSpec.state) additional fields.
  */
  @JSImport("prosemirror-state", "EditorState")
  @js.native
  open class EditorState () extends StObject {
    
    /**
      Apply the given transaction to produce a new state.
      */
    @JSName("apply")
    def apply(tr: Transaction): EditorState = js.native
    
    /**
      Verbose variant of [`apply`](https://prosemirror.net/docs/ref/#state.EditorState.apply) that
      returns the precise transactions that were applied (which might
      be influenced by the [transaction
      hooks](https://prosemirror.net/docs/ref/#state.PluginSpec.filterTransaction) of
      plugins) along with the new state.
      */
    def applyTransaction(rootTr: Transaction): State = js.native
    
    /**
      The current document.
      */
    var doc: Node = js.native
    
    /**
      The plugins that are active in this state.
      */
    def plugins: js.Array[Plugin[Any]] = js.native
    
    /**
      Create a new state based on this one, but with an adjusted set
      of active plugins. State fields that exist in both sets of
      plugins are kept unchanged. Those that no longer exist are
      dropped, and those that are new are initialized using their
      [`init`](https://prosemirror.net/docs/ref/#state.StateField.init) method, passing in the new
      configuration object..
      */
    def reconfigure(config: `0`): EditorState = js.native
    
    /**
      The schema of the state's document.
      */
    def schema: Schema[Any, Any] = js.native
    
    /**
      The selection.
      */
    var selection: Selection = js.native
    
    /**
      A set of marks to apply to the next input. Will be null when
      no explicit marks have been set.
      */
    var storedMarks: js.Array[Mark] | Null = js.native
    
    /**
      Serialize this state to JSON. If you want to serialize the state
      of plugins, pass an object mapping property names to use in the
      resulting JSON object to plugin objects. The argument may also be
      a string or number, in which case it is ignored, to support the
      way `JSON.stringify` calls `toString` methods.
      */
    def toJSON(): Any = js.native
    def toJSON(pluginFields: StringDictionary[Plugin[Any]]): Any = js.native
    
    /**
      Start a [transaction](https://prosemirror.net/docs/ref/#state.Transaction) from this state.
      */
    def tr: Transaction = js.native
  }
  object EditorState {
    
    @JSImport("prosemirror-state", "EditorState")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Create a new state.
      */
    /* static member */
    inline def create(config: EditorStateConfig): EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[EditorState]
    
    /**
      Deserialize a JSON representation of a state. `config` should
      have at least a `schema` field, and should contain array of
      plugins to initialize the state with. `pluginFields` can be used
      to deserialize the state of plugins, by associating plugin
      instances with the property names they use in the JSON object.
      */
    /* static member */
    inline def fromJSON(config: Plugins, json: Any): EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(config.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[EditorState]
    inline def fromJSON(config: Plugins, json: Any, pluginFields: StringDictionary[Plugin[Any]]): EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(config.asInstanceOf[js.Any], json.asInstanceOf[js.Any], pluginFields.asInstanceOf[js.Any])).asInstanceOf[EditorState]
  }
  
  /**
  A node selection is a selection that points at a single node. All
  nodes marked [selectable](https://prosemirror.net/docs/ref/#model.NodeSpec.selectable) can be the
  target of a node selection. In such a selection, `from` and `to`
  point directly before and after the selected node, `anchor` equals
  `from`, and `head` equals `to`..
  */
  @JSImport("prosemirror-state", "NodeSelection")
  @js.native
  open class NodeSelection protected () extends Selection {
    /**
      Create a node selection. Does not verify the validity of its
      argument.
      */
    def this($pos: ResolvedPos) = this()
    
    /**
      The selected node.
      */
    var node: Node = js.native
  }
  object NodeSelection {
    
    @JSImport("prosemirror-state", "NodeSelection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Create a node selection from non-resolved positions.
      */
    /* static member */
    inline def create(doc: Node, from: Double): NodeSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[NodeSelection]
    
    /**
      Determines whether the given node may be selected as a node
      selection.
      */
    /* static member */
    inline def isSelectable(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelectable")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
  Plugins bundle functionality that can be added to an editor.
  They are part of the [editor state](https://prosemirror.net/docs/ref/#state.EditorState) and
  may influence that state and the view that contains it.
  */
  @JSImport("prosemirror-state", "Plugin")
  @js.native
  open class Plugin[PluginState] protected () extends StObject {
    /**
      Create a plugin.
      */
    def this(/**
      The plugin's [spec object](https://prosemirror.net/docs/ref/#state.PluginSpec).
      */
    spec: PluginSpec[PluginState]) = this()
    
    /**
      Extract the plugin's state field from an editor state.
      */
    def getState(state: EditorState): js.UndefOr[PluginState] = js.native
    
    /**
      The [props](https://prosemirror.net/docs/ref/#view.EditorProps) exported by this plugin.
      */
    val props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorProps<Plugin<PluginState>> */ Any = js.native
    
    /**
      The plugin's [spec object](https://prosemirror.net/docs/ref/#state.PluginSpec).
      */
    val spec: PluginSpec[PluginState] = js.native
  }
  
  /**
  A key is used to [tag](https://prosemirror.net/docs/ref/#state.PluginSpec.key) plugins in a way
  that makes it possible to find them, given an editor state.
  Assigning a key does mean only one plugin of that type can be
  active in a state.
  */
  @JSImport("prosemirror-state", "PluginKey")
  @js.native
  /**
    Create a plugin key.
    */
  open class PluginKey[PluginState] () extends StObject {
    def this(name: String) = this()
    
    /**
      Get the active plugin with this key, if any, from an editor
      state.
      */
    def get(state: EditorState): js.UndefOr[Plugin[PluginState]] = js.native
    
    /**
      Get the plugin's state from an editor state.
      */
    def getState(state: EditorState): js.UndefOr[PluginState] = js.native
  }
  
  /**
  Superclass for editor selections. Every selection type should
  extend this. Should not be instantiated directly.
  */
  /* note: abstract class */ @JSImport("prosemirror-state", "Selection")
  @js.native
  open class Selection protected () extends StObject {
    /**
      Initialize a selection with the head and anchor and ranges. If no
      ranges are given, constructs a single range across `$anchor` and
      `$head`.
      */
    def this(
      /**
      The resolved anchor of the selection (the side that stays in
      place when the selection is modified).
      */
    $anchor: ResolvedPos,
      /**
      The resolved head of the selection (the side that moves when
      the selection is modified).
      */
    $head: ResolvedPos
    ) = this()
    def this(
      /**
      The resolved anchor of the selection (the side that stays in
      place when the selection is modified).
      */
    $anchor: ResolvedPos,
      /**
      The resolved head of the selection (the side that moves when
      the selection is modified).
      */
    $head: ResolvedPos,
      ranges: js.Array[SelectionRange]
    ) = this()
    
    /**
      The resolved anchor of the selection (the side that stays in
      place when the selection is modified).
      */
    @JSName("$anchor")
    val $anchor: ResolvedPos = js.native
    
    /**
      The resolved lower  bound of the selection's main range.
      */
    @JSName("$from")
    def $from: ResolvedPos = js.native
    
    /**
      The resolved head of the selection (the side that moves when
      the selection is modified).
      */
    @JSName("$head")
    val $head: ResolvedPos = js.native
    
    /**
      The resolved upper bound of the selection's main range.
      */
    @JSName("$to")
    def $to: ResolvedPos = js.native
    
    /**
      The selection's anchor, as an unresolved position.
      */
    def anchor: Double = js.native
    
    /**
      Get the content of this selection as a slice.
      */
    def content(): Slice = js.native
    
    /**
      Indicates whether the selection contains any content.
      */
    def empty: Boolean = js.native
    
    /**
      Test whether the selection is the same as another selection.
      */
    def eq(selection: Selection): Boolean = js.native
    
    /**
      The lower bound of the selection's main range.
      */
    def from: Double = js.native
    
    /**
      Get a [bookmark](https://prosemirror.net/docs/ref/#state.SelectionBookmark) for this selection,
      which is a value that can be mapped without having access to a
      current document, and later resolved to a real selection for a
      given document again. (This is used mostly by the history to
      track and restore old selections.) The default implementation of
      this method just converts the selection to a text selection and
      returns the bookmark for that.
      */
    def getBookmark(): SelectionBookmark = js.native
    
    /**
      The selection's head.
      */
    def head: Double = js.native
    
    /**
      Map this selection through a [mappable](https://prosemirror.net/docs/ref/#transform.Mappable)
      thing. `doc` should be the new document to which we are mapping.
      */
    def map(doc: Node, mapping: Mappable): Selection = js.native
    
    /**
      The ranges covered by the selection.
      */
    var ranges: js.Array[SelectionRange] = js.native
    
    /**
      Replace the selection with a slice or, if no slice is given,
      delete the selection. Will append to the given transaction.
      */
    def replace(tr: Transaction): Unit = js.native
    def replace(tr: Transaction, content: Slice): Unit = js.native
    
    /**
      Replace the selection with the given node, appending the changes
      to the given transaction.
      */
    def replaceWith(tr: Transaction, node: Node): Unit = js.native
    
    /**
      The upper bound of the selection's main range.
      */
    def to: Double = js.native
    
    /**
      Convert the selection to a JSON representation. When implementing
      this for a custom selection class, make sure to give the object a
      `type` property whose value matches the ID under which you
      [registered](https://prosemirror.net/docs/ref/#state.Selection^jsonID) your class.
      */
    def toJSON(): Any = js.native
    
    /**
      Controls whether, when a selection of this type is active in the
      browser, the selected range should be visible to the user.
      Defaults to `true`.
      */
    var visible: Boolean = js.native
  }
  object Selection {
    
    @JSImport("prosemirror-state", "Selection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Find the cursor or leaf node selection closest to the end of the
      given document.
      */
    /* static member */
    inline def atEnd(doc: Node): Selection = ^.asInstanceOf[js.Dynamic].applyDynamic("atEnd")(doc.asInstanceOf[js.Any]).asInstanceOf[Selection]
    
    /**
      Find the cursor or leaf node selection closest to the start of
      the given document. Will return an
      [`AllSelection`](https://prosemirror.net/docs/ref/#state.AllSelection) if no valid position
      exists.
      */
    /* static member */
    inline def atStart(doc: Node): Selection = ^.asInstanceOf[js.Dynamic].applyDynamic("atStart")(doc.asInstanceOf[js.Any]).asInstanceOf[Selection]
    
    /**
      Find a valid cursor or leaf node selection starting at the given
      position and searching back if `dir` is negative, and forward if
      positive. When `textOnly` is true, only consider cursor
      selections. Will return null when no valid selection position is
      found.
      */
    /* static member */
    inline def findFrom($pos: ResolvedPos, dir: Double): Selection | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findFrom")($pos.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Selection | Null]
    inline def findFrom($pos: ResolvedPos, dir: Double, textOnly: Boolean): Selection | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findFrom")($pos.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], textOnly.asInstanceOf[js.Any])).asInstanceOf[Selection | Null]
    
    /**
      Deserialize the JSON representation of a selection. Must be
      implemented for custom classes (as a static class method).
      */
    /* static member */
    inline def fromJSON(doc: Node, json: Any): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(doc.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Selection]
    
    /**
      To be able to deserialize selections from JSON, custom selection
      classes must register themselves with an ID string, so that they
      can be disambiguated. Try to pick something that's unlikely to
      clash with classes from other modules.
      */
    /* static member */
    inline def jsonID(id: String, selectionClass: FromJSON): FromJSON = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonID")(id.asInstanceOf[js.Any], selectionClass.asInstanceOf[js.Any])).asInstanceOf[FromJSON]
    
    /**
      Find a valid cursor or leaf node selection near the given
      position. Searches forward first by default, but if `bias` is
      negative, it will search backwards first.
      */
    /* static member */
    inline def near($pos: ResolvedPos): Selection = ^.asInstanceOf[js.Dynamic].applyDynamic("near")($pos.asInstanceOf[js.Any]).asInstanceOf[Selection]
    inline def near($pos: ResolvedPos, bias: Double): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("near")($pos.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Selection]
  }
  
  /**
  Represents a selected range in a document.
  */
  @JSImport("prosemirror-state", "SelectionRange")
  @js.native
  open class SelectionRange protected () extends StObject {
    /**
      Create a range.
      */
    def this(
      /**
      The lower bound of the range.
      */
    $from: ResolvedPos,
      /**
      The upper bound of the range.
      */
    $to: ResolvedPos
    ) = this()
    
    /**
      The lower bound of the range.
      */
    @JSName("$from")
    val $from: ResolvedPos = js.native
    
    /**
      The upper bound of the range.
      */
    @JSName("$to")
    val $to: ResolvedPos = js.native
  }
  
  /**
  A text selection represents a classical editor selection, with a
  head (the moving side) and anchor (immobile side), both of which
  point into textblock nodes. It can be empty (a regular cursor
  position).
  */
  @JSImport("prosemirror-state", "TextSelection")
  @js.native
  open class TextSelection protected () extends Selection {
    /**
      Construct a text selection between the given points.
      */
    def this($anchor: ResolvedPos) = this()
    def this($anchor: ResolvedPos, $head: ResolvedPos) = this()
    
    /**
      Returns a resolved position if this is a cursor selection (an
      empty text selection), and null otherwise.
      */
    @JSName("$cursor")
    def $cursor: ResolvedPos | Null = js.native
  }
  object TextSelection {
    
    @JSImport("prosemirror-state", "TextSelection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Return a text selection that spans the given positions or, if
      they aren't text positions, find a text selection near them.
      `bias` determines whether the method searches forward (default)
      or backwards (negative number) first. Will fall back to calling
      [`Selection.near`](https://prosemirror.net/docs/ref/#state.Selection^near) when the document
      doesn't contain a valid text position.
      */
    /* static member */
    inline def between($anchor: ResolvedPos, $head: ResolvedPos): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("between")($anchor.asInstanceOf[js.Any], $head.asInstanceOf[js.Any])).asInstanceOf[Selection]
    inline def between($anchor: ResolvedPos, $head: ResolvedPos, bias: Double): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("between")($anchor.asInstanceOf[js.Any], $head.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Selection]
    
    /**
      Create a text selection from non-resolved positions.
      */
    /* static member */
    inline def create(doc: Node, anchor: Double): TextSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[TextSelection]
    inline def create(doc: Node, anchor: Double, head: Double): TextSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], head.asInstanceOf[js.Any])).asInstanceOf[TextSelection]
  }
  
  /**
  An editor state transaction, which can be applied to a state to
  create an updated state. Use
  [`EditorState.tr`](https://prosemirror.net/docs/ref/#state.EditorState.tr) to create an instance.
  Transactions track changes to the document (they are a subclass of
  [`Transform`](https://prosemirror.net/docs/ref/#transform.Transform)), but also other state changes,
  like selection updates and adjustments of the set of [stored
  marks](https://prosemirror.net/docs/ref/#state.EditorState.storedMarks). In addition, you can store
  metadata properties in a transaction, which are extra pieces of
  information that client code or plugins can use to describe what a
  transaction represents, so that they can update their [own
  state](https://prosemirror.net/docs/ref/#state.StateField) accordingly.
  The [editor view](https://prosemirror.net/docs/ref/#view.EditorView) uses a few metadata
  properties: it will attach a property `"pointer"` with the value
  `true` to selection transactions directly caused by mouse or touch
  input, a `"composition"` property holding an ID identifying the
  composition that caused it to transactions caused by composed DOM
  input, and a `"uiEvent"` property of that may be `"paste"`,
  `"cut"`, or `"drop"`.
  */
  @JSImport("prosemirror-state", "Transaction")
  @js.native
  open class Transaction protected () extends Transform {
    /**
      Create a transform that starts with the given document.
      */
    def this(/**
      The current document (the result of applying the steps in the
      transform).
      */
    doc: Node) = this()
    
    /**
      Add a mark to the set of stored marks.
      */
    def addStoredMark(mark: Mark): this.type = js.native
    
    /* private */ var curSelection: Any = js.native
    
    /* private */ var curSelectionFor: Any = js.native
    
    /**
      Delete the selection.
      */
    def deleteSelection(): this.type = js.native
    
    /**
      Make sure the current stored marks or, if that is null, the marks
      at the selection, match the given set of marks. Does nothing if
      this is already the case.
      */
    def ensureMarks(marks: js.Array[Mark]): this.type = js.native
    
    /**
      Retrieve a metadata property for a given name or plugin.
      */
    def getMeta(key: String): Any = js.native
    def getMeta(key: Plugin[Any]): Any = js.native
    def getMeta(key: PluginKey[Any]): Any = js.native
    
    /**
      Replace the given range, or the selection if no range is given,
      with a text node containing the given string.
      */
    def insertText(text: String): this.type = js.native
    def insertText(text: String, from: Double): this.type = js.native
    def insertText(text: String, from: Double, to: Double): this.type = js.native
    def insertText(text: String, from: Unit, to: Double): this.type = js.native
    
    /**
      Returns true if this transaction doesn't contain any metadata,
      and can thus safely be extended.
      */
    def isGeneric: Boolean = js.native
    
    /* private */ var meta: Any = js.native
    
    /**
      Remove a mark or mark type from the set of stored marks.
      */
    def removeStoredMark(mark: Mark): this.type = js.native
    def removeStoredMark(mark: MarkType): this.type = js.native
    
    /**
      Replace the current selection with the given slice.
      */
    def replaceSelection(slice: Slice): this.type = js.native
    
    /**
      Replace the selection with the given node. When `inheritMarks` is
      true and the content is inline, it inherits the marks from the
      place where it is inserted.
      */
    def replaceSelectionWith(node: Node): this.type = js.native
    def replaceSelectionWith(node: Node, inheritMarks: Boolean): this.type = js.native
    
    /**
      Indicate that the editor should scroll the selection into view
      when updated to the state produced by this transaction.
      */
    def scrollIntoView(): this.type = js.native
    
    /**
      True when this transaction has had `scrollIntoView` called on it.
      */
    def scrolledIntoView: Boolean = js.native
    
    /**
      The transaction's current selection. This defaults to the editor
      selection [mapped](https://prosemirror.net/docs/ref/#state.Selection.map) through the steps in the
      transaction, but can be overwritten with
      [`setSelection`](https://prosemirror.net/docs/ref/#state.Transaction.setSelection).
      */
    def selection: Selection = js.native
    
    /**
      Whether the selection was explicitly updated by this transaction.
      */
    def selectionSet: Boolean = js.native
    
    /**
      Store a metadata property in this transaction, keyed either by
      name or by plugin.
      */
    def setMeta(key: String, value: Any): this.type = js.native
    def setMeta(key: PluginKey[Any], value: Any): this.type = js.native
    def setMeta(key: Plugin[Any], value: Any): this.type = js.native
    
    /**
      Update the transaction's current selection. Will determine the
      selection that the editor gets when the transaction is applied.
      */
    def setSelection(selection: Selection): this.type = js.native
    
    /**
      Set the current stored marks.
      */
    def setStoredMarks(): this.type = js.native
    def setStoredMarks(marks: js.Array[Mark]): this.type = js.native
    
    /**
      Update the timestamp for the transaction.
      */
    def setTime(time: Double): this.type = js.native
    
    /**
      The stored marks set by this transaction, if any.
      */
    var storedMarks: js.Array[Mark] | Null = js.native
    
    /**
      Whether the stored marks were explicitly set for this transaction.
      */
    def storedMarksSet: Boolean = js.native
    
    /**
      The timestamp associated with this transaction, in the same
      format as `Date.now()`.
      */
    var time: Double = js.native
    
    /* private */ var updated: Any = js.native
  }
  
  /**
  Commands are functions that take a state and a an optional
  transaction dispatch function and...
    - determine whether they apply to this state
    - if not, return false
    - if `dispatch` was passed, perform their effect, possibly by
    passing a transaction to `dispatch`
    - return true
  In some cases, the editor view is passed as a third argument.
  */
  type Command = js.Function3[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    /* view */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorView */ Any
    ], 
    Boolean
  ]
  
  /**
  The type of object passed to
  [`EditorState.create`](https://prosemirror.net/docs/ref/#state.EditorState^create).
  */
  trait EditorStateConfig extends StObject {
    
    /**
      The starting document. Either this or `schema` _must_ be
      provided.
      */
    var doc: js.UndefOr[Node] = js.undefined
    
    /**
      The plugins that should be active in this state.
      */
    var plugins: js.UndefOr[js.Array[Plugin[Any]]] = js.undefined
    
    /**
      The schema to use (only relevant if no `doc` is specified).
      */
    var schema: js.UndefOr[Schema[Any, Any]] = js.undefined
    
    /**
      A valid selection in the document.
      */
    var selection: js.UndefOr[Selection] = js.undefined
    
    /**
      The initial set of [stored marks](https://prosemirror.net/docs/ref/#state.EditorState.storedMarks).
      */
    var storedMarks: js.UndefOr[js.Array[Mark] | Null] = js.undefined
  }
  object EditorStateConfig {
    
    inline def apply(): EditorStateConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorStateConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorStateConfig] (val x: Self) extends AnyVal {
      
      inline def setDoc(value: Node): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin[Any]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin[Any]*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setSchema(value: Schema[Any, Any]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSelection(value: Selection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setStoredMarks(value: js.Array[Mark]): Self = StObject.set(x, "storedMarks", value.asInstanceOf[js.Any])
      
      inline def setStoredMarksNull: Self = StObject.set(x, "storedMarks", null)
      
      inline def setStoredMarksUndefined: Self = StObject.set(x, "storedMarks", js.undefined)
      
      inline def setStoredMarksVarargs(value: Mark*): Self = StObject.set(x, "storedMarks", js.Array(value*))
    }
  }
  
  trait NodeBookmark extends StObject {
    
    val anchor: Double
    
    def map(mapping: Mappable): TextBookmark | NodeBookmark
    
    def resolve(doc: Node): Selection | NodeSelection
  }
  object NodeBookmark {
    
    inline def apply(
      anchor: Double,
      map: Mappable => TextBookmark | NodeBookmark,
      resolve: Node => Selection | NodeSelection
    ): NodeBookmark = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[NodeBookmark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeBookmark] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setMap(value: Mappable => TextBookmark | NodeBookmark): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setResolve(value: Node => Selection | NodeSelection): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  /**
  This is the type passed to the [`Plugin`](https://prosemirror.net/docs/ref/#state.Plugin)
  constructor. It provides a definition for a plugin.
  */
  trait PluginSpec[PluginState]
    extends StObject
       with /**
    Additional properties are allowed on plugin specs, which can be
    read via [`Plugin.spec`](https://prosemirror.net/docs/ref/#state.Plugin.spec).
    */
  /* key */ StringDictionary[Any] {
    
    /**
      Allows the plugin to append another transaction to be applied
      after the given array of transactions. When another plugin
      appends a transaction after this was called, it is called again
      with the new state and new transactions—but only the new
      transactions, i.e. it won't be passed transactions that it
      already saw.
      */
    var appendTransaction: js.UndefOr[
        js.Function3[
          /* transactions */ js.Array[Transaction], 
          /* oldState */ EditorState, 
          /* newState */ EditorState, 
          js.UndefOr[Transaction | Null]
        ]
      ] = js.undefined
    
    /**
      When present, this will be called before a transaction is
      applied by the state, allowing the plugin to cancel it (by
      returning false).
      */
    var filterTransaction: js.UndefOr[js.Function2[/* tr */ Transaction, /* state */ EditorState, Boolean]] = js.undefined
    
    /**
      Can be used to make this a keyed plugin. You can have only one
      plugin with a given key in a given state, but it is possible to
      access the plugin's configuration and state through the key,
      without having access to the plugin instance object.
      */
    var key: js.UndefOr[PluginKey[Any]] = js.undefined
    
    /**
      The [view props](https://prosemirror.net/docs/ref/#view.EditorProps) added by this plugin. Props
      that are functions will be bound to have the plugin instance as
      their `this` binding.
      */
    var props: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorProps<Plugin<PluginState>> */ Any
      ] = js.undefined
    
    /**
      Allows a plugin to define a [state field](https://prosemirror.net/docs/ref/#state.StateField), an
      extra slot in the state object in which it can keep its own data.
      */
    var state: js.UndefOr[StateField[PluginState]] = js.undefined
    
    /**
      When the plugin needs to interact with the editor view, or
      set something up in the DOM, use this field. The function
      will be called when the plugin's state is associated with an
      editor view.
      */
    var view: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorView */ /* view */ Any, 
          PluginView
        ]
      ] = js.undefined
  }
  object PluginSpec {
    
    inline def apply[PluginState](): PluginSpec[PluginState] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginSpec[PluginState]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginSpec[?], PluginState] (val x: Self & PluginSpec[PluginState]) extends AnyVal {
      
      inline def setAppendTransaction(
        value: (/* transactions */ js.Array[Transaction], /* oldState */ EditorState, /* newState */ EditorState) => js.UndefOr[Transaction | Null]
      ): Self = StObject.set(x, "appendTransaction", js.Any.fromFunction3(value))
      
      inline def setAppendTransactionUndefined: Self = StObject.set(x, "appendTransaction", js.undefined)
      
      inline def setFilterTransaction(value: (/* tr */ Transaction, /* state */ EditorState) => Boolean): Self = StObject.set(x, "filterTransaction", js.Any.fromFunction2(value))
      
      inline def setFilterTransactionUndefined: Self = StObject.set(x, "filterTransaction", js.undefined)
      
      inline def setKey(value: PluginKey[Any]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setProps(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorProps<Plugin<PluginState>> */ Any
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setState(value: StateField[PluginState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setView(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorView */ /* view */ Any => PluginView
      ): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  /**
  A stateful object that can be installed in an editor by a
  [plugin](https://prosemirror.net/docs/ref/#state.PluginSpec.view).
  */
  trait PluginView extends StObject {
    
    /**
      Called when the view is destroyed or receives a state
      with different plugins.
      */
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      Called whenever the view's state is updated.
      */
    var update: js.UndefOr[
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorView */ /* view */ Any, 
          /* prevState */ EditorState, 
          Unit
        ]
      ] = js.undefined
  }
  object PluginView {
    
    inline def apply(): PluginView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginView]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginView] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setUpdate(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorView */ /* view */ Any, /* prevState */ EditorState) => Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  /**
  A lightweight, document-independent representation of a selection.
  You can define a custom bookmark type for a custom selection class
  to make the history handle it well.
  */
  trait SelectionBookmark extends StObject {
    
    /**
      Map the bookmark through a set of changes.
      */
    def map(mapping: Mappable): SelectionBookmark
    
    /**
      Resolve the bookmark to a real selection again. This may need to
      do some error checking and may fall back to a default (usually
      [`TextSelection.between`](https://prosemirror.net/docs/ref/#state.TextSelection^between)) if
      mapping made the bookmark invalid.
      */
    def resolve(doc: Node): Selection
  }
  object SelectionBookmark {
    
    inline def apply(map: Mappable => SelectionBookmark, resolve: Node => Selection): SelectionBookmark = {
      val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[SelectionBookmark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionBookmark] (val x: Self) extends AnyVal {
      
      inline def setMap(value: Mappable => SelectionBookmark): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setResolve(value: Node => Selection): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  /**
  A plugin spec may provide a state field (under its
  [`state`](https://prosemirror.net/docs/ref/#state.PluginSpec.state) property) of this type, which
  describes the state it wants to keep. Functions provided here are
  always called with the plugin instance as their `this` binding.
  */
  trait StateField[T] extends StObject {
    
    /**
      Apply the given transaction to this state field, producing a new
      field value. Note that the `newState` argument is again a partially
      constructed state does not yet contain the state from plugins
      coming after this one.
      */
    @JSName("apply")
    def apply(tr: Transaction, value: T, oldState: EditorState, newState: EditorState): T
    
    /**
      Deserialize the JSON representation of this field. Note that the
      `state` argument is again a half-initialized state.
      */
    var fromJSON: js.UndefOr[
        js.Function3[/* config */ EditorStateConfig, /* value */ Any, /* state */ EditorState, T]
      ] = js.undefined
    
    /**
      Initialize the value of the field. `config` will be the object
      passed to [`EditorState.create`](https://prosemirror.net/docs/ref/#state.EditorState^create). Note
      that `instance` is a half-initialized state instance, and will
      not have values for plugin fields initialized after this one.
      */
    def init(config: EditorStateConfig, instance: EditorState): T
    
    /**
      Convert this field to JSON. Optional, can be left off to disable
      JSON serialization for the field.
      */
    var toJSON: js.UndefOr[js.Function1[/* value */ T, Any]] = js.undefined
  }
  object StateField {
    
    inline def apply[T](
      apply: (Transaction, T, EditorState, EditorState) => T,
      init: (EditorStateConfig, EditorState) => T
    ): StateField[T] = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction4(apply), init = js.Any.fromFunction2(init))
      __obj.asInstanceOf[StateField[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StateField[?], T] (val x: Self & StateField[T]) extends AnyVal {
      
      inline def setApply(value: (Transaction, T, EditorState, EditorState) => T): Self = StObject.set(x, "apply", js.Any.fromFunction4(value))
      
      inline def setFromJSON(value: (/* config */ EditorStateConfig, /* value */ Any, /* state */ EditorState) => T): Self = StObject.set(x, "fromJSON", js.Any.fromFunction3(value))
      
      inline def setFromJSONUndefined: Self = StObject.set(x, "fromJSON", js.undefined)
      
      inline def setInit(value: (EditorStateConfig, EditorState) => T): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
      
      inline def setToJSON(value: /* value */ T => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
      
      inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    }
  }
  
  trait TextBookmark extends StObject {
    
    val anchor: Double
    
    val head: Double
    
    def map(mapping: Mappable): TextBookmark
    
    def resolve(doc: Node): Selection
  }
  object TextBookmark {
    
    inline def apply(anchor: Double, head: Double, map: Mappable => TextBookmark, resolve: Node => Selection): TextBookmark = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[TextBookmark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextBookmark] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setHead(value: Double): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setMap(value: Mappable => TextBookmark): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setResolve(value: Node => Selection): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
