package typings.smartFoxServer.global.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Managers
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Managers.html
@JSGlobal("SFS2X.Managers")
@js.native
object Managers extends js.Object {
  @js.native
  class BuddyManager protected ()
    extends typings.smartFoxServer.SFS2X.Managers.BuddyManager {
    /**
      * Creates a new BuddyManager instance.
      * @param {SmartFox} sfs An instance of the SmartFoxServer 2X client API main SmartFox class.
      */
    def this(sfs: typings.smartFoxServer.SFS2X.SmartFox) = this()
  }
  
  @js.native
  class RoomManager protected ()
    extends typings.smartFoxServer.SFS2X.Managers.RoomManager {
    /**
      * Creates a new RoomManager instance.
      * @param {SmartFox} sfs An instance of the SmartFoxServer 2X client API main SmartFox class.
      */
    def this(sfs: typings.smartFoxServer.SFS2X.SmartFox) = this()
  }
  
  @js.native
  class UserManager protected ()
    extends typings.smartFoxServer.SFS2X.Managers.UserManager {
    /**
      * Creates a new UserManager instance.
      * @param {SmartFox} sfs An instance of the SmartFoxServer 2X client API main SmartFox class.
      */
    def this(sfs: typings.smartFoxServer.SFS2X.SmartFox) = this()
  }
  
}

