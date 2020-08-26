package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.prosemirrorModelBooleans.`false`
import typings.prosemirrorModel.prosemirrorModelStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseRule extends js.Object {
  /**
    * Attributes for the node or mark created by this rule. When
    * `getAttrs` is provided, it takes precedence.
    */
  var attrs: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  /**
    * For `tag` rules that produce non-leaf nodes or marks, by default
    * the content of the DOM element is parsed as content of the mark
    * or node. If the child nodes are in a descendent node, this may be
    * a CSS selector string that the parser must use to find the actual
    * content element, or a function that returns the actual content
    * element to the parser.
    */
  var contentElement: js.UndefOr[String | (js.Function1[/* p */ typings.std.Node, typings.std.Node]) | Null] = js.native
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
  var context: js.UndefOr[String | Null] = js.native
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
      js.UndefOr[StringDictionary[_] | `false` | Null]
    ]) | Null
  ] = js.native
  /**
    * Can be used to override the content of a matched node. When
    * present, instead of parsing the node's child nodes, the result of
    * this function is used.
    */
  var getContent: js.UndefOr[
    (js.Function2[/* p */ typings.std.Node, /* schema */ js.Any, Fragment[_]]) | Null
  ] = js.native
  /**
    * When true, ignore content that matches this rule.
    */
  var ignore: js.UndefOr[Boolean | Null] = js.native
  /**
    * The name of the mark type to wrap the matched content in.
    */
  var mark: js.UndefOr[String | Null] = js.native
  /**
    * The namespace to match. This should be used with `tag`.
    * Nodes are only matched when the namespace matches or this property
    * is null.
    */
  var namespace: js.UndefOr[String | Null] = js.native
  /**
    * The name of the node type to create when this rule matches. Only
    * valid for rules with a `tag` property, not for style rules. Each
    * rule should have one of a `node`, `mark`, or `ignore` property
    * (except when it appears in a [node](#model.NodeSpec.parseDOM) or
    * [mark spec](#model.MarkSpec.parseDOM), in which case the `node`
    * or `mark` property will be derived from its position).
    */
  var node: js.UndefOr[String | Null] = js.native
  /**
    * Controls whether whitespace should be preserved when parsing the
    * content inside the matched element. `false` means whitespace may
    * be collapsed, `true` means that whitespace should be preserved
    * but newlines normalized to spaces, and `"full"` means that
    * newlines should also be preserved.
    */
  var preserveWhitespace: js.UndefOr[Boolean | full | Null] = js.native
  /**
    * Can be used to change the order in which the parse rules in a
    * schema are tried. Those with higher priority come first. Rules
    * without a priority are counted as having priority 50. This
    * property is only meaningful in a schema—when directly
    * constructing a parser, the order of the rule array is used.
    */
  var priority: js.UndefOr[Double | Null] = js.native
  /**
    * When true, ignore the node that matches this rule, but do parse
    * its content.
    */
  var skip: js.UndefOr[Boolean | Null] = js.native
  /**
    * A CSS property name to match. When given, this rule matches
    * inline styles that list that property. May also have the form
    * `"property=value"`, in which case the rule only matches if the
    * propery's value exactly matches the given value. (For more
    * complicated filters, use [`getAttrs`](#model.ParseRule.getAttrs)
    * and return undefined to indicate that the match failed.)
    */
  var style: js.UndefOr[String | Null] = js.native
  /**
    * A CSS selector describing the kind of DOM elements to match. A
    * single rule should have _either_ a `tag` or a `style` property.
    */
  var tag: js.UndefOr[String | Null] = js.native
}

object ParseRule {
  @scala.inline
  def apply(): ParseRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseRule]
  }
  @scala.inline
  implicit class ParseRuleOps[Self <: ParseRule] (val x: Self) extends AnyVal {
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
    def setAttrs(value: StringDictionary[js.Any]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    @scala.inline
    def setAttrsNull: Self = this.set("attrs", null)
    @scala.inline
    def setContentElementFunction1(value: /* p */ typings.std.Node => typings.std.Node): Self = this.set("contentElement", js.Any.fromFunction1(value))
    @scala.inline
    def setContentElement(value: String | (js.Function1[/* p */ typings.std.Node, typings.std.Node])): Self = this.set("contentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentElement: Self = this.set("contentElement", js.undefined)
    @scala.inline
    def setContentElementNull: Self = this.set("contentElement", null)
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setContextNull: Self = this.set("context", null)
    @scala.inline
    def setGetAttrs(value: /* p */ typings.std.Node | String => js.UndefOr[StringDictionary[_] | `false` | Null]): Self = this.set("getAttrs", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAttrs: Self = this.set("getAttrs", js.undefined)
    @scala.inline
    def setGetAttrsNull: Self = this.set("getAttrs", null)
    @scala.inline
    def setGetContent(value: (/* p */ typings.std.Node, /* schema */ js.Any) => Fragment[_]): Self = this.set("getContent", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetContent: Self = this.set("getContent", js.undefined)
    @scala.inline
    def setGetContentNull: Self = this.set("getContent", null)
    @scala.inline
    def setIgnore(value: Boolean): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setIgnoreNull: Self = this.set("ignore", null)
    @scala.inline
    def setMark(value: String): Self = this.set("mark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
    @scala.inline
    def setMarkNull: Self = this.set("mark", null)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setNamespaceNull: Self = this.set("namespace", null)
    @scala.inline
    def setNode(value: String): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    @scala.inline
    def setNodeNull: Self = this.set("node", null)
    @scala.inline
    def setPreserveWhitespace(value: Boolean | full): Self = this.set("preserveWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveWhitespace: Self = this.set("preserveWhitespace", js.undefined)
    @scala.inline
    def setPreserveWhitespaceNull: Self = this.set("preserveWhitespace", null)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setPriorityNull: Self = this.set("priority", null)
    @scala.inline
    def setSkip(value: Boolean): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setSkipNull: Self = this.set("skip", null)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setTagNull: Self = this.set("tag", null)
  }
  
}

