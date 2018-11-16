package typings
package prosemirrorDashTransformLib.prosemirrorDashTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "Transform")
@js.native
class Transform[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] protected () extends js.Object {
  /**
     * Create a transform that starts with the given document.
     */
  def this(doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]) = this()
  /**
     * The starting document.
     */
  var before: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S] = js.native
  /**
     * The current document (the result of applying the steps in the
     * transform).
     */
  var doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S] = js.native
  /**
     * True when the document has been changed (when there are any
     * steps).
     */
  var docChanged: scala.Boolean = js.native
  /**
     * The documents before each of the steps.
     */
  var docs: js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]] = js.native
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
  def addMark(
    from: scala.Double,
    to: scala.Double,
    mark: prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[S]
  ): this.type = js.native
  /**
     * Removes all marks and nodes from the content of the node at `pos`
     * that don't match the given new parent node type. Accepts an
     * optional starting [content match](#model.ContentMatch) as third
     * argument.
     */
  def clearIncompatible(pos: scala.Double, parentType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S]): this.type = js.native
  /**
     * Removes all marks and nodes from the content of the node at `pos`
     * that don't match the given new parent node type. Accepts an
     * optional starting [content match](#model.ContentMatch) as third
     * argument.
     */
  def clearIncompatible(
    pos: scala.Double,
    parentType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    `match`: prosemirrorDashModelLib.prosemirrorDashModelMod.ContentMatch[S]
  ): this.type = js.native
  /**
     * Delete the content between the given positions.
     */
  def delete(from: scala.Double, to: scala.Double): this.type = js.native
  /**
     * Delete the given range, expanding it to cover fully covered
     * parent nodes until a valid replace is found.
     */
  def deleteRange(from: scala.Double, to: scala.Double): this.type = js.native
  /**
     * Insert the given content at the given position.
     */
  def insert(pos: scala.Double, content: js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]]): this.type = js.native
  /**
     * Insert the given content at the given position.
     */
  def insert(pos: scala.Double, content: prosemirrorDashModelLib.prosemirrorDashModelMod.Fragment[S]): this.type = js.native
  /**
     * Insert the given content at the given position.
     */
  def insert(pos: scala.Double, content: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]): this.type = js.native
  /**
     * Join the blocks around the given position. If depth is 2, their
     * last and first siblings are also joined, and so on.
     */
  def join(pos: scala.Double): this.type = js.native
  /**
     * Join the blocks around the given position. If depth is 2, their
     * last and first siblings are also joined, and so on.
     */
  def join(pos: scala.Double, depth: scala.Double): this.type = js.native
  /**
     * Join the blocks around the given position. If depth is 2, their
     * last and first siblings are also joined, and so on.
     */
  def join(pos: scala.Double, depth: scala.Double, p1: scala.Boolean): this.type = js.native
  /**
     * Split the content in the given range off from its parent, if there
     * is sibling content before or after it, and move it up the tree to
     * the depth specified by `target`. You'll probably want to use
     * [`liftTarget`](#transform.liftTarget) to compute `target`, to make
     * sure the lift is valid.
     */
  def lift(range: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeRange[S], target: scala.Double): this.type = js.native
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
  def removeMark(from: scala.Double, to: scala.Double): this.type = js.native
  /**
     * Remove marks from inline nodes between `from` and `to`. When `mark`
     * is a single mark, remove precisely that mark. When it is a mark type,
     * remove all marks of that type. When it is null, remove all marks of
     * any type.
     */
  def removeMark(
    from: scala.Double,
    to: scala.Double,
    mark: prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[S]
  ): this.type = js.native
  /**
     * Remove marks from inline nodes between `from` and `to`. When `mark`
     * is a single mark, remove precisely that mark. When it is a mark type,
     * remove all marks of that type. When it is null, remove all marks of
     * any type.
     */
  def removeMark(
    from: scala.Double,
    to: scala.Double,
    mark: prosemirrorDashModelLib.prosemirrorDashModelMod.MarkType[S]
  ): this.type = js.native
  /**
     * Replace the part of the document between `from` and `to` with the
     * given `slice`.
     */
  def replace(from: scala.Double): this.type = js.native
  /**
     * Replace the part of the document between `from` and `to` with the
     * given `slice`.
     */
  def replace(from: scala.Double, to: scala.Double): this.type = js.native
  /**
     * Replace the part of the document between `from` and `to` with the
     * given `slice`.
     */
  def replace(
    from: scala.Double,
    to: scala.Double,
    slice: prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S]
  ): this.type = js.native
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
  def replaceRange(
    from: scala.Double,
    to: scala.Double,
    slice: prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S]
  ): this.type = js.native
  /**
     * Replace the given range with a node, but use `from` and `to` as
     * hints, rather than precise positions. When from and to are the same
     * and are at the start or end of a parent node in which the given
     * node doesn't fit, this method may _move_ them out towards a parent
     * that does allow the given node to be placed. When the given range
     * completely covers a parent node, this method may completely replace
     * that parent node.
     */
  def replaceRangeWith(
    from: scala.Double,
    to: scala.Double,
    node: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]
  ): this.type = js.native
  /**
     * Replace the given range with the given content, which may be a
     * fragment, node, or array of nodes.
     */
  def replaceWith(
    from: scala.Double,
    to: scala.Double,
    content: js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]]
  ): this.type = js.native
  /**
     * Replace the given range with the given content, which may be a
     * fragment, node, or array of nodes.
     */
  def replaceWith(
    from: scala.Double,
    to: scala.Double,
    content: prosemirrorDashModelLib.prosemirrorDashModelMod.Fragment[S]
  ): this.type = js.native
  /**
     * Replace the given range with the given content, which may be a
     * fragment, node, or array of nodes.
     */
  def replaceWith(
    from: scala.Double,
    to: scala.Double,
    content: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]
  ): this.type = js.native
  /**
     * Set the type of all textblocks (partly) between `from` and `to` to
     * the given node type with the given attributes.
     */
  def setBlockType(
    from: scala.Double,
    to: js.UndefOr[scala.Nothing],
    `type`: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S]
  ): this.type = js.native
  /**
     * Set the type of all textblocks (partly) between `from` and `to` to
     * the given node type with the given attributes.
     */
  def setBlockType(
    from: scala.Double,
    to: js.UndefOr[scala.Nothing],
    `type`: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    attrs: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): this.type = js.native
  /**
     * Set the type of all textblocks (partly) between `from` and `to` to
     * the given node type with the given attributes.
     */
  def setBlockType(
    from: scala.Double,
    to: scala.Double,
    `type`: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S]
  ): this.type = js.native
  /**
     * Set the type of all textblocks (partly) between `from` and `to` to
     * the given node type with the given attributes.
     */
  def setBlockType(
    from: scala.Double,
    to: scala.Double,
    `type`: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    attrs: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): this.type = js.native
  /**
     * Change the type, attributes, and/or marks of the node at `pos`.
     * When `nodeType` is null, the existing node type is preserved,
     */
  def setNodeMarkup(pos: scala.Double): this.type = js.native
  /**
     * Change the type, attributes, and/or marks of the node at `pos`.
     * When `nodeType` is null, the existing node type is preserved,
     */
  def setNodeMarkup(pos: scala.Double, `type`: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S]): this.type = js.native
  /**
     * Change the type, attributes, and/or marks of the node at `pos`.
     * When `nodeType` is null, the existing node type is preserved,
     */
  def setNodeMarkup(
    pos: scala.Double,
    `type`: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    attrs: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): this.type = js.native
  /**
     * Change the type, attributes, and/or marks of the node at `pos`.
     * When `nodeType` is null, the existing node type is preserved,
     */
  def setNodeMarkup(
    pos: scala.Double,
    `type`: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    attrs: ScalablyTyped.runtime.StringDictionary[js.Any],
    marks: js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[S]]
  ): this.type = js.native
  /**
     * Split the node at the given position, and optionally, if `depth` is
     * greater than one, any number of nodes above that. By default, the
     * parts split off will inherit the node type of the original node.
     * This can be changed by passing an array of types and attributes to
     * use after the split.
     */
  def split(pos: scala.Double): this.type = js.native
  /**
     * Split the node at the given position, and optionally, if `depth` is
     * greater than one, any number of nodes above that. By default, the
     * parts split off will inherit the node type of the original node.
     * This can be changed by passing an array of types and attributes to
     * use after the split.
     */
  def split(pos: scala.Double, depth: scala.Double): this.type = js.native
  /**
     * Split the node at the given position, and optionally, if `depth` is
     * greater than one, any number of nodes above that. By default, the
     * parts split off will inherit the node type of the original node.
     * This can be changed by passing an array of types and attributes to
     * use after the split.
     */
  def split(
    pos: scala.Double,
    depth: scala.Double,
    typesAfter: js.Array[prosemirrorDashTransformLib.Anon_Type[S]]
  ): this.type = js.native
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
  def wrap(
    range: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeRange[S],
    wrappers: js.Array[prosemirrorDashTransformLib.Anon_Type[S]]
  ): this.type = js.native
}

