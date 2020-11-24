package typings.smartFoxServer.global.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Utils
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Utils.html
@JSGlobal("SFS2X.Utils")
@js.native
object Utils extends js.Object {
  
  @js.native
  class ClientDisconnectionReason ()
    extends typings.smartFoxServer.SFS2X.Utils.ClientDisconnectionReason
  /* static members */
  @js.native
  object ClientDisconnectionReason extends js.Object {
    
    /** @type {string} Client was banned from the server. */
    var BAN: String = js.native
    
    /** @type {string} Client was disconnected because it was idle for too long. */
    var IDLE: String = js.native
    
    /** @type {string} Client was kicked out of the server. */
    var KICK: String = js.native
    
    /** @type {string} The client manually disconnected from the server. */
    var MANUAL: String = js.native
    
    /** @type {string} A generic network error occurred, and the client is unable to determine the cause of the disconnection. */
    var UNKNOWN: String = js.native
  }
}
