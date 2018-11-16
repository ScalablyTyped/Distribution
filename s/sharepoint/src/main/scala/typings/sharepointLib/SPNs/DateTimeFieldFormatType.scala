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
  
  val dateOnly: dateOnly with java.lang.String = js.native
  val dateTime: dateTime with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.DateTimeFieldFormatType with java.lang.String] = js.native
}

