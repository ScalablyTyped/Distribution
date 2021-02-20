package typings.prosemirrorMarkdown

import org.scalablytyped.runtime.StringDictionary
import typings.markdownIt.libMod.MarkdownIt
import typings.prosemirrorMarkdown.anon.Leading
import typings.prosemirrorMarkdown.anon.TightLists
import typings.prosemirrorModel.mod.Fragment
import typings.prosemirrorModel.mod.Mark
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-markdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prosemirror-markdown", "MarkdownParser")
  @js.native
  class MarkdownParser[S /* <: Schema[_, _] */] protected () extends StObject {
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
  
  @JSImport("prosemirror-markdown", "MarkdownSerializer")
  @js.native
  class MarkdownSerializer[S /* <: Schema[_, _] */] protected () extends StObject {
    def this(
      nodes: StringDictionary[
            js.Function4[
              /* state */ MarkdownSerializerState[S], 
              /* node */ Node[S], 
              /* parent */ Node[S], 
              /* index */ Double, 
              Unit
            ]
          ],
      marks: StringDictionary[MarkSerializerConfig[_]]
    ) = this()
    
    /**
      * The mark serializer info.
      */
    var marks: StringDictionary[js.Any] = js.native
    
    /**
      * The node serializer
      * functions for this serializer.
      */
    var nodes: StringDictionary[js.Function2[/* p1 */ MarkdownSerializerState[S], /* p2 */ Node[S], Unit]] = js.native
    
    /**
      * Serialize the content of the given node to
      * [CommonMark](http://commonmark.org/).
      */
    def serialize(content: Node[S]): String = js.native
    def serialize(content: Node[S], options: StringDictionary[js.Any]): String = js.native
  }
  
  @JSImport("prosemirror-markdown", "MarkdownSerializerState")
  @js.native
  class MarkdownSerializerState[S /* <: Schema[_, _] */] () extends StObject {
    
    /**
      * Close the block for the given node.
      */
    def closeBlock(node: Node[S]): Unit = js.native
    
    /**
      * Ensure the current content ends with a newline.
      */
    def ensureNewLine(): Unit = js.native
    
    /**
      * Escape the given string so that it can safely appear in Markdown
      * content. If `startOfLine` is true, also escape characters that
      * has special meaning only at the start of the line.
      */
    def esc(str: String): String = js.native
    def esc(str: String, startOfLine: Boolean): String = js.native
    
    /**
      * Get leading and trailing whitespace from a string. Values of
      * leading or trailing property of the return object will be undefined
      * if there is no match.
      */
    def getEnclosingWhitespace(text: String): Leading = js.native
    
    /**
      * The options passed to the serializer.
      */
    var options: TightLists = js.native
    
    /**
      * Wraps the passed string in a string of its own
      */
    def quote(str: String): String = js.native
    
    /**
      * Render the given node as a block.
      */
    def render(node: Node[S]): Unit = js.native
    
    /**
      * Render the contents of `parent` as block nodes.
      */
    def renderContent(parent: Node[S]): Unit = js.native
    
    /**
      * Render the contents of `parent` as inline content.
      */
    def renderInline(parent: Node[S]): Unit = js.native
    
    /**
      * Render a node's content as a list. `delim` should be the extra
      * indentation added to all lines except the first in an item,
      * `firstDelim` is a function going from an item index to a
      * delimiter for the first line of the item.
      */
    def renderList(node: Node[S], delim: String, firstDelim: js.Function1[/* p */ Double, String]): Unit = js.native
    
    /**
      * Repeat the given string `n` times.
      */
    def repeat(str: String, n: Double): String = js.native
    
    /**
      * Add the given text to the document. When escape is not `false`,
      * it will be escaped.
      */
    def text(text: String): Unit = js.native
    def text(text: String, escape: Boolean): Unit = js.native
    
    def wrapBlock(delim: String, firstDelim: js.UndefOr[scala.Nothing], node: Node[S], f: js.Function0[Unit]): Unit = js.native
    /**
      * Render a block, prefixing each line with `delim`, and the first
      * line in `firstDelim`. `node` should be the node that is closed at
      * the end of the block, and `f` is a function that renders the
      * content of the block.
      */
    def wrapBlock(delim: String, firstDelim: String, node: Node[S], f: js.Function0[Unit]): Unit = js.native
    
    /**
      * Prepare the state for writing output (closing closed paragraphs,
      * adding delimiters, and so on), and then optionally add content
      * (unescaped) to the output.
      */
    def write(): Unit = js.native
    def write(content: String): Unit = js.native
  }
  
  @JSImport("prosemirror-markdown", "defaultMarkdownParser")
  @js.native
  def defaultMarkdownParser: MarkdownParser[js.Any] = js.native
  @scala.inline
  def defaultMarkdownParser_=(x: MarkdownParser[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMarkdownParser")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-markdown", "defaultMarkdownSerializer")
  @js.native
  def defaultMarkdownSerializer: MarkdownSerializer[js.Any] = js.native
  @scala.inline
  def defaultMarkdownSerializer_=(x: MarkdownSerializer[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMarkdownSerializer")(x.asInstanceOf[js.Any])
  
  @js.native
  trait MarkSerializerConfig[S /* <: Schema[_, _] */] extends StObject {
    
    var close: String | MarkSerializerMethod[S] = js.native
    
    var escape: js.UndefOr[Boolean] = js.native
    
    var expelEnclosingWhitespace: js.UndefOr[Boolean] = js.native
    
    var mixable: js.UndefOr[Boolean] = js.native
    
    var open: String | MarkSerializerMethod[S] = js.native
  }
  object MarkSerializerConfig {
    
    @scala.inline
    def apply[S /* <: Schema[_, _] */](close: String | MarkSerializerMethod[S], open: String | MarkSerializerMethod[S]): MarkSerializerConfig[S] = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkSerializerConfig[S]]
    }
    
    @scala.inline
    implicit class MarkSerializerConfigMutableBuilder[Self <: MarkSerializerConfig[_], S /* <: Schema[_, _] */] (val x: Self with MarkSerializerConfig[S]) extends AnyVal {
      
      @scala.inline
      def setClose(value: String | MarkSerializerMethod[S]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseFunction4(
        value: (/* state */ MarkdownSerializerState[S], /* mark */ Mark[S], /* parent */ Fragment[S], /* index */ Double) => Unit
      ): Self = StObject.set(x, "close", js.Any.fromFunction4(value))
      
      @scala.inline
      def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setExpelEnclosingWhitespace(value: Boolean): Self = StObject.set(x, "expelEnclosingWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpelEnclosingWhitespaceUndefined: Self = StObject.set(x, "expelEnclosingWhitespace", js.undefined)
      
      @scala.inline
      def setMixable(value: Boolean): Self = StObject.set(x, "mixable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixableUndefined: Self = StObject.set(x, "mixable", js.undefined)
      
      @scala.inline
      def setOpen(value: String | MarkSerializerMethod[S]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenFunction4(
        value: (/* state */ MarkdownSerializerState[S], /* mark */ Mark[S], /* parent */ Fragment[S], /* index */ Double) => Unit
      ): Self = StObject.set(x, "open", js.Any.fromFunction4(value))
    }
  }
  
  type MarkSerializerMethod[S /* <: Schema[_, _] */] = js.Function4[
    /* state */ MarkdownSerializerState[S], 
    /* mark */ Mark[S], 
    /* parent */ Fragment[S], 
    /* index */ Double, 
    Unit
  ]
  
  @js.native
  trait TokenConfig extends StObject {
    
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
    implicit class TokenConfigMutableBuilder[Self <: TokenConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: Record[String, _]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setBlock(value: String): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setGetAttrs(value: /* token */ typings.markdownIt.tokenMod.^ => Record[String, _]): Self = StObject.set(x, "getAttrs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAttrsUndefined: Self = StObject.set(x, "getAttrs", js.undefined)
      
      @scala.inline
      def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
}
