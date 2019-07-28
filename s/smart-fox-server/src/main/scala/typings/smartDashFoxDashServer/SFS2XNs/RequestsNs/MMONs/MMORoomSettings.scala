package typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.MMONs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.DataNs.Vec3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.MMO.MMORoomSettings")
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

