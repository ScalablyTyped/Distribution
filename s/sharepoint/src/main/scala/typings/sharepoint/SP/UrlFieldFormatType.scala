package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UrlFieldFormatType extends js.Object

@JSGlobal("SP.UrlFieldFormatType")
@js.native
object UrlFieldFormatType extends js.Object {
  @js.native
  sealed trait hyperlink extends UrlFieldFormatType
  
  @js.native
  sealed trait image extends UrlFieldFormatType
  
  /* 0 */ val hyperlink: typings.sharepoint.SP.UrlFieldFormatType.hyperlink with Double = js.native
  /* 1 */ val image: typings.sharepoint.SP.UrlFieldFormatType.image with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UrlFieldFormatType with Double] = js.native
}

