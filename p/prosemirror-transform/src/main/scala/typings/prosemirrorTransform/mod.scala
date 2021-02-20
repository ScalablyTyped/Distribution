package typings.prosemirrorTransform

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
import typings.prosemirrorTransform.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-transform", "AddMarkStep")
  @js.native
  class AddMarkStep[S /* <: Schema[_, _] */] protected () extends Step[S] {
    def this(from: Double, to: Double, mark: Mark[S]) = this()
  }
  
  @JSImport("prosemirror-transform", "MapResult")
  @js.native
  class MapResult () extends StObject {
    
    /**
      * Tells you whether the position was deleted, that is,
      * whether the step removed its surroundings from the document.
      */
    var deleted: Boolean = js.native
    
    /**
      * The mapped version of the position.
      */
    var pos: Double = js.native
  }
  
  @JSImport("prosemirror-transform", "Mapping")
  @js.native
  /**
    * Create a new mapping with the given position maps.
    */
  class Mapping () extends Mappable {
    def this(maps: js.Array[StepMap]) = this()
    
    /**
      * Add a step map to the end of this mapping. If `mirrors` is
      * given, it should be the index of the step map that is the mirror
      * image of this one.
      */
    def appendMap(map: StepMap): Unit = js.native
    def appendMap(map: StepMap, mirrors: Double): Unit = js.native
    
    /**
      * Add all the step maps in a given mapping to this one (preserving
      * mirroring information).
      */
    def appendMapping(mapping: Mapping): Unit = js.native
    
    /**
      * Append the inverse of the given mapping to this one.
      */
    def appendMappingInverted(mapping: Mapping): Unit = js.native
    
    /**
      * The starting position in the `maps` array, used when `map` or
      * `mapResult` is called.
      */
    var from: Double = js.native
    
    /**
      * Finds the offset of the step map that mirrors the map at the
      * given offset, in this mapping (as per the second argument to
      * appendMap).
      */
    def getMirror(n: Double): js.UndefOr[Double | Null] = js.native
    
    /**
      * The step maps in this mapping.
      */
    var maps: js.Array[StepMap] = js.native
    
    /**
      * Create a mapping that maps only through a part of this one.
      */
    def slice(): Mapping = js.native
    def slice(from: js.UndefOr[scala.Nothing], to: Double): Mapping = js.native
    def slice(from: Double): Mapping = js.native
    def slice(from: Double, to: Double): Mapping = js.native
    
    /**
      * The end position in the `maps` array.
      */
    var to: Double = js.native
  }
  
  @JSImport("prosemirror-transform", "RemoveMarkStep")
  @js.native
  class RemoveMarkStep[S /* <: Schema[_, _] */] protected () extends Step[S] {
    def this(from: Double, to: Double, mark: Mark[S]) = this()
  }
  
  @JSImport("prosemirror-transform", "ReplaceAroundStep")
  @js.native
  class ReplaceAroundStep[S /* <: Schema[_, _] */] protected () extends Step[S] {
    /**
      * Create a replace-around step with the given range and gap.
      * `insert` should be the point in the slice into which the content
      * of the gap should be moved. `structure` has the same meaning as
      * it has in the [`ReplaceStep`](#transform.ReplaceStep) class.
      */
    def this(from: Double, to: Double, gapFrom: Double, gapTo: Double, slice: Slice[S], insert: Double) = this()
    def this(
      from: Double,
      to: Double,
      gapFrom: Double,
      gapTo: Double,
      slice: Slice[S],
      insert: Double,
      structure: Boolean
    ) = this()
  }
  
  @JSImport("prosemirror-transform", "ReplaceStep")
  @js.native
  class ReplaceStep_[S /* <: Schema[_, _] */] protected () extends Step[S] {
    /**
      * The given `slice` should fit the 'gap' between `from` and
      * `to`—the depths must line up, and the surrounding nodes must be
      * able to be joined with the open sides of the slice. When
      * `structure` is true, the step will fail if the content between
      * from and to is not just a sequence of closing and then opening
      * tokens (this is to guard against rebased replace steps
      * overwriting something they weren't supposed to).
      */
    def this(from: Double, to: Double, slice: Slice[S]) = this()
    def this(from: Double, to: Double, slice: Slice[S], structure: Boolean) = this()
  }
  
  @JSImport("prosemirror-transform", "Step")
  @js.native
  class Step[S /* <: Schema[_, _] */] () extends StObject {
    
    /**
      * Applies this step to the given document, returning a result
      * object that either indicates failure, if the step can not be
      * applied to this document, or indicates success by containing a
      * transformed document.
      */
    @JSName("apply")
    def apply(doc: Node[S]): StepResult[S] = js.native
    
    /**
      * Get the step map that represents the changes made by this step,
      * and which can be used to transform between positions in the old
      * and the new document.
      */
    def getMap(): StepMap = js.native
    
    /**
      * Create an inverted version of this step. Needs the document as it
      * was before the step as argument.
      */
    def invert(doc: Node[S]): Step[S] = js.native
    
    /**
      * Map this step through a mappable thing, returning either a
      * version of that step with its positions adjusted, or `null` if
      * the step was entirely deleted by the mapping.
      */
    def map(mapping: Mappable): js.UndefOr[Step[S] | Null] = js.native
    
    /**
      * Try to merge this step with another one, to be applied directly
      * after it. Returns the merged step when possible, null if the
      * steps can't be merged.
      */
    def merge(other: Step[S]): js.UndefOr[Step[S] | Null] = js.native
    
    /**
      * Create a JSON-serializeable representation of this step. When
      * defining this for a custom subclass, make sure the result object
      * includes the step type's [JSON id](#transform.Step^jsonID) under
      * the `stepType` property.
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  /* static members */
  object Step {
    
    /**
      * Deserialize a step from its JSON representation. Will call
      * through to the step class' own implementation of this method.
      */
    @JSImport("prosemirror-transform", "Step.fromJSON")
    @js.native
    def fromJSON[S /* <: Schema[_, _] */](schema: S, json: StringDictionary[js.Any]): Step[S] = js.native
    
    /**
      * To be able to serialize steps to JSON, each step needs a string
      * ID to attach to its JSON representation. Use this method to
      * register an ID for your step classes. Try to pick something
      * that's unlikely to clash with steps from other modules.
      */
    @JSImport("prosemirror-transform", "Step.jsonID")
    @js.native
    def jsonID(id: String, stepClass: Instantiable): Unit = js.native
  }
  
  @JSImport("prosemirror-transform", "StepMap")
  @js.native
  class StepMap protected () extends Mappable {
    /**
      * Create a position map. The modifications to the document are
      * represented as an array of numbers, in which each group of three
      * represents a modified chunk as `[start, oldSize, newSize]`.
      */
    def this(ranges: js.Array[Double]) = this()
    
    /**
      * Calls the given function on each of the changed ranges included in
      * this map.
      */
    def forEach(
      f: js.Function4[
          /* oldStart */ Double, 
          /* oldEnd */ Double, 
          /* newStart */ Double, 
          /* newEnd */ Double, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Create an inverted version of this map. The result can be used to
      * map positions in the post-step document to the pre-step document.
      */
    def invert(): StepMap = js.native
  }
  /* static members */
  object StepMap {
    
    /**
      * Create a map that moves all positions by offset `n` (which may be
      * negative). This can be useful when applying steps meant for a
      * sub-document to a larger document, or vice-versa.
      */
    @JSImport("prosemirror-transform", "StepMap.offset")
    @js.native
    def offset(n: Double): StepMap = js.native
  }
  
  @JSImport("prosemirror-transform", "StepResult")
  @js.native
  class StepResult[S /* <: Schema[_, _] */] () extends StObject {
    
    /**
      * The transformed document.
      */
    var doc: js.UndefOr[Node[S] | Null] = js.native
    
    /**
      * Text providing information about a failed step.
      */
    var failed: js.UndefOr[String | Null] = js.native
  }
  /* static members */
  object StepResult {
    
    /**
      * Create a failed step result.
      */
    @JSImport("prosemirror-transform", "StepResult.fail")
    @js.native
    def fail(message: String): StepResult[_] = js.native
    
    /**
      * Call [`Node.replace`](#model.Node.replace) with the given
      * arguments. Create a successful result if it succeeds, and a
      * failed one if it throws a `ReplaceError`.
      */
    @JSImport("prosemirror-transform", "StepResult.fromReplace")
    @js.native
    def fromReplace[S /* <: Schema[_, _] */](doc: Node[S], from: Double, to: Double, slice: Slice[S]): StepResult[S] = js.native
    
    /**
      * Create a successful step result.
      */
    @JSImport("prosemirror-transform", "StepResult.ok")
    @js.native
    def ok[S /* <: Schema[_, _] */](doc: Node[S]): StepResult[S] = js.native
  }
  
  @JSImport("prosemirror-transform", "Transform")
  @js.native
  class Transform[S /* <: Schema[_, _] */] protected () extends StObject {
    /**
      * Create a transform that starts with the given document.
      */
    def this(doc: Node[S]) = this()
    
    /**
      * Add the given mark to the inline content between `from` and `to`.
      */
    def addMark(from: Double, to: Double, mark: Mark[S]): this.type = js.native
    
    /**
      * The starting document.
      */
    var before: Node[S] = js.native
    
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
    def join(pos: Double, depth: js.UndefOr[scala.Nothing], p1: Boolean): this.type = js.native
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
      * A mapping with the maps for each of the steps in this transform.
      */
    var mapping: Mapping = js.native
    
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
    def replace(from: Double, to: js.UndefOr[scala.Nothing], slice: Slice[S]): this.type = js.native
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
    
    def setBlockType(from: Double, to: js.UndefOr[scala.Nothing], `type`: NodeType[S]): this.type = js.native
    def setBlockType(from: Double, to: js.UndefOr[scala.Nothing], `type`: NodeType[S], attrs: StringDictionary[js.Any]): this.type = js.native
    /**
      * Set the type of all textblocks (partly) between `from` and `to` to
      * the given node type with the given attributes.
      */
    def setBlockType(from: Double, to: Double, `type`: NodeType[S]): this.type = js.native
    def setBlockType(from: Double, to: Double, `type`: NodeType[S], attrs: StringDictionary[js.Any]): this.type = js.native
    
    /**
      * Change the type, attributes, and/or marks of the node at `pos`.
      * When `nodeType` is null, the existing node type is preserved,
      */
    def setNodeMarkup(pos: Double): this.type = js.native
    def setNodeMarkup(
      pos: Double,
      `type`: js.UndefOr[scala.Nothing],
      attrs: js.UndefOr[scala.Nothing],
      marks: js.Array[Mark[S]]
    ): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: js.UndefOr[scala.Nothing], attrs: StringDictionary[js.Any]): this.type = js.native
    def setNodeMarkup(
      pos: Double,
      `type`: js.UndefOr[scala.Nothing],
      attrs: StringDictionary[js.Any],
      marks: js.Array[Mark[S]]
    ): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: NodeType[S]): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: NodeType[S], attrs: js.UndefOr[scala.Nothing], marks: js.Array[Mark[S]]): this.type = js.native
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
    def split(pos: Double, depth: js.UndefOr[scala.Nothing], typesAfter: js.Array[Attrs[S]]): this.type = js.native
    def split(pos: Double, depth: Double): this.type = js.native
    def split(pos: Double, depth: Double, typesAfter: js.Array[Attrs[S]]): this.type = js.native
    
    /**
      * Apply a new step in this transform, saving the result. Throws an
      * error when the step fails.
      */
    def step(step: Step[S]): this.type = js.native
    
    /**
      * The steps in this transform.
      */
    var steps: js.Array[Step[S]] = js.native
    
    /**
      * Wrap the given [range](#model.NodeRange) in the given set of wrappers.
      * The wrappers are assumed to be valid in this position, and should
      * probably be computed with [`findWrapping`](#transform.findWrapping).
      */
    def wrap(range: NodeRange[S], wrappers: js.Array[Attrs[S]]): this.type = js.native
  }
  
  @JSImport("prosemirror-transform", "canJoin")
  @js.native
  def canJoin(doc: Node[_], pos: Double): Boolean = js.native
  
  @JSImport("prosemirror-transform", "canSplit")
  @js.native
  def canSplit[S /* <: Schema[_, _] */](doc: Node[S], pos: Double): Boolean = js.native
  @JSImport("prosemirror-transform", "canSplit")
  @js.native
  def canSplit[S /* <: Schema[_, _] */](
    doc: Node[S],
    pos: Double,
    depth: js.UndefOr[scala.Nothing],
    typesAfter: js.Array[js.UndefOr[Attrs[S] | Null]]
  ): Boolean = js.native
  @JSImport("prosemirror-transform", "canSplit")
  @js.native
  def canSplit[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, depth: Double): Boolean = js.native
  @JSImport("prosemirror-transform", "canSplit")
  @js.native
  def canSplit[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, depth: Double, typesAfter: js.Array[js.UndefOr[Attrs[S] | Null]]): Boolean = js.native
  
  @JSImport("prosemirror-transform", "dropPoint")
  @js.native
  def dropPoint[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, slice: Slice[S]): js.UndefOr[Double | Null] = js.native
  
  @JSImport("prosemirror-transform", "findWrapping")
  @js.native
  def findWrapping[S /* <: Schema[_, _] */](range: NodeRange[S], nodeType: NodeType[S]): js.UndefOr[js.Array[Attrs[S]] | Null] = js.native
  @JSImport("prosemirror-transform", "findWrapping")
  @js.native
  def findWrapping[S /* <: Schema[_, _] */](
    range: NodeRange[S],
    nodeType: NodeType[S],
    attrs: js.UndefOr[scala.Nothing],
    innerRange: NodeRange[S]
  ): js.UndefOr[js.Array[Attrs[S]] | Null] = js.native
  @JSImport("prosemirror-transform", "findWrapping")
  @js.native
  def findWrapping[S /* <: Schema[_, _] */](range: NodeRange[S], nodeType: NodeType[S], attrs: StringDictionary[js.Any]): js.UndefOr[js.Array[Attrs[S]] | Null] = js.native
  @JSImport("prosemirror-transform", "findWrapping")
  @js.native
  def findWrapping[S /* <: Schema[_, _] */](
    range: NodeRange[S],
    nodeType: NodeType[S],
    attrs: StringDictionary[js.Any],
    innerRange: NodeRange[S]
  ): js.UndefOr[js.Array[Attrs[S]] | Null] = js.native
  
  @JSImport("prosemirror-transform", "insertPoint")
  @js.native
  def insertPoint[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, nodeType: NodeType[S]): js.UndefOr[Double | Null] = js.native
  
  @JSImport("prosemirror-transform", "joinPoint")
  @js.native
  def joinPoint(doc: Node[_], pos: Double): js.UndefOr[Double | Null] = js.native
  @JSImport("prosemirror-transform", "joinPoint")
  @js.native
  def joinPoint(doc: Node[_], pos: Double, dir: Double): js.UndefOr[Double | Null] = js.native
  
  @JSImport("prosemirror-transform", "liftTarget")
  @js.native
  def liftTarget(range: NodeRange[_]): js.UndefOr[Double | Null] = js.native
  
  @JSImport("prosemirror-transform", "replaceStep")
  @js.native
  def replaceStep[S /* <: Schema[_, _] */](doc: Node[S], from: Double): js.UndefOr[Step[S] | Null] = js.native
  @JSImport("prosemirror-transform", "replaceStep")
  @js.native
  def replaceStep[S /* <: Schema[_, _] */](doc: Node[S], from: Double, to: js.UndefOr[scala.Nothing], slice: Slice[S]): js.UndefOr[Step[S] | Null] = js.native
  @JSImport("prosemirror-transform", "replaceStep")
  @js.native
  def replaceStep[S /* <: Schema[_, _] */](doc: Node[S], from: Double, to: Double): js.UndefOr[Step[S] | Null] = js.native
  @JSImport("prosemirror-transform", "replaceStep")
  @js.native
  def replaceStep[S /* <: Schema[_, _] */](doc: Node[S], from: Double, to: Double, slice: Slice[S]): js.UndefOr[Step[S] | Null] = js.native
  
  @js.native
  trait Mappable extends StObject {
    
    /**
      * Map a position through this object. When given, `assoc` (should
      * be -1 or 1, defaults to 1) determines with which side the
      * position is associated, which determines in which direction to
      * move when a chunk of content is inserted at the mapped position.
      */
    def map(pos: Double): Double = js.native
    def map(pos: Double, assoc: Double): Double = js.native
    
    /**
      * Map a position, and return an object containing additional
      * information about the mapping. The result's `deleted` field tells
      * you whether the position was deleted (completely enclosed in a
      * replaced range) during the mapping. When content on only one side
      * is deleted, the position itself is only considered deleted when
      * `assoc` points in the direction of the deleted content.
      */
    def mapResult(pos: Double): MapResult = js.native
    def mapResult(pos: Double, assoc: Double): MapResult = js.native
  }
}
