package typings.prosemirrorTransform.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.ContentMatch
import typings.prosemirrorModel.mod.Fragment
import typings.prosemirrorModel.mod.Mark
import typings.prosemirrorModel.mod.MarkType
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.NodeRange
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorTransform.anon.Attrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "Transform")
@js.native
class Transform[S /* <: Schema[_, _] */] protected () extends js.Object {
  /**
    * Create a transform that starts with the given document.
    */
  def this(doc: Node[S]) = this()
  /**
    * The starting document.
    */
  var before: Node[S] = js.native
  /**
    * The current document (the result of applying the steps in the
    * transform).
    */
  var doc: Node[S] = js.native
  /**
    * True when the document has been changed (when there are any
    * steps).
    */
  var docChanged: Boolean = js.native
  /**
    * The documents before each of the steps.
    */
  var docs: js.Array[Node[S]] = js.native
  /**
    * A mapping with the maps for each of the steps in this transform.
    */
  var mapping: Mapping = js.native
  /**
    * The steps in this transform.
    */
  var steps: js.Array[Step[S]] = js.native
  /**
    * Add the given mark to the inline content between `from` and `to`.
    */
  def addMark(from: Double, to: Double, mark: Mark[S]): this.type = js.native
  /**
    * Removes all marks and nodes from the content of the node at `pos`
    * that don't match the given new parent node type. Accepts an
    * optional starting [content match](#model.ContentMatch) as third
    * argument.
    */
  def clearIncompatible(pos: Double, parentType: NodeType[S]): this.type = js.native
  def clearIncompatible(pos: Double, parentType: NodeType[S], `match`: ContentMatch[S]): this.type = js.native
  /**
    * Delete the content between the given positions.
    */
  def delete(from: Double, to: Double): this.type = js.native
  /**
    * Delete the given range, expanding it to cover fully covered
    * parent nodes until a valid replace is found.
    */
  def deleteRange(from: Double, to: Double): this.type = js.native
  def insert(pos: Double, content: js.Array[Node[S]]): this.type = js.native
  /**
    * Insert the given content at the given position.
    */
  def insert(pos: Double, content: Fragment[S]): this.type = js.native
  def insert(pos: Double, content: Node[S]): this.type = js.native
  /**
    * Join the blocks around the given position. If depth is 2, their
    * last and first siblings are also joined, and so on.
    */
  def join(pos: Double): this.type = js.native
  def join(pos: Double, depth: Double): this.type = js.native
  def join(pos: Double, depth: Double, p1: Boolean): this.type = js.native
  /**
    * Split the content in the given range off from its parent, if there
    * is sibling content before or after it, and move it up the tree to
    * the depth specified by `target`. You'll probably want to use
    * [`liftTarget`](#transform.liftTarget) to compute `target`, to make
    * sure the lift is valid.
    */
  def lift(range: NodeRange[S], target: Double): this.type = js.native
  /**
    * Try to apply a step in this transformation, ignoring it if it
    * fails. Returns the step result.
    */
  def maybeStep(step: Step[S]): StepResult[S] = js.native
  /**
    * Remove marks from inline nodes between `from` and `to`. When `mark`
    * is a single mark, remove precisely that mark. When it is a mark type,
    * remove all marks of that type. When it is null, remove all marks of
    * any type.
    */
  def removeMark(from: Double, to: Double): this.type = js.native
  def removeMark(from: Double, to: Double, mark: Mark[S]): this.type = js.native
  def removeMark(from: Double, to: Double, mark: MarkType[S]): this.type = js.native
  /**
    * Replace the part of the document between `from` and `to` with the
    * given `slice`.
    */
  def replace(from: Double): this.type = js.native
  def replace(from: Double, to: Double): this.type = js.native
  def replace(from: Double, to: Double, slice: Slice[S]): this.type = js.native
  /**
    * Replace a range of the document with a given slice, using `from`,
    * `to`, and the slice's [`openStart`](#model.Slice.openStart) property
    * as hints, rather than fixed start and end points. This method may
    * grow the replaced area or close open nodes in the slice in order to
    * get a fit that is more in line with WYSIWYG expectations, by
    * dropping fully covered parent nodes of the replaced region when
    * they are marked [non-defining](#model.NodeSpec.defining), or
    * including an open parent node from the slice that _is_ marked as
    * [defining](#model.NodeSpec.defining).
    *
    * This is the method, for example, to handle paste. The similar
    * [`replace`](#transform.Transform.replace) method is a more
    * primitive tool which will _not_ move the start and end of its given
    * range, and is useful in situations where you need more precise
    * control over what happens.
    */
  def replaceRange(from: Double, to: Double, slice: Slice[S]): this.type = js.native
  /**
    * Replace the given range with a node, but use `from` and `to` as
    * hints, rather than precise positions. When from and to are the same
    * and are at the start or end of a parent node in which the given
    * node doesn't fit, this method may _move_ them out towards a parent
    * that does allow the given node to be placed. When the given range
    * completely covers a parent node, this method may completely replace
    * that parent node.
    */
  def replaceRangeWith(from: Double, to: Double, node: Node[S]): this.type = js.native
  def replaceWith(from: Double, to: Double, content: js.Array[Node[S]]): this.type = js.native
  /**
    * Replace the given range with the given content, which may be a
    * fragment, node, or array of nodes.
    */
  def replaceWith(from: Double, to: Double, content: Fragment[S]): this.type = js.native
  def replaceWith(from: Double, to: Double, content: Node[S]): this.type = js.native
  /**
    * Set the type of all textblocks (partly) between `from` and `to` to
    * the given node type with the given attributes.
    */
  def setBlockType(from: Double, to: js.UndefOr[Double], `type`: NodeType[S]): this.type = js.native
  def setBlockType(from: Double, to: js.UndefOr[Double], `type`: NodeType[S], attrs: StringDictionary[js.Any]): this.type = js.native
  /**
    * Change the type, attributes, and/or marks of the node at `pos`.
    * When `nodeType` is null, the existing node type is preserved,
    */
  def setNodeMarkup(pos: Double): this.type = js.native
  def setNodeMarkup(pos: Double, `type`: NodeType[S]): this.type = js.native
  def setNodeMarkup(pos: Double, `type`: NodeType[S], attrs: StringDictionary[js.Any]): this.type = js.native
  def setNodeMarkup(pos: Double, `type`: NodeType[S], attrs: StringDictionary[js.Any], marks: js.Array[Mark[S]]): this.type = js.native
  /**
    * Split the node at the given position, and optionally, if `depth` is
    * greater than one, any number of nodes above that. By default, the
    * parts split off will inherit the node type of the original node.
    * This can be changed by passing an array of types and attributes to
    * use after the split.
    */
  def split(pos: Double): this.type = js.native
  def split(pos: Double, depth: Double): this.type = js.native
  def split(pos: Double, depth: Double, typesAfter: js.Array[Attrs[S]]): this.type = js.native
  /**
    * Apply a new step in this transform, saving the result. Throws an
    * error when the step fails.
    */
  def step(step: Step[S]): this.type = js.native
  /**
    * Wrap the given [range](#model.NodeRange) in the given set of wrappers.
    * The wrappers are assumed to be valid in this position, and should
    * probably be computed with [`findWrapping`](#transform.findWrapping).
    */
  def wrap(range: NodeRange[S], wrappers: js.Array[Attrs[S]]): this.type = js.native
}

