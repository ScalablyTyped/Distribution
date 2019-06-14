package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeFieldFriendlyFormatType extends js.Object

@JSGlobal("SP.DateTimeFieldFriendlyFormatType")
@js.native
object DateTimeFieldFriendlyFormatType extends js.Object {
  @js.native
  sealed trait disabled
    extends sharepointLib.SPNs.DateTimeFieldFriendlyFormatType
  
  @js.native
  sealed trait relative
    extends sharepointLib.SPNs.DateTimeFieldFriendlyFormatType
  
  @js.native
  sealed trait unspecified
    extends sharepointLib.SPNs.DateTimeFieldFriendlyFormatType
  
  /* 1 */ val disabled: disabled with scala.Double = js.native
  /* 2 */ val relative: relative with scala.Double = js.native
  /* 0 */ val unspecified: unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.DateTimeFieldFriendlyFormatType with scala.Double] = js.native
}

