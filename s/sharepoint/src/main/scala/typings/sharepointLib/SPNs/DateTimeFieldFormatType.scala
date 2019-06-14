package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeFieldFormatType extends js.Object

@JSGlobal("SP.DateTimeFieldFormatType")
@js.native
object DateTimeFieldFormatType extends js.Object {
  @js.native
  sealed trait dateOnly
    extends sharepointLib.SPNs.DateTimeFieldFormatType
  
  @js.native
  sealed trait dateTime
    extends sharepointLib.SPNs.DateTimeFieldFormatType
  
  /* 0 */ val dateOnly: dateOnly with scala.Double = js.native
  /* 1 */ val dateTime: dateTime with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.DateTimeFieldFormatType with scala.Double] = js.native
}

