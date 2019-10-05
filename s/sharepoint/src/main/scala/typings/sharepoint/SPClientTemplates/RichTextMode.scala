package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RichTextMode extends js.Object

@JSGlobal("SPClientTemplates.RichTextMode")
@js.native
object RichTextMode extends js.Object {
  @js.native
  sealed trait Compatible extends RichTextMode
  
  @js.native
  sealed trait FullHtml extends RichTextMode
  
  @js.native
  sealed trait HtmlAsXml extends RichTextMode
  
  @js.native
  sealed trait ThemeHtml extends RichTextMode
  
  /* 0 */ val Compatible: typings.sharepoint.SPClientTemplates.RichTextMode.Compatible with Double = js.native
  /* 1 */ val FullHtml: typings.sharepoint.SPClientTemplates.RichTextMode.FullHtml with Double = js.native
  /* 2 */ val HtmlAsXml: typings.sharepoint.SPClientTemplates.RichTextMode.HtmlAsXml with Double = js.native
  /* 3 */ val ThemeHtml: typings.sharepoint.SPClientTemplates.RichTextMode.ThemeHtml with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RichTextMode with Double] = js.native
}

