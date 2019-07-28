package typings.prosemirrorDashModel.prosemirrorDashModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorDashModel.prosemirrorDashModelNumbers.`false`
import typings.prosemirrorDashModel.prosemirrorDashModelStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseRule extends js.Object {
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
      js.UndefOr[StringDictionary[_] | `false` | Null]
    ]) | Null
  ] = js.undefined
  /**
    * Can be used to override the content of a matched node. When
    * present, instead of parsing the node's child nodes, the result of
    * this function is used.
    */
  var getContent: js.UndefOr[
    (js.Function2[/* p */ typings.std.Node, /* schema */ Schema[_, _], Fragment[Schema[_, _]]]) | Null
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
  @scala.inline
  def apply(
    attrs: StringDictionary[js.Any] = null,
    contentElement: String | (js.Function1[/* p */ typings.std.Node, typings.std.Node]) = null,
    context: String = null,
    getAttrs: /* p */ typings.std.Node | String => js.UndefOr[StringDictionary[_] | `false` | Null] = null,
    getContent: (/* p */ typings.std.Node, /* schema */ Schema[_, _]) => Fragment[Schema[_, _]] = null,
    ignore: js.UndefOr[Boolean] = js.undefined,
    mark: String = null,
    namespace: String = null,
    node: String = null,
    preserveWhitespace: Boolean | full = null,
    priority: Int | Double = null,
    skip: js.UndefOr[Boolean] = js.undefined,
    style: String = null,
    tag: String = null
  ): ParseRule = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (contentElement != null) __obj.updateDynamic("contentElement")(contentElement.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (getAttrs != null) __obj.updateDynamic("getAttrs")(js.Any.fromFunction1(getAttrs))
    if (getContent != null) __obj.updateDynamic("getContent")(js.Any.fromFunction2(getContent))
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore)
    if (mark != null) __obj.updateDynamic("mark")(mark)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (node != null) __obj.updateDynamic("node")(node)
    if (preserveWhitespace != null) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[ParseRule]
  }
}

