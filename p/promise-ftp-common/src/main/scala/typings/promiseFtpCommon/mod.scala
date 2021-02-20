package typings.promiseFtpCommon

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-ftp-common", "FtpConnectionError")
  @js.native
  class FtpConnectionError () extends Error
  
  @JSImport("promise-ftp-common", "FtpReconnectError")
  @js.native
  class FtpReconnectError () extends Error {
    def this(disconnectError: String) = this()
    def this(disconnectError: Error) = this()
    def this(disconnectError: js.UndefOr[scala.Nothing], connectError: String) = this()
    def this(disconnectError: js.UndefOr[scala.Nothing], connectError: Error) = this()
    def this(disconnectError: String, connectError: String) = this()
    def this(disconnectError: String, connectError: Error) = this()
    def this(disconnectError: Error, connectError: String) = this()
    def this(disconnectError: Error, connectError: Error) = this()
    def this(
      disconnectError: js.UndefOr[scala.Nothing],
      connectError: js.UndefOr[scala.Nothing],
      onCwd: Boolean
    ) = this()
    def this(disconnectError: js.UndefOr[scala.Nothing], connectError: String, onCwd: Boolean) = this()
    def this(disconnectError: js.UndefOr[scala.Nothing], connectError: Error, onCwd: Boolean) = this()
    def this(disconnectError: String, connectError: js.UndefOr[scala.Nothing], onCwd: Boolean) = this()
    def this(disconnectError: String, connectError: String, onCwd: Boolean) = this()
    def this(disconnectError: String, connectError: Error, onCwd: Boolean) = this()
    def this(disconnectError: Error, connectError: js.UndefOr[scala.Nothing], onCwd: Boolean) = this()
    def this(disconnectError: Error, connectError: String, onCwd: Boolean) = this()
    def this(disconnectError: Error, connectError: Error, onCwd: Boolean) = this()
    
    var connectError: String | Error = js.native
    
    var disconnectError: String | Error = js.native
  }
  
  @js.native
  sealed trait STATUSES extends StObject
  @JSImport("promise-ftp-common", "STATUSES")
  @js.native
  object STATUSES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[STATUSES with String] = js.native
    
    @js.native
    sealed trait CONNECTED extends STATUSES
    /* "connected" */ val CONNECTED: typings.promiseFtpCommon.mod.STATUSES.CONNECTED with String = js.native
    
    @js.native
    sealed trait CONNECTING extends STATUSES
    /* "connecting" */ val CONNECTING: typings.promiseFtpCommon.mod.STATUSES.CONNECTING with String = js.native
    
    @js.native
    sealed trait DISCONNECTED extends STATUSES
    /* "disconnected" */ val DISCONNECTED: typings.promiseFtpCommon.mod.STATUSES.DISCONNECTED with String = js.native
    
    @js.native
    sealed trait DISCONNECTING extends STATUSES
    /* "disconnecting" */ val DISCONNECTING: typings.promiseFtpCommon.mod.STATUSES.DISCONNECTING with String = js.native
    
    @js.native
    sealed trait LOGGING_OUT extends STATUSES
    /* "logging out" */ val LOGGING_OUT: typings.promiseFtpCommon.mod.STATUSES.LOGGING_OUT with String = js.native
    
    @js.native
    sealed trait NOT_YET_CONNECTED extends STATUSES
    /* "not yet connected" */ val NOT_YET_CONNECTED: typings.promiseFtpCommon.mod.STATUSES.NOT_YET_CONNECTED with String = js.native
    
    @js.native
    sealed trait RECONNECTING extends STATUSES
    /* "reconnecting" */ val RECONNECTING: typings.promiseFtpCommon.mod.STATUSES.RECONNECTING with String = js.native
  }
}
