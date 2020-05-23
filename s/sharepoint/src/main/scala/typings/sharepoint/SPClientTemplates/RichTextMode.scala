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
  
}

