package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UrlFieldFormatType with Double] = js.native
  /* 0 */ @js.native
  object hyperlink extends TopLevel[hyperlink with Double]
  
  /* 1 */ @js.native
  object image extends TopLevel[image with Double]
  
}

