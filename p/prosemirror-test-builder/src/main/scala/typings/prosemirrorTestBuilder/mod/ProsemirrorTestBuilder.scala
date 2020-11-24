package typings.prosemirrorTestBuilder.mod

import org.scalablytyped.runtime.TopLevel
import typings.prosemirrorModel.mod.Schema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProsemirrorTestBuilder extends js.Object {
  
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
