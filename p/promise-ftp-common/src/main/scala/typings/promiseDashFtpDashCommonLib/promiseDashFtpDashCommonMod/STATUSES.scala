package typings
package promiseDashFtpDashCommonLib.promiseDashFtpDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STATUSES extends js.Object

@JSImport("promise-ftp-common", "STATUSES")
@js.native
object STATUSES extends js.Object {
  @js.native
  sealed trait CONNECTED
    extends promiseDashFtpDashCommonLib.promiseDashFtpDashCommonMod.STATUSES
  
  @js.native
  sealed trait CONNECTING
    extends promiseDashFtpDashCommonLib.promiseDashFtpDashCommonMod.STATUSES
  
  @js.native
  sealed trait DISCONNECTED
    extends promiseDashFtpDashCommonLib.promiseDashFtpDashCommonMod.STATUSES
  
  @js.native
  sealed trait DISCONNECTING
    extends promiseDashFtpDashCommonLib.promiseDashFtpDashCommonMod.STATUSES
  
  @js.native
  sealed trait LOGGING_OUT
    extends promiseDashFtpDashCommonLib.promiseDashFtpDashCommonMod.STATUSES
  
  @js.native
  sealed trait NOT_YET_CONNECTED
    extends promiseDashFtpDashCommonLib.promiseDashFtpDashCommonMod.STATUSES
  
  @js.native
  sealed trait RECONNECTING
    extends promiseDashFtpDashCommonLib.promiseDashFtpDashCommonMod.STATUSES
  
  /* "connected" */ val CONNECTED: CONNECTED with java.lang.String = js.native
  /* "connecting" */ val CONNECTING: CONNECTING with java.lang.String = js.native
  /* "disconnected" */ val DISCONNECTED: DISCONNECTED with java.lang.String = js.native
  /* "disconnecting" */ val DISCONNECTING: DISCONNECTING with java.lang.String = js.native
  /* "logging out" */ val LOGGING_OUT: LOGGING_OUT with java.lang.String = js.native
  /* "not yet connected" */ val NOT_YET_CONNECTED: NOT_YET_CONNECTED with java.lang.String = js.native
  /* "reconnecting" */ val RECONNECTING: RECONNECTING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    promiseDashFtpDashCommonLib.promiseDashFtpDashCommonMod.STATUSES with java.lang.String
  ] = js.native
}

