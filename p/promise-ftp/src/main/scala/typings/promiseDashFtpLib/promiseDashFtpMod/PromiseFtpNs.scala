package typings
package promiseDashFtpLib.promiseDashFtpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-ftp", "PromiseFtp")
@js.native
object PromiseFtpNs extends js.Object {
  trait ERROR_CODES extends js.Object {
    var `421`: promiseDashFtpLib.promiseDashFtpLibStrings.`Service not available, closing control connection`
    var `425`: promiseDashFtpLib.promiseDashFtpLibStrings.`Can't open data connection`
    var `426`: promiseDashFtpLib.promiseDashFtpLibStrings.`Connection closed, transfer aborted`
    var `450`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested file action not taken / File unavailable (eDOTgDOT, file busy)`
    var `451`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested action aborted: local error in processing`
    var `452`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested action not taken / Insufficient storage space in system`
    var `500`: promiseDashFtpLib.promiseDashFtpLibStrings.`Syntax error / Command unrecognized`
    var `501`: promiseDashFtpLib.promiseDashFtpLibStrings.`Syntax error in parameters or arguments`
    var `502`: promiseDashFtpLib.promiseDashFtpLibStrings.`Command not implemented`
    var `503`: promiseDashFtpLib.promiseDashFtpLibStrings.`Bad sequence of commands`
    var `504`: promiseDashFtpLib.promiseDashFtpLibStrings.`Command not implemented for that parameter`
    var `530`: promiseDashFtpLib.promiseDashFtpLibStrings.`Not logged in`
    var `532`: promiseDashFtpLib.promiseDashFtpLibStrings.`Need account for storing files`
    var `550`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested action not taken / File unavailable (eDOTgDOT, file not found, no access)`
    var `551`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested action aborted: page type unknown`
    var `552`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested file action aborted / Exceeded storage allocation (for current directory or dataset)`
    var `553`: promiseDashFtpLib.promiseDashFtpLibStrings.`Requested action not taken / File name not allowed`
  }
  
  @js.native
  class FtpConnectionError ()
    extends stdLib.Error {
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
  }
  
  @js.native
  class FtpReconnectError ()
    extends stdLib.Error {
    def this(disconnectError: java.lang.String) = this()
    def this(disconnectError: stdLib.Error) = this()
    def this(disconnectError: java.lang.String, connectError: java.lang.String) = this()
    def this(disconnectError: java.lang.String, connectError: stdLib.Error) = this()
    def this(disconnectError: stdLib.Error, connectError: java.lang.String) = this()
    def this(disconnectError: stdLib.Error, connectError: stdLib.Error) = this()
    def this(disconnectError: java.lang.String, connectError: java.lang.String, onCwd: scala.Boolean) = this()
    def this(disconnectError: java.lang.String, connectError: stdLib.Error, onCwd: scala.Boolean) = this()
    def this(disconnectError: stdLib.Error, connectError: java.lang.String, onCwd: scala.Boolean) = this()
    def this(disconnectError: stdLib.Error, connectError: stdLib.Error, onCwd: scala.Boolean) = this()
    var connectError: java.lang.String | stdLib.Error = js.native
    var disconnectError: java.lang.String | stdLib.Error = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
  }
  
  @js.native
  sealed trait STATUSES extends js.Object
  
  @js.native
  object STATUSES extends js.Object {
    @js.native
    sealed trait CONNECTED
      extends promiseDashFtpLib.promiseDashFtpMod.PromiseFtpNs.STATUSES
    
    @js.native
    sealed trait CONNECTING
      extends promiseDashFtpLib.promiseDashFtpMod.PromiseFtpNs.STATUSES
    
    @js.native
    sealed trait DISCONNECTED
      extends promiseDashFtpLib.promiseDashFtpMod.PromiseFtpNs.STATUSES
    
    @js.native
    sealed trait DISCONNECTING
      extends promiseDashFtpLib.promiseDashFtpMod.PromiseFtpNs.STATUSES
    
    @js.native
    sealed trait LOGGING_OUT
      extends promiseDashFtpLib.promiseDashFtpMod.PromiseFtpNs.STATUSES
    
    @js.native
    sealed trait NOT_YET_CONNECTED
      extends promiseDashFtpLib.promiseDashFtpMod.PromiseFtpNs.STATUSES
    
    @js.native
    sealed trait RECONNECTING
      extends promiseDashFtpLib.promiseDashFtpMod.PromiseFtpNs.STATUSES
    
    /* "connected" */ val CONNECTED: CONNECTED with java.lang.String = js.native
    /* "connecting" */ val CONNECTING: CONNECTING with java.lang.String = js.native
    /* "disconnected" */ val DISCONNECTED: DISCONNECTED with java.lang.String = js.native
    /* "disconnecting" */ val DISCONNECTING: DISCONNECTING with java.lang.String = js.native
    /* "logging out" */ val LOGGING_OUT: LOGGING_OUT with java.lang.String = js.native
    /* "not yet connected" */ val NOT_YET_CONNECTED: NOT_YET_CONNECTED with java.lang.String = js.native
    /* "reconnecting" */ val RECONNECTING: RECONNECTING with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[promiseDashFtpLib.promiseDashFtpMod.PromiseFtpNs.STATUSES with java.lang.String] = js.native
  }
  
}

