package typings.prosemirrorMarkdown

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorMarkdown.anon.EscapeExtraCharacters
import typings.prosemirrorMarkdown.anon.EscapeExtraCharactersTightLists
import typings.prosemirrorMarkdown.anon.Leading
import typings.prosemirrorMarkdown.anon.TightLists
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.blockquote
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.bullet_list
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.code
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.code_block
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.doc
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.em
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.hard_break
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.heading
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.horizontal_rule
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.image
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.link
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.list_item
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.ordered_list
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.paragraph
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.strong
import typings.prosemirrorMarkdown.prosemirrorMarkdownStrings.text
import typings.prosemirrorModel.mod.Attrs
import typings.prosemirrorModel.mod.Mark
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  A configuration of a Markdown parser. Such a parser uses
  [markdown-it](https://github.com/markdown-it/markdown-it) to
  tokenize a file, and then runs the custom rules it is given over
  the tokens to create a ProseMirror document tree.
  */
  @JSImport("prosemirror-markdown", "MarkdownParser")
  @js.native
  open class MarkdownParser protected () extends StObject {
    /**
      Create a parser with the given configuration. You can configure
      the markdown-it parser to parse the dialect you want, and provide
      a description of the ProseMirror entities those tokens map to in
      the `tokens` object, which maps token names to descriptions of
      what to do with them. Such a description is an object, and may
      have the following properties:
      */
    def this(
      /**
      The parser's document schema.
      */
    schema: Schema[Any, Any],
      /**
      This parser's markdown-it tokenizer.
      */
    tokenizer: MarkdownIt,
      /**
      The value of the `tokens` object used to construct this
      parser. Can be useful to copy and modify to base other parsers
      on.
      */
    tokens: StringDictionary[ParseSpec]
    ) = this()
    
    /**
      Parse a string as [CommonMark](http://commonmark.org/) markup,
      and create a ProseMirror document as prescribed by this parser's
      rules.
      
      The second argument, when given, is passed through to the
      [Markdown
      parser](https://markdown-it.github.io/markdown-it/#MarkdownIt.parse).
      */
    def parse(text: String): Node | Null = js.native
    def parse(text: String, markdownEnv: js.Object): Node | Null = js.native
    
    /**
      The parser's document schema.
      */
    val schema: Schema[Any, Any] = js.native
    
    /**
      This parser's markdown-it tokenizer.
      */
    val tokenizer: MarkdownIt = js.native
    
    /**
      The value of the `tokens` object used to construct this
      parser. Can be useful to copy and modify to base other parsers
      on.
      */
    val tokens: StringDictionary[ParseSpec] = js.native
  }
  
  /**
  A specification for serializing a ProseMirror document as
  Markdown/CommonMark text.
  */
  @JSImport("prosemirror-markdown", "MarkdownSerializer")
  @js.native
  open class MarkdownSerializer protected () extends StObject {
    /**
      Construct a serializer with the given configuration. The `nodes`
      object should map node names in a given schema to function that
      take a serializer state and such a node, and serialize the node.
      */
    def this(
      /**
      The node serializer functions for this serializer.
      */
    nodes: StringDictionary[
            js.Function4[
              /* state */ MarkdownSerializerState, 
              /* node */ Node, 
              /* parent */ Node, 
              /* index */ Double, 
              Unit
            ]
          ],
      /**
      The mark serializer info.
      */
    marks: StringDictionary[MarkSerializerSpec]
    ) = this()
    def this(
      /**
      The node serializer functions for this serializer.
      */
    nodes: StringDictionary[
            js.Function4[
              /* state */ MarkdownSerializerState, 
              /* node */ Node, 
              /* parent */ Node, 
              /* index */ Double, 
              Unit
            ]
          ],
      /**
      The mark serializer info.
      */
    marks: StringDictionary[MarkSerializerSpec],
      options: EscapeExtraCharacters
    ) = this()
    
    /**
      The mark serializer info.
      */
    val marks: StringDictionary[MarkSerializerSpec] = js.native
    
    /**
      The node serializer functions for this serializer.
      */
    val nodes: StringDictionary[
        js.Function4[
          /* state */ MarkdownSerializerState, 
          /* node */ Node, 
          /* parent */ Node, 
          /* index */ Double, 
          Unit
        ]
      ] = js.native
    
    val options: EscapeExtraCharacters = js.native
    
    /**
      Serialize the content of the given node to
      [CommonMark](http://commonmark.org/).
      */
    def serialize(content: Node): String = js.native
    def serialize(content: Node, options: TightLists): String = js.native
  }
  
  /**
  This is an object used to track state and expose
  methods related to markdown serialization. Instances are passed to
  node and mark serialization methods (see `toMarkdown`).
  */
  @JSImport("prosemirror-markdown", "MarkdownSerializerState")
  @js.native
  open class MarkdownSerializerState () extends StObject {
    
    /**
      Close the block for the given node.
      */
    def closeBlock(node: Node): Unit = js.native
    
    /**
      Ensure the current content ends with a newline.
      */
    def ensureNewLine(): Unit = js.native
    
    /**
      Escape the given string so that it can safely appear in Markdown
      content. If `startOfLine` is true, also escape characters that
      have special meaning only at the start of the line.
      */
    def esc(str: String): String = js.native
    def esc(str: String, startOfLine: Boolean): String = js.native
    
    /**
      Get leading and trailing whitespace from a string. Values of
      leading or trailing property of the return object will be undefined
      if there is no match.
      */
    def getEnclosingWhitespace(text: String): Leading = js.native
    
    /**
      Get the markdown string for a given opening or closing mark.
      */
    def markString(mark: Mark, open: Boolean, parent: Node, index: Double): String = js.native
    
    /**
      The options passed to the serializer.
      */
    val options: EscapeExtraCharactersTightLists = js.native
    
    /**
      Render the given node as a block.
      */
    def render(node: Node, parent: Node, index: Double): Unit = js.native
    
    /**
      Render the contents of `parent` as block nodes.
      */
    def renderContent(parent: Node): Unit = js.native
    
    /**
      Render the contents of `parent` as inline content.
      */
    def renderInline(parent: Node): Unit = js.native
    
    /**
      Render a node's content as a list. `delim` should be the extra
      indentation added to all lines except the first in an item,
      `firstDelim` is a function going from an item index to a
      delimiter for the first line of the item.
      */
    def renderList(node: Node, delim: String, firstDelim: js.Function1[/* index */ Double, String]): Unit = js.native
    
    /**
      Repeat the given string `n` times.
      */
    def repeat(str: String, n: Double): String = js.native
    
    /**
      Add the given text to the document. When escape is not `false`,
      it will be escaped.
      */
    def text(text: String): Unit = js.native
    def text(text: String, escape: Boolean): Unit = js.native
    
    /**
      Render a block, prefixing each line with `delim`, and the first
      line in `firstDelim`. `node` should be the node that is closed at
      the end of the block, and `f` is a function that renders the
      content of the block.
      */
    def wrapBlock(delim: String, firstDelim: String, node: Node, f: js.Function0[Unit]): Unit = js.native
    def wrapBlock(delim: String, firstDelim: Null, node: Node, f: js.Function0[Unit]): Unit = js.native
    
    /**
      Prepare the state for writing output (closing closed paragraphs,
      adding delimiters, and so on), and then optionally add content
      (unescaped) to the output.
      */
    def write(): Unit = js.native
    def write(content: String): Unit = js.native
  }
  
  /**
  A parser parsing unextended [CommonMark](http://commonmark.org/),
  without inline HTML, and producing a document in the basic schema.
  */
  @JSImport("prosemirror-markdown", "defaultMarkdownParser")
  @js.native
  val defaultMarkdownParser: MarkdownParser = js.native
  
  /**
  A serializer for the [basic schema](https://prosemirror.net/docs/ref/#schema).
  */
  @JSImport("prosemirror-markdown", "defaultMarkdownSerializer")
  @js.native
  val defaultMarkdownSerializer: MarkdownSerializer = js.native
  
  /**
  Document schema for the data model used by CommonMark.
  */
  @JSImport("prosemirror-markdown", "schema")
  @js.native
  val schema: Schema[
    blockquote | image | text | doc | paragraph | horizontal_rule | heading | code_block | ordered_list | bullet_list | list_item | hard_break, 
    link | code | em | strong
  ] = js.native
  
  trait MarkSerializerSpec extends StObject {
    
    /**
      The string that should appear after a piece of content marked by
      this mark.
      */
    var close: String | (js.Function4[
        /* state */ MarkdownSerializerState, 
        /* mark */ Mark, 
        /* parent */ Node, 
        /* index */ Double, 
        String
      ])
    
    /**
      Can be set to `false` to disable character escaping in a mark. A
      non-escaping mark has to have the highest precedence (must
      always be the innermost mark).
      */
    var escape: js.UndefOr[Boolean] = js.undefined
    
    /**
      When enabled, causes the serializer to move enclosing whitespace
      from inside the marks to outside the marks. This is necessary
      for emphasis marks as CommonMark does not permit enclosing
      whitespace inside emphasis marks, see:
      http:spec.commonmark.org/0.26/#example-330
      */
    var expelEnclosingWhitespace: js.UndefOr[Boolean] = js.undefined
    
    /**
      When `true`, this indicates that the order in which the mark's
      opening and closing syntax appears relative to other mixable
      marks can be varied. (For example, you can say `**a *b***` and
      `*a **b***`, but not `` `a *b*` ``.)
      */
    var mixable: js.UndefOr[Boolean] = js.undefined
    
    /**
      The string that should appear before a piece of content marked
      by this mark, either directly or as a function that returns an
      appropriate string.
      */
    var open: String | (js.Function4[
        /* state */ MarkdownSerializerState, 
        /* mark */ Mark, 
        /* parent */ Node, 
        /* index */ Double, 
        String
      ])
  }
  object MarkSerializerSpec {
    
    inline def apply(
      close: String | (js.Function4[
          /* state */ MarkdownSerializerState, 
          /* mark */ Mark, 
          /* parent */ Node, 
          /* index */ Double, 
          String
        ]),
      open: String | (js.Function4[
          /* state */ MarkdownSerializerState, 
          /* mark */ Mark, 
          /* parent */ Node, 
          /* index */ Double, 
          String
        ])
    ): MarkSerializerSpec = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkSerializerSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkSerializerSpec] (val x: Self) extends AnyVal {
      
      inline def setClose(
        value: String | (js.Function4[
              /* state */ MarkdownSerializerState, 
              /* mark */ Mark, 
              /* parent */ Node, 
              /* index */ Double, 
              String
            ])
      ): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseFunction4(
        value: (/* state */ MarkdownSerializerState, /* mark */ Mark, /* parent */ Node, /* index */ Double) => String
      ): Self = StObject.set(x, "close", js.Any.fromFunction4(value))
      
      inline def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setExpelEnclosingWhitespace(value: Boolean): Self = StObject.set(x, "expelEnclosingWhitespace", value.asInstanceOf[js.Any])
      
      inline def setExpelEnclosingWhitespaceUndefined: Self = StObject.set(x, "expelEnclosingWhitespace", js.undefined)
      
      inline def setMixable(value: Boolean): Self = StObject.set(x, "mixable", value.asInstanceOf[js.Any])
      
      inline def setMixableUndefined: Self = StObject.set(x, "mixable", js.undefined)
      
      inline def setOpen(
        value: String | (js.Function4[
              /* state */ MarkdownSerializerState, 
              /* mark */ Mark, 
              /* parent */ Node, 
              /* index */ Double, 
              String
            ])
      ): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenFunction4(
        value: (/* state */ MarkdownSerializerState, /* mark */ Mark, /* parent */ Node, /* index */ Double) => String
      ): Self = StObject.set(x, "open", js.Any.fromFunction4(value))
    }
  }
  
  type MarkdownIt = Any
  
  /**
  Object type used to specify how Markdown tokens should be parsed.
  */
  trait ParseSpec extends StObject {
    
    /**
      Attributes for the node or mark. When `getAttrs` is provided,
      it takes precedence.
      */
    var attrs: js.UndefOr[Attrs | Null] = js.undefined
    
    /**
      This token (unless `noCloseToken` is true) comes in `_open`
      and `_close` variants (which are appended to the base token
      name provides a the object property), and wraps a block of
      content. The block should be wrapped in a node of the type
      named to by the property's value. If the token does not have
      `_open` or `_close`, use the `noCloseToken` option.
      */
    var block: js.UndefOr[String] = js.undefined
    
    /**
      A function used to compute the attributes for the node or mark
      that takes a [markdown-it
      token](https://markdown-it.github.io/markdown-it/#Token) and
      returns an attribute object.
      */
    var getAttrs: js.UndefOr[
        js.Function3[/* token */ Token, /* tokenStream */ js.Array[Token], /* index */ Double, Attrs | Null]
      ] = js.undefined
    
    /**
      When true, ignore content for the matched token.
      */
    var ignore: js.UndefOr[Boolean] = js.undefined
    
    /**
      This token (again, unless `noCloseToken` is true) also comes
      in `_open` and `_close` variants, but should add a mark
      (named by the value) to its content, rather than wrapping it
      in a node.
      */
    var mark: js.UndefOr[String] = js.undefined
    
    /**
      Indicates that the [markdown-it
      token](https://markdown-it.github.io/markdown-it/#Token) has
      no `_open` or `_close` for the nodes. This defaults to `true`
      for `code_inline`, `code_block` and `fence`.
      */
    var noCloseToken: js.UndefOr[Boolean] = js.undefined
    
    /**
      This token maps to a single node, whose type can be looked up
      in the schema under the given name. Exactly one of `node`,
      `block`, or `mark` must be set.
      */
    var node: js.UndefOr[String] = js.undefined
  }
  object ParseSpec {
    
    inline def apply(): ParseSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseSpec] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsNull: Self = StObject.set(x, "attrs", null)
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setBlock(value: String): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setGetAttrs(value: (/* token */ Token, /* tokenStream */ js.Array[Token], /* index */ Double) => Attrs | Null): Self = StObject.set(x, "getAttrs", js.Any.fromFunction3(value))
      
      inline def setGetAttrsUndefined: Self = StObject.set(x, "getAttrs", js.undefined)
      
      inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setNoCloseToken(value: Boolean): Self = StObject.set(x, "noCloseToken", value.asInstanceOf[js.Any])
      
      inline def setNoCloseTokenUndefined: Self = StObject.set(x, "noCloseToken", js.undefined)
      
      inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
  
  type Token = Any
}
