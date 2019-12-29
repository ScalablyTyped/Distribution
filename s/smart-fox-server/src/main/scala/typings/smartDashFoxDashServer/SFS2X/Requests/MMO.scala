package typings.smartDashFoxDashServer.SFS2X.Requests

import typings.smartDashFoxDashServer.SFS2X.Entities.Data.Vec3D
import typings.smartDashFoxDashServer.SFS2X.Entities.MMORoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region MMO
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Requests.MMO.html
@JSGlobal("SFS2X.Requests.MMO")
@js.native
object MMO extends js.Object {
  @js.native
  class MMORoomSettings protected () extends js.Object {
    /**
      * Creates a new MMORoomSettings instance.
      * @param {string} name The name of the MMORoom to be created.
      */
    def this(name: String) = this()
    /** @type {Entities.Data.Vec3D} Defines the Area of Interest (AoI) for the MMORoom. */
    var defaultAOI: Vec3D = js.native
    /** @type {MapLimits} Defines the limits of the virtual environment represented by the MMORoom. */
    var mapLimits: MapLimits = js.native
    /** @type {number} Configures the speed at which the SFSEvent.PROXIMITY_LIST_UPDATE event is sent by the server. */
    var proximityListUpdateMillis: Double = js.native
    /** @type {boolean} Sets if the users entry points in the current user's Area of Interest should be transmitted in the SFSEvent.PROXIMITY_LIST_UPDATE event. */
    var sendAOIEntryPoint: Boolean = js.native
    /** @type {number} Defines the time limit before a user without a physical position set inside the MMORoom is kicked from the Room. */
    var userMaxLimboSeconds: Double = js.native
  }
  
  @js.native
  class MapLimits protected () extends js.Object {
    /**
      * Creates a new MapLimits instance.
      * @param {Entities.Data.Vec3D} lowerLimit
      * @param {Entities.Data.Vec3D} higherLimit
      */
    def this(lowerLimit: Vec3D, higherLimit: Vec3D) = this()
    /** @type {Entities.Data.Vec3D} Returns the higher coordinates limit of the virtual environment along the X,Y,Z axes. */
    var higherLimit: Vec3D = js.native
    /** @type {Entities.Data.Vec3D} Returns the lower coordinates limit of the virtual environment along the X,Y,Z axes. */
    var lowerLimit: Vec3D = js.native
  }
  
  @js.native
  class SetUserPositionRequest protected () extends js.Object {
    /**
      * Creates a new SetUserPositionRequest instance.
      * @param {Entities.Data.Vec3D} pos        The user position.
      * @param {Entities.MMORoom}    [targetRoom=null] The MMORoom object corresponding to the Room where the position should be set; if null, the last Room joined by the user is used.
      */
    def this(pos: Vec3D) = this()
    def this(pos: Vec3D, targetRoom: MMORoom) = this()
  }
  
}

