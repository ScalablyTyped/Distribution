package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeSpec
  extends /**
  * Allow specifying arbitrary fields on a NodeSpec.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Can be set to true to indicate that, though this isn't a [leaf
    * node](#model.NodeType.isLeaf), it doesn't have directly editable
    * content and should be treated as a single unit in the view.
    */
  var atom: js.UndefOr[Boolean | Null] = js.native
  /**
    * The attributes that nodes of this type get.
    */
  var attrs: js.UndefOr[StringDictionary[AttributeSpec] | Null] = js.native
  /**
    * Can be used to indicate that this node contains code, which
    * causes some commands to behave differently.
    */
  var code: js.UndefOr[Boolean | Null] = js.native
  /**
    * The content expression for this node, as described in the [schema
    * guide](/docs/guide/#schema.content_expressions). When not given,
    * the node does not allow any content.
    */
  var content: js.UndefOr[String | Null] = js.native
  /**
    * Determines whether this node is considered an important parent
    * node during replace operations (such as paste). Non-defining (the
    * default) nodes get dropped when their entire content is replaced,
    * whereas defining nodes persist and wrap the inserted content.
    * Likewise, in _inserted_ content the defining parents of the
    * content are preserved when possible. Typically,
    * non-default-paragraph textblock types, and possibly list items,
    * are marked as defining.
    */
  var defining: js.UndefOr[Boolean | Null] = js.native
  /**
    * Determines whether nodes of this type can be dragged without
    * being selected. Defaults to false.
    */
  var draggable: js.UndefOr[Boolean | Null] = js.native
  /**
    * The group or space-separated groups to which this node belongs,
    * which can be referred to in the content expressions for the
    * schema.
    */
  var group: js.UndefOr[String | Null] = js.native
  /**
    * Should be set to true for inline nodes. (Implied for text nodes.)
    */
  var `inline`: js.UndefOr[Boolean | Null] = js.native
  /**
    * When enabled (default is false), the sides of nodes of this type
    * count as boundaries that regular editing operations, like
    * backspacing or lifting, won't cross. An example of a node that
    * should probably have this enabled is a table cell.
    */
  var isolating: js.UndefOr[Boolean | Null] = js.native
  /**
    * The marks that are allowed inside of this node. May be a
    * space-separated string referring to mark names or groups, `"_"`
    * to explicitly allow all marks, or `""` to disallow marks. When
    * not given, nodes with inline content default to allowing all
    * marks, other nodes default to not allowing marks.
    */
  var marks: js.UndefOr[String | Null] = js.native
  /**
    * Associates DOM parser information with this node, which can be
    * used by [`DOMParser.fromSchema`](#model.DOMParser^fromSchema) to
    * automatically derive a parser. The `node` field in the rules is
    * implied (the name of this node will be filled in automatically).
    * If you supply your own parser, you do not need to also specify
    * parsing rules in your schema.
    */
  var parseDOM: js.UndefOr[js.Array[ParseRule] | Null] = js.native
  /**
    * Controls whether nodes of this type can be selected as a [node
    * selection](#state.NodeSelection). Defaults to true for non-text
    * nodes.
    */
  var selectable: js.UndefOr[Boolean | Null] = js.native
  /**
    * Defines the default way a node of this type should be serialized
    * to DOM/HTML (as used by
    * [`DOMSerializer.fromSchema`](#model.DOMSerializer^fromSchema)).
    * Should return a DOM node or an [array
    * structure](#model.DOMOutputSpec) that describes one, with an
    * optional number zero (“hole”) in it to indicate where the node's
    * content should be inserted.
    *
    * For text nodes, the default is to create a text DOM node. Though
    * it is possible to create a serializer where text is rendered
    * differently, this is not supported inside the editor, so you
    * shouldn't override that in your text node spec.
    */
  var toDOM: js.UndefOr[(js.Function1[/* node */ ProsemirrorNode[_], DOMOutputSpec]) | Null] = js.native
  /**
    * Defines the default way a node of this type should be serialized
    * to a string representation for debugging (e.g. in error messages).
    */
  var toDebugString: js.UndefOr[(js.Function1[/* node */ ProsemirrorNode[_], String]) | Null] = js.native
}

object NodeSpec {
  @scala.inline
  def apply(): NodeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSpec]
  }
  @scala.inline
  implicit class NodeSpecOps[Self <: NodeSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAtom(value: Boolean): Self = this.set("atom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtom: Self = this.set("atom", js.undefined)
    @scala.inline
    def setAtomNull: Self = this.set("atom", null)
    @scala.inline
    def setAttrs(value: StringDictionary[AttributeSpec]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    @scala.inline
    def setAttrsNull: Self = this.set("attrs", null)
    @scala.inline
    def setCode(value: Boolean): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setCodeNull: Self = this.set("code", null)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    @scala.inline
    def setDefining(value: Boolean): Self = this.set("defining", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefining: Self = this.set("defining", js.undefined)
    @scala.inline
    def setDefiningNull: Self = this.set("defining", null)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setDraggableNull: Self = this.set("draggable", null)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setGroupNull: Self = this.set("group", null)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setInlineNull: Self = this.set("inline", null)
    @scala.inline
    def setIsolating(value: Boolean): Self = this.set("isolating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsolating: Self = this.set("isolating", js.undefined)
    @scala.inline
    def setIsolatingNull: Self = this.set("isolating", null)
    @scala.inline
    def setMarks(value: String): Self = this.set("marks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarks: Self = this.set("marks", js.undefined)
    @scala.inline
    def setMarksNull: Self = this.set("marks", null)
    @scala.inline
    def setParseDOMVarargs(value: ParseRule*): Self = this.set("parseDOM", js.Array(value :_*))
    @scala.inline
    def setParseDOM(value: js.Array[ParseRule]): Self = this.set("parseDOM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseDOM: Self = this.set("parseDOM", js.undefined)
    @scala.inline
    def setParseDOMNull: Self = this.set("parseDOM", null)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelectableNull: Self = this.set("selectable", null)
    @scala.inline
    def setToDOM(value: /* node */ ProsemirrorNode[_] => DOMOutputSpec): Self = this.set("toDOM", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToDOM: Self = this.set("toDOM", js.undefined)
    @scala.inline
    def setToDOMNull: Self = this.set("toDOM", null)
    @scala.inline
    def setToDebugString(value: /* node */ ProsemirrorNode[_] => String): Self = this.set("toDebugString", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToDebugString: Self = this.set("toDebugString", js.undefined)
    @scala.inline
    def setToDebugStringNull: Self = this.set("toDebugString", null)
  }
  
}

