package typings.smartFoxServer.global.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Utils
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Utils.html
object Utils {
  
  @JSGlobal("SFS2X.Utils.ClientDisconnectionReason")
  @js.native
  class ClientDisconnectionReason ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Utils.ClientDisconnectionReason
  /* static members */
  object ClientDisconnectionReason {
    
    @JSGlobal("SFS2X.Utils.ClientDisconnectionReason")
    @js.native
    val ^ : js.Any = js.native
    
    /** @type {string} Client was banned from the server. */
    @JSGlobal("SFS2X.Utils.ClientDisconnectionReason.BAN")
    @js.native
    def BAN: String = js.native
    @scala.inline
    def BAN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BAN")(x.asInstanceOf[js.Any])
    
    /** @type {string} Client was disconnected because it was idle for too long. */
    @JSGlobal("SFS2X.Utils.ClientDisconnectionReason.IDLE")
    @js.native
    def IDLE: String = js.native
    @scala.inline
    def IDLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDLE")(x.asInstanceOf[js.Any])
    
    /** @type {string} Client was kicked out of the server. */
    @JSGlobal("SFS2X.Utils.ClientDisconnectionReason.KICK")
    @js.native
    def KICK: String = js.native
    @scala.inline
    def KICK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KICK")(x.asInstanceOf[js.Any])
    
    /** @type {string} The client manually disconnected from the server. */
    @JSGlobal("SFS2X.Utils.ClientDisconnectionReason.MANUAL")
    @js.native
    def MANUAL: String = js.native
    @scala.inline
    def MANUAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANUAL")(x.asInstanceOf[js.Any])
    
    /** @type {string} A generic network error occurred, and the client is unable to determine the cause of the disconnection. */
    @JSGlobal("SFS2X.Utils.ClientDisconnectionReason.UNKNOWN")
    @js.native
    def UNKNOWN: String = js.native
    @scala.inline
    def UNKNOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
  }
}
