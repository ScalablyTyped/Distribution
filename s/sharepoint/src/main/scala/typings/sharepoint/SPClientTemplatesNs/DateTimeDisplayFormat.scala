package typings.sharepoint.SPClientTemplatesNs

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
  
  /* 0 */ val DateOnly: typings.sharepoint.SPClientTemplatesNs.DateTimeDisplayFormat.DateOnly with Double = js.native
  /* 1 */ val DateTime: typings.sharepoint.SPClientTemplatesNs.DateTimeDisplayFormat.DateTime with Double = js.native
  /* 2 */ val TimeOnly: typings.sharepoint.SPClientTemplatesNs.DateTimeDisplayFormat.TimeOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeDisplayFormat with Double] = js.native
}

