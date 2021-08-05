package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.prosemirrorModelBooleans.`false`
import typings.prosemirrorModel.prosemirrorModelStrings.full
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseRule extends StObject {
  
  /**
    * Attributes for the node or mark created by this rule. When
    * `getAttrs` is provided, it takes precedence.
    */
  var attrs: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
  
  /**
    * For `tag` rules that produce non-leaf nodes or marks, by default
    * the content of the DOM element is parsed as content of the mark
    * or node. If the child nodes are in a descendent node, this may be
    * a CSS selector string that the parser must use to find the actual
    * content element, or a function that returns the actual content
    * element to the parser.
    */
  var contentElement: js.UndefOr[String | (js.Function1[/* p */ typings.std.Node, typings.std.Node]) | Null] = js.undefined
  
  /**
    * When given, restricts this rule to only match when the current
    * context—the parent nodes into which the content is being
    * parsed—matches this expression. Should contain one or more node
    * names or node group names followed by single or double slashes.
    * For example `"paragraph/"` means the rule only matches when the
    * parent node is a paragraph, `"blockquote/paragraph/"` restricts
    * it to be in a paragraph that is inside a blockquote, and
    * `"section//"` matches any position inside a section—a double
    * slash matches any sequence of ancestor nodes. To allow multiple
    * different contexts, they can be separated by a pipe (`|`)
    * character, as in `"blockquote/|list_item/"`.
    */
  var context: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A function used to compute the attributes for the node or mark
    * created by this rule. Can also be used to describe further
    * conditions the DOM element or style must match. When it returns
    * `false`, the rule won't match. When it returns null or undefined,
    * that is interpreted as an empty/default set of attributes.
    *
    * Called with a DOM Element for `tag` rules, and with a string (the
    * style's value) for `style` rules.
    */
  var getAttrs: js.UndefOr[
    (js.Function1[
      /* p */ typings.std.Node | String, 
      js.UndefOr[StringDictionary[js.Any] | `false` | Null]
    ]) | Null
  ] = js.undefined
  
  /**
    * Can be used to override the content of a matched node. When
    * present, instead of parsing the node's child nodes, the result of
    * this function is used.
    */
  var getContent: js.UndefOr[
    (js.Function2[/* p */ typings.std.Node, /* schema */ js.Any, Fragment[js.Any]]) | Null
  ] = js.undefined
  
  /**
    * When true, ignore content that matches this rule.
    */
  var ignore: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The name of the mark type to wrap the matched content in.
    */
  var mark: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The namespace to match. This should be used with `tag`.
    * Nodes are only matched when the namespace matches or this property
    * is null.
    */
  var namespace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the node type to create when this rule matches. Only
    * valid for rules with a `tag` property, not for style rules. Each
    * rule should have one of a `node`, `mark`, or `ignore` property
    * (except when it appears in a [node](#model.NodeSpec.parseDOM) or
    * [mark spec](#model.MarkSpec.parseDOM), in which case the `node`
    * or `mark` property will be derived from its position).
    */
  var node: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Controls whether whitespace should be preserved when parsing the
    * content inside the matched element. `false` means whitespace may
    * be collapsed, `true` means that whitespace should be preserved
    * but newlines normalized to spaces, and `"full"` means that
    * newlines should also be preserved.
    */
  var preserveWhitespace: js.UndefOr[Boolean | full | Null] = js.undefined
  
  /**
    * Can be used to change the order in which the parse rules in a
    * schema are tried. Those with higher priority come first. Rules
    * without a priority are counted as having priority 50. This
    * property is only meaningful in a schema—when directly
    * constructing a parser, the order of the rule array is used.
    */
  var priority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * When true, ignore the node that matches this rule, but do parse
    * its content.
    */
  var skip: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A CSS property name to match. When given, this rule matches
    * inline styles that list that property. May also have the form
    * `"property=value"`, in which case the rule only matches if the
    * propery's value exactly matches the given value. (For more
    * complicated filters, use [`getAttrs`](#model.ParseRule.getAttrs)
    * and return undefined to indicate that the match failed.)
    */
  var style: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A CSS selector describing the kind of DOM elements to match. A
    * single rule should have _either_ a `tag` or a `style` property.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object ParseRule {
  
  inline def apply(): ParseRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseRule]
  }
  
  extension [Self <: ParseRule](x: Self) {
    
    inline def setAttrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsNull: Self = StObject.set(x, "attrs", null)
    
    inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    inline def setContentElement(value: String | (js.Function1[/* p */ typings.std.Node, typings.std.Node])): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
    
    inline def setContentElementFunction1(value: /* p */ typings.std.Node => typings.std.Node): Self = StObject.set(x, "contentElement", js.Any.fromFunction1(value))
    
    inline def setContentElementNull: Self = StObject.set(x, "contentElement", null)
    
    inline def setContentElementUndefined: Self = StObject.set(x, "contentElement", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setGetAttrs(value: /* p */ typings.std.Node | String => js.UndefOr[StringDictionary[js.Any] | `false` | Null]): Self = StObject.set(x, "getAttrs", js.Any.fromFunction1(value))
    
    inline def setGetAttrsNull: Self = StObject.set(x, "getAttrs", null)
    
    inline def setGetAttrsUndefined: Self = StObject.set(x, "getAttrs", js.undefined)
    
    inline def setGetContent(value: (/* p */ typings.std.Node, /* schema */ js.Any) => Fragment[js.Any]): Self = StObject.set(x, "getContent", js.Any.fromFunction2(value))
    
    inline def setGetContentNull: Self = StObject.set(x, "getContent", null)
    
    inline def setGetContentUndefined: Self = StObject.set(x, "getContent", js.undefined)
    
    inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreNull: Self = StObject.set(x, "ignore", null)
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkNull: Self = StObject.set(x, "mark", null)
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeNull: Self = StObject.set(x, "node", null)
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setPreserveWhitespace(value: Boolean | full): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
    
    inline def setPreserveWhitespaceNull: Self = StObject.set(x, "preserveWhitespace", null)
    
    inline def setPreserveWhitespaceUndefined: Self = StObject.set(x, "preserveWhitespace", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipNull: Self = StObject.set(x, "skip", null)
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
