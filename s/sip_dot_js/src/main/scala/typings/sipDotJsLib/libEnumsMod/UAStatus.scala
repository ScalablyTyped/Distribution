package typings
package sipDotJsLib.libEnumsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UAStatus extends js.Object

@JSImport("sip.js/lib/Enums", "UAStatus")
@js.native
object UAStatus extends js.Object {
  @js.native
  sealed trait STATUS_INIT
    extends sipDotJsLib.libEnumsMod.UAStatus
  
  @js.native
  sealed trait STATUS_NOT_READY
    extends sipDotJsLib.libEnumsMod.UAStatus
  
  @js.native
  sealed trait STATUS_READY
    extends sipDotJsLib.libEnumsMod.UAStatus
  
  @js.native
  sealed trait STATUS_STARTING
    extends sipDotJsLib.libEnumsMod.UAStatus
  
  @js.native
  sealed trait STATUS_USER_CLOSED
    extends sipDotJsLib.libEnumsMod.UAStatus
  
  /* 0 */ val STATUS_INIT: STATUS_INIT with scala.Double = js.native
  /* 4 */ val STATUS_NOT_READY: STATUS_NOT_READY with scala.Double = js.native
  /* 2 */ val STATUS_READY: STATUS_READY with scala.Double = js.native
  /* 1 */ val STATUS_STARTING: STATUS_STARTING with scala.Double = js.native
  /* 3 */ val STATUS_USER_CLOSED: STATUS_USER_CLOSED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sipDotJsLib.libEnumsMod.UAStatus with scala.Double] = js.native
}

