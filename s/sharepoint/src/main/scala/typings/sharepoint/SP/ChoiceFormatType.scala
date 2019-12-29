package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChoiceFormatType extends js.Object

@JSGlobal("SP.ChoiceFormatType")
@js.native
object ChoiceFormatType extends js.Object {
  @js.native
  sealed trait dropdown extends ChoiceFormatType
  
  @js.native
  sealed trait radioButtons extends ChoiceFormatType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChoiceFormatType with Double] = js.native
  /* 0 */ @js.native
  object dropdown extends TopLevel[dropdown with Double]
  
  /* 1 */ @js.native
  object radioButtons extends TopLevel[radioButtons with Double]
  
}

