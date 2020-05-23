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
  
}

