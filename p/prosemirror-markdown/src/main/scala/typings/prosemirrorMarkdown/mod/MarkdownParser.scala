package typings.prosemirrorMarkdown.mod

import org.scalablytyped.runtime.StringDictionary
import typings.markdownIt.libMod.MarkdownIt
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-markdown", "MarkdownParser")
@js.native
class MarkdownParser[S /* <: Schema[_, _] */] protected () extends js.Object {
  /**
    * Create a parser with the given configuration. You can configure
    * the markdown-it parser to parse the dialect you want, and provide
    * a description of the ProseMirror entities those tokens map to in
    * the `tokens` object, which maps token names to descriptions of
    * what to do with them. Such a description is an object, and may
    * have the following properties:
    *
    * **`node`**`: ?string`
    * : This token maps to a single node, whose type can be looked up
    * in the schema under the given name. Exactly one of `node`,
    * `block`, or `mark` must be set.
    *
    * **`block`**`: ?string`
    * : This token comes in `_open` and `_close` variants (which are
    * appended to the base token name provides a the object
    * property), and wraps a block of content. The block should be
    * wrapped in a node of the type named to by the property's
    * value.
    *
    * **`mark`**`: ?string`
    * : This token also comes in `_open` and `_close` variants, but
    * should add a mark (named by the value) to its content, rather
    * than wrapping it in a node.
    *
    * **`attrs`**`: ?Object`
    * : Attributes for the node or mark. When `getAttrs` is provided,
    * it takes precedence.
    *
    * **`getAttrs`**`: ?(MarkdownToken) → Object`
    * : A function used to compute the attributes for the node or mark
    * that takes a [markdown-it
    * token](https://markdown-it.github.io/markdown-it/#Token) and
    * returns an attribute object.
    *
    * **`ignore`**`: ?bool`
    * : When true, ignore content for the matched token.
    */
  def this(schema: S, tokenizer: MarkdownIt, tokens: StringDictionary[TokenConfig]) = this()
  
  /**
    * Parse a string as [CommonMark](http://commonmark.org/) markup,
    * and create a ProseMirror document as prescribed by this parser's
    * rules.
    */
  def parse(text: String): Node[S] = js.native
  
  /**
    * The value of the `tokens` object used to construct
    * this parser. Can be useful to copy and modify to base other
    * parsers on.
    */
  var tokens: StringDictionary[typings.markdownIt.tokenMod.^] = js.native
}
