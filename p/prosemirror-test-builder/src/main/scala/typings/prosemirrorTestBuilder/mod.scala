package typings.prosemirrorTestBuilder

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.TopLevel
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("prosemirror-test-builder", JSImport.Namespace)
  @js.native
  val ^ : ProsemirrorTestBuilder = js.native
  
  type Args = js.Array[String | TaggedProsemirrorNode[js.Any] | TaggedFlatObject[js.Any]]
  
  type Builder = js.Function2[
    /* testSchema */ Schema[String, String], 
    /* names */ Record[String, NodeTypeAttributes | MarkTypeAttributes], 
    (Record[String, NodeBuilderMethod[Schema[String, String]]]) with (Record[String, MarkBuilderMethod[Schema[String, String]]]) with typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.Builder with (TopLevel[Record[String, NodeTypeAttributes | MarkTypeAttributes]])
  ]
  
  @js.native
  trait EqMethod extends StObject {
    
    def eq(param: EqMethod): Boolean = js.native
  }
  object EqMethod {
    
    @scala.inline
    def apply(eq_ : EqMethod => Boolean): EqMethod = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
      __obj.asInstanceOf[EqMethod]
    }
    
    @scala.inline
    implicit class EqMethodMutableBuilder[Self <: EqMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEq_(value: EqMethod => Boolean): Self = StObject.set(x, "eq", js.Any.fromFunction1(value))
    }
  }
  
  type MarkBuilderMethod[S /* <: Schema[_, _] */] = js.Function1[/* args */ Args, TaggedFlatObject[S]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ @js.native
  trait MarkTypeAttributes extends StObject {
    
    var markType: String = js.native
  }
  object MarkTypeAttributes {
    
    @scala.inline
    def apply(markType: String): MarkTypeAttributes = {
      val __obj = js.Dynamic.literal(markType = markType.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkTypeAttributes]
    }
    
    @scala.inline
    implicit class MarkTypeAttributesMutableBuilder[Self <: MarkTypeAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarkType(value: String): Self = StObject.set(x, "markType", value.asInstanceOf[js.Any])
    }
  }
  
  type NodeBuilderMethod[S /* <: Schema[_, _] */] = js.Function1[/* args */ Args, TaggedProsemirrorNode[S]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ @js.native
  trait NodeTypeAttributes extends StObject {
    
    var nodeType: String = js.native
  }
  object NodeTypeAttributes {
    
    @scala.inline
    def apply(nodeType: String): NodeTypeAttributes = {
      val __obj = js.Dynamic.literal(nodeType = nodeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeTypeAttributes]
    }
    
    @scala.inline
    implicit class NodeTypeAttributesMutableBuilder[Self <: NodeTypeAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProsemirrorTestBuilder extends StObject {
    
    def a(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedFlatObject[TestSchema] = js.native
    @JSName("a")
    var a_Original: MarkBuilderMethod[TestSchema] = js.native
    
    def blockquote(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("blockquote")
    var blockquote_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def br(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("br")
    var br_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def builders[Obj /* <: Record[String, NodeTypeAttributes | MarkTypeAttributes] */, N /* <: String */, M /* <: String */](testSchema: Schema[N, M], names: Obj): (Record[N, NodeBuilderMethod[Schema[N, M]]]) with (Record[M, MarkBuilderMethod[Schema[N, M]]]) with typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ProsemirrorTestBuilder with TopLevel[Obj] = js.native
    @JSName("builders")
    var builders_Original: Builder = js.native
    
    def bullet_list(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("bullet_list")
    var bullet_list_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def code(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedFlatObject[TestSchema] = js.native
    @JSName("code")
    var code_Original: MarkBuilderMethod[TestSchema] = js.native
    
    def code_block(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("code_block")
    var code_block_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def doc(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("doc")
    var doc_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def em(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedFlatObject[TestSchema] = js.native
    @JSName("em")
    var em_Original: MarkBuilderMethod[TestSchema] = js.native
    
    def eq(a: EqMethod, b: EqMethod): Boolean = js.native
    
    def h1(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("h1")
    var h1_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def h2(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("h2")
    var h2_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def h3(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("h3")
    var h3_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def hard_break(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("hard_break")
    var hard_break_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def heading(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("heading")
    var heading_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def horizontal_rule(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("horizontal_rule")
    var horizontal_rule_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def hr(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("hr")
    var hr_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def image(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("image")
    var image_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def img(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("img")
    var img_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def li(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("li")
    var li_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def link(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedFlatObject[TestSchema] = js.native
    @JSName("link")
    var link_Original: MarkBuilderMethod[TestSchema] = js.native
    
    def list_item(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("list_item")
    var list_item_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def ol(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("ol")
    var ol_Original: NodeBuilderMethod[TestSchema] = js.native
    
    // From schema list
    def ordered_list(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    // From schema list
    @JSName("ordered_list")
    var ordered_list_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def p(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("p")
    var p_Original: NodeBuilderMethod[TestSchema] = js.native
    
    // From schema basic
    def paragraph(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    // From schema basic
    @JSName("paragraph")
    var paragraph_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def pre(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("pre")
    var pre_Original: NodeBuilderMethod[TestSchema] = js.native
    
    var schema: TestSchema = js.native
    
    def strong(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedFlatObject[TestSchema] = js.native
    @JSName("strong")
    var strong_Original: MarkBuilderMethod[TestSchema] = js.native
    
    def text(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("text")
    var text_Original: NodeBuilderMethod[TestSchema] = js.native
    
    def ul(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): TaggedProsemirrorNode[TestSchema] = js.native
    @JSName("ul")
    var ul_Original: NodeBuilderMethod[TestSchema] = js.native
  }
  
  @js.native
  trait TaggedFlatObject[S /* <: Schema[_, _] */] extends StObject {
    
    var flat: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]] = js.native
    
    var tag: Record[String, Double] = js.native
  }
  object TaggedFlatObject {
    
    @scala.inline
    def apply[S /* <: Schema[_, _] */](flat: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]], tag: Record[String, Double]): TaggedFlatObject[S] = {
      val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaggedFlatObject[S]]
    }
    
    @scala.inline
    implicit class TaggedFlatObjectMutableBuilder[Self <: TaggedFlatObject[_], S /* <: Schema[_, _] */] (val x: Self with TaggedFlatObject[S]) extends AnyVal {
      
      @scala.inline
      def setFlat(value: js.Array[TaggedProsemirrorNode[S] | TaggedFlatObject[S]]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatVarargs(value: (TaggedProsemirrorNode[S] | TaggedFlatObject[S])*): Self = StObject.set(x, "flat", js.Array(value :_*))
      
      @scala.inline
      def setTag(value: Record[String, Double]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TaggedProsemirrorNode[S /* <: Schema[_, _] */]
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
    
    @scala.inline
    def a: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.a = "a".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.a]
    
    @scala.inline
    def code: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code = "code".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code]
    
    @scala.inline
    def em: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.em = "em".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.em]
    
    @scala.inline
    def link: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.link = "link".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.link]
    
    @scala.inline
    def strong: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.strong = "strong".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.strong]
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
    
    @scala.inline
    def blockquote: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.blockquote = "blockquote".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.blockquote]
    
    @scala.inline
    def br: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.br = "br".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.br]
    
    @scala.inline
    def bullet_list: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.bullet_list = "bullet_list".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.bullet_list]
    
    @scala.inline
    def code_block: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code_block = "code_block".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.code_block]
    
    @scala.inline
    def doc: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.doc = "doc".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.doc]
    
    @scala.inline
    def h1: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h1 = "h1".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h1]
    
    @scala.inline
    def h2: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h2 = "h2".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h2]
    
    @scala.inline
    def h3: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h3 = "h3".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.h3]
    
    @scala.inline
    def hard_break: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hard_break = "hard_break".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hard_break]
    
    @scala.inline
    def heading: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.heading = "heading".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.heading]
    
    @scala.inline
    def horizontal_rule: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.horizontal_rule = "horizontal_rule".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.horizontal_rule]
    
    @scala.inline
    def hr: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hr = "hr".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.hr]
    
    @scala.inline
    def image: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.image = "image".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.image]
    
    @scala.inline
    def img: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.img = "img".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.img]
    
    @scala.inline
    def li: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.li = "li".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.li]
    
    @scala.inline
    def list_item: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.list_item = "list_item".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.list_item]
    
    @scala.inline
    def ol: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ol = "ol".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ol]
    
    @scala.inline
    def ordered_list: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ordered_list = "ordered_list".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ordered_list]
    
    @scala.inline
    def p: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.p = "p".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.p]
    
    @scala.inline
    def paragraph: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.paragraph = "paragraph".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.paragraph]
    
    @scala.inline
    def pre: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.pre = "pre".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.pre]
    
    @scala.inline
    def text: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.text = "text".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.text]
    
    @scala.inline
    def ul: typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ul = "ul".asInstanceOf[typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.ul]
  }
  
  type TestSchema = Schema[TestNodesUnion, TestMarksUnion]
  
  type _To = ProsemirrorTestBuilder
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ProsemirrorTestBuilder = ^
}
