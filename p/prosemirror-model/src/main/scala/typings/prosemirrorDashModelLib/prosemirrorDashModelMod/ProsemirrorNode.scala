package typings
package prosemirrorDashModelLib.prosemirrorDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait ProsemirrorNode[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * An object mapping attribute names to values. The kind of
    * attributes allowed and required are
    * [determined](#model.NodeSpec.attrs) by the node type.
    */
  var attrs: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * The number of children that the node has.
    */
  var childCount: scala.Double = js.native
  /**
    * A container holding the node's children.
    */
  var content: Fragment[S] = js.native
  /**
    * Returns this node's first child, or `null` if there are no
    * children.
    */
  var firstChild: js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  /**
    * True when this node has inline content.
    */
  var inlineContent: scala.Boolean = js.native
  /**
    * True when this is an atom, i.e. when it does not have directly
    * editable content. This is usually the same as `isLeaf`, but can
    * be configured with the [`atom` property](#model.NodeSpec.atom) on
    * a node's spec (typically used when the node is displayed as an
    * uneditable [node view](#view.NodeView)).
    */
  var isAtom: scala.Boolean = js.native
  /**
    * True when this is a block (non-inline node)
    */
  var isBlock: scala.Boolean = js.native
  /**
    * True when this is an inline node (a text node or a node that can
    * appear among text).
    */
  var isInline: scala.Boolean = js.native
  /**
    * True when this is a leaf node.
    */
  var isLeaf: scala.Boolean = js.native
  /**
    * True when this is a text node.
    */
  var isText: scala.Boolean = js.native
  /**
    * True when this is a textblock node, a block node with inline
    * content.
    */
  var isTextblock: scala.Boolean = js.native
  /**
    * Returns this node's last child, or `null` if there are no
    * children.
    */
  var lastChild: js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  /**
    * The marks (things like whether it is emphasized or part of a
    * link) applied to this node.
    */
  var marks: js.Array[Mark[S]] = js.native
  /**
    * The size of this node, as defined by the integer-based [indexing
    * scheme](/docs/guide/#doc.indexing). For text nodes, this is the
    * amount of characters. For other leaf nodes, it is one. For
    * non-leaf nodes, it is the size of the content plus two (the start
    * and end token).
    */
  var nodeSize: scala.Double = js.native
  /**
    * For text nodes, this contains the node's text content.
    */
  var text: js.UndefOr[java.lang.String | scala.Null] = js.native
  /**
    * Concatenates all the text nodes found in this fragment and its
    * children.
    */
  var textContent: java.lang.String = js.native
  /**
    * The type of node that this is.
    */
  var `type`: NodeType[S] = js.native
  /**
    * Test whether the given node's content could be appended to this
    * node. If that node is empty, this will only return true if there
    * is at least one node type that can appear in both nodes (to avoid
    * merging completely incompatible nodes).
    */
  def canAppend(other: ProsemirrorNode[S]): scala.Boolean = js.native
  /**
    * Test whether replacing the range between `from` and `to` (by
    * child index) with the given replacement fragment (which defaults
    * to the empty fragment) would leave the node's content valid. You
    * can optionally pass `start` and `end` indices into the
    * replacement fragment.
    */
  def canReplace(from: scala.Double, to: scala.Double): scala.Boolean = js.native
  def canReplace(from: scala.Double, to: scala.Double, replacement: Fragment[S]): scala.Boolean = js.native
  def canReplace(from: scala.Double, to: scala.Double, replacement: Fragment[S], start: scala.Double): scala.Boolean = js.native
  def canReplace(
    from: scala.Double,
    to: scala.Double,
    replacement: Fragment[S],
    start: scala.Double,
    end: scala.Double
  ): scala.Boolean = js.native
  /**
    * Test whether replacing the range `from` to `to` (by index) with a
    * node of the given type.
    */
  def canReplaceWith(from: scala.Double, to: scala.Double, `type`: NodeType[S]): scala.Boolean = js.native
  def canReplaceWith(from: scala.Double, to: scala.Double, `type`: NodeType[S], marks: js.Array[Mark[S]]): scala.Boolean = js.native
  /**
    * Check whether this node and its descendants conform to the
    * schema, and raise error when they do not.
    */
  def check(): scala.Unit = js.native
  /**
    * Get the child node at the given index. Raises an error when the
    * index is out of range.
    */
  def child(index: scala.Double): ProsemirrorNode[S] = js.native
  /**
    * Find the (direct) child node after the given offset, if any,
    * and return it along with its index and offset relative to this
    * node.
    */
  def childAfter(pos: scala.Double): prosemirrorDashModelLib.Anon_NodeOffset[S] = js.native
  /**
    * Find the (direct) child node before the given offset, if any,
    * and return it along with its index and offset relative to this
    * node.
    */
  def childBefore(pos: scala.Double): prosemirrorDashModelLib.Anon_NodeOffset[S] = js.native
  /**
    * Get the content match in this node at the given index.
    */
  def contentMatchAt(index: scala.Double): ContentMatch[S] = js.native
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
  def cut(from: scala.Double): ProsemirrorNode[S] = js.native
  def cut(from: scala.Double, to: scala.Double): ProsemirrorNode[S] = js.native
  /**
    * Call the given callback for every descendant node. Doesn't
    * descend into a node when the callback returns `false`.
    */
  def descendants(
    f: js.Function3[
      /* node */ ProsemirrorNode[S], 
      /* pos */ scala.Double, 
      /* parent */ ProsemirrorNode[S], 
      js.UndefOr[scala.Boolean | scala.Null | scala.Unit]
    ]
  ): scala.Unit = js.native
  /**
    * Test whether two nodes represent the same piece of document.
    */
  def eq(other: ProsemirrorNode[S]): scala.Boolean = js.native
  /**
    * Call `f` for every child node, passing the node, its offset
    * into this parent node, and its index.
    */
  def forEach(
    f: js.Function3[
      /* node */ ProsemirrorNode[S], 
      /* offset */ scala.Double, 
      /* index */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Check whether this node's markup correspond to the given type,
    * attributes, and marks.
    */
  def hasMarkup(`type`: NodeType[S]): scala.Boolean = js.native
  def hasMarkup(`type`: NodeType[S], attrs: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Boolean = js.native
  def hasMarkup(
    `type`: NodeType[S],
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    marks: js.Array[Mark[S]]
  ): scala.Boolean = js.native
  /**
    * Create a copy of this node, with the given set of marks instead
    * of the node's own marks.
    */
  def mark(marks: js.Array[Mark[S]]): ProsemirrorNode[S] = js.native
  /**
    * Get the child node at the given index, if it exists.
    */
  def maybeChild(index: scala.Double): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  /**
    * Find the node starting at the given position.
    */
  def nodeAt(pos: scala.Double): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  /**
    * Invoke a callback for all descendant nodes recursively between
    * the given two positions that are relative to start of this node's
    * content. The callback is invoked with the node, its
    * parent-relative position, its parent node, and its child index.
    * When the callback returns false for a given node, that node's
    * children will not be recursed over.
    */
  def nodesBetween(
    from: scala.Double,
    to: scala.Double,
    f: js.Function4[
      /* node */ ProsemirrorNode[S], 
      /* pos */ scala.Double, 
      /* parent */ ProsemirrorNode[S], 
      /* index */ scala.Double, 
      js.UndefOr[scala.Boolean | scala.Null | scala.Unit]
    ]
  ): scala.Unit = js.native
  def nodesBetween(
    from: scala.Double,
    to: scala.Double,
    f: js.Function4[
      /* node */ ProsemirrorNode[S], 
      /* pos */ scala.Double, 
      /* parent */ ProsemirrorNode[S], 
      /* index */ scala.Double, 
      js.UndefOr[scala.Boolean | scala.Null | scala.Unit]
    ],
    startPos: scala.Double
  ): scala.Unit = js.native
  /**
    * Test whether a mark of the given type occurs in this document
    * between the two given positions.
    */
  def rangeHasMark(from: scala.Double, to: scala.Double, `type`: MarkType[S]): scala.Boolean = js.native
  /**
    * Replace the part of the document between the given positions with
    * the given slice. The slice must 'fit', meaning its open sides
    * must be able to connect to the surrounding content, and its
    * content nodes must be valid children for the node they are placed
    * into. If any of this is violated, an error of type
    * [`ReplaceError`](#model.ReplaceError) is thrown.
    */
  def replace(from: scala.Double, to: scala.Double, slice: Slice[S]): ProsemirrorNode[S] = js.native
  /**
    * Resolve the given position in the document, returning an
    * [object](#model.ResolvedPos) with information about its context.
    */
  def resolve(pos: scala.Double): ResolvedPos[S] = js.native
  /**
    * Compare the markup (type, attributes, and marks) of this node to
    * those of another. Returns `true` if both have the same markup.
    */
  def sameMarkup(other: ProsemirrorNode[S]): scala.Boolean = js.native
  /**
    * Cut out the part of the document between the given positions, and
    * return it as a `Slice` object.
    */
  def slice(from: scala.Double): Slice[S] = js.native
  def slice(from: scala.Double, to: scala.Double): Slice[S] = js.native
  /**
    * Get all text between positions `from` and `to`. When
    * `blockSeparator` is given, it will be inserted whenever a new
    * block node is started. When `leafText` is given, it'll be
    * inserted for every non-text leaf node encountered.
    */
  def textBetween(from: scala.Double, to: scala.Double): java.lang.String = js.native
  def textBetween(from: scala.Double, to: scala.Double, blockSeparator: java.lang.String): java.lang.String = js.native
  def textBetween(from: scala.Double, to: scala.Double, blockSeparator: java.lang.String, leafText: java.lang.String): java.lang.String = js.native
  /**
    * Return a JSON-serializeable representation of this node.
    */
  def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

