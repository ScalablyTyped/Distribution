package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RichTextMode extends js.Object

@JSGlobal("SPClientTemplates.RichTextMode")
@js.native
object RichTextMode extends js.Object {
  @js.native
  sealed trait Compatible
    extends sharepointLib.SPClientTemplatesNs.RichTextMode
  
  @js.native
  sealed trait FullHtml
    extends sharepointLib.SPClientTemplatesNs.RichTextMode
  
  @js.native
  sealed trait HtmlAsXml
    extends sharepointLib.SPClientTemplatesNs.RichTextMode
  
  @js.native
  sealed trait ThemeHtml
    extends sharepointLib.SPClientTemplatesNs.RichTextMode
  
  val Compatible: Compatible with java.lang.String = js.native
  val FullHtml: FullHtml with java.lang.String = js.native
  val HtmlAsXml: HtmlAsXml with java.lang.String = js.native
  val ThemeHtml: ThemeHtml with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPClientTemplatesNs.RichTextMode with java.lang.String] = js.native
}

