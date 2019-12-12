package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SPClientTemplates.RichTextMode.Compatible
import typings.sharepoint.SPClientTemplates.RichTextMode.FullHtml
import typings.sharepoint.SPClientTemplates.RichTextMode.HtmlAsXml
import typings.sharepoint.SPClientTemplates.RichTextMode.ThemeHtml
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RichTextMode with Double] = js.native
  /* 0 */ @js.native
  object Compatible extends TopLevel[Compatible with Double]
  
  /* 1 */ @js.native
  object FullHtml extends TopLevel[FullHtml with Double]
  
  /* 2 */ @js.native
  object HtmlAsXml extends TopLevel[HtmlAsXml with Double]
  
  /* 3 */ @js.native
  object ThemeHtml extends TopLevel[ThemeHtml with Double]
  
}

