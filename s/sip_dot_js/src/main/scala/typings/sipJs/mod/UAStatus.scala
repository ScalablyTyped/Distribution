package typings.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "UAStatus")
@js.native
object UAStatus extends js.Object {
  /* 0 */ val STATUS_INIT: typings.sipJs.enumsMod.UAStatus.STATUS_INIT with Double = js.native
  /* 4 */ val STATUS_NOT_READY: typings.sipJs.enumsMod.UAStatus.STATUS_NOT_READY with Double = js.native
  /* 2 */ val STATUS_READY: typings.sipJs.enumsMod.UAStatus.STATUS_READY with Double = js.native
  /* 1 */ val STATUS_STARTING: typings.sipJs.enumsMod.UAStatus.STATUS_STARTING with Double = js.native
  /* 3 */ val STATUS_USER_CLOSED: typings.sipJs.enumsMod.UAStatus.STATUS_USER_CLOSED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.sipJs.enumsMod.UAStatus with Double] = js.native
}

