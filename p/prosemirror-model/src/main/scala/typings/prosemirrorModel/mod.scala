package typings.prosemirrorModel

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.orderedmap.mod.default
import typings.prosemirrorModel.anon.A
import typings.prosemirrorModel.anon.ContentDOM
import typings.prosemirrorModel.anon.Document
import typings.prosemirrorModel.anon.Index
import typings.prosemirrorModel.anon.Offset
import typings.prosemirrorModel.prosemirrorModelBooleans.`false`
import typings.prosemirrorModel.prosemirrorModelStrings.full
import typings.prosemirrorModel.prosemirrorModelStrings.normal
import typings.prosemirrorModel.prosemirrorModelStrings.pre
import typings.std.DocumentFragment
import typings.std.Error
import typings.std.HTMLElement
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Instances of this class represent a match state of a node type's
  [content expression](https://prosemirror.net/docs/ref/#model.NodeSpec.content), and can be used to
  find out whether further content matches here, and whether a given
  position is a valid end of the node.
  */
  @JSImport("prosemirror-model", "ContentMatch")
  @js.native
  open class ContentMatch () extends StObject {
    
    /**
      Get the first matching node type at this match position that can
      be generated.
      */
    def defaultType: NodeType | Null = js.native
    
    /**
      Get the _n_​th outgoing edge from this node in the finite
      automaton that describes the content expression.
      */
    def edge(n: Double): MatchEdge = js.native
    
    /**
      The number of outgoing edges this node has in the finite
      automaton that describes the content expression.
      */
    def edgeCount: Double = js.native
    
    /**
      Try to match the given fragment, and if that fails, see if it can
      be made to match by inserting nodes in front of it. When
      successful, return a fragment of inserted nodes (which may be
      empty if nothing had to be inserted). When `toEnd` is true, only
      return a fragment if the resulting match goes to the end of the
      content expression.
      */
    def fillBefore(after: Fragment): Fragment | Null = js.native
    def fillBefore(after: Fragment, toEnd: Boolean): Fragment | Null = js.native
    def fillBefore(after: Fragment, toEnd: Boolean, startIndex: Double): Fragment | Null = js.native
    def fillBefore(after: Fragment, toEnd: Unit, startIndex: Double): Fragment | Null = js.native
    
    /**
      Find a set of wrapping node types that would allow a node of the
      given type to appear at this position. The result may be empty
      (when it fits directly) and will be null when no such wrapping
      exists.
      */
    def findWrapping(target: NodeType): js.Array[NodeType] | Null = js.native
    
    /**
      Try to match a fragment. Returns the resulting match when
      successful.
      */
    def matchFragment(frag: Fragment): ContentMatch | Null = js.native
    def matchFragment(frag: Fragment, start: Double): ContentMatch | Null = js.native
    def matchFragment(frag: Fragment, start: Double, end: Double): ContentMatch | Null = js.native
    def matchFragment(frag: Fragment, start: Unit, end: Double): ContentMatch | Null = js.native
    
    /**
      Match a node type, returning a match after that node if
      successful.
      */
    def matchType(`type`: NodeType): ContentMatch | Null = js.native
    
    /**
      True when this match state represents a valid end of the node.
      */
    val validEnd: Boolean = js.native
  }
  
  /**
  A DOM parser represents a strategy for parsing DOM content into a
  ProseMirror document conforming to a given schema. Its behavior is
  defined by an array of [rules](https://prosemirror.net/docs/ref/#model.ParseRule).
  */
  @JSImport("prosemirror-model", "DOMParser")
  @js.native
  open class DOMParser protected () extends StObject {
    /**
      Create a parser that targets the given schema, using the given
      parsing rules.
      */
    def this(
      /**
      The schema into which the parser parses.
      */
    schema: Schema[Any, Any],
      /**
      The set of [parse rules](https://prosemirror.net/docs/ref/#model.ParseRule) that the parser
      uses, in order of precedence.
      */
    rules: js.Array[ParseRule]
    ) = this()
    
    /**
      Parse a document from the content of a DOM node.
      */
    def parse(dom: DOMNode): Node = js.native
    def parse(dom: DOMNode, options: ParseOptions): Node = js.native
    
    /**
      Parses the content of the given DOM node, like
      [`parse`](https://prosemirror.net/docs/ref/#model.DOMParser.parse), and takes the same set of
      options. But unlike that method, which produces a whole node,
      this one returns a slice that is open at the sides, meaning that
      the schema constraints aren't applied to the start of nodes to
      the left of the input and the end of nodes at the end.
      */
    def parseSlice(dom: DOMNode): Slice = js.native
    def parseSlice(dom: DOMNode, options: ParseOptions): Slice = js.native
    
    /**
      The set of [parse rules](https://prosemirror.net/docs/ref/#model.ParseRule) that the parser
      uses, in order of precedence.
      */
    val rules: js.Array[ParseRule] = js.native
    
    /**
      The schema into which the parser parses.
      */
    val schema: Schema[Any, Any] = js.native
  }
  object DOMParser {
    
    @JSImport("prosemirror-model", "DOMParser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Construct a DOM parser using the parsing rules listed in a
      schema's [node specs](https://prosemirror.net/docs/ref/#model.NodeSpec.parseDOM), reordered by
      [priority](https://prosemirror.net/docs/ref/#model.ParseRule.priority).
      */
    /* static member */
    inline def fromSchema(schema: Schema[Any, Any]): DOMParser = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[DOMParser]
  }
  
  /**
  A DOM serializer knows how to convert ProseMirror nodes and
  marks of various types to DOM nodes.
  */
  @JSImport("prosemirror-model", "DOMSerializer")
  @js.native
  open class DOMSerializer protected () extends StObject {
    /**
      Create a serializer. `nodes` should map node names to functions
      that take a node and return a description of the corresponding
      DOM. `marks` does the same for mark names, but also gets an
      argument that tells it whether the mark's content is block or
      inline content (for typical use, it'll always be inline). A mark
      serializer may be `null` to indicate that marks of that type
      should not be serialized.
      */
    def this(
      /**
      The node serialization functions.
      */
    nodes: StringDictionary[js.Function1[/* node */ Node, DOMOutputSpec]],
      /**
      The mark serialization functions.
      */
    marks: StringDictionary[js.Function2[/* mark */ Mark, /* inline */ Boolean, DOMOutputSpec]]
    ) = this()
    
    /**
      The mark serialization functions.
      */
    val marks: StringDictionary[js.Function2[/* mark */ Mark, /* inline */ Boolean, DOMOutputSpec]] = js.native
    
    /**
      The node serialization functions.
      */
    val nodes: StringDictionary[js.Function1[/* node */ Node, DOMOutputSpec]] = js.native
    
    /**
      Serialize the content of this fragment to a DOM fragment. When
      not in the browser, the `document` option, containing a DOM
      document, should be passed so that the serializer can create
      nodes.
      */
    def serializeFragment(fragment: Fragment): HTMLElement | DocumentFragment = js.native
    def serializeFragment(fragment: Fragment, options: Unit, target: DocumentFragment): HTMLElement | DocumentFragment = js.native
    def serializeFragment(fragment: Fragment, options: Unit, target: HTMLElement): HTMLElement | DocumentFragment = js.native
    def serializeFragment(fragment: Fragment, options: Document): HTMLElement | DocumentFragment = js.native
    def serializeFragment(fragment: Fragment, options: Document, target: DocumentFragment): HTMLElement | DocumentFragment = js.native
    def serializeFragment(fragment: Fragment, options: Document, target: HTMLElement): HTMLElement | DocumentFragment = js.native
    
    /**
      Serialize this node to a DOM node. This can be useful when you
      need to serialize a part of a document, as opposed to the whole
      document. To serialize a whole document, use
      [`serializeFragment`](https://prosemirror.net/docs/ref/#model.DOMSerializer.serializeFragment) on
      its [content](https://prosemirror.net/docs/ref/#model.Node.content).
      */
    def serializeNode(node: Node): Any = js.native
    def serializeNode(node: Node, options: Document): Any = js.native
  }
  object DOMSerializer {
    
    @JSImport("prosemirror-model", "DOMSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Build a serializer using the [`toDOM`](https://prosemirror.net/docs/ref/#model.NodeSpec.toDOM)
      properties in a schema's node and mark specs.
      */
    /* static member */
    inline def fromSchema(schema: Schema[Any, Any]): DOMSerializer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[DOMSerializer]
    
    /**
      Gather the serializers in a schema's mark specs into an object.
      */
    /* static member */
    inline def marksFromSchema(schema: Schema[Any, Any]): StringDictionary[js.Function2[/* mark */ Mark, /* inline */ Boolean, DOMOutputSpec]] = ^.asInstanceOf[js.Dynamic].applyDynamic("marksFromSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Function2[/* mark */ Mark, /* inline */ Boolean, DOMOutputSpec]]]
    
    /**
      Gather the serializers in a schema's node specs into an object.
      This can be useful as a base to build a custom serializer from.
      */
    /* static member */
    inline def nodesFromSchema(schema: Schema[Any, Any]): StringDictionary[js.Function1[/* node */ Node, DOMOutputSpec]] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodesFromSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Function1[/* node */ Node, DOMOutputSpec]]]
    
    /**
      Render an [output spec](https://prosemirror.net/docs/ref/#model.DOMOutputSpec) to a DOM node. If
      the spec has a hole (zero) in it, `contentDOM` will point at the
      node with the hole.
      */
    /* static member */
    inline def renderSpec(doc: typings.std.Document, structure: DOMOutputSpec): ContentDOM = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSpec")(doc.asInstanceOf[js.Any], structure.asInstanceOf[js.Any])).asInstanceOf[ContentDOM]
    inline def renderSpec(doc: typings.std.Document, structure: DOMOutputSpec, xmlNS: String): ContentDOM = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSpec")(doc.asInstanceOf[js.Any], structure.asInstanceOf[js.Any], xmlNS.asInstanceOf[js.Any])).asInstanceOf[ContentDOM]
  }
  
  /**
  A fragment represents a node's collection of child nodes.
  Like nodes, fragments are persistent data structures, and you
  should not mutate them or their content. Rather, you create new
  instances whenever needed. The API tries to make this easy.
  */
  @JSImport("prosemirror-model", "Fragment")
  @js.native
  open class Fragment () extends StObject {
    
    /**
      Create a new fragment by appending the given node to this
      fragment.
      */
    def addToEnd(node: Node): Fragment = js.native
    
    /**
      Create a new fragment by prepending the given node to this
      fragment.
      */
    def addToStart(node: Node): Fragment = js.native
    
    /**
      Create a new fragment containing the combined content of this
      fragment and the other.
      */
    def append(other: Fragment): Fragment = js.native
    
    /**
      Get the child node at the given index. Raise an error when the
      index is out of range.
      */
    def child(index: Double): Node = js.native
    
    /**
      The number of child nodes in this fragment.
      */
    def childCount: Double = js.native
    
    /**
      Cut out the sub-fragment between the two given positions.
      */
    def cut(from: Double): Fragment = js.native
    def cut(from: Double, to: Double): Fragment = js.native
    
    /**
      Call the given callback for every descendant node. `pos` will be
      relative to the start of the fragment. The callback may return
      `false` to prevent traversal of a given node's children.
      */
    def descendants(f: js.Function3[/* node */ Node, /* pos */ Double, /* parent */ Node | Null, Boolean | Unit]): Unit = js.native
    
    /**
      Compare this fragment to another one.
      */
    def eq(other: Fragment): Boolean = js.native
    
    /**
      Find the first position, searching from the end, at which this
      fragment and the given fragment differ, or `null` if they are
      the same. Since this position will not be the same in both
      nodes, an object with two separate positions is returned.
      */
    def findDiffEnd(other: Fragment): A | Null = js.native
    def findDiffEnd(other: Fragment, pos: Double): A | Null = js.native
    def findDiffEnd(other: Fragment, pos: Double, otherPos: Double): A | Null = js.native
    def findDiffEnd(other: Fragment, pos: Unit, otherPos: Double): A | Null = js.native
    
    /**
      Find the first position at which this fragment and another
      fragment differ, or `null` if they are the same.
      */
    def findDiffStart(other: Fragment): Double | Null = js.native
    def findDiffStart(other: Fragment, pos: Double): Double | Null = js.native
    
    /**
      Find the index and inner offset corresponding to a given relative
      position in this fragment. The result object will be reused
      (overwritten) the next time the function is called. (Not public.)
      */
    def findIndex(pos: Double): Index = js.native
    def findIndex(pos: Double, round: Double): Index = js.native
    
    /**
      The first child of the fragment, or `null` if it is empty.
      */
    def firstChild: Node | Null = js.native
    
    /**
      Call `f` for every child node, passing the node, its offset
      into this parent node, and its index.
      */
    def forEach(f: js.Function3[/* node */ Node, /* offset */ Double, /* index */ Double, Unit]): Unit = js.native
    
    /**
      The last child of the fragment, or `null` if it is empty.
      */
    def lastChild: Node | Null = js.native
    
    /**
      Get the child node at the given index, if it exists.
      */
    def maybeChild(index: Double): Node | Null = js.native
    
    /**
      Invoke a callback for all descendant nodes between the given two
      positions (relative to start of this fragment). Doesn't descend
      into a node when the callback returns `false`.
      */
    def nodesBetween(
      from: Double,
      to: Double,
      f: js.Function4[
          /* node */ Node, 
          /* start */ Double, 
          /* parent */ Node | Null, 
          /* index */ Double, 
          Boolean | Unit
        ]
    ): Unit = js.native
    def nodesBetween(
      from: Double,
      to: Double,
      f: js.Function4[
          /* node */ Node, 
          /* start */ Double, 
          /* parent */ Node | Null, 
          /* index */ Double, 
          Boolean | Unit
        ],
      nodeStart: Double
    ): Unit = js.native
    def nodesBetween(
      from: Double,
      to: Double,
      f: js.Function4[
          /* node */ Node, 
          /* start */ Double, 
          /* parent */ Node | Null, 
          /* index */ Double, 
          Boolean | Unit
        ],
      nodeStart: Double,
      parent: Node
    ): Unit = js.native
    def nodesBetween(
      from: Double,
      to: Double,
      f: js.Function4[
          /* node */ Node, 
          /* start */ Double, 
          /* parent */ Node | Null, 
          /* index */ Double, 
          Boolean | Unit
        ],
      nodeStart: Unit,
      parent: Node
    ): Unit = js.native
    
    /**
      Create a new fragment in which the node at the given index is
      replaced by the given node.
      */
    def replaceChild(index: Double, node: Node): Fragment = js.native
    
    /**
      The size of the fragment, which is the total of the size of
      its content nodes.
      */
    val size: Double = js.native
    
    /**
      Extract the text between `from` and `to`. See the same method on
      [`Node`](https://prosemirror.net/docs/ref/#model.Node.textBetween).
      */
    def textBetween(from: Double, to: Double): String = js.native
    def textBetween(from: Double, to: Double, blockSeparator: String): String = js.native
    def textBetween(from: Double, to: Double, blockSeparator: String, leafText: String): String = js.native
    def textBetween(
      from: Double,
      to: Double,
      blockSeparator: String,
      leafText: js.Function1[/* leafNode */ Node, String]
    ): String = js.native
    def textBetween(from: Double, to: Double, blockSeparator: Null, leafText: String): String = js.native
    def textBetween(
      from: Double,
      to: Double,
      blockSeparator: Null,
      leafText: js.Function1[/* leafNode */ Node, String]
    ): String = js.native
    def textBetween(from: Double, to: Double, blockSeparator: Unit, leafText: String): String = js.native
    def textBetween(
      from: Double,
      to: Double,
      blockSeparator: Unit,
      leafText: js.Function1[/* leafNode */ Node, String]
    ): String = js.native
    
    /**
      Create a JSON-serializeable representation of this fragment.
      */
    def toJSON(): Any = js.native
  }
  object Fragment {
    
    @JSImport("prosemirror-model", "Fragment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      An empty fragment. Intended to be reused whenever a node doesn't
      contain anything (rather than allocating a new empty fragment for
      each leaf node).
      */
    /* static member */
    @JSImport("prosemirror-model", "Fragment.empty")
    @js.native
    def empty: Fragment = js.native
    inline def empty_=(x: Fragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
    
    /**
      Create a fragment from something that can be interpreted as a
      set of nodes. For `null`, it returns the empty fragment. For a
      fragment, the fragment itself. For a node or array of nodes, a
      fragment containing those nodes.
      */
    /* static member */
    inline def from(): Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[Fragment]
    inline def from(nodes: js.Array[Node]): Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(nodes.asInstanceOf[js.Any]).asInstanceOf[Fragment]
    inline def from(nodes: Fragment): Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(nodes.asInstanceOf[js.Any]).asInstanceOf[Fragment]
    inline def from(nodes: Node): Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(nodes.asInstanceOf[js.Any]).asInstanceOf[Fragment]
    
    /**
      Build a fragment from an array of nodes. Ensures that adjacent
      text nodes with the same marks are joined together.
      */
    /* static member */
    inline def fromArray(array: js.Array[Node]): Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Fragment]
    
    /**
      Deserialize a fragment from its JSON representation.
      */
    /* static member */
    inline def fromJSON(schema: Schema[Any, Any], value: Any): Fragment = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Fragment]
  }
  
  /**
  A mark is a piece of information that can be attached to a node,
  such as it being emphasized, in code font, or a link. It has a
  type and optionally a set of attributes that provide further
  information (such as the target of the link). Marks are created
  through a `Schema`, which controls which types exist and which
  attributes they have.
  */
  @JSImport("prosemirror-model", "Mark")
  @js.native
  open class Mark () extends StObject {
    
    /**
      Given a set of marks, create a new set which contains this one as
      well, in the right position. If this mark is already in the set,
      the set itself is returned. If any marks that are set to be
      [exclusive](https://prosemirror.net/docs/ref/#model.MarkSpec.excludes) with this mark are present,
      those are replaced by this one.
      */
    def addToSet(set: js.Array[Mark]): js.Array[Mark] = js.native
    
    /**
      The attributes associated with this mark.
      */
    val attrs: Attrs = js.native
    
    /**
      Test whether this mark has the same type and attributes as
      another mark.
      */
    def eq(other: Mark): Boolean = js.native
    
    /**
      Test whether this mark is in the given set of marks.
      */
    def isInSet(set: js.Array[Mark]): Boolean = js.native
    
    /**
      Remove this mark from the given set, returning a new set. If this
      mark is not in the set, the set itself is returned.
      */
    def removeFromSet(set: js.Array[Mark]): js.Array[Mark] = js.native
    
    /**
      Convert this mark to a JSON-serializeable representation.
      */
    def toJSON(): Any = js.native
    
    /**
      The type of this mark.
      */
    val `type`: MarkType = js.native
  }
  object Mark {
    
    @JSImport("prosemirror-model", "Mark")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Deserialize a mark from JSON.
      */
    /* static member */
    inline def fromJSON(schema: Schema[Any, Any], json: Any): Mark = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(schema.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Mark]
    
    /**
      The empty set of marks.
      */
    /* static member */
    @JSImport("prosemirror-model", "Mark.none")
    @js.native
    def none: js.Array[Mark] = js.native
    inline def none_=(x: js.Array[Mark]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
    
    /**
      Test whether two sets of marks are identical.
      */
    /* static member */
    inline def sameSet(a: js.Array[Mark], b: js.Array[Mark]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sameSet")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      Create a properly sorted mark set from null, a single mark, or an
      unsorted array of marks.
      */
    /* static member */
    inline def setFrom(): js.Array[Mark] = ^.asInstanceOf[js.Dynamic].applyDynamic("setFrom")().asInstanceOf[js.Array[Mark]]
    inline def setFrom(marks: js.Array[Mark]): js.Array[Mark] = ^.asInstanceOf[js.Dynamic].applyDynamic("setFrom")(marks.asInstanceOf[js.Any]).asInstanceOf[js.Array[Mark]]
    inline def setFrom(marks: Mark): js.Array[Mark] = ^.asInstanceOf[js.Dynamic].applyDynamic("setFrom")(marks.asInstanceOf[js.Any]).asInstanceOf[js.Array[Mark]]
  }
  
  /**
  Like nodes, marks (which are associated with nodes to signify
  things like emphasis or being part of a link) are
  [tagged](https://prosemirror.net/docs/ref/#model.Mark.type) with type objects, which are
  instantiated once per `Schema`.
  */
  @JSImport("prosemirror-model", "MarkType")
  @js.native
  open class MarkType () extends StObject {
    
    /**
      Create a mark of this type. `attrs` may be `null` or an object
      containing only some of the mark's attributes. The others, if
      they have defaults, will be added.
      */
    def create(): Mark = js.native
    def create(attrs: Attrs): Mark = js.native
    
    /**
      Queries whether a given mark type is
      [excluded](https://prosemirror.net/docs/ref/#model.MarkSpec.excludes) by this one.
      */
    def excludes(other: MarkType): Boolean = js.native
    
    /**
      Tests whether there is a mark of this type in the given set.
      */
    def isInSet(set: js.Array[Mark]): js.UndefOr[Mark] = js.native
    
    /**
      The name of the mark type.
      */
    val name: String = js.native
    
    /**
      When there is a mark of this type in the given set, a new set
      without it is returned. Otherwise, the input set is returned.
      */
    def removeFromSet(set: js.Array[Mark]): js.Array[Mark] = js.native
    
    /**
      The schema that this mark type instance is part of.
      */
    val schema: Schema[Any, Any] = js.native
    
    /**
      The spec on which the type is based.
      */
    val spec: MarkSpec = js.native
  }
  
  /**
  This class represents a node in the tree that makes up a
  ProseMirror document. So a document is an instance of `Node`, with
  children that are also instances of `Node`.
  Nodes are persistent data structures. Instead of changing them, you
  create new ones with the content you want. Old ones keep pointing
  at the old document shape. This is made cheaper by sharing
  structure between the old and new data as much as possible, which a
  tree shape like this (without back pointers) makes easy.
  **Do not** directly mutate the properties of a `Node` object. See
  [the guide](/docs/guide/#doc) for more information.
  */
  @JSImport("prosemirror-model", "Node")
  @js.native
  open class Node () extends StObject {
    
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
      parent-relative position, its parent node, and its child index.
      When the callback returns false for a given node, that node's
      children will not be recursed over. The last parameter can be
      used to specify a starting position to count from.
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
  object Node {
    
    @JSImport("prosemirror-model", "Node")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Deserialize a node from its JSON representation.
      */
    /* static member */
    inline def fromJSON(schema: Schema[Any, Any], json: Any): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(schema.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Node]
  }
  
  /**
  Represents a flat range of content, i.e. one that starts and
  ends in the same node.
  */
  @JSImport("prosemirror-model", "NodeRange")
  @js.native
  open class NodeRange protected () extends StObject {
    /**
      Construct a node range. `$from` and `$to` should point into the
      same node until at least the given `depth`, since a node range
      denotes an adjacent set of nodes in a single parent node.
      */
    def this(
      /**
      A resolved position along the start of the content. May have a
      `depth` greater than this object's `depth` property, since
      these are the positions that were used to compute the range,
      not re-resolved positions directly at its boundaries.
      */
    $from: ResolvedPos,
      /**
      A position along the end of the content. See
      caveat for [`$from`](https://prosemirror.net/docs/ref/#model.NodeRange.$from).
      */
    $to: ResolvedPos,
      /**
      The depth of the node that this range points into.
      */
    depth: Double
    ) = this()
    
    /**
      A resolved position along the start of the content. May have a
      `depth` greater than this object's `depth` property, since
      these are the positions that were used to compute the range,
      not re-resolved positions directly at its boundaries.
      */
    @JSName("$from")
    val $from: ResolvedPos = js.native
    
    /**
      A position along the end of the content. See
      caveat for [`$from`](https://prosemirror.net/docs/ref/#model.NodeRange.$from).
      */
    @JSName("$to")
    val $to: ResolvedPos = js.native
    
    /**
      The depth of the node that this range points into.
      */
    val depth: Double = js.native
    
    /**
      The position at the end of the range.
      */
    def end: Double = js.native
    
    /**
      The end index of the range in the parent node.
      */
    def endIndex: Double = js.native
    
    /**
      The parent node that the range points into.
      */
    def parent: Node = js.native
    
    /**
      The position at the start of the range.
      */
    def start: Double = js.native
    
    /**
      The start index of the range in the parent node.
      */
    def startIndex: Double = js.native
  }
  
  /**
  Node types are objects allocated once per `Schema` and used to
  [tag](https://prosemirror.net/docs/ref/#model.Node.type) `Node` instances. They contain information
  about the node type, such as its name and what kind of node it
  represents.
  */
  @JSImport("prosemirror-model", "NodeType")
  @js.native
  open class NodeType () extends StObject {
    
    /**
      Removes the marks that are not allowed in this node from the given set.
      */
    def allowedMarks(marks: js.Array[Mark]): js.Array[Mark] = js.native
    
    /**
      Check whether the given mark type is allowed in this node.
      */
    def allowsMarkType(markType: MarkType): Boolean = js.native
    
    /**
      Test whether the given set of marks are allowed in this node.
      */
    def allowsMarks(marks: js.Array[Mark]): Boolean = js.native
    
    /**
      Indicates whether this node allows some of the same content as
      the given node type.
      */
    def compatibleContent(other: NodeType): Boolean = js.native
    
    /**
      The starting match of the node type's content expression.
      */
    var contentMatch: ContentMatch = js.native
    
    /**
      Create a `Node` of this type. The given attributes are
      checked and defaulted (you can pass `null` to use the type's
      defaults entirely, if no required attributes exist). `content`
      may be a `Fragment`, a node, an array of nodes, or
      `null`. Similarly `marks` may be `null` to default to the empty
      set of marks.
      */
    def create(): Node = js.native
    def create(attrs: Null, content: js.Array[Node]): Node = js.native
    def create(attrs: Null, content: js.Array[Node], marks: js.Array[Mark]): Node = js.native
    def create(attrs: Null, content: Null, marks: js.Array[Mark]): Node = js.native
    def create(attrs: Null, content: Unit, marks: js.Array[Mark]): Node = js.native
    def create(attrs: Null, content: Fragment): Node = js.native
    def create(attrs: Null, content: Fragment, marks: js.Array[Mark]): Node = js.native
    def create(attrs: Null, content: Node): Node = js.native
    def create(attrs: Null, content: Node, marks: js.Array[Mark]): Node = js.native
    def create(attrs: Unit, content: js.Array[Node]): Node = js.native
    def create(attrs: Unit, content: js.Array[Node], marks: js.Array[Mark]): Node = js.native
    def create(attrs: Unit, content: Null, marks: js.Array[Mark]): Node = js.native
    def create(attrs: Unit, content: Unit, marks: js.Array[Mark]): Node = js.native
    def create(attrs: Unit, content: Fragment): Node = js.native
    def create(attrs: Unit, content: Fragment, marks: js.Array[Mark]): Node = js.native
    def create(attrs: Unit, content: Node): Node = js.native
    def create(attrs: Unit, content: Node, marks: js.Array[Mark]): Node = js.native
    def create(attrs: Attrs): Node = js.native
    def create(attrs: Attrs, content: js.Array[Node]): Node = js.native
    def create(attrs: Attrs, content: js.Array[Node], marks: js.Array[Mark]): Node = js.native
    def create(attrs: Attrs, content: Null, marks: js.Array[Mark]): Node = js.native
    def create(attrs: Attrs, content: Unit, marks: js.Array[Mark]): Node = js.native
    def create(attrs: Attrs, content: Fragment): Node = js.native
    def create(attrs: Attrs, content: Fragment, marks: js.Array[Mark]): Node = js.native
    def create(attrs: Attrs, content: Node): Node = js.native
    def create(attrs: Attrs, content: Node, marks: js.Array[Mark]): Node = js.native
    
    /**
      Like [`create`](https://prosemirror.net/docs/ref/#model.NodeType.create), but see if it is
      necessary to add nodes to the start or end of the given fragment
      to make it fit the node. If no fitting wrapping can be found,
      return null. Note that, due to the fact that required nodes can
      always be created, this will always succeed if you pass null or
      `Fragment.empty` as content.
      */
    def createAndFill(): Node | Null = js.native
    def createAndFill(attrs: Null, content: js.Array[Node]): Node | Null = js.native
    def createAndFill(attrs: Null, content: js.Array[Node], marks: js.Array[Mark]): Node | Null = js.native
    def createAndFill(attrs: Null, content: Null, marks: js.Array[Mark]): Node | Null = js.native
    def createAndFill(attrs: Null, content: Unit, marks: js.Array[Mark]): Node | Null = js.native
    def createAndFill(attrs: Null, content: Fragment): Node | Null = js.native
    def createAndFill(attrs: Null, content: Fragment, marks: js.Array[Mark]): Node | Null = js.native
    def createAndFill(attrs: Null, content: Node): Node | Null = js.native
    def createAndFill(attrs: Null, content: Node, marks: js.Array[Mark]): Node | Null = js.native
    def createAndFill(attrs: Unit, content: js.Array[Node]): Node | Null = js.native
    def createAndFill(attrs: Unit, content: js.Array[Node], marks: js.Array[Mark]): Node | Null = js.native
    def createAndFill(attrs: Unit, content: Null, marks: js.Array[Mark]): Node | Null = js.native
    def createAndFill(attrs: Unit, content: Unit, marks: js.Array[Mark]): Node | Null = js.native
    def createAndFill(attrs: Unit, content: Fragment): Node | Null = js.native
    def createAndFill(attrs: Unit, content: Fragment, marks: js.Array[Mark]): Node | Null = js.native
    def createAndFill(attrs: Unit, content: Node): Node | Null = js.native
    def createAndFill(attrs: Unit, content: Node, marks: js.Array[Mark]): Node | Null = js.native
    def createAndFill(attrs: Attrs): Node | Null = js.native
    def createAndFill(attrs: Attrs, content: js.Array[Node]): Node | Null = js.native
    def createAndFill(attrs: Attrs, content: js.Array[Node], marks: js.Array[Mark]): Node | Null = js.native
    def createAndFill(attrs: Attrs, content: Null, marks: js.Array[Mark]): Node | Null = js.native
    def createAndFill(attrs: Attrs, content: Unit, marks: js.Array[Mark]): Node | Null = js.native
    def createAndFill(attrs: Attrs, content: Fragment): Node | Null = js.native
    def createAndFill(attrs: Attrs, content: Fragment, marks: js.Array[Mark]): Node | Null = js.native
    def createAndFill(attrs: Attrs, content: Node): Node | Null = js.native
    def createAndFill(attrs: Attrs, content: Node, marks: js.Array[Mark]): Node | Null = js.native
    
    /**
      Like [`create`](https://prosemirror.net/docs/ref/#model.NodeType.create), but check the given content
      against the node type's content restrictions, and throw an error
      if it doesn't match.
      */
    def createChecked(): Node = js.native
    def createChecked(attrs: Null, content: js.Array[Node]): Node = js.native
    def createChecked(attrs: Null, content: js.Array[Node], marks: js.Array[Mark]): Node = js.native
    def createChecked(attrs: Null, content: Null, marks: js.Array[Mark]): Node = js.native
    def createChecked(attrs: Null, content: Unit, marks: js.Array[Mark]): Node = js.native
    def createChecked(attrs: Null, content: Fragment): Node = js.native
    def createChecked(attrs: Null, content: Fragment, marks: js.Array[Mark]): Node = js.native
    def createChecked(attrs: Null, content: Node): Node = js.native
    def createChecked(attrs: Null, content: Node, marks: js.Array[Mark]): Node = js.native
    def createChecked(attrs: Unit, content: js.Array[Node]): Node = js.native
    def createChecked(attrs: Unit, content: js.Array[Node], marks: js.Array[Mark]): Node = js.native
    def createChecked(attrs: Unit, content: Null, marks: js.Array[Mark]): Node = js.native
    def createChecked(attrs: Unit, content: Unit, marks: js.Array[Mark]): Node = js.native
    def createChecked(attrs: Unit, content: Fragment): Node = js.native
    def createChecked(attrs: Unit, content: Fragment, marks: js.Array[Mark]): Node = js.native
    def createChecked(attrs: Unit, content: Node): Node = js.native
    def createChecked(attrs: Unit, content: Node, marks: js.Array[Mark]): Node = js.native
    def createChecked(attrs: Attrs): Node = js.native
    def createChecked(attrs: Attrs, content: js.Array[Node]): Node = js.native
    def createChecked(attrs: Attrs, content: js.Array[Node], marks: js.Array[Mark]): Node = js.native
    def createChecked(attrs: Attrs, content: Null, marks: js.Array[Mark]): Node = js.native
    def createChecked(attrs: Attrs, content: Unit, marks: js.Array[Mark]): Node = js.native
    def createChecked(attrs: Attrs, content: Fragment): Node = js.native
    def createChecked(attrs: Attrs, content: Fragment, marks: js.Array[Mark]): Node = js.native
    def createChecked(attrs: Attrs, content: Node): Node = js.native
    def createChecked(attrs: Attrs, content: Node, marks: js.Array[Mark]): Node = js.native
    
    /**
      Tells you whether this node type has any required attributes.
      */
    def hasRequiredAttrs(): Boolean = js.native
    
    /**
      True if this node type has inline content.
      */
    var inlineContent: Boolean = js.native
    
    /**
      True when this node is an atom, i.e. when it does not have
      directly editable content.
      */
    def isAtom: Boolean = js.native
    
    /**
      True if this is a block type
      */
    var isBlock: Boolean = js.native
    
    /**
      True if this is an inline type.
      */
    def isInline: Boolean = js.native
    
    /**
      True for node types that allow no content.
      */
    def isLeaf: Boolean = js.native
    
    /**
      True if this is the text node type.
      */
    var isText: Boolean = js.native
    
    /**
      True if this is a textblock type, a block that contains inline
      content.
      */
    def isTextblock: Boolean = js.native
    
    /**
      The set of marks allowed in this node. `null` means all marks
      are allowed.
      */
    var markSet: js.Array[MarkType] | Null = js.native
    
    /**
      The name the node type has in this schema.
      */
    val name: String = js.native
    
    /**
      A link back to the `Schema` the node type belongs to.
      */
    val schema: Schema[Any, Any] = js.native
    
    /**
      The spec that this type is based on
      */
    val spec: NodeSpec = js.native
    
    /**
      Returns true if the given fragment is valid content for this node
      type with the given attributes.
      */
    def validContent(content: Fragment): Boolean = js.native
    
    /**
      The node type's [whitespace](https://prosemirror.net/docs/ref/#model.NodeSpec.whitespace) option.
      */
    def whitespace: pre | normal = js.native
  }
  
  /**
  Error type raised by [`Node.replace`](https://prosemirror.net/docs/ref/#model.Node.replace) when
  given an invalid replacement.
  */
  @JSImport("prosemirror-model", "ReplaceError")
  @js.native
  open class ReplaceError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /**
  You can [_resolve_](https://prosemirror.net/docs/ref/#model.Node.resolve) a position to get more
  information about it. Objects of this class represent such a
  resolved position, providing various pieces of context
  information, and some helper methods.
  Throughout this interface, methods that take an optional `depth`
  parameter will interpret undefined as `this.depth` and negative
  numbers as `this.depth + value`.
  */
  @JSImport("prosemirror-model", "ResolvedPos")
  @js.native
  open class ResolvedPos () extends StObject {
    
    /**
      The (absolute) position directly after the wrapping node at the
      given level, or the original position when `depth` is `this.depth + 1`.
      */
    def after(): Double = js.native
    def after(depth: Double): Double = js.native
    
    /**
      The (absolute) position directly before the wrapping node at the
      given level, or, when `depth` is `this.depth + 1`, the original
      position.
      */
    def before(): Double = js.native
    def before(depth: Double): Double = js.native
    
    /**
      Returns a range based on the place where this position and the
      given position diverge around block content. If both point into
      the same textblock, for example, a range around that textblock
      will be returned. If they point into different blocks, the range
      around those blocks in their shared ancestor is returned. You can
      pass in an optional predicate that will be called with a parent
      node to see if a range into that parent is acceptable.
      */
    def blockRange(): NodeRange | Null = js.native
    def blockRange(other: Unit, pred: js.Function1[/* node */ Node, Boolean]): NodeRange | Null = js.native
    def blockRange(other: ResolvedPos): NodeRange | Null = js.native
    def blockRange(other: ResolvedPos, pred: js.Function1[/* node */ Node, Boolean]): NodeRange | Null = js.native
    
    /**
      The number of levels the parent node is from the root. If this
      position points directly into the root node, it is 0. If it
      points into a top-level paragraph, 1, and so on.
      */
    var depth: Double = js.native
    
    /**
      The root node in which the position was resolved.
      */
    def doc: Node = js.native
    
    /**
      The (absolute) position at the end of the node at the given
      level.
      */
    def end(): Double = js.native
    def end(depth: Double): Double = js.native
    
    /**
      The index into the ancestor at the given level. If this points
      at the 3rd node in the 2nd paragraph on the top level, for
      example, `p.index(0)` is 1 and `p.index(1)` is 2.
      */
    def index(): Double = js.native
    def index(depth: Double): Double = js.native
    
    /**
      The index pointing after this position into the ancestor at the
      given level.
      */
    def indexAfter(): Double = js.native
    def indexAfter(depth: Double): Double = js.native
    
    /**
      Get the marks at this position, factoring in the surrounding
      marks' [`inclusive`](https://prosemirror.net/docs/ref/#model.MarkSpec.inclusive) property. If the
      position is at the start of a non-empty node, the marks of the
      node after it (if any) are returned.
      */
    def marks(): js.Array[Mark] = js.native
    
    /**
      Get the marks after the current position, if any, except those
      that are non-inclusive and not present at position `$end`. This
      is mostly useful for getting the set of marks to preserve after a
      deletion. Will return `null` if this position is at the end of
      its parent node or its parent node isn't a textblock (in which
      case no marks should be preserved).
      */
    def marksAcross($end: ResolvedPos): js.Array[Mark] | Null = js.native
    
    /**
      Return the greater of this and the given position.
      */
    def max(other: ResolvedPos): ResolvedPos = js.native
    
    /**
      Return the smaller of this and the given position.
      */
    def min(other: ResolvedPos): ResolvedPos = js.native
    
    /**
      The ancestor node at the given level. `p.node(p.depth)` is the
      same as `p.parent`.
      */
    def node(): Node = js.native
    def node(depth: Double): Node = js.native
    
    /**
      Get the node directly after the position, if any. If the position
      points into a text node, only the part of that node after the
      position is returned.
      */
    def nodeAfter: Node | Null = js.native
    
    /**
      Get the node directly before the position, if any. If the
      position points into a text node, only the part of that node
      before the position is returned.
      */
    def nodeBefore: Node | Null = js.native
    
    /**
      The parent node that the position points into. Note that even if
      a position points into a text node, that node is not considered
      the parent—text nodes are ‘flat’ in this model, and have no content.
      */
    def parent: Node = js.native
    
    /**
      The offset this position has into its parent node.
      */
    val parentOffset: Double = js.native
    
    /**
      The position that was resolved.
      */
    val pos: Double = js.native
    
    /**
      Get the position at the given index in the parent node at the
      given depth (which defaults to `this.depth`).
      */
    def posAtIndex(index: Double): Double = js.native
    def posAtIndex(index: Double, depth: Double): Double = js.native
    
    /**
      Query whether the given position shares the same parent node.
      */
    def sameParent(other: ResolvedPos): Boolean = js.native
    
    /**
      The depth up to which this position and the given (non-resolved)
      position share the same parent nodes.
      */
    def sharedDepth(pos: Double): Double = js.native
    
    /**
      The (absolute) position at the start of the node at the given
      level.
      */
    def start(): Double = js.native
    def start(depth: Double): Double = js.native
    
    /**
      When this position points into a text node, this returns the
      distance between the position and the start of the text node.
      Will be zero for positions that point between nodes.
      */
    def textOffset: Double = js.native
  }
  
  /**
  A document schema. Holds [node](https://prosemirror.net/docs/ref/#model.NodeType) and [mark
  type](https://prosemirror.net/docs/ref/#model.MarkType) objects for the nodes and marks that may
  occur in conforming documents, and provides functionality for
  creating and deserializing such documents.
  When given, the type parameters provide the names of the nodes and
  marks in this schema.
  */
  @JSImport("prosemirror-model", "Schema")
  @js.native
  open class Schema[Nodes /* <: String */, Marks /* <: String */] protected () extends StObject {
    /**
      Construct a schema from a schema [specification](https://prosemirror.net/docs/ref/#model.SchemaSpec).
      */
    def this(spec: SchemaSpec[Nodes, Marks]) = this()
    
    /**
      An object for storing whatever values modules may want to
      compute and cache per schema. (If you want to store something
      in it, try to use property names unlikely to clash.)
      */
    var cached: StringDictionary[Any] = js.native
    
    /**
      Create a mark with the given type and attributes.
      */
    def mark(`type`: String): Mark = js.native
    def mark(`type`: String, attrs: Attrs): Mark = js.native
    def mark(`type`: MarkType): Mark = js.native
    def mark(`type`: MarkType, attrs: Attrs): Mark = js.native
    
    /**
      Deserialize a mark from its JSON representation. This method is
      bound.
      */
    def markFromJSON(json: Any): Mark = js.native
    
    /**
      A map from mark names to mark type objects.
      */
    var marks: typings.prosemirrorModel.prosemirrorModelStrings.Schema & TopLevel[Any] & StringDictionary[MarkType] = js.native
    
    /**
      Create a node in this schema. The `type` may be a string or a
      `NodeType` instance. Attributes will be extended with defaults,
      `content` may be a `Fragment`, `null`, a `Node`, or an array of
      nodes.
      */
    def node(`type`: String): Node = js.native
    def node(`type`: String, attrs: Null, content: js.Array[Node]): Node = js.native
    def node(`type`: String, attrs: Null, content: js.Array[Node], marks: js.Array[Mark]): Node = js.native
    def node(`type`: String, attrs: Null, content: Unit, marks: js.Array[Mark]): Node = js.native
    def node(`type`: String, attrs: Null, content: Fragment): Node = js.native
    def node(`type`: String, attrs: Null, content: Fragment, marks: js.Array[Mark]): Node = js.native
    def node(`type`: String, attrs: Null, content: Node): Node = js.native
    def node(`type`: String, attrs: Null, content: Node, marks: js.Array[Mark]): Node = js.native
    def node(`type`: String, attrs: Unit, content: js.Array[Node]): Node = js.native
    def node(`type`: String, attrs: Unit, content: js.Array[Node], marks: js.Array[Mark]): Node = js.native
    def node(`type`: String, attrs: Unit, content: Unit, marks: js.Array[Mark]): Node = js.native
    def node(`type`: String, attrs: Unit, content: Fragment): Node = js.native
    def node(`type`: String, attrs: Unit, content: Fragment, marks: js.Array[Mark]): Node = js.native
    def node(`type`: String, attrs: Unit, content: Node): Node = js.native
    def node(`type`: String, attrs: Unit, content: Node, marks: js.Array[Mark]): Node = js.native
    def node(`type`: String, attrs: Attrs): Node = js.native
    def node(`type`: String, attrs: Attrs, content: js.Array[Node]): Node = js.native
    def node(`type`: String, attrs: Attrs, content: js.Array[Node], marks: js.Array[Mark]): Node = js.native
    def node(`type`: String, attrs: Attrs, content: Unit, marks: js.Array[Mark]): Node = js.native
    def node(`type`: String, attrs: Attrs, content: Fragment): Node = js.native
    def node(`type`: String, attrs: Attrs, content: Fragment, marks: js.Array[Mark]): Node = js.native
    def node(`type`: String, attrs: Attrs, content: Node): Node = js.native
    def node(`type`: String, attrs: Attrs, content: Node, marks: js.Array[Mark]): Node = js.native
    def node(`type`: NodeType): Node = js.native
    def node(`type`: NodeType, attrs: Null, content: js.Array[Node]): Node = js.native
    def node(`type`: NodeType, attrs: Null, content: js.Array[Node], marks: js.Array[Mark]): Node = js.native
    def node(`type`: NodeType, attrs: Null, content: Unit, marks: js.Array[Mark]): Node = js.native
    def node(`type`: NodeType, attrs: Null, content: Fragment): Node = js.native
    def node(`type`: NodeType, attrs: Null, content: Fragment, marks: js.Array[Mark]): Node = js.native
    def node(`type`: NodeType, attrs: Null, content: Node): Node = js.native
    def node(`type`: NodeType, attrs: Null, content: Node, marks: js.Array[Mark]): Node = js.native
    def node(`type`: NodeType, attrs: Unit, content: js.Array[Node]): Node = js.native
    def node(`type`: NodeType, attrs: Unit, content: js.Array[Node], marks: js.Array[Mark]): Node = js.native
    def node(`type`: NodeType, attrs: Unit, content: Unit, marks: js.Array[Mark]): Node = js.native
    def node(`type`: NodeType, attrs: Unit, content: Fragment): Node = js.native
    def node(`type`: NodeType, attrs: Unit, content: Fragment, marks: js.Array[Mark]): Node = js.native
    def node(`type`: NodeType, attrs: Unit, content: Node): Node = js.native
    def node(`type`: NodeType, attrs: Unit, content: Node, marks: js.Array[Mark]): Node = js.native
    def node(`type`: NodeType, attrs: Attrs): Node = js.native
    def node(`type`: NodeType, attrs: Attrs, content: js.Array[Node]): Node = js.native
    def node(`type`: NodeType, attrs: Attrs, content: js.Array[Node], marks: js.Array[Mark]): Node = js.native
    def node(`type`: NodeType, attrs: Attrs, content: Unit, marks: js.Array[Mark]): Node = js.native
    def node(`type`: NodeType, attrs: Attrs, content: Fragment): Node = js.native
    def node(`type`: NodeType, attrs: Attrs, content: Fragment, marks: js.Array[Mark]): Node = js.native
    def node(`type`: NodeType, attrs: Attrs, content: Node): Node = js.native
    def node(`type`: NodeType, attrs: Attrs, content: Node, marks: js.Array[Mark]): Node = js.native
    
    /**
      Deserialize a node from its JSON representation. This method is
      bound.
      */
    def nodeFromJSON(json: Any): Node = js.native
    
    /**
      An object mapping the schema's node names to node type objects.
      */
    var nodes: typings.prosemirrorModel.prosemirrorModelStrings.Schema & TopLevel[Any] & StringDictionary[NodeType] = js.native
    
    /**
      The [spec](https://prosemirror.net/docs/ref/#model.SchemaSpec) on which the schema is based,
      with the added guarantee that its `nodes` and `marks`
      properties are
      [`OrderedMap`](https://github.com/marijnh/orderedmap) instances
      (not raw objects).
      */
    var spec: typings.prosemirrorModel.anon.Marks = js.native
    
    /**
      Create a text node in the schema. Empty text nodes are not
      allowed.
      */
    def text(text: String): Node = js.native
    def text(text: String, marks: js.Array[Mark]): Node = js.native
    
    /**
      The type of the [default top node](https://prosemirror.net/docs/ref/#model.SchemaSpec.topNode)
      for this schema.
      */
    var topNodeType: NodeType = js.native
  }
  
  /**
  A slice represents a piece cut out of a larger document. It
  stores not only a fragment, but also the depth up to which nodes on
  both side are ‘open’ (cut through).
  */
  @JSImport("prosemirror-model", "Slice")
  @js.native
  open class Slice protected () extends StObject {
    /**
      Create a slice. When specifying a non-zero open depth, you must
      make sure that there are nodes of at least that depth at the
      appropriate side of the fragment—i.e. if the fragment is an
      empty paragraph node, `openStart` and `openEnd` can't be greater
      than 1.
      
      It is not necessary for the content of open nodes to conform to
      the schema's content constraints, though it should be a valid
      start/end/middle for such a node, depending on which sides are
      open.
      */
    def this(
      /**
      The slice's content.
      */
    content: Fragment,
      /**
      The open depth at the start of the fragment.
      */
    openStart: Double,
      /**
      The open depth at the end.
      */
    openEnd: Double
    ) = this()
    
    /**
      The slice's content.
      */
    val content: Fragment = js.native
    
    /**
      Tests whether this slice is equal to another slice.
      */
    def eq(other: Slice): Boolean = js.native
    
    /**
      The open depth at the end.
      */
    val openEnd: Double = js.native
    
    /**
      The open depth at the start of the fragment.
      */
    val openStart: Double = js.native
    
    /**
      The size this slice would add when inserted into a document.
      */
    def size: Double = js.native
    
    /**
      Convert a slice to a JSON-serializable representation.
      */
    def toJSON(): Any = js.native
  }
  object Slice {
    
    @JSImport("prosemirror-model", "Slice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      The empty slice.
      */
    /* static member */
    @JSImport("prosemirror-model", "Slice.empty")
    @js.native
    def empty: Slice = js.native
    inline def empty_=(x: Slice): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
    
    /**
      Deserialize a slice from its JSON representation.
      */
    /* static member */
    inline def fromJSON(schema: Schema[Any, Any], json: Any): Slice = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(schema.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Slice]
    
    /**
      Create a slice from a fragment by taking the maximum possible
      open value on both side of the fragment.
      */
    /* static member */
    inline def maxOpen(fragment: Fragment): Slice = ^.asInstanceOf[js.Dynamic].applyDynamic("maxOpen")(fragment.asInstanceOf[js.Any]).asInstanceOf[Slice]
    inline def maxOpen(fragment: Fragment, openIsolating: Boolean): Slice = (^.asInstanceOf[js.Dynamic].applyDynamic("maxOpen")(fragment.asInstanceOf[js.Any], openIsolating.asInstanceOf[js.Any])).asInstanceOf[Slice]
  }
  
  /**
  Used to [define](https://prosemirror.net/docs/ref/#model.NodeSpec.attrs) attributes on nodes or
  marks.
  */
  trait AttributeSpec extends StObject {
    
    /**
      The default value for this attribute, to use when no explicit
      value is provided. Attributes that have no default must be
      provided whenever a node or mark of a type that has them is
      created.
      */
    var default: js.UndefOr[Any] = js.undefined
  }
  object AttributeSpec {
    
    inline def apply(): AttributeSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributeSpec]
    }
    
    extension [Self <: AttributeSpec](x: Self) {
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
  
  /**
  An object holding the attributes of a node.
  */
  type Attrs = StringDictionary[Any]
  
  type DOMNode = InstanceType[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.Node */ Any
  ]
  
  /**
  A description of a DOM structure. Can be either a string, which is
  interpreted as a text node, a DOM node, which is interpreted as
  itself, a `{dom, contentDOM}` object, or an array.
  An array describes a DOM element. The first value in the array
  should be a string—the name of the DOM element, optionally prefixed
  by a namespace URL and a space. If the second element is plain
  object, it is interpreted as a set of attributes for the element.
  Any elements after that (including the 2nd if it's not an attribute
  object) are interpreted as children of the DOM elements, and must
  either be valid `DOMOutputSpec` values, or the number zero.
  The number zero (pronounced “hole”) is used to indicate the place
  where a node's child nodes should be inserted. If it occurs in an
  output spec, it should be the only child element in its parent
  node.
  */
  type DOMOutputSpec = String | DOMNode | ContentDOM | (/* import warning: importer.ImportType#apply c repeated non-array type: any */ js.Array[Any])
  
  /**
  Used to define marks when creating a schema.
  */
  trait MarkSpec
    extends StObject
       with /**
    Node specs may include arbitrary properties that can be read by
    other code via [`NodeType.spec`](https://prosemirror.net/docs/ref/#model.NodeType.spec).
    */
  /* key */ StringDictionary[Any] {
    
    /**
      The attributes that marks of this type get.
      */
    var attrs: js.UndefOr[StringDictionary[AttributeSpec]] = js.undefined
    
    /**
      Determines which other marks this mark can coexist with. Should
      be a space-separated strings naming other marks or groups of marks.
      When a mark is [added](https://prosemirror.net/docs/ref/#model.Mark.addToSet) to a set, all marks
      that it excludes are removed in the process. If the set contains
      any mark that excludes the new mark but is not, itself, excluded
      by the new mark, the mark can not be added an the set. You can
      use the value `"_"` to indicate that the mark excludes all
      marks in the schema.
      
      Defaults to only being exclusive with marks of the same type. You
      can set it to an empty string (or any string not containing the
      mark's own name) to allow multiple marks of a given type to
      coexist (as long as they have different attributes).
      */
    var excludes: js.UndefOr[String] = js.undefined
    
    /**
      The group or space-separated groups to which this mark belongs.
      */
    var group: js.UndefOr[String] = js.undefined
    
    /**
      Whether this mark should be active when the cursor is positioned
      at its end (or at its start when that is also the start of the
      parent node). Defaults to true.
      */
    var inclusive: js.UndefOr[Boolean] = js.undefined
    
    /**
      Associates DOM parser information with this mark (see the
      corresponding [node spec field](https://prosemirror.net/docs/ref/#model.NodeSpec.parseDOM)). The
      `mark` field in the rules is implied.
      */
    var parseDOM: js.UndefOr[js.Array[ParseRule]] = js.undefined
    
    /**
      Determines whether marks of this type can span multiple adjacent
      nodes when serialized to DOM/HTML. Defaults to true.
      */
    var spanning: js.UndefOr[Boolean] = js.undefined
    
    /**
      Defines the default way marks of this type should be serialized
      to DOM/HTML. When the resulting spec contains a hole, that is
      where the marked content is placed. Otherwise, it is appended to
      the top node.
      */
    var toDOM: js.UndefOr[js.Function2[/* mark */ Mark, /* inline */ Boolean, DOMOutputSpec]] = js.undefined
  }
  object MarkSpec {
    
    inline def apply(): MarkSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkSpec]
    }
    
    extension [Self <: MarkSpec](x: Self) {
      
      inline def setAttrs(value: StringDictionary[AttributeSpec]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setExcludes(value: String): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      inline def setInclusiveUndefined: Self = StObject.set(x, "inclusive", js.undefined)
      
      inline def setParseDOM(value: js.Array[ParseRule]): Self = StObject.set(x, "parseDOM", value.asInstanceOf[js.Any])
      
      inline def setParseDOMUndefined: Self = StObject.set(x, "parseDOM", js.undefined)
      
      inline def setParseDOMVarargs(value: ParseRule*): Self = StObject.set(x, "parseDOM", js.Array(value*))
      
      inline def setSpanning(value: Boolean): Self = StObject.set(x, "spanning", value.asInstanceOf[js.Any])
      
      inline def setSpanningUndefined: Self = StObject.set(x, "spanning", js.undefined)
      
      inline def setToDOM(value: (/* mark */ Mark, /* inline */ Boolean) => DOMOutputSpec): Self = StObject.set(x, "toDOM", js.Any.fromFunction2(value))
      
      inline def setToDOMUndefined: Self = StObject.set(x, "toDOM", js.undefined)
    }
  }
  
  trait MatchEdge extends StObject {
    
    var next: ContentMatch
    
    var `type`: NodeType
  }
  object MatchEdge {
    
    inline def apply(next: ContentMatch, `type`: NodeType): MatchEdge = {
      val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchEdge]
    }
    
    extension [Self <: MatchEdge](x: Self) {
      
      inline def setNext(value: ContentMatch): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  A description of a node type, used when defining a schema.
  */
  trait NodeSpec
    extends StObject
       with /**
    Node specs may include arbitrary properties that can be read by
    other code via [`NodeType.spec`](https://prosemirror.net/docs/ref/#model.NodeType.spec).
    */
  /* key */ StringDictionary[Any] {
    
    /**
      Can be set to true to indicate that, though this isn't a [leaf
      node](https://prosemirror.net/docs/ref/#model.NodeType.isLeaf), it doesn't have directly editable
      content and should be treated as a single unit in the view.
      */
    var atom: js.UndefOr[Boolean] = js.undefined
    
    /**
      The attributes that nodes of this type get.
      */
    var attrs: js.UndefOr[StringDictionary[AttributeSpec]] = js.undefined
    
    /**
      Can be used to indicate that this node contains code, which
      causes some commands to behave differently.
      */
    var code: js.UndefOr[Boolean] = js.undefined
    
    /**
      The content expression for this node, as described in the [schema
      guide](/docs/guide/#schema.content_expressions). When not given,
      the node does not allow any content.
      */
    var content: js.UndefOr[String] = js.undefined
    
    /**
      When enabled, enables both
      [`definingAsContext`](https://prosemirror.net/docs/ref/#model.NodeSpec.definingAsContext) and
      [`definingForContent`](https://prosemirror.net/docs/ref/#model.NodeSpec.definingForContent).
      */
    var defining: js.UndefOr[Boolean] = js.undefined
    
    /**
      Determines whether this node is considered an important parent
      node during replace operations (such as paste). Non-defining (the
      default) nodes get dropped when their entire content is replaced,
      whereas defining nodes persist and wrap the inserted content.
      */
    var definingAsContext: js.UndefOr[Boolean] = js.undefined
    
    /**
      In inserted content the defining parents of the content are
      preserved when possible. Typically, non-default-paragraph
      textblock types, and possibly list items, are marked as defining.
      */
    var definingForContent: js.UndefOr[Boolean] = js.undefined
    
    /**
      Determines whether nodes of this type can be dragged without
      being selected. Defaults to false.
      */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    /**
      The group or space-separated groups to which this node belongs,
      which can be referred to in the content expressions for the
      schema.
      */
    var group: js.UndefOr[String] = js.undefined
    
    /**
      Should be set to true for inline nodes. (Implied for text nodes.)
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      When enabled (default is false), the sides of nodes of this type
      count as boundaries that regular editing operations, like
      backspacing or lifting, won't cross. An example of a node that
      should probably have this enabled is a table cell.
      */
    var isolating: js.UndefOr[Boolean] = js.undefined
    
    /**
      Defines the default way a [leaf node](https://prosemirror.net/docs/ref/#model.NodeType.isLeaf) of
      this type should be serialized to a string (as used by
      [`Node.textBetween`](https://prosemirror.net/docs/ref/#model.Node^textBetween) and
      [`Node.textContent`](https://prosemirror.net/docs/ref/#model.Node^textContent)).
      */
    var leafText: js.UndefOr[js.Function1[/* node */ Node, String]] = js.undefined
    
    /**
      The marks that are allowed inside of this node. May be a
      space-separated string referring to mark names or groups, `"_"`
      to explicitly allow all marks, or `""` to disallow marks. When
      not given, nodes with inline content default to allowing all
      marks, other nodes default to not allowing marks.
      */
    var marks: js.UndefOr[String] = js.undefined
    
    /**
      Associates DOM parser information with this node, which can be
      used by [`DOMParser.fromSchema`](https://prosemirror.net/docs/ref/#model.DOMParser^fromSchema) to
      automatically derive a parser. The `node` field in the rules is
      implied (the name of this node will be filled in automatically).
      If you supply your own parser, you do not need to also specify
      parsing rules in your schema.
      */
    var parseDOM: js.UndefOr[js.Array[ParseRule]] = js.undefined
    
    /**
      Controls whether nodes of this type can be selected as a [node
      selection](https://prosemirror.net/docs/ref/#state.NodeSelection). Defaults to true for non-text
      nodes.
      */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      Defines the default way a node of this type should be serialized
      to DOM/HTML (as used by
      [`DOMSerializer.fromSchema`](https://prosemirror.net/docs/ref/#model.DOMSerializer^fromSchema)).
      Should return a DOM node or an [array
      structure](https://prosemirror.net/docs/ref/#model.DOMOutputSpec) that describes one, with an
      optional number zero (“hole”) in it to indicate where the node's
      content should be inserted.
      
      For text nodes, the default is to create a text DOM node. Though
      it is possible to create a serializer where text is rendered
      differently, this is not supported inside the editor, so you
      shouldn't override that in your text node spec.
      */
    var toDOM: js.UndefOr[js.Function1[/* node */ Node, DOMOutputSpec]] = js.undefined
    
    /**
      Defines the default way a node of this type should be serialized
      to a string representation for debugging (e.g. in error messages).
      */
    var toDebugString: js.UndefOr[js.Function1[/* node */ Node, String]] = js.undefined
    
    /**
      Controls way whitespace in this a node is parsed. The default is
      `"normal"`, which causes the [DOM parser](https://prosemirror.net/docs/ref/#model.DOMParser) to
      collapse whitespace in normal mode, and normalize it (replacing
      newlines and such with spaces) otherwise. `"pre"` causes the
      parser to preserve spaces inside the node. When this option isn't
      given, but [`code`](https://prosemirror.net/docs/ref/#model.NodeSpec.code) is true, `whitespace`
      will default to `"pre"`. Note that this option doesn't influence
      the way the node is rendered—that should be handled by `toDOM`
      and/or styling.
      */
    var whitespace: js.UndefOr[pre | normal] = js.undefined
  }
  object NodeSpec {
    
    inline def apply(): NodeSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeSpec]
    }
    
    extension [Self <: NodeSpec](x: Self) {
      
      inline def setAtom(value: Boolean): Self = StObject.set(x, "atom", value.asInstanceOf[js.Any])
      
      inline def setAtomUndefined: Self = StObject.set(x, "atom", js.undefined)
      
      inline def setAttrs(value: StringDictionary[AttributeSpec]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDefining(value: Boolean): Self = StObject.set(x, "defining", value.asInstanceOf[js.Any])
      
      inline def setDefiningAsContext(value: Boolean): Self = StObject.set(x, "definingAsContext", value.asInstanceOf[js.Any])
      
      inline def setDefiningAsContextUndefined: Self = StObject.set(x, "definingAsContext", js.undefined)
      
      inline def setDefiningForContent(value: Boolean): Self = StObject.set(x, "definingForContent", value.asInstanceOf[js.Any])
      
      inline def setDefiningForContentUndefined: Self = StObject.set(x, "definingForContent", js.undefined)
      
      inline def setDefiningUndefined: Self = StObject.set(x, "defining", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setIsolating(value: Boolean): Self = StObject.set(x, "isolating", value.asInstanceOf[js.Any])
      
      inline def setIsolatingUndefined: Self = StObject.set(x, "isolating", js.undefined)
      
      inline def setLeafText(value: /* node */ Node => String): Self = StObject.set(x, "leafText", js.Any.fromFunction1(value))
      
      inline def setLeafTextUndefined: Self = StObject.set(x, "leafText", js.undefined)
      
      inline def setMarks(value: String): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      inline def setParseDOM(value: js.Array[ParseRule]): Self = StObject.set(x, "parseDOM", value.asInstanceOf[js.Any])
      
      inline def setParseDOMUndefined: Self = StObject.set(x, "parseDOM", js.undefined)
      
      inline def setParseDOMVarargs(value: ParseRule*): Self = StObject.set(x, "parseDOM", js.Array(value*))
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setToDOM(value: /* node */ Node => DOMOutputSpec): Self = StObject.set(x, "toDOM", js.Any.fromFunction1(value))
      
      inline def setToDOMUndefined: Self = StObject.set(x, "toDOM", js.undefined)
      
      inline def setToDebugString(value: /* node */ Node => String): Self = StObject.set(x, "toDebugString", js.Any.fromFunction1(value))
      
      inline def setToDebugStringUndefined: Self = StObject.set(x, "toDebugString", js.undefined)
      
      inline def setWhitespace(value: pre | normal): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
      
      inline def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
    }
  }
  
  /**
  These are the options recognized by the
  [`parse`](https://prosemirror.net/docs/ref/#model.DOMParser.parse) and
  [`parseSlice`](https://prosemirror.net/docs/ref/#model.DOMParser.parseSlice) methods.
  */
  trait ParseOptions extends StObject {
    
    /**
      A set of additional nodes to count as
      [context](https://prosemirror.net/docs/ref/#model.ParseRule.context) when parsing, above the
      given [top node](https://prosemirror.net/docs/ref/#model.ParseOptions.topNode).
      */
    var context: js.UndefOr[ResolvedPos] = js.undefined
    
    /**
      When given, the parser will, beside parsing the content,
      record the document positions of the given DOM positions. It
      will do so by writing to the objects, adding a `pos` property
      that holds the document position. DOM positions that are not
      in the parsed content will not be written to.
      */
    var findPositions: js.UndefOr[js.Array[Offset]] = js.undefined
    
    /**
      The child node index to start parsing from.
      */
    var from: js.UndefOr[Double] = js.undefined
    
    /**
      By default, whitespace is collapsed as per HTML's rules. Pass
      `true` to preserve whitespace, but normalize newlines to
      spaces, and `"full"` to preserve whitespace entirely.
      */
    var preserveWhitespace: js.UndefOr[Boolean | full] = js.undefined
    
    /**
      The child node index to stop parsing at.
      */
    var to: js.UndefOr[Double] = js.undefined
    
    /**
      Provide the starting content match that content parsed into the
      top node is matched against.
      */
    var topMatch: js.UndefOr[ContentMatch] = js.undefined
    
    /**
      By default, the content is parsed into the schema's default
      [top node type](https://prosemirror.net/docs/ref/#model.Schema.topNodeType). You can pass this
      option to use the type and attributes from a different node
      as the top container.
      */
    var topNode: js.UndefOr[Node] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setContext(value: ResolvedPos): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setFindPositions(value: js.Array[Offset]): Self = StObject.set(x, "findPositions", value.asInstanceOf[js.Any])
      
      inline def setFindPositionsUndefined: Self = StObject.set(x, "findPositions", js.undefined)
      
      inline def setFindPositionsVarargs(value: Offset*): Self = StObject.set(x, "findPositions", js.Array(value*))
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setPreserveWhitespace(value: Boolean | full): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
      
      inline def setPreserveWhitespaceUndefined: Self = StObject.set(x, "preserveWhitespace", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setTopMatch(value: ContentMatch): Self = StObject.set(x, "topMatch", value.asInstanceOf[js.Any])
      
      inline def setTopMatchUndefined: Self = StObject.set(x, "topMatch", js.undefined)
      
      inline def setTopNode(value: Node): Self = StObject.set(x, "topNode", value.asInstanceOf[js.Any])
      
      inline def setTopNodeUndefined: Self = StObject.set(x, "topNode", js.undefined)
    }
  }
  
  /**
  A value that describes how to parse a given DOM node or inline
  style as a ProseMirror node or mark.
  */
  trait ParseRule extends StObject {
    
    /**
      Attributes for the node or mark created by this rule. When
      `getAttrs` is provided, it takes precedence.
      */
    var attrs: js.UndefOr[Attrs] = js.undefined
    
    /**
      When true, finding an element that matches this rule will close
      the current node.
      */
    var closeParent: js.UndefOr[Boolean] = js.undefined
    
    /**
      By default, when a rule matches an element or style, no further
      rules get a chance to match it. By setting this to `false`, you
      indicate that even when this rule matches, other rules that come
      after it should also run.
      */
    var consuming: js.UndefOr[Boolean] = js.undefined
    
    /**
      For `tag` rules that produce non-leaf nodes or marks, by default
      the content of the DOM element is parsed as content of the mark
      or node. If the child nodes are in a descendent node, this may be
      a CSS selector string that the parser must use to find the actual
      content element, or a function that returns the actual content
      element to the parser.
      */
    var contentElement: js.UndefOr[String | HTMLElement | (js.Function1[/* node */ DOMNode, HTMLElement])] = js.undefined
    
    /**
      When given, restricts this rule to only match when the current
      context—the parent nodes into which the content is being
      parsed—matches this expression. Should contain one or more node
      names or node group names followed by single or double slashes.
      For example `"paragraph/"` means the rule only matches when the
      parent node is a paragraph, `"blockquote/paragraph/"` restricts
      it to be in a paragraph that is inside a blockquote, and
      `"section//"` matches any position inside a section—a double
      slash matches any sequence of ancestor nodes. To allow multiple
      different contexts, they can be separated by a pipe (`|`)
      character, as in `"blockquote/|list_item/"`.
      */
    var context: js.UndefOr[String] = js.undefined
    
    /**
      A function used to compute the attributes for the node or mark
      created by this rule. Can also be used to describe further
      conditions the DOM element or style must match. When it returns
      `false`, the rule won't match. When it returns null or undefined,
      that is interpreted as an empty/default set of attributes.
      
      Called with a DOM Element for `tag` rules, and with a string (the
      style's value) for `style` rules.
      */
    var getAttrs: js.UndefOr[js.Function1[/* node */ HTMLElement | String, Attrs | `false` | Null]] = js.undefined
    
    /**
      Can be used to override the content of a matched node. When
      present, instead of parsing the node's child nodes, the result of
      this function is used.
      */
    var getContent: js.UndefOr[js.Function2[/* node */ DOMNode, /* schema */ Schema[Any, Any], Fragment]] = js.undefined
    
    /**
      When true, ignore content that matches this rule.
      */
    var ignore: js.UndefOr[Boolean] = js.undefined
    
    /**
      The name of the mark type to wrap the matched content in.
      */
    var mark: js.UndefOr[String] = js.undefined
    
    /**
      The namespace to match. This should be used with `tag`.
      Nodes are only matched when the namespace matches or this property
      is null.
      */
    var namespace: js.UndefOr[String] = js.undefined
    
    /**
      The name of the node type to create when this rule matches. Only
      valid for rules with a `tag` property, not for style rules. Each
      rule should have one of a `node`, `mark`, or `ignore` property
      (except when it appears in a [node](https://prosemirror.net/docs/ref/#model.NodeSpec.parseDOM) or
      [mark spec](https://prosemirror.net/docs/ref/#model.MarkSpec.parseDOM), in which case the `node`
      or `mark` property will be derived from its position).
      */
    var node: js.UndefOr[String] = js.undefined
    
    /**
      Controls whether whitespace should be preserved when parsing the
      content inside the matched element. `false` means whitespace may
      be collapsed, `true` means that whitespace should be preserved
      but newlines normalized to spaces, and `"full"` means that
      newlines should also be preserved.
      */
    var preserveWhitespace: js.UndefOr[Boolean | full] = js.undefined
    
    /**
      Can be used to change the order in which the parse rules in a
      schema are tried. Those with higher priority come first. Rules
      without a priority are counted as having priority 50. This
      property is only meaningful in a schema—when directly
      constructing a parser, the order of the rule array is used.
      */
    var priority: js.UndefOr[Double] = js.undefined
    
    /**
      When true, ignore the node that matches this rule, but do parse
      its content.
      */
    var skip: js.UndefOr[Boolean] = js.undefined
    
    /**
      A CSS property name to match. When given, this rule matches
      inline styles that list that property. May also have the form
      `"property=value"`, in which case the rule only matches if the
      property's value exactly matches the given value. (For more
      complicated filters, use [`getAttrs`](https://prosemirror.net/docs/ref/#model.ParseRule.getAttrs)
      and return false to indicate that the match failed.) Rules
      matching styles may only produce [marks](https://prosemirror.net/docs/ref/#model.ParseRule.mark),
      not nodes.
      */
    var style: js.UndefOr[String] = js.undefined
    
    /**
      A CSS selector describing the kind of DOM elements to match. A
      single rule should have _either_ a `tag` or a `style` property.
      */
    var tag: js.UndefOr[String] = js.undefined
  }
  object ParseRule {
    
    inline def apply(): ParseRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseRule]
    }
    
    extension [Self <: ParseRule](x: Self) {
      
      inline def setAttrs(value: Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setCloseParent(value: Boolean): Self = StObject.set(x, "closeParent", value.asInstanceOf[js.Any])
      
      inline def setCloseParentUndefined: Self = StObject.set(x, "closeParent", js.undefined)
      
      inline def setConsuming(value: Boolean): Self = StObject.set(x, "consuming", value.asInstanceOf[js.Any])
      
      inline def setConsumingUndefined: Self = StObject.set(x, "consuming", js.undefined)
      
      inline def setContentElement(value: String | HTMLElement | (js.Function1[/* node */ DOMNode, HTMLElement])): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
      
      inline def setContentElementFunction1(value: /* node */ DOMNode => HTMLElement): Self = StObject.set(x, "contentElement", js.Any.fromFunction1(value))
      
      inline def setContentElementUndefined: Self = StObject.set(x, "contentElement", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setGetAttrs(value: /* node */ HTMLElement | String => Attrs | `false` | Null): Self = StObject.set(x, "getAttrs", js.Any.fromFunction1(value))
      
      inline def setGetAttrsUndefined: Self = StObject.set(x, "getAttrs", js.undefined)
      
      inline def setGetContent(value: (/* node */ DOMNode, /* schema */ Schema[Any, Any]) => Fragment): Self = StObject.set(x, "getContent", js.Any.fromFunction2(value))
      
      inline def setGetContentUndefined: Self = StObject.set(x, "getContent", js.undefined)
      
      inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setPreserveWhitespace(value: Boolean | full): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
      
      inline def setPreserveWhitespaceUndefined: Self = StObject.set(x, "preserveWhitespace", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  /**
  An object describing a schema, as passed to the [`Schema`](https://prosemirror.net/docs/ref/#model.Schema)
  constructor.
  */
  trait SchemaSpec[Nodes /* <: String */, Marks /* <: String */] extends StObject {
    
    /**
      The mark types that exist in this schema. The order in which they
      are provided determines the order in which [mark
      sets](https://prosemirror.net/docs/ref/#model.Mark.addToSet) are sorted and in which [parse
      rules](https://prosemirror.net/docs/ref/#model.MarkSpec.parseDOM) are tried.
      */
    var marks: js.UndefOr[
        (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ name in Marks ]: prosemirror-model.prosemirror-model.MarkSpec}
      */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec & TopLevel[Any]) | default[MarkSpec]
      ] = js.undefined
    
    /**
      The node types in this schema. Maps names to
      [`NodeSpec`](https://prosemirror.net/docs/ref/#model.NodeSpec) objects that describe the node type
      associated with that name. Their order is significant—it
      determines which [parse rules](https://prosemirror.net/docs/ref/#model.NodeSpec.parseDOM) take
      precedence by default, and which nodes come first in a given
      [group](https://prosemirror.net/docs/ref/#model.NodeSpec.group).
      */
    var nodes: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ name in Nodes ]: prosemirror-model.prosemirror-model.NodeSpec}
      */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec & TopLevel[Any]) | default[NodeSpec]
    
    /**
      The name of the default top-level node for the schema. Defaults
      to `"doc"`.
      */
    var topNode: js.UndefOr[String] = js.undefined
  }
  object SchemaSpec {
    
    inline def apply[Nodes /* <: String */, Marks /* <: String */](
      nodes: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ name in Nodes ]: prosemirror-model.prosemirror-model.NodeSpec}
      */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec & TopLevel[Any]) | default[NodeSpec]
    ): SchemaSpec[Nodes, Marks] = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaSpec[Nodes, Marks]]
    }
    
    extension [Self <: SchemaSpec[?, ?], Nodes /* <: String */, Marks /* <: String */](x: Self & (SchemaSpec[Nodes, Marks])) {
      
      inline def setMarks(
        value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ name in Marks ]: prosemirror-model.prosemirror-model.MarkSpec}
        */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec & TopLevel[Any]) | default[MarkSpec]
      ): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      inline def setNodes(
        value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ name in Nodes ]: prosemirror-model.prosemirror-model.NodeSpec}
        */ typings.prosemirrorModel.prosemirrorModelStrings.SchemaSpec & TopLevel[Any]) | default[NodeSpec]
      ): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setTopNode(value: String): Self = StObject.set(x, "topNode", value.asInstanceOf[js.Any])
      
      inline def setTopNodeUndefined: Self = StObject.set(x, "topNode", js.undefined)
    }
  }
}
