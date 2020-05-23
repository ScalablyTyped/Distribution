package typings.prosemirrorMarkdown.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenConfig extends js.Object {
  /**
    * Attributes for the node or mark. When `getAttrs` is provided,
    * it takes precedence.
    */
  var attrs: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * This token comes in `_open` and `_close` variants (which are
    * appended to the base token name provides a the object
    * property), and wraps a block of content. The block should be
    * wrapped in a node of the type named to by the property's
    * value.
    */
  var block: js.UndefOr[String] = js.undefined
  /**
    * A function used to compute the attributes for the node or mark
    * that takes a [markdown-it
    * token](https://markdown-it.github.io/markdown-it/#Token) and
    * returns an attribute object.
    */
  var getAttrs: js.UndefOr[js.Function1[/* token */ typings.markdownIt.tokenMod.^, Record[String, _]]] = js.undefined
  /**
    * When true, ignore content for the matched token.
    */
  var ignore: js.UndefOr[Boolean] = js.undefined
  /**
    * This token also comes in `_open` and `_close` variants, but
    * should add a mark (named by the value) to its content, rather
    * than wrapping it in a node.
    */
  var mark: js.UndefOr[String] = js.undefined
  /**
    * This token maps to a single node, whose type can be looked up
    * in the schema under the given name. Exactly one of `node`,
    * `block`, or `mark` must be set.
    */
  var node: js.UndefOr[String] = js.undefined
}

object TokenConfig {
  @scala.inline
  def apply(
    attrs: Record[String, _] = null,
    block: String = null,
    getAttrs: /* token */ typings.markdownIt.tokenMod.^ => Record[String, _] = null,
    ignore: js.UndefOr[Boolean] = js.undefined,
    mark: String = null,
    node: String = null
  ): TokenConfig = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (getAttrs != null) __obj.updateDynamic("getAttrs")(js.Any.fromFunction1(getAttrs))
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore.get.asInstanceOf[js.Any])
    if (mark != null) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenConfig]
  }
}

