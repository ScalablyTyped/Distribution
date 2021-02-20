package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a node in the tree that makes up a
  * ProseMirror document. So a document is an instance of `Node`, with
  * children that are also instances of `Node`.
  *
  * Nodes are persistent data structures. Instead of changing them, you
  * create new ones with the content you want. Old ones keep pointing
  * at the old document shape. This is made cheaper by sharing
  * structure between the old and new data as much as possible, which a
  * tree shape like this (without back pointers) makes easy.
  *
  * **Do not** directly mutate the properties of a `Node` object. See
  * [the guide](/docs/guide/#doc) for more information.
  */
@js.native
trait ProsemirrorNode[S /* <: Schema[_, _] */] extends StObject {
  
  /**
    * An object mapping attribute names to values. The kind of
    * attributes allowed and required are
    * [determined](#model.NodeSpec.attrs) by the node type.
    */
  var attrs: StringDictionary[js.Any] = js.native
  
  /**
    * Test whether the given node's content could be appended to this
    * node. If that node is empty, this will only return true if there
    * is at least one node type that can appear in both nodes (to avoid
    * merging completely incompatible nodes).
    */
  def canAppend(other: ProsemirrorNode[S]): Boolean = js.native
  
  /**
    * Test whether replacing the range between `from` and `to` (by
    * child index) with the given replacement fragment (which defaults
    * to the empty fragment) would leave the node's content valid. You
    * can optionally pass `start` and `end` indices into the
    * replacement fragment.
    */
  def canReplace(from: Double, to: Double): Boolean = js.native
  def canReplace(
    from: Double,
    to: Double,
    replacement: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    end: Double
  ): Boolean = js.native
  def canReplace(from: Double, to: Double, replacement: js.UndefOr[scala.Nothing], start: Double): Boolean = js.native
  def canReplace(from: Double, to: Double, replacement: js.UndefOr[scala.Nothing], start: Double, end: Double): Boolean = js.native
  def canReplace(from: Double, to: Double, replacement: Fragment[S]): Boolean = js.native
  def canReplace(from: Double, to: Double, replacement: Fragment[S], start: js.UndefOr[scala.Nothing], end: Double): Boolean = js.native
  def canReplace(from: Double, to: Double, replacement: Fragment[S], start: Double): Boolean = js.native
  def canReplace(from: Double, to: Double, replacement: Fragment[S], start: Double, end: Double): Boolean = js.native
  
  /**
    * Test whether replacing the range `from` to `to` (by index) with a
    * node of the given type.
    */
  def canReplaceWith(from: Double, to: Double, `type`: NodeType[S]): Boolean = js.native
  def canReplaceWith(from: Double, to: Double, `type`: NodeType[S], marks: js.Array[Mark[S]]): Boolean = js.native
  
  /**
    * Check whether this node and its descendants conform to the
    * schema, and raise error when they do not.
    */
  def check(): Unit = js.native
  
  /**
    * Get the child node at the given index. Raises an error when the
    * index is out of range.
    */
  def child(index: Double): ProsemirrorNode[S] = js.native
  
  /**
    * Find the (direct) child node after the given offset, if any,
    * and return it along with its index and offset relative to this
    * node.
    */
  def childAfter(pos: Double): Index[S] = js.native
  
  /**
    * Find the (direct) child node before the given offset, if any,
    * and return it along with its index and offset relative to this
    * node.
    */
  def childBefore(pos: Double): Index[S] = js.native
  
  /**
    * The number of children that the node has.
    */
  var childCount: Double = js.native
  
  /**
    * A container holding the node's children.
    */
  var content: Fragment[S] = js.native
  
  /**
    * Get the content match in this node at the given index.
    */
  def contentMatchAt(index: Double): ContentMatch[S] = js.native
  
  /**
    * Create a new node with the same markup as this node, containing
    * the given content (or empty, if no content is given).
    */
  def copy(): ProsemirrorNode[S] = js.native
  def copy(content: Fragment[S]): ProsemirrorNode[S] = js.native
  
  /**
    * Create a copy of this node with only the content between the
    * given positions. If `to` is not given, it defaults to the end of
    * the node.
    */
  def cut(from: Double): ProsemirrorNode[S] = js.native
  def cut(from: Double, to: Double): ProsemirrorNode[S] = js.native
  
  /**
    * Call the given callback for every descendant node. Doesn't
    * descend into a node when the callback returns `false`.
    */
  def descendants(
    f: js.Function3[
      /* node */ ProsemirrorNode[S], 
      /* pos */ Double, 
      /* parent */ ProsemirrorNode[S], 
      js.UndefOr[Boolean | Null | Unit]
    ]
  ): Unit = js.native
  
  /**
    * Test whether two nodes represent the same piece of document.
    */
  def eq(other: ProsemirrorNode[S]): Boolean = js.native
  
  /**
    * Returns this node's first child, or `null` if there are no
    * children.
    */
  var firstChild: js.UndefOr[ProsemirrorNode[S] | Null] = js.native
  
  /**
    * Call `f` for every child node, passing the node, its offset
    * into this parent node, and its index.
    */
  def forEach(f: js.Function3[/* node */ ProsemirrorNode[S], /* offset */ Double, /* index */ Double, Unit]): Unit = js.native
  
  /**
    * Check whether this node's markup correspond to the given type,
    * attributes, and marks.
    */
  def hasMarkup(`type`: NodeType[S]): Boolean = js.native
  def hasMarkup(`type`: NodeType[S], attrs: js.UndefOr[scala.Nothing], marks: js.Array[Mark[S]]): Boolean = js.native
  def hasMarkup(`type`: NodeType[S], attrs: StringDictionary[js.Any]): Boolean = js.native
  def hasMarkup(`type`: NodeType[S], attrs: StringDictionary[js.Any], marks: js.Array[Mark[S]]): Boolean = js.native
  
  /**
    * True when this node has inline content.
    */
  var inlineContent: Boolean = js.native
  
  /**
    * True when this is an atom, i.e. when it does not have directly
    * editable content. This is usually the same as `isLeaf`, but can
    * be configured with the [`atom` property](#model.NodeSpec.atom) on
    * a node's spec (typically used when the node is displayed as an
    * uneditable [node view](#view.NodeView)).
    */
  var isAtom: Boolean = js.native
  
  /**
    * True when this is a block (non-inline node)
    */
  var isBlock: Boolean = js.native
  
  /**
    * True when this is an inline node (a text node or a node that can
    * appear among text).
    */
  var isInline: Boolean = js.native
  
  /**
    * True when this is a leaf node.
    */
  var isLeaf: Boolean = js.native
  
  /**
    * True when this is a text node.
    */
  var isText: Boolean = js.native
  
  /**
    * True when this is a textblock node, a block node with inline
    * content.
    */
  var isTextblock: Boolean = js.native
  
  /**
    * Returns this node's last child, or `null` if there are no
    * children.
    */
  var lastChild: js.UndefOr[ProsemirrorNode[S] | Null] = js.native
  
  /**
    * Create a copy of this node, with the given set of marks instead
    * of the node's own marks.
    */
  def mark(marks: js.Array[Mark[S]]): ProsemirrorNode[S] = js.native
  
  /**
    * The marks (things like whether it is emphasized or part of a
    * link) applied to this node.
    */
  var marks: js.Array[Mark[S]] = js.native
  
  /**
    * Get the child node at the given index, if it exists.
    */
  def maybeChild(index: Double): js.UndefOr[ProsemirrorNode[S] | Null] = js.native
  
  /**
    * Find the node starting at the given position.
    */
  def nodeAt(pos: Double): js.UndefOr[ProsemirrorNode[S] | Null] = js.native
  
  /**
    * The size of this node, as defined by the integer-based [indexing
    * scheme](/docs/guide/#doc.indexing). For text nodes, this is the
    * amount of characters. For other leaf nodes, it is one. For
    * non-leaf nodes, it is the size of the content plus two (the start
    * and end token).
    */
  var nodeSize: Double = js.native
  
  /**
    * Invoke a callback for all descendant nodes recursively between
    * the given two positions that are relative to start of this node's
    * content. The callback is invoked with the node, its
    * parent-relative position, its parent node, and its child index.
    * When the callback returns false for a given node, that node's
    * children will not be recursed over.
    */
  def nodesBetween(
    from: Double,
    to: Double,
    f: js.Function4[
      /* node */ ProsemirrorNode[S], 
      /* pos */ Double, 
      /* parent */ ProsemirrorNode[S], 
      /* index */ Double, 
      js.UndefOr[Boolean | Null | Unit]
    ]
  ): Unit = js.native
  def nodesBetween(
    from: Double,
    to: Double,
    f: js.Function4[
      /* node */ ProsemirrorNode[S], 
      /* pos */ Double, 
      /* parent */ ProsemirrorNode[S], 
      /* index */ Double, 
      js.UndefOr[Boolean | Null | Unit]
    ],
    startPos: Double
  ): Unit = js.native
  
  /**
    * Test whether a given mark or mark type occurs in this document
    * between the two given positions.
    */
  def rangeHasMark(from: Double, to: Double, `type`: Mark[S]): Boolean = js.native
  def rangeHasMark(from: Double, to: Double, `type`: MarkType[S]): Boolean = js.native
  
  /**
    * Replace the part of the document between the given positions with
    * the given slice. The slice must 'fit', meaning its open sides
    * must be able to connect to the surrounding content, and its
    * content nodes must be valid children for the node they are placed
    * into. If any of this is violated, an error of type
    * [`ReplaceError`](#model.ReplaceError) is thrown.
    */
  def replace(from: Double, to: Double, slice: Slice[S]): ProsemirrorNode[S] = js.native
  
  /**
    * Resolve the given position in the document, returning an
    * [object](#model.ResolvedPos) with information about its context.
    */
  def resolve(pos: Double): ResolvedPos[S] = js.native
  
  /**
    * Compare the markup (type, attributes, and marks) of this node to
    * those of another. Returns `true` if both have the same markup.
    */
  def sameMarkup(other: ProsemirrorNode[S]): Boolean = js.native
  
  /**
    * Cut out the part of the document between the given positions, and
    * return it as a `Slice` object.
    */
  def slice(from: Double): Slice[S] = js.native
  def slice(from: Double, to: Double): Slice[S] = js.native
  
  /**
    * For text nodes, this contains the node's text content.
    */
  var text: js.UndefOr[String | Null] = js.native
  
  /**
    * Get all text between positions `from` and `to`. When
    * `blockSeparator` is given, it will be inserted whenever a new
    * block node is started. When `leafText` is given, it'll be
    * inserted for every non-text leaf node encountered.
    */
  def textBetween(from: Double, to: Double): String = js.native
  def textBetween(from: Double, to: Double, blockSeparator: js.UndefOr[scala.Nothing], leafText: String): String = js.native
  def textBetween(from: Double, to: Double, blockSeparator: String): String = js.native
  def textBetween(from: Double, to: Double, blockSeparator: String, leafText: String): String = js.native
  
  /**
    * Concatenates all the text nodes found in this fragment and its
    * children.
    */
  var textContent: String = js.native
  
  /**
    * Return a JSON-serializeable representation of this node.
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /**
    * The type of node that this is.
    */
  var `type`: NodeType[S] = js.native
}
