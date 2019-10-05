package typings.prismicDashDom

import typings.prismicDashDom.prismicDashDomMod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prismic-dom", JSImport.Namespace)
@js.native
object prismicDashDomMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.prismicDashDom.prismicDashDomStrings.heading1
    - typings.prismicDashDom.prismicDashDomStrings.heading2
    - typings.prismicDashDom.prismicDashDomStrings.heading3
    - typings.prismicDashDom.prismicDashDomStrings.heading4
    - typings.prismicDashDom.prismicDashDomStrings.heading5
    - typings.prismicDashDom.prismicDashDomStrings.heading6
    - typings.prismicDashDom.prismicDashDomStrings.paragraph
    - typings.prismicDashDom.prismicDashDomStrings.preformatted
    - typings.prismicDashDom.prismicDashDomStrings.strong
    - typings.prismicDashDom.prismicDashDomStrings.em
    - typings.prismicDashDom.prismicDashDomStrings.`list-item`
    - typings.prismicDashDom.prismicDashDomStrings.`o-list-item`
    - typings.prismicDashDom.prismicDashDomStrings.`group-list-item`
    - typings.prismicDashDom.prismicDashDomStrings.`group-o-list-item`
    - typings.prismicDashDom.prismicDashDomStrings.image
    - typings.prismicDashDom.prismicDashDomStrings.embed
    - typings.prismicDashDom.prismicDashDomStrings.hyperlink
    - typings.prismicDashDom.prismicDashDomStrings.label
    - typings.prismicDashDom.prismicDashDomStrings.span
  */
  trait ElementType extends js.Object
  
  @js.native
  trait Link extends js.Object {
    def url(link: js.Any): String = js.native
    def url(link: js.Any, linkResolver: js.Function1[/* doc */ js.Any, String]): String = js.native
  }
  
  @js.native
  trait RichText extends js.Object {
    var Elements: typings.prismicDashDom.prismicDashDomMod.Elements = js.native
    def asHtml(richText: js.Any): String = js.native
    def asHtml(richText: js.Any, linkResolver: js.Function1[/* doc */ js.Any, String]): String = js.native
    def asHtml(
      richText: js.Any,
      linkResolver: js.Function1[/* doc */ js.Any, String],
      serializer: typings.prismicDashDom.prismicDashDomMod.HTMLSerializer[String]
    ): String = js.native
    def asText(richText: js.Any): String = js.native
    def asText(richText: js.Any, joinString: String): String = js.native
  }
  
  val HTMLSerializer: typings.prismicDashDom.prismicDashDomMod.HTMLSerializer[String] = js.native
  val Link: typings.prismicDashDom.prismicDashDomMod.Link = js.native
  val RichText: typings.prismicDashDom.prismicDashDomMod.RichText = js.native
  @js.native
  object default extends js.Object {
    var Link: typings.prismicDashDom.prismicDashDomMod.Link = js.native
    var RichText: typings.prismicDashDom.prismicDashDomMod.RichText = js.native
  }
  
  type Elements = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in prismic-dom.prismic-dom.ElementType ]: string}
    */ typings.prismicDashDom.prismicDashDomStrings.Elements with js.Any
  type HTMLSerializer[T] = js.Function5[
    /* type */ ElementType, 
    /* element */ js.Any, 
    /* text */ String | Null, 
    /* children */ js.Array[T], 
    /* index */ Double, 
    T
  ]
}

