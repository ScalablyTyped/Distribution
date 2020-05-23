package typings.prosemirrorState.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorState.anon.Instantiable
import typings.prosemirrorTransform.mod.Mappable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-state", "Selection")
@js.native
class Selection[S /* <: Schema[_, _] */] protected () extends js.Object {
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
    * Indicates whether the selection contains any content.
    */
  var empty: Boolean = js.native
  /**
    * The lower bound of the selection's main range.
    */
  var from: Double = js.native
  /**
    * The selection's head.
    */
  var head: Double = js.native
  /**
    * The ranges covered by the selection.
    */
  var ranges: js.Array[SelectionRange[S]] = js.native
  /**
    * The upper bound of the selection's main range.
    */
  var to: Double = js.native
  /**
    * Controls whether, when a selection of this type is active in the
    * browser, the selected range should be visible to the user. Defaults
    * to `true`.
    */
  var visible: Boolean = js.native
  /**
    * Get the content of this selection as a slice.
    */
  def content(): Slice[S] = js.native
  /**
    * Test whether the selection is the same as another selection.
    */
  def eq(p: Selection[S]): Boolean = js.native
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
    * Map this selection through a [mappable](#transform.Mappable) thing. `doc`
    * should be the new document to which we are mapping.
    */
  def map(doc: Node[S], mapping: Mappable): Selection[S] = js.native
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
    * Convert the selection to a JSON representation. When implementing
    * this for a custom selection class, make sure to give the object a
    * `type` property whose value matches the ID under which you
    * [registered](#state.Selection^jsonID) your class.
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("prosemirror-state", "Selection")
@js.native
object Selection extends js.Object {
  /**
    * Find the cursor or leaf node selection closest to the end of the
    * given document.
    */
  def atEnd[S /* <: Schema[_, _] */](doc: Node[S]): Selection[S] = js.native
  /**
    * Find the cursor or leaf node selection closest to the start of
    * the given document. Will return an
    * [`AllSelection`](#state.AllSelection) if no valid position
    * exists.
    */
  def atStart[S /* <: Schema[_, _] */](doc: Node[S]): Selection[S] = js.native
  /**
    * Find a valid cursor or leaf node selection starting at the given
    * position and searching back if `dir` is negative, and forward if
    * positive. When `textOnly` is true, only consider cursor
    * selections. Will return null when no valid selection position is
    * found.
    */
  def findFrom[S /* <: Schema[_, _] */]($pos: ResolvedPos[S], dir: Double): js.UndefOr[Selection[S] | Null] = js.native
  def findFrom[S /* <: Schema[_, _] */]($pos: ResolvedPos[S], dir: Double, textOnly: Boolean): js.UndefOr[Selection[S] | Null] = js.native
  /**
    * Deserialize the JSON representation of a selection. Must be
    * implemented for custom classes (as a static class method).
    */
  def fromJSON[S /* <: Schema[_, _] */](doc: Node[S], json: StringDictionary[js.Any]): Selection[S] = js.native
  /**
    * To be able to deserialize selections from JSON, custom selection
    * classes must register themselves with an ID string, so that they
    * can be disambiguated. Try to pick something that's unlikely to
    * clash with classes from other modules.
    */
  def jsonID(id: String, selectionClass: Instantiable): Unit = js.native
  /**
    * Find a valid cursor or leaf node selection near the given
    * position. Searches forward first by default, but if `bias` is
    * negative, it will search backwards first.
    */
  def near[S /* <: Schema[_, _] */]($pos: ResolvedPos[S]): Selection[S] = js.native
  def near[S /* <: Schema[_, _] */]($pos: ResolvedPos[S], bias: Double): Selection[S] = js.native
}

