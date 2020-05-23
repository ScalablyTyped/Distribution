package typings.smartFoxServer.SFS2X.Requests.MMO

import typings.smartFoxServer.SFS2X.Entities.Data.Vec3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MMORoomSettings extends js.Object {
  /** @type {Entities.Data.Vec3D} Defines the Area of Interest (AoI) for the MMORoom. */
  var defaultAOI: Vec3D
  /** @type {MapLimits} Defines the limits of the virtual environment represented by the MMORoom. */
  var mapLimits: MapLimits
  /** @type {number} Configures the speed at which the SFSEvent.PROXIMITY_LIST_UPDATE event is sent by the server. */
  var proximityListUpdateMillis: Double
  /** @type {boolean} Sets if the users entry points in the current user's Area of Interest should be transmitted in the SFSEvent.PROXIMITY_LIST_UPDATE event. */
  var sendAOIEntryPoint: Boolean
  /** @type {number} Defines the time limit before a user without a physical position set inside the MMORoom is kicked from the Room. */
  var userMaxLimboSeconds: Double
}

object MMORoomSettings {
  @scala.inline
  def apply(
    defaultAOI: Vec3D,
    mapLimits: MapLimits,
    proximityListUpdateMillis: Double,
    sendAOIEntryPoint: Boolean,
    userMaxLimboSeconds: Double
  ): MMORoomSettings = {
    val __obj = js.Dynamic.literal(defaultAOI = defaultAOI.asInstanceOf[js.Any], mapLimits = mapLimits.asInstanceOf[js.Any], proximityListUpdateMillis = proximityListUpdateMillis.asInstanceOf[js.Any], sendAOIEntryPoint = sendAOIEntryPoint.asInstanceOf[js.Any], userMaxLimboSeconds = userMaxLimboSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MMORoomSettings]
  }
}

