package typings.prosemirrorSchemaBasic

import typings.prosemirrorModel.mod.MarkSpec
import typings.prosemirrorModel.mod.NodeSpec
import typings.prosemirrorModel.mod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-schema-basic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object marks {
    
    @JSImport("prosemirror-schema-basic", "marks")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("prosemirror-schema-basic", "marks.code")
    @js.native
    def code: MarkSpec = js.native
    inline def code_=(x: MarkSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("code")(x.asInstanceOf[js.Any])
    
    @JSImport("prosemirror-schema-basic", "marks.em")
    @js.native
    def em: MarkSpec = js.native
    inline def em_=(x: MarkSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("em")(x.asInstanceOf[js.Any])
    
    @JSImport("prosemirror-schema-basic", "marks.link")
    @js.native
    def link: MarkSpec = js.native
    inline def link_=(x: MarkSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("link")(x.asInstanceOf[js.Any])
    
    @JSImport("prosemirror-schema-basic", "marks.strong")
    @js.native
    def strong: MarkSpec = js.native
    inline def strong_=(x: MarkSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strong")(x.asInstanceOf[js.Any])
  }
  
  object nodes {
    
    @JSImport("prosemirror-schema-basic", "nodes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("prosemirror-schema-basic", "nodes.blockquote")
    @js.native
    def blockquote: NodeSpec = js.native
    inline def blockquote_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockquote")(x.asInstanceOf[js.Any])
    
    @JSImport("prosemirror-schema-basic", "nodes.code_block")
    @js.native
    def codeBlock: NodeSpec = js.native
    
    inline def codeBlock_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("code_block")(x.asInstanceOf[js.Any])
    
    @JSImport("prosemirror-schema-basic", "nodes.doc")
    @js.native
    def doc: NodeSpec = js.native
    inline def doc_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("doc")(x.asInstanceOf[js.Any])
    
    @JSImport("prosemirror-schema-basic", "nodes.hard_break")
    @js.native
    def hardBreak: NodeSpec = js.native
    
    inline def hardBreak_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hard_break")(x.asInstanceOf[js.Any])
    
    @JSImport("prosemirror-schema-basic", "nodes.heading")
    @js.native
    def heading: NodeSpec = js.native
    inline def heading_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading")(x.asInstanceOf[js.Any])
    
    @JSImport("prosemirror-schema-basic", "nodes.horizontal_rule")
    @js.native
    def horizontalRule: NodeSpec = js.native
    
    inline def horizontalRule_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("horizontal_rule")(x.asInstanceOf[js.Any])
    
    @JSImport("prosemirror-schema-basic", "nodes.image")
    @js.native
    def image: NodeSpec = js.native
    inline def image_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("image")(x.asInstanceOf[js.Any])
    
    @JSImport("prosemirror-schema-basic", "nodes.paragraph")
    @js.native
    def paragraph: NodeSpec = js.native
    inline def paragraph_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(x.asInstanceOf[js.Any])
    
    @JSImport("prosemirror-schema-basic", "nodes.text")
    @js.native
    def text: NodeSpec = js.native
    inline def text_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("prosemirror-schema-basic", "schema")
  @js.native
  def schema: Schema[
    /* keyof {[ name in keyof typeof nodes ]: prosemirror-model.prosemirror-model.NodeType<prosemirror-model.prosemirror-model.Schema<keyof typeof nodes, keyof typeof marks>>} & {[key: string] : prosemirror-model.prosemirror-model.NodeType<prosemirror-model.prosemirror-model.Schema<keyof typeof nodes, keyof typeof marks>>} */ String, 
    /* keyof {[ name in keyof typeof marks ]: prosemirror-model.prosemirror-model.MarkType<prosemirror-model.prosemirror-model.Schema<keyof typeof nodes, keyof typeof marks>>} & {[key: string] : prosemirror-model.prosemirror-model.MarkType<prosemirror-model.prosemirror-model.Schema<keyof typeof nodes, keyof typeof marks>>} */ String
  ] = js.native
  inline def schema_=(
    x: Schema[
      /* keyof {[ name in keyof typeof nodes ]: prosemirror-model.prosemirror-model.NodeType<prosemirror-model.prosemirror-model.Schema<keyof typeof nodes, keyof typeof marks>>} & {[key: string] : prosemirror-model.prosemirror-model.NodeType<prosemirror-model.prosemirror-model.Schema<keyof typeof nodes, keyof typeof marks>>} */ String, 
      /* keyof {[ name in keyof typeof marks ]: prosemirror-model.prosemirror-model.MarkType<prosemirror-model.prosemirror-model.Schema<keyof typeof nodes, keyof typeof marks>>} & {[key: string] : prosemirror-model.prosemirror-model.MarkType<prosemirror-model.prosemirror-model.Schema<keyof typeof nodes, keyof typeof marks>>} */ String
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("schema")(x.asInstanceOf[js.Any])
}
