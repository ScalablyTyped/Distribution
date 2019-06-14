package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeDisplayFormat extends js.Object

@JSGlobal("SPClientTemplates.DateTimeDisplayFormat")
@js.native
object DateTimeDisplayFormat extends js.Object {
  @js.native
  sealed trait DateOnly
    extends sharepointLib.SPClientTemplatesNs.DateTimeDisplayFormat
  
  @js.native
  sealed trait DateTime
    extends sharepointLib.SPClientTemplatesNs.DateTimeDisplayFormat
  
  @js.native
  sealed trait TimeOnly
    extends sharepointLib.SPClientTemplatesNs.DateTimeDisplayFormat
  
  /* 0 */ val DateOnly: DateOnly with scala.Double = js.native
  /* 1 */ val DateTime: DateTime with scala.Double = js.native
  /* 2 */ val TimeOnly: TimeOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPClientTemplatesNs.DateTimeDisplayFormat with scala.Double] = js.native
}

