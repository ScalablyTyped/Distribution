package typings.promiseSftp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-sftp", "STATUSES")
@js.native
object STATUSES extends js.Object {
  /* "connected" */ val CONNECTED: typings.promiseFtpCommon.mod.STATUSES.CONNECTED with String = js.native
  /* "connecting" */ val CONNECTING: typings.promiseFtpCommon.mod.STATUSES.CONNECTING with String = js.native
  /* "disconnected" */ val DISCONNECTED: typings.promiseFtpCommon.mod.STATUSES.DISCONNECTED with String = js.native
  /* "disconnecting" */ val DISCONNECTING: typings.promiseFtpCommon.mod.STATUSES.DISCONNECTING with String = js.native
  /* "logging out" */ val LOGGING_OUT: typings.promiseFtpCommon.mod.STATUSES.LOGGING_OUT with String = js.native
  /* "not yet connected" */ val NOT_YET_CONNECTED: typings.promiseFtpCommon.mod.STATUSES.NOT_YET_CONNECTED with String = js.native
  /* "reconnecting" */ val RECONNECTING: typings.promiseFtpCommon.mod.STATUSES.RECONNECTING with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.promiseFtpCommon.mod.STATUSES with String] = js.native
}

