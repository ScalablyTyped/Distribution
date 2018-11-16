package typings
package prosemirrorDashStateLib.prosemirrorDashStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-state", "Transaction")
@js.native
class Transaction[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] ()
  extends prosemirrorDashTransformLib.prosemirrorDashTransformMod.Transform[S] {
  /**
     * Returns true if this transaction doesn't contain any metadata,
     * and can thus safely be extended.
     */
  var isGeneric: scala.Boolean = js.native
  /**
     * The transaction's current selection. This defaults to the editor
     * selection [mapped](#state.Selection.map) through the steps in the
     * transaction, but can be overwritten with
     * [`setSelection`](#state.Transaction.setSelection).
     */
  var selection: Selection[_] = js.native
  /**
     * Whether the selection was explicitly updated by this transaction.
     */
  var selectionSet: scala.Boolean = js.native
  /**
     * The stored marks set by this transaction, if any.
     */
  var storedMarks: js.UndefOr[js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[_]] | scala.Null] = js.native
  /**
     * Whether the stored marks were explicitly set for this transaction.
     */
  var storedMarksSet: scala.Boolean = js.native
  /**
     * The timestamp associated with this transaction, in the same
     * format as `Date.now()`.
     */
  var time: scala.Double = js.native
  /**
     * Add a mark to the set of stored marks.
     */
  def addStoredMark(mark: prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[_]): Transaction[_] = js.native
  /**
     * Delete the selection.
     */
  def deleteSelection(): Transaction[_] = js.native
  /**
     * Make sure the current stored marks or, if that is null, the marks
     * at the selection, match the given set of marks. Does nothing if
     * this is already the case.
     */
  def ensureMarks(marks: js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[_]]): Transaction[_] = js.native
  /**
     * Retrieve a metadata property for a given name or plugin.
     */
  def getMeta(key: java.lang.String): js.Any = js.native
  /**
     * Retrieve a metadata property for a given name or plugin.
     */
  def getMeta(key: Plugin[_]): js.Any = js.native
  /**
     * Retrieve a metadata property for a given name or plugin.
     */
  def getMeta(key: PluginKey[_]): js.Any = js.native
  /**
     * Replace the given range, or the selection if no range is given,
     * with a text node containing the given string.
     */
  def insertText(text: java.lang.String): Transaction[_] = js.native
  /**
     * Replace the given range, or the selection if no range is given,
     * with a text node containing the given string.
     */
  def insertText(text: java.lang.String, from: scala.Double): Transaction[_] = js.native
  /**
     * Replace the given range, or the selection if no range is given,
     * with a text node containing the given string.
     */
  def insertText(text: java.lang.String, from: scala.Double, to: scala.Double): Transaction[_] = js.native
  /**
     * Remove a mark or mark type from the set of stored marks.
     */
  def removeStoredMark(mark: prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[_]): Transaction[_] = js.native
  /**
     * Remove a mark or mark type from the set of stored marks.
     */
  def removeStoredMark(mark: prosemirrorDashModelLib.prosemirrorDashModelMod.MarkType[_]): Transaction[_] = js.native
  /**
     * Replace the current selection with the given slice.
     */
  def replaceSelection(slice: prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[_]): Transaction[_] = js.native
  /**
     * Replace the selection with the given node. When `inheritMarks` is
     * true and the content is inline, it inherits the marks from the
     * place where it is inserted.
     */
  def replaceSelectionWith(node: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_]): Transaction[_] = js.native
  /**
     * Replace the selection with the given node. When `inheritMarks` is
     * true and the content is inline, it inherits the marks from the
     * place where it is inserted.
     */
  def replaceSelectionWith(node: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_], inheritMarks: scala.Boolean): Transaction[_] = js.native
  /**
     * Indicate that the editor should scroll the selection into view
     * when updated to the state produced by this transaction.
     */
  def scrollIntoView(): Transaction[_] = js.native
  /**
     * Store a metadata property in this transaction, keyed either by
     * name or by plugin.
     */
  def setMeta(key: java.lang.String, value: js.Any): Transaction[_] = js.native
  /**
     * Store a metadata property in this transaction, keyed either by
     * name or by plugin.
     */
  def setMeta(key: PluginKey[_], value: js.Any): Transaction[_] = js.native
  /**
     * Store a metadata property in this transaction, keyed either by
     * name or by plugin.
     */
  def setMeta(key: Plugin[_], value: js.Any): Transaction[_] = js.native
  /**
     * Update the transaction's current selection. Will determine the
     * selection that the editor gets when the transaction is applied.
     */
  def setSelection(selection: Selection[_]): Transaction[_] = js.native
  /**
     * Set the current stored marks.
     */
  def setStoredMarks(): Transaction[_] = js.native
  /**
     * Set the current stored marks.
     */
  def setStoredMarks(marks: js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[_]]): Transaction[_] = js.native
  /**
     * Update the timestamp for the transaction.
     */
  def setTime(time: scala.Double): Transaction[_] = js.native
}

