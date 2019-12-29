package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UrlFormatType with Double] = js.native
  /* 0 */ @js.native
  object Hyperlink extends TopLevel[Hyperlink with Double]
  
  /* 1 */ @js.native
  object Image extends TopLevel[Image with Double]
  
}

