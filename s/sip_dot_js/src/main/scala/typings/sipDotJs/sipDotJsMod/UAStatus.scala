package typings.sipDotJs.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "UAStatus")
@js.native
object UAStatus extends js.Object {
  /* 0 */ val STATUS_INIT: typings.sipDotJs.libEnumsMod.UAStatus.STATUS_INIT with Double = js.native
  /* 4 */ val STATUS_NOT_READY: typings.sipDotJs.libEnumsMod.UAStatus.STATUS_NOT_READY with Double = js.native
  /* 2 */ val STATUS_READY: typings.sipDotJs.libEnumsMod.UAStatus.STATUS_READY with Double = js.native
  /* 1 */ val STATUS_STARTING: typings.sipDotJs.libEnumsMod.UAStatus.STATUS_STARTING with Double = js.native
  /* 3 */ val STATUS_USER_CLOSED: typings.sipDotJs.libEnumsMod.UAStatus.STATUS_USER_CLOSED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.sipDotJs.libEnumsMod.UAStatus with Double] = js.native
}

