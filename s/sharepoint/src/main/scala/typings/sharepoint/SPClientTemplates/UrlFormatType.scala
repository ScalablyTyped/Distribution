package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UrlFormatType extends js.Object
@JSGlobal("SPClientTemplates.UrlFormatType")
@js.native
object UrlFormatType extends js.Object {
  
  @js.native
  sealed trait Hyperlink extends UrlFormatType
  
  @js.native
  sealed trait Image extends UrlFormatType
}
