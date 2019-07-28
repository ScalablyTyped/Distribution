package typings.sharepoint.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UrlFormatType extends js.Object

@JSGlobal("SPClientTemplates.UrlFormatType")
@js.native
object UrlFormatType extends js.Object {
  @js.native
  sealed trait Hyperlink extends UrlFormatType
  
  @js.native
  sealed trait Image extends UrlFormatType
  
  /* 0 */ val Hyperlink: typings.sharepoint.SPClientTemplatesNs.UrlFormatType.Hyperlink with Double = js.native
  /* 1 */ val Image: typings.sharepoint.SPClientTemplatesNs.UrlFormatType.Image with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UrlFormatType with Double] = js.native
}

