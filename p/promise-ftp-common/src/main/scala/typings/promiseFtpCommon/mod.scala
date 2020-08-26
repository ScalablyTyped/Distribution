package typings.promiseFtpCommon

import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-ftp-common", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class FtpConnectionError () extends Error
  
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
  sealed trait STATUSES extends js.Object
  
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[STATUSES with String] = js.native
    /* "connected" */ @js.native
    object CONNECTED extends TopLevel[CONNECTED with String]
    
    /* "connecting" */ @js.native
    object CONNECTING extends TopLevel[CONNECTING with String]
    
    /* "disconnected" */ @js.native
    object DISCONNECTED extends TopLevel[DISCONNECTED with String]
    
    /* "disconnecting" */ @js.native
    object DISCONNECTING extends TopLevel[DISCONNECTING with String]
    
    /* "logging out" */ @js.native
    object LOGGING_OUT extends TopLevel[LOGGING_OUT with String]
    
    /* "not yet connected" */ @js.native
    object NOT_YET_CONNECTED extends TopLevel[NOT_YET_CONNECTED with String]
    
    /* "reconnecting" */ @js.native
    object RECONNECTING extends TopLevel[RECONNECTING with String]
    
  }
  
}

