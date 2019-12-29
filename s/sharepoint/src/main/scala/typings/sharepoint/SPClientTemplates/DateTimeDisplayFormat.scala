package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeDisplayFormat extends js.Object

@JSGlobal("SPClientTemplates.DateTimeDisplayFormat")
@js.native
object DateTimeDisplayFormat extends js.Object {
  @js.native
  sealed trait DateOnly extends DateTimeDisplayFormat
  
  @js.native
  sealed trait DateTime extends DateTimeDisplayFormat
  
  @js.native
  sealed trait TimeOnly extends DateTimeDisplayFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeDisplayFormat with Double] = js.native
  /* 0 */ @js.native
  object DateOnly extends TopLevel[DateOnly with Double]
  
  /* 1 */ @js.native
  object DateTime extends TopLevel[DateTime with Double]
  
  /* 2 */ @js.native
  object TimeOnly extends TopLevel[TimeOnly with Double]
  
}

