package typings
package sipDotJsLib.libEnumsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DialogStatus extends js.Object

@JSImport("sip.js/lib/Enums", "DialogStatus")
@js.native
object DialogStatus extends js.Object {
  @js.native
  sealed trait STATUS_CONFIRMED
    extends sipDotJsLib.libEnumsMod.DialogStatus
  
  @js.native
  sealed trait STATUS_EARLY
    extends sipDotJsLib.libEnumsMod.DialogStatus
  
  /* 2 */ val STATUS_CONFIRMED: STATUS_CONFIRMED with scala.Double = js.native
  /* 1 */ val STATUS_EARLY: STATUS_EARLY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sipDotJsLib.libEnumsMod.DialogStatus with scala.Double] = js.native
}

