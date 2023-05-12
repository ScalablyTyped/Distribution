package typings.prosemirrorSchemaBasic

import typings.prosemirrorModel.mod.MarkSpec
import typings.prosemirrorModel.mod.NodeSpec
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorSchemaBasic.prosemirrorSchemaBasicStrings.blockquote
import typings.prosemirrorSchemaBasic.prosemirrorSchemaBasicStrings.code
import typings.prosemirrorSchemaBasic.prosemirrorSchemaBasicStrings.code_block
import typings.prosemirrorSchemaBasic.prosemirrorSchemaBasicStrings.doc
import typings.prosemirrorSchemaBasic.prosemirrorSchemaBasicStrings.em
import typings.prosemirrorSchemaBasic.prosemirrorSchemaBasicStrings.hard_break
import typings.prosemirrorSchemaBasic.prosemirrorSchemaBasicStrings.heading
import typings.prosemirrorSchemaBasic.prosemirrorSchemaBasicStrings.horizontal_rule
import typings.prosemirrorSchemaBasic.prosemirrorSchemaBasicStrings.image
import typings.prosemirrorSchemaBasic.prosemirrorSchemaBasicStrings.link
import typings.prosemirrorSchemaBasic.prosemirrorSchemaBasicStrings.paragraph
import typings.prosemirrorSchemaBasic.prosemirrorSchemaBasicStrings.strong
import typings.prosemirrorSchemaBasic.prosemirrorSchemaBasicStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  [Specs](https://prosemirror.net/docs/ref/#model.MarkSpec) for the marks in the schema.
  */
  object marks {
    
    @JSImport("prosemirror-schema-basic", "marks")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Code font mark. Represented as a `<code>` element.
      */
    @JSImport("prosemirror-schema-basic", "marks.code")
    @js.native
    def code: MarkSpec = js.native
    inline def code_=(x: MarkSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("code")(x.asInstanceOf[js.Any])
    
    /**
      An emphasis mark. Rendered as an `<em>` element. Has parse rules
      that also match `<i>` and `font-style: italic`.
      */
    @JSImport("prosemirror-schema-basic", "marks.em")
    @js.native
    def em: MarkSpec = js.native
    inline def em_=(x: MarkSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("em")(x.asInstanceOf[js.Any])
    
    /**
      A link. Has `href` and `title` attributes. `title`
      defaults to the empty string. Rendered and parsed as an `<a>`
      element.
      */
    @JSImport("prosemirror-schema-basic", "marks.link")
    @js.native
    def link: MarkSpec = js.native
    inline def link_=(x: MarkSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("link")(x.asInstanceOf[js.Any])
    
    /**
      A strong mark. Rendered as `<strong>`, parse rules also match
      `<b>` and `font-weight: bold`.
      */
    @JSImport("prosemirror-schema-basic", "marks.strong")
    @js.native
    def strong: MarkSpec = js.native
    inline def strong_=(x: MarkSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strong")(x.asInstanceOf[js.Any])
  }
  
  /**
  [Specs](https://prosemirror.net/docs/ref/#model.NodeSpec) for the nodes defined in this schema.
  */
  object nodes {
    
    @JSImport("prosemirror-schema-basic", "nodes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      A blockquote (`<blockquote>`) wrapping one or more blocks.
      */
    @JSImport("prosemirror-schema-basic", "nodes.blockquote")
    @js.native
    def blockquote: NodeSpec = js.native
    inline def blockquote_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockquote")(x.asInstanceOf[js.Any])
    
    /**
      A code listing. Disallows marks or non-text inline
      nodes by default. Represented as a `<pre>` element with a
      `<code>` element inside of it.
      */
    @JSImport("prosemirror-schema-basic", "nodes.code_block")
    @js.native
    def codeBlock: NodeSpec = js.native
    
    inline def codeBlock_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("code_block")(x.asInstanceOf[js.Any])
    
    /**
      NodeSpec The top level document node.
      */
    @JSImport("prosemirror-schema-basic", "nodes.doc")
    @js.native
    def doc: NodeSpec = js.native
    inline def doc_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("doc")(x.asInstanceOf[js.Any])
    
    /**
      A hard line break, represented in the DOM as `<br>`.
      */
    @JSImport("prosemirror-schema-basic", "nodes.hard_break")
    @js.native
    def hardBreak: NodeSpec = js.native
    
    inline def hardBreak_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hard_break")(x.asInstanceOf[js.Any])
    
    /**
      A heading textblock, with a `level` attribute that
      should hold the number 1 to 6. Parsed and serialized as `<h1>` to
      `<h6>` elements.
      */
    @JSImport("prosemirror-schema-basic", "nodes.heading")
    @js.native
    def heading: NodeSpec = js.native
    inline def heading_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading")(x.asInstanceOf[js.Any])
    
    /**
      A horizontal rule (`<hr>`).
      */
    @JSImport("prosemirror-schema-basic", "nodes.horizontal_rule")
    @js.native
    def horizontalRule: NodeSpec = js.native
    
    inline def horizontalRule_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("horizontal_rule")(x.asInstanceOf[js.Any])
    
    /**
      An inline image (`<img>`) node. Supports `src`,
      `alt`, and `href` attributes. The latter two default to the empty
      string.
      */
    @JSImport("prosemirror-schema-basic", "nodes.image")
    @js.native
    def image: NodeSpec = js.native
    inline def image_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("image")(x.asInstanceOf[js.Any])
    
    /**
      A plain paragraph textblock. Represented in the DOM
      as a `<p>` element.
      */
    @JSImport("prosemirror-schema-basic", "nodes.paragraph")
    @js.native
    def paragraph: NodeSpec = js.native
    inline def paragraph_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(x.asInstanceOf[js.Any])
    
    /**
      The text node.
      */
    @JSImport("prosemirror-schema-basic", "nodes.text")
    @js.native
    def text: NodeSpec = js.native
    inline def text_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
  }
  
  /**
  This schema roughly corresponds to the document schema used by
  [CommonMark](http://commonmark.org/), minus the list elements,
  which are defined in the [`prosemirror-schema-list`](https://prosemirror.net/docs/ref/#schema-list)
  module.
  To reuse elements from this schema, extend or read from its
  `spec.nodes` and `spec.marks` [properties](https://prosemirror.net/docs/ref/#model.Schema.spec).
  */
  @JSImport("prosemirror-schema-basic", "schema")
  @js.native
  val schema: Schema[
    blockquote | image | text | doc | paragraph | horizontal_rule | heading | code_block | hard_break, 
    link | code | em | strong
  ] = js.native
}
