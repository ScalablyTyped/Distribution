package typings.prosemirrorTestBuilder

import typings.prosemirrorModel.mod.Attrs
import typings.prosemirrorModel.mod.ContentMatch
import typings.prosemirrorModel.mod.Fragment
import typings.prosemirrorModel.mod.Mark
import typings.prosemirrorModel.mod.MarkType
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorTestBuilder.mod.Tags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Eq[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {eq (other : T): boolean} */ js.Any */] extends StObject
  
  trait Flat extends StObject {
    
    var flat: js.Array[Node]
    
    var tag: Tags
  }
  object Flat {
    
    inline def apply(flat: js.Array[Node], tag: Tags): Flat = {
      val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Flat] (val x: Self) extends AnyVal {
      
      inline def setFlat(value: js.Array[Node]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatVarargs(value: Node*): Self = StObject.set(x, "flat", js.Array(value*))
      
      inline def setTag(value: Tags): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined prosemirror-model.prosemirror-model.Node & {  tag :prosemirror-test-builder.prosemirror-test-builder.Tags} */
  @js.native
  trait NodetagTags extends StObject {
    
    /**
      An object mapping attribute names to values. The kind of
      attributes allowed and required are
      [determined](https://prosemirror.net/docs/ref/#model.NodeSpec.attrs) by the node type.
      */
    val attrs: Attrs = js.native
    
    /**
      Test whether the given node's content could be appended to this
      node. If that node is empty, this will only return true if there
      is at least one node type that can appear in both nodes (to avoid
      merging completely incompatible nodes).
      */
    def canAppend(other: Node): Boolean = js.native
    
    /**
      Test whether replacing the range between `from` and `to` (by
      child index) with the given replacement fragment (which defaults
      to the empty fragment) would leave the node's content valid. You
      can optionally pass `start` and `end` indices into the
      replacement fragment.
      */
    def canReplace(from: Double, to: Double): Boolean = js.native
    def canReplace(from: Double, to: Double, replacement: Unit, start: Double): Boolean = js.native
    def canReplace(from: Double, to: Double, replacement: Unit, start: Double, end: Double): Boolean = js.native
    def canReplace(from: Double, to: Double, replacement: Unit, start: Unit, end: Double): Boolean = js.native
    def canReplace(from: Double, to: Double, replacement: Fragment): Boolean = js.native
    def canReplace(from: Double, to: Double, replacement: Fragment, start: Double): Boolean = js.native
    def canReplace(from: Double, to: Double, replacement: Fragment, start: Double, end: Double): Boolean = js.native
    def canReplace(from: Double, to: Double, replacement: Fragment, start: Unit, end: Double): Boolean = js.native
    
    /**
      Test whether replacing the range `from` to `to` (by index) with
      a node of the given type would leave the node's content valid.
      */
    def canReplaceWith(from: Double, to: Double, `type`: NodeType): Boolean = js.native
    def canReplaceWith(from: Double, to: Double, `type`: NodeType, marks: js.Array[Mark]): Boolean = js.native
    
    /**
      Check whether this node and its descendants conform to the
      schema, and raise error when they do not.
      */
    def check(): Unit = js.native
    
    /**
      Get the child node at the given index. Raises an error when the
      index is out of range.
      */
    def child(index: Double): Node = js.native
    
    /**
      Find the (direct) child node after the given offset, if any,
      and return it along with its index and offset relative to this
      node.
      */
    def childAfter(pos: Double): typings.prosemirrorModel.anon.Node = js.native
    
    /**
      Find the (direct) child node before the given offset, if any,
      and return it along with its index and offset relative to this
      node.
      */
    def childBefore(pos: Double): typings.prosemirrorModel.anon.Node = js.native
    
    /**
      The number of children that the node has.
      */
    def childCount: Double = js.native
    
    /**
      A container holding the node's children.
      */
    val content: Fragment = js.native
    
    /**
      Get the content match in this node at the given index.
      */
    def contentMatchAt(index: Double): ContentMatch = js.native
    
    /**
      Create a new node with the same markup as this node, containing
      the given content (or empty, if no content is given).
      */
    def copy(): Node = js.native
    def copy(content: Fragment): Node = js.native
    
    /**
      Create a copy of this node with only the content between the
      given positions. If `to` is not given, it defaults to the end of
      the node.
      */
    def cut(from: Double): Node = js.native
    def cut(from: Double, to: Double): Node = js.native
    
    /**
      Call the given callback for every descendant node. Doesn't
      descend into a node when the callback returns `false`.
      */
    def descendants(
      f: js.Function4[
          /* node */ this.type, 
          /* pos */ Double, 
          /* parent */ this.type | Null, 
          /* index */ Double, 
          Unit | Boolean
        ]
    ): Unit = js.native
    
    /**
      Test whether two nodes represent the same piece of document.
      */
    def eq(other: Node): Boolean = js.native
    
    /**
      Returns this node's first child, or `null` if there are no
      children.
      */
    def firstChild: Node | Null = js.native
    
    /**
      Call `f` for every child node, passing the node, its offset
      into this parent node, and its index.
      */
    def forEach(f: js.Function3[/* node */ this.type, /* offset */ Double, /* index */ Double, Unit]): Unit = js.native
    
    /**
      Check whether this node's markup correspond to the given type,
      attributes, and marks.
      */
    def hasMarkup(`type`: NodeType): Boolean = js.native
    def hasMarkup(`type`: NodeType, attrs: Null, marks: js.Array[Mark]): Boolean = js.native
    def hasMarkup(`type`: NodeType, attrs: Unit, marks: js.Array[Mark]): Boolean = js.native
    def hasMarkup(`type`: NodeType, attrs: Attrs): Boolean = js.native
    def hasMarkup(`type`: NodeType, attrs: Attrs, marks: js.Array[Mark]): Boolean = js.native
    
    /**
      True when this node allows inline content.
      */
    def inlineContent: Boolean = js.native
    
    /**
      True when this is an atom, i.e. when it does not have directly
      editable content. This is usually the same as `isLeaf`, but can
      be configured with the [`atom` property](https://prosemirror.net/docs/ref/#model.NodeSpec.atom)
      on a node's spec (typically used when the node is displayed as
      an uneditable [node view](https://prosemirror.net/docs/ref/#view.NodeView)).
      */
    def isAtom: Boolean = js.native
    
    /**
      True when this is a block (non-inline node)
      */
    def isBlock: Boolean = js.native
    
    /**
      True when this is an inline node (a text node or a node that can
      appear among text).
      */
    def isInline: Boolean = js.native
    
    /**
      True when this is a leaf node.
      */
    def isLeaf: Boolean = js.native
    
    /**
      True when this is a text node.
      */
    def isText: Boolean = js.native
    
    /**
      True when this is a textblock node, a block node with inline
      content.
      */
    def isTextblock: Boolean = js.native
    
    /**
      Returns this node's last child, or `null` if there are no
      children.
      */
    def lastChild: Node | Null = js.native
    
    /**
      Create a copy of this node, with the given set of marks instead
      of the node's own marks.
      */
    def mark(marks: js.Array[Mark]): Node = js.native
    
    /**
      The marks (things like whether it is emphasized or part of a
      link) applied to this node.
      */
    val marks: js.Array[Mark] = js.native
    
    /**
      Get the child node at the given index, if it exists.
      */
    def maybeChild(index: Double): Node | Null = js.native
    
    /**
      Find the node directly after the given position.
      */
    def nodeAt(pos: Double): Node | Null = js.native
    
    /**
      The size of this node, as defined by the integer-based [indexing
      scheme](/docs/guide/#doc.indexing). For text nodes, this is the
      amount of characters. For other leaf nodes, it is one. For
      non-leaf nodes, it is the size of the content plus two (the
      start and end token).
      */
    def nodeSize: Double = js.native
    
    /**
      Invoke a callback for all descendant nodes recursively between
      the given two positions that are relative to start of this
      node's content. The callback is invoked with the node, its
      position relative to the original node (method receiver),
      its parent node, and its child index. When the callback returns
      false for a given node, that node's children will not be
      recursed over. The last parameter can be used to specify a
      starting position to count from.
      */
    def nodesBetween(
      from: Double,
      to: Double,
      f: js.Function4[
          /* node */ this.type, 
          /* pos */ Double, 
          /* parent */ this.type | Null, 
          /* index */ Double, 
          Unit | Boolean
        ]
    ): Unit = js.native
    def nodesBetween(
      from: Double,
      to: Double,
      f: js.Function4[
          /* node */ this.type, 
          /* pos */ Double, 
          /* parent */ this.type | Null, 
          /* index */ Double, 
          Unit | Boolean
        ],
      startPos: Double
    ): Unit = js.native
    
    /**
      Test whether a given mark or mark type occurs in this document
      between the two given positions.
      */
    def rangeHasMark(from: Double, to: Double, `type`: Mark): Boolean = js.native
    def rangeHasMark(from: Double, to: Double, `type`: MarkType): Boolean = js.native
    
    /**
      Replace the part of the document between the given positions with
      the given slice. The slice must 'fit', meaning its open sides
      must be able to connect to the surrounding content, and its
      content nodes must be valid children for the node they are placed
      into. If any of this is violated, an error of type
      [`ReplaceError`](https://prosemirror.net/docs/ref/#model.ReplaceError) is thrown.
      */
    def replace(from: Double, to: Double, slice: Slice): Node = js.native
    
    /**
      Resolve the given position in the document, returning an
      [object](https://prosemirror.net/docs/ref/#model.ResolvedPos) with information about its context.
      */
    def resolve(pos: Double): ResolvedPos = js.native
    
    /**
      Compare the markup (type, attributes, and marks) of this node to
      those of another. Returns `true` if both have the same markup.
      */
    def sameMarkup(other: Node): Boolean = js.native
    
    /**
      Cut out the part of the document between the given positions, and
      return it as a `Slice` object.
      */
    def slice(from: Double): Slice = js.native
    def slice(from: Double, to: Double): Slice = js.native
    def slice(from: Double, to: Double, includeParents: Boolean): Slice = js.native
    def slice(from: Double, to: Unit, includeParents: Boolean): Slice = js.native
    
    var tag: Tags = js.native
    
    /**
      For text nodes, this contains the node's text content.
      */
    val text: js.UndefOr[String] = js.native
    
    /**
      Get all text between positions `from` and `to`. When
      `blockSeparator` is given, it will be inserted to separate text
      from different block nodes. If `leafText` is given, it'll be
      inserted for every non-text leaf node encountered, otherwise
      [`leafText`](https://prosemirror.net/docs/ref/#model.NodeSpec^leafText) will be used.
      */
    def textBetween(from: Double, to: Double): String = js.native
    def textBetween(from: Double, to: Double, blockSeparator: String): String = js.native
    def textBetween(from: Double, to: Double, blockSeparator: String, leafText: String): String = js.native
    def textBetween(
      from: Double,
      to: Double,
      blockSeparator: String,
      leafText: js.Function1[/* leafNode */ this.type, String]
    ): String = js.native
    def textBetween(from: Double, to: Double, blockSeparator: Null, leafText: String): String = js.native
    def textBetween(
      from: Double,
      to: Double,
      blockSeparator: Null,
      leafText: js.Function1[/* leafNode */ this.type, String]
    ): String = js.native
    def textBetween(from: Double, to: Double, blockSeparator: Unit, leafText: String): String = js.native
    def textBetween(
      from: Double,
      to: Double,
      blockSeparator: Unit,
      leafText: js.Function1[/* leafNode */ this.type, String]
    ): String = js.native
    
    /**
      Concatenates all the text nodes found in this fragment and its
      children.
      */
    def textContent: String = js.native
    
    /**
      Return a JSON-serializeable representation of this node.
      */
    def toJSON(): Any = js.native
    
    /**
      The type of node that this is.
      */
    val `type`: NodeType = js.native
  }
}
