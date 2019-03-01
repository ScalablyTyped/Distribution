package typings
package prosemirrorDashModelLib.prosemirrorDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeSpec extends js.Object {
  /**
    * Can be set to true to indicate that, though this isn't a [leaf
    * node](#model.NodeType.isLeaf), it doesn't have directly editable
    * content and should be treated as a single unit in the view.
    */
  var atom: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * The attributes that nodes of this type get.
    */
  var attrs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[AttributeSpec] | scala.Null] = js.undefined
  /**
    * Can be used to indicate that this node contains code, which
    * causes some commands to behave differently.
    */
  var code: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * The content expression for this node, as described in the [schema
    * guide](/docs/guide/#schema.content_expressions). When not given,
    * the node does not allow any content.
    */
  var content: js.UndefOr[java.lang.String | scala.Null] = js.undefined
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
  var defining: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Determines whether nodes of this type can be dragged without
    * being selected. Defaults to false.
    */
  var draggable: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * The group or space-separated groups to which this node belongs,
    * which can be referred to in the content expressions for the
    * schema.
    */
  var group: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Should be set to true for inline nodes. (Implied for text nodes.)
    */
  var `inline`: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * When enabled (default is false), the sides of nodes of this type
    * count as boundaries that regular editing operations, like
    * backspacing or lifting, won't cross. An example of a node that
    * should probably have this enabled is a table cell.
    */
  var isolating: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * The marks that are allowed inside of this node. May be a
    * space-separated string referring to mark names or groups, `"_"`
    * to explicitly allow all marks, or `""` to disallow marks. When
    * not given, nodes with inline content default to allowing all
    * marks, other nodes default to not allowing marks.
    */
  var marks: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Associates DOM parser information with this node, which can be
    * used by [`DOMParser.fromSchema`](#model.DOMParser^fromSchema) to
    * automatically derive a parser. The `node` field in the rules is
    * implied (the name of this node will be filled in automatically).
    * If you supply your own parser, you do not need to also specify
    * parsing rules in your schema.
    */
  var parseDOM: js.UndefOr[js.Array[ParseRule] | scala.Null] = js.undefined
  /**
    * Controls whether nodes of this type can be selected as a [node
    * selection](#state.NodeSelection). Defaults to true for non-text
    * nodes.
    */
  var selectable: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
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
  var toDOM: js.UndefOr[(js.Function1[/* node */ ProsemirrorNode[_], DOMOutputSpec]) | scala.Null] = js.undefined
  /**
    * Defines the default way a node of this type should be serialized
    * to a string representation for debugging (e.g. in error messages).
    */
  var toDebugString: js.UndefOr[(js.Function1[/* node */ ProsemirrorNode[_], java.lang.String]) | scala.Null] = js.undefined
}

object NodeSpec {
  @scala.inline
  def apply(
    atom: js.UndefOr[scala.Boolean] = js.undefined,
    attrs: org.scalablytyped.runtime.StringDictionary[AttributeSpec] = null,
    code: js.UndefOr[scala.Boolean] = js.undefined,
    content: java.lang.String = null,
    defining: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    group: java.lang.String = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    isolating: js.UndefOr[scala.Boolean] = js.undefined,
    marks: java.lang.String = null,
    parseDOM: js.Array[ParseRule] = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    toDOM: js.Function1[/* node */ ProsemirrorNode[_], DOMOutputSpec] = null,
    toDebugString: js.Function1[/* node */ ProsemirrorNode[_], java.lang.String] = null
  ): NodeSpec = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(atom)) __obj.updateDynamic("atom")(atom)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code)
    if (content != null) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(defining)) __obj.updateDynamic("defining")(defining)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (group != null) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (!js.isUndefined(isolating)) __obj.updateDynamic("isolating")(isolating)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (parseDOM != null) __obj.updateDynamic("parseDOM")(parseDOM)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (toDOM != null) __obj.updateDynamic("toDOM")(toDOM)
    if (toDebugString != null) __obj.updateDynamic("toDebugString")(toDebugString)
    __obj.asInstanceOf[NodeSpec]
  }
}

