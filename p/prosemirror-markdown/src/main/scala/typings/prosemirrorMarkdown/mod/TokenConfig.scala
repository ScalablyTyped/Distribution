package typings.prosemirrorMarkdown.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenConfig extends js.Object {
  
  /**
    * Attributes for the node or mark. When `getAttrs` is provided,
    * it takes precedence.
    */
  var attrs: js.UndefOr[Record[String, _]] = js.native
  
  /**
    * This token comes in `_open` and `_close` variants (which are
    * appended to the base token name provides a the object
    * property), and wraps a block of content. The block should be
    * wrapped in a node of the type named to by the property's
    * value.
    */
  var block: js.UndefOr[String] = js.native
  
  /**
    * A function used to compute the attributes for the node or mark
    * that takes a [markdown-it
    * token](https://markdown-it.github.io/markdown-it/#Token) and
    * returns an attribute object.
    */
  var getAttrs: js.UndefOr[js.Function1[/* token */ typings.markdownIt.tokenMod.^, Record[String, _]]] = js.native
  
  /**
    * When true, ignore content for the matched token.
    */
  var ignore: js.UndefOr[Boolean] = js.native
  
  /**
    * This token also comes in `_open` and `_close` variants, but
    * should add a mark (named by the value) to its content, rather
    * than wrapping it in a node.
    */
  var mark: js.UndefOr[String] = js.native
  
  /**
    * This token maps to a single node, whose type can be looked up
    * in the schema under the given name. Exactly one of `node`,
    * `block`, or `mark` must be set.
    */
  var node: js.UndefOr[String] = js.native
}
object TokenConfig {
  
  @scala.inline
  def apply(): TokenConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenConfig]
  }
  
  @scala.inline
  implicit class TokenConfigOps[Self <: TokenConfig] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: Record[String, _]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    
    @scala.inline
    def setBlock(value: String): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    
    @scala.inline
    def setGetAttrs(value: /* token */ typings.markdownIt.tokenMod.^ => Record[String, _]): Self = this.set("getAttrs", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetAttrs: Self = this.set("getAttrs", js.undefined)
    
    @scala.inline
    def setIgnore(value: Boolean): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setMark(value: String): Self = this.set("mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
    
    @scala.inline
    def setNode(value: String): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
  }
}
