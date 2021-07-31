package typings.promiseSftp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-sftp", "STATUSES")
@js.native
object STATUSES extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.promiseFtpCommon.mod.STATUSES & String] = js.native
  
  /* "connected" */ val CONNECTED: typings.promiseFtpCommon.mod.STATUSES.CONNECTED & String = js.native
  
  /* "connecting" */ val CONNECTING: typings.promiseFtpCommon.mod.STATUSES.CONNECTING & String = js.native
  
  /* "disconnected" */ val DISCONNECTED: typings.promiseFtpCommon.mod.STATUSES.DISCONNECTED & String = js.native
  
  /* "disconnecting" */ val DISCONNECTING: typings.promiseFtpCommon.mod.STATUSES.DISCONNECTING & String = js.native
  
  /* "logging out" */ val LOGGING_OUT: typings.promiseFtpCommon.mod.STATUSES.LOGGING_OUT & String = js.native
  
  /* "not yet connected" */ val NOT_YET_CONNECTED: typings.promiseFtpCommon.mod.STATUSES.NOT_YET_CONNECTED & String = js.native
  
  /* "reconnecting" */ val RECONNECTING: typings.promiseFtpCommon.mod.STATUSES.RECONNECTING & String = js.native
}
