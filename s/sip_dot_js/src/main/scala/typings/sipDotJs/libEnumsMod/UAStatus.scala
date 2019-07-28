package typings.sipDotJs.libEnumsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UAStatus extends js.Object

@JSImport("sip.js/lib/Enums", "UAStatus")
@js.native
object UAStatus extends js.Object {
  @js.native
  sealed trait STATUS_INIT extends UAStatus
  
  @js.native
  sealed trait STATUS_NOT_READY extends UAStatus
  
  @js.native
  sealed trait STATUS_READY extends UAStatus
  
  @js.native
  sealed trait STATUS_STARTING extends UAStatus
  
  @js.native
  sealed trait STATUS_USER_CLOSED extends UAStatus
  
  /* 0 */ val STATUS_INIT: typings.sipDotJs.libEnumsMod.UAStatus.STATUS_INIT with Double = js.native
  /* 4 */ val STATUS_NOT_READY: typings.sipDotJs.libEnumsMod.UAStatus.STATUS_NOT_READY with Double = js.native
  /* 2 */ val STATUS_READY: typings.sipDotJs.libEnumsMod.UAStatus.STATUS_READY with Double = js.native
  /* 1 */ val STATUS_STARTING: typings.sipDotJs.libEnumsMod.UAStatus.STATUS_STARTING with Double = js.native
  /* 3 */ val STATUS_USER_CLOSED: typings.sipDotJs.libEnumsMod.UAStatus.STATUS_USER_CLOSED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UAStatus with Double] = js.native
}

