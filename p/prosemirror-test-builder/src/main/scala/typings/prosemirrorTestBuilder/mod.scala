package typings.prosemirrorTestBuilder

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.TopLevel
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("prosemirror-test-builder", JSImport.Namespace)
  @js.native
  val ^ : ProsemirrorTestBuilder = js.native
  
  type Args = js.Array[String | TaggedProsemirrorNode[js.Any] | TaggedFlatObject[js.Any]]
  
  type Builder = js.Function2[
    /* testSchema */ Schema[String, String], 
    /* names */ Record[String, NodeTypeAttributes | MarkTypeAttributes], 
    (Record[String, NodeBuilderMethod[Schema[String, String]]]) & (Record[String, MarkBuilderMethod[Schema[String, String]]]) & typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.Builder & (TopLevel[Record[String, NodeTypeAttributes | MarkTypeAttributes]])
  ]
  
  trait EqMethod extends StObject {
    
    def eq(param: EqMethod): Boolean
  }
  object EqMethod {
    
    inline def apply(eq_ : EqMethod => Boolean): EqMethod = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
      __obj.asInstanceOf[EqMethod]
    }
    
    extension [Self <: EqMethod](x: Self) {
      
      inline def setEq_(value: EqMethod => Boolean): Self = StObject.set(x, "eq", js.Any.fromFunction1(value))
    }
  }
  
  type MarkBuilderMethod[S /* <: Schema[js.Any, js.Any] */] = js.Function1[/* args */ Args, TaggedFlatObject[S]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait MarkTypeAttributes extends StObject {
    
    var markType: String
  }
  object MarkTypeAttributes {
    
    inline def apply(markType: String): MarkTypeAttributes = {
      val __obj = js.Dynamic.literal(markType = markType.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkTypeAttributes]
    }
    
    extension [Self <: MarkTypeAttributes](x: Self) {
      
      inline def setMarkType(value: String): Self = StObject.set(x, "markType", value.asInstanceOf[js.Any])
    }
  }
  
  type NodeBuilderMethod[S /* <: Schema[js.Any, js.Any] */] = js.Function1[/* args */ Args, TaggedProsemirrorNode[S]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait NodeTypeAttributes extends StObject {
    
    var nodeType: String
  }
  object NodeTypeAttributes {
    
    inline def apply(nodeType: String): NodeTypeAttributes = {
      val __obj = js.Dynamic.literal(nodeType = nodeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeTypeAttributes]
    }
    
    extension [Self <: NodeTypeAttributes](x: Self) {
      
      inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProsemirrorTestBuilder extends StObject {
    
    def a(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedFlatObject[TestSchema]
    @JSName("a")
    var a_Original: MarkBuilderMethod[TestSchema]
    
    def blockquote(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("blockquote")
    var blockquote_Original: NodeBuilderMethod[TestSchema]
    
    def br(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("br")
    var br_Original: NodeBuilderMethod[TestSchema]
    
    def builders[Obj /* <: Record[String, NodeTypeAttributes | MarkTypeAttributes] */, N /* <: String */, M /* <: String */](testSchema: Schema[N, M], names: Obj): (Record[N, NodeBuilderMethod[Schema[N, M]]]) & (Record[M, MarkBuilderMethod[Schema[N, M]]]) & typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ProsemirrorTestBuilder & TopLevel[Obj]
    @JSName("builders")
    var builders_Original: Builder
    
    def bullet_list(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("bullet_list")
    var bullet_list_Original: NodeBuilderMethod[TestSchema]
    
    def code(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedFlatObject[TestSchema]
    @JSName("code")
    var code_Original: MarkBuilderMethod[TestSchema]
    
    def code_block(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("code_block")
    var code_block_Original: NodeBuilderMethod[TestSchema]
    
    def doc(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("doc")
    var doc_Original: NodeBuilderMethod[TestSchema]
    
    def em(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedFlatObject[TestSchema]
    @JSName("em")
    var em_Original: MarkBuilderMethod[TestSchema]
    
    def eq(a: EqMethod, b: EqMethod): Boolean
    
    def h1(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("h1")
    var h1_Original: NodeBuilderMethod[TestSchema]
    
    def h2(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("h2")
    var h2_Original: NodeBuilderMethod[TestSchema]
    
    def h3(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("h3")
    var h3_Original: NodeBuilderMethod[TestSchema]
    
    def hard_break(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("hard_break")
    var hard_break_Original: NodeBuilderMethod[TestSchema]
    
    def heading(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("heading")
    var heading_Original: NodeBuilderMethod[TestSchema]
    
    def horizontal_rule(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("horizontal_rule")
    var horizontal_rule_Original: NodeBuilderMethod[TestSchema]
    
    def hr(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("hr")
    var hr_Original: NodeBuilderMethod[TestSchema]
    
    def image(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("image")
    var image_Original: NodeBuilderMethod[TestSchema]
    
    def img(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("img")
    var img_Original: NodeBuilderMethod[TestSchema]
    
    def li(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("li")
    var li_Original: NodeBuilderMethod[TestSchema]
    
    def link(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedFlatObject[TestSchema]
    @JSName("link")
    var link_Original: MarkBuilderMethod[TestSchema]
    
    def list_item(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("list_item")
    var list_item_Original: NodeBuilderMethod[TestSchema]
    
    def ol(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("ol")
    var ol_Original: NodeBuilderMethod[TestSchema]
    
    // From schema list
    def ordered_list(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    // From schema list
    @JSName("ordered_list")
    var ordered_list_Original: NodeBuilderMethod[TestSchema]
    
    def p(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("p")
    var p_Original: NodeBuilderMethod[TestSchema]
    
    // From schema basic
    def paragraph(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    // From schema basic
    @JSName("paragraph")
    var paragraph_Original: NodeBuilderMethod[TestSchema]
    
    def pre(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("pre")
    var pre_Original: NodeBuilderMethod[TestSchema]
    
    var schema: TestSchema
    
    def strong(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedFlatObject[TestSchema]
    @JSName("strong")
    var strong_Original: MarkBuilderMethod[TestSchema]
    
    def text(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("text")
    var text_Original: NodeBuilderMethod[TestSchema]
    
    def ul(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema]
    @JSName("ul")
    var ul_Original: NodeBuilderMethod[TestSchema]
  }
  object ProsemirrorTestBuilder {
    
    inline def apply(
      a: /* args */ Args => TaggedFlatObject[TestSchema],
      blockquote: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      br: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      builders: (/* testSchema */ Schema[String, String], /* names */ Record[String, NodeTypeAttributes | MarkTypeAttributes]) => (Record[String, NodeBuilderMethod[Schema[String, String]]]) & (Record[String, MarkBuilderMethod[Schema[String, String]]]) & typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.Builder & (TopLevel[Record[String, NodeTypeAttributes | MarkTypeAttributes]]),
      bullet_list: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      code: /* args */ Args => TaggedFlatObject[TestSchema],
      code_block: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      doc: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      em: /* args */ Args => TaggedFlatObject[TestSchema],
      eq_ : (EqMethod, EqMethod) => Boolean,
      h1: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      h2: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      h3: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      hard_break: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      heading: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      horizontal_rule: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      hr: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      image: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      img: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      li: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      link: /* args */ Args => TaggedFlatObject[TestSchema],
      list_item: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      ol: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      ordered_list: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      p: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      paragraph: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      pre: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      schema: TestSchema,
      strong: /* args */ Args => TaggedFlatObject[TestSchema],
      text: /* args */ Args => TaggedProsemirrorNode[TestSchema],
      ul: /* args */ Args => TaggedProsemirrorNode[TestSchema]
    ): ProsemirrorTestBuilder = {
      val __obj = js.Dynamic.literal(a = js.Any.fromFunction1(a), blockquote = js.Any.fromFunction1(blockquote), br = js.Any.fromFunction1(br), builders = js.Any.fromFunction2(builders), bullet_list = js.Any.fromFunction1(bullet_list), code = js.Any.fromFunction1(code), code_block = js.Any.fromFunction1(code_block), doc = js.Any.fromFunction1(doc), em = js.Any.fromFunction1(em), h1 = js.Any.fromFunction1(h1), h2 = js.Any.fromFunction1(h2), h3 = js.Any.fromFunction1(h3), hard_break = js.Any.fromFunction1(hard_break), heading = js.Any.fromFunction1(heading), horizontal_rule = js.Any.fromFunction1(horizontal_rule), hr = js.Any.fromFunction1(hr), image = js.Any.fromFunction1(image), img = js.Any.fromFunction1(img), li = js.Any.fromFunction1(li), link = js.Any.fromFunction1(link), list_item = js.Any.fromFunction1(list_item), ol = js.Any.fromFunction1(ol), ordered_list = js.Any.fromFunction1(ordered_list), p = js.Any.fromFunction1(p), paragraph = js.Any.fromFunction1(paragraph), pre = js.Any.fromFunction1(pre), schema = schema.asInstanceOf[js.Any], strong = js.Any.fromFunction1(strong), text = js.Any.fromFunction1(text), ul = js.Any.fromFunction1(ul))
      __obj.updateDynamic("eq")(js.Any.fromFunction2(eq_))
      __obj.asInstanceOf[ProsemirrorTestBuilder]
    }
    
    extension [Self <: ProsemirrorTestBuilder](x: Self) {
      
      inline def setA(value: /* args */ Args => TaggedFlatObject[TestSchema]): Self = StObject.set(x, "a", js.Any.fromFunction1(value))
      
      inline def setBlockquote(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "blockquote", js.Any.fromFunction1(value))
      
      inline def setBr(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "br", js.Any.fromFunction1(value))
      
      inline def setBuilders(
        value: (/* testSchema */ Schema[String, String], /* names */ Record[String, NodeTypeAttributes | MarkTypeAttributes]) => (Record[String, NodeBuilderMethod[Schema[String, String]]]) & (Record[String, MarkBuilderMethod[Schema[String, String]]]) & typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.Builder & (TopLevel[Record[String, NodeTypeAttributes | MarkTypeAttributes]])
      ): Self = StObject.set(x, "builders", js.Any.fromFunction2(value))
      
      inline def setBullet_list(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "bullet_list", js.Any.fromFunction1(value))
      
      inline def setCode(value: /* args */ Args => TaggedFlatObject[TestSchema]): Self = StObject.set(x, "code", js.Any.fromFunction1(value))
      
      inline def setCode_block(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "code_block", js.Any.fromFunction1(value))
      
      inline def setDoc(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "doc", js.Any.fromFunction1(value))
      
      inline def setEm(value: /* args */ Args => TaggedFlatObject[TestSchema]): Self = StObject.set(x, "em", js.Any.fromFunction1(value))
      
      inline def setEq_(value: (EqMethod, EqMethod) => Boolean): Self = StObject.set(x, "eq", js.Any.fromFunction2(value))
      
      inline def setH1(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "h1", js.Any.fromFunction1(value))
      
      inline def setH2(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "h2", js.Any.fromFunction1(value))
      
      inline def setH3(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "h3", js.Any.fromFunction1(value))
      
      inline def setHard_break(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "hard_break", js.Any.fromFunction1(value))
      
      inline def setHeading(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "heading", js.Any.fromFunction1(value))
      
      inline def setHorizontal_rule(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "horizontal_rule", js.Any.fromFunction1(value))
      
      inline def setHr(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "hr", js.Any.fromFunction1(value))
      
      inline def setImage(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "image", js.Any.fromFunction1(value))
      
      inline def setImg(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "img", js.Any.fromFunction1(value))
      
      inline def setLi(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "li", js.Any.fromFunction1(value))
      
      inline def setLink(value: /* args */ Args => TaggedFlatObject[TestSchema]): Self = StObject.set(x, "link", js.Any.fromFunction1(value))
      
      inline def setList_item(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "list_item", js.Any.fromFunction1(value))
      
      inline def setOl(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "ol", js.Any.fromFunction1(value))
      
      inline def setOrdered_list(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "ordered_list", js.Any.fromFunction1(value))
      
      inline def setP(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "p", js.Any.fromFunction1(value))
      
      inline def setParagraph(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "paragraph", js.Any.fromFunction1(value))
      
      inline def setPre(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "pre", js.Any.fromFunction1(value))
      
      inline def setSchema(value: TestSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setStrong(value: /* args */ Args => TaggedFlatObject[TestSchema]): Self = StObject.set(x, "strong", js.Any.fromFunction1(value))
      
      inline def setText(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
      
      inline def setUl(value: /* args */ Args => TaggedProsemirrorNode[TestSchema]): Self = StObject.set(x, "ul", js.Any.fromFunction1(value))
    }
  }
  
  trait TaggedFlatObject[S /* <: Schema[js.Any, js.Any] */] extends StObject {
    
    var flat: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]]
    
    var tag: Record[String, Double]
  }
  object TaggedFlatObject {
    
    inline def apply[S /* <: Schema[js.Any, js.Any] */](flat: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]], tag: Record[String, Double]): TaggedFlatObject[S] = {
      val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaggedFlatObject[S]]
    }
    
    extension [Self <: TaggedFlatObject[?], S /* <: Schema[js.Any, js.Any] */](x: Self & TaggedFlatObject[S]) {
      
      inline def setFlat(value: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatVarargs(value: (TaggedProsemirrorNode[S] | TaggedFlatObject[S])*): Self = StObject.set(x, "flat", js.Array(value :_*))
      
      inline def setTag(value: Record[String, Double]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TaggedProsemirrorNode[S /* <: Schema[js.Any, js.Any] */]
    extends Node[js.Any]
       with TaggedFlatObject[S]
  
  /* Rewritten from type alias, can be one of: 
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.a
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.link
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.em
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.strong
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code
  */
  trait TestMarksUnion extends StObject
  object TestMarksUnion {
    
    inline def a: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.a = "a".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.a]
    
    inline def code: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code = "code".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code]
    
    inline def em: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.em = "em".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.em]
    
    inline def link: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.link = "link".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.link]
    
    inline def strong: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.strong = "strong".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.strong]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.p
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.pre
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h1
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h2
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h3
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.li
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ul
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ol
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.br
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.img
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hr
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ordered_list
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.bullet_list
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.list_item
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.doc
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.paragraph
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.blockquote
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.horizontal_rule
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.heading
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code_block
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.text
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.image
    - typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hard_break
  */
  trait TestNodesUnion extends StObject
  object TestNodesUnion {
    
    inline def blockquote: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.blockquote = "blockquote".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.blockquote]
    
    inline def br: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.br = "br".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.br]
    
    inline def bullet_list: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.bullet_list = "bullet_list".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.bullet_list]
    
    inline def code_block: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code_block = "code_block".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code_block]
    
    inline def doc: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.doc = "doc".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.doc]
    
    inline def h1: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h1 = "h1".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h1]
    
    inline def h2: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h2 = "h2".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h2]
    
    inline def h3: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h3 = "h3".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h3]
    
    inline def hard_break: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hard_break = "hard_break".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hard_break]
    
    inline def heading: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.heading = "heading".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.heading]
    
    inline def horizontal_rule: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.horizontal_rule = "horizontal_rule".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.horizontal_rule]
    
    inline def hr: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hr = "hr".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hr]
    
    inline def image: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.image = "image".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.image]
    
    inline def img: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.img = "img".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.img]
    
    inline def li: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.li = "li".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.li]
    
    inline def list_item: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.list_item = "list_item".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.list_item]
    
    inline def ol: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ol = "ol".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ol]
    
    inline def ordered_list: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ordered_list = "ordered_list".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ordered_list]
    
    inline def p: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.p = "p".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.p]
    
    inline def paragraph: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.paragraph = "paragraph".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.paragraph]
    
    inline def pre: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.pre = "pre".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.pre]
    
    inline def text: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.text = "text".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.text]
    
    inline def ul: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ul = "ul".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ul]
  }
  
  type TestSchema = Schema[TestNodesUnion, TestMarksUnion]
  
  type _To = ProsemirrorTestBuilder
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ProsemirrorTestBuilder = ^
}
