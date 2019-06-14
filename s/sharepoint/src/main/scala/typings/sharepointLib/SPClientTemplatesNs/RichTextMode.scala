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
  
  /* 0 */ val Compatible: Compatible with scala.Double = js.native
  /* 1 */ val FullHtml: FullHtml with scala.Double = js.native
  /* 2 */ val HtmlAsXml: HtmlAsXml with scala.Double = js.native
  /* 3 */ val ThemeHtml: ThemeHtml with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPClientTemplatesNs.RichTextMode with scala.Double] = js.native
}

