package typings.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STATUSES extends js.Object

@JSImport("promise-ftp-common", "STATUSES")
@js.native
object STATUSES extends js.Object {
  @js.native
  sealed trait CONNECTED extends STATUSES
  
  @js.native
  sealed trait CONNECTING extends STATUSES
  
  @js.native
  sealed trait DISCONNECTED extends STATUSES
  
  @js.native
  sealed trait DISCONNECTING extends STATUSES
  
  @js.native
  sealed trait LOGGING_OUT extends STATUSES
  
  @js.native
  sealed trait NOT_YET_CONNECTED extends STATUSES
  
  @js.native
  sealed trait RECONNECTING extends STATUSES
  
  /* "connected" */ val CONNECTED: typings.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.STATUSES.CONNECTED with String = js.native
  /* "connecting" */ val CONNECTING: typings.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.STATUSES.CONNECTING with String = js.native
  /* "disconnected" */ val DISCONNECTED: typings.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.STATUSES.DISCONNECTED with String = js.native
  /* "disconnecting" */ val DISCONNECTING: typings.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.STATUSES.DISCONNECTING with String = js.native
  /* "logging out" */ val LOGGING_OUT: typings.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.STATUSES.LOGGING_OUT with String = js.native
  /* "not yet connected" */ val NOT_YET_CONNECTED: typings.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.STATUSES.NOT_YET_CONNECTED with String = js.native
  /* "reconnecting" */ val RECONNECTING: typings.promiseDashFtpDashCommon.promiseDashFtpDashCommonMod.STATUSES.RECONNECTING with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[STATUSES with String] = js.native
}

