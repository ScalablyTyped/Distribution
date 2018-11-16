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
  
  val disabled: disabled with java.lang.String = js.native
  val relative: relative with java.lang.String = js.native
  val unspecified: unspecified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.DateTimeFieldFriendlyFormatType with java.lang.String] = js.native
}

