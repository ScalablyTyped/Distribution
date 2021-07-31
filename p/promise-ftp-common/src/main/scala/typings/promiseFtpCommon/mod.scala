package typings.promiseFtpCommon

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-ftp-common", "FtpConnectionError")
  @js.native
  class FtpConnectionError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("promise-ftp-common", "FtpReconnectError")
  @js.native
  class FtpReconnectError ()
    extends StObject
       with Error {
    def this(disconnectError: String) = this()
    def this(disconnectError: Error) = this()
    def this(disconnectError: String, connectError: String) = this()
    def this(disconnectError: String, connectError: Error) = this()
    def this(disconnectError: Unit, connectError: String) = this()
    def this(disconnectError: Unit, connectError: Error) = this()
    def this(disconnectError: Error, connectError: String) = this()
    def this(disconnectError: Error, connectError: Error) = this()
    def this(disconnectError: String, connectError: String, onCwd: Boolean) = this()
    def this(disconnectError: String, connectError: Unit, onCwd: Boolean) = this()
    def this(disconnectError: String, connectError: Error, onCwd: Boolean) = this()
    def this(disconnectError: Unit, connectError: String, onCwd: Boolean) = this()
    def this(disconnectError: Unit, connectError: Unit, onCwd: Boolean) = this()
    def this(disconnectError: Unit, connectError: Error, onCwd: Boolean) = this()
    def this(disconnectError: Error, connectError: String, onCwd: Boolean) = this()
    def this(disconnectError: Error, connectError: Unit, onCwd: Boolean) = this()
    def this(disconnectError: Error, connectError: Error, onCwd: Boolean) = this()
    
    var connectError: String | Error = js.native
    
    var disconnectError: String | Error = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  sealed trait STATUSES extends StObject
  @JSImport("promise-ftp-common", "STATUSES")
  @js.native
  object STATUSES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[STATUSES & String] = js.native
    
    @js.native
    sealed trait CONNECTED
      extends StObject
         with STATUSES
    /* "connected" */ val CONNECTED: typings.promiseFtpCommon.mod.STATUSES.CONNECTED & String = js.native
    
    @js.native
    sealed trait CONNECTING
      extends StObject
         with STATUSES
    /* "connecting" */ val CONNECTING: typings.promiseFtpCommon.mod.STATUSES.CONNECTING & String = js.native
    
    @js.native
    sealed trait DISCONNECTED
      extends StObject
         with STATUSES
    /* "disconnected" */ val DISCONNECTED: typings.promiseFtpCommon.mod.STATUSES.DISCONNECTED & String = js.native
    
    @js.native
    sealed trait DISCONNECTING
      extends StObject
         with STATUSES
    /* "disconnecting" */ val DISCONNECTING: typings.promiseFtpCommon.mod.STATUSES.DISCONNECTING & String = js.native
    
    @js.native
    sealed trait LOGGING_OUT
      extends StObject
         with STATUSES
    /* "logging out" */ val LOGGING_OUT: typings.promiseFtpCommon.mod.STATUSES.LOGGING_OUT & String = js.native
    
    @js.native
    sealed trait NOT_YET_CONNECTED
      extends StObject
         with STATUSES
    /* "not yet connected" */ val NOT_YET_CONNECTED: typings.promiseFtpCommon.mod.STATUSES.NOT_YET_CONNECTED & String = js.native
    
    @js.native
    sealed trait RECONNECTING
      extends StObject
         with STATUSES
    /* "reconnecting" */ val RECONNECTING: typings.promiseFtpCommon.mod.STATUSES.RECONNECTING & String = js.native
  }
}
