package typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.DataNs.Vec3D
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.MMONs.MapLimits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.MMORoom")
@js.native
class MMORoom protected () extends SFSRoom {
  /**
    * Creates a new MMORoom instance.
    * @param {number} id      The MMORoom id.
    * @param {string} name    The MMORoom name.
    * @param {string} groupId The id of the Group to which the MMORoom belongs.
    */
  def this(id: Double, name: String) = this()
  def this(id: Double, name: String, groupId: String) = this()
  /** @type {Data.Vec3D} Returns the default Area of Interest (AoI) of this MMORoom. */
  var defaultAOI: Vec3D = js.native
  /** @type {Requests.MMO.MapLimits} Returns the higher coordinates limit of the virtual environment represented by the MMORoom along the X,Y,Z axes. If null is returned, no limits were set at Room creation time. */
  var higherMapLimit: MapLimits = js.native
  /** @type {Requests.MMO.MapLimits} Returns the lower coordinates limit of the virtual environment represented by the MMORoom along the X,Y,Z axes. If null is returned, no limits were set at Room creation time. */
  var lowerMapLimit: MapLimits = js.native
  /**
    * Retrieves an MMOItem object from its id property. The item is available to the current user if it falls within his Area of Interest only.
    * @param  {number}  id The id of the item to be retrieved.
    * @return {MMOItem}    Returns: An MMOItem object, or null if the item with the passed id is not in proximity of the current user.
    */
  def getMMOItem(id: Double): MMOItem = js.native
  /**
    * Retrieves all MMOItem object in the MMORoom that fall within the current user's Area of Interest.
    * @return {MMOItem[]} Returns: A list of MMOItem objects, or an empty list if no item is in proximity of the current user.
    */
  def getMMOItems(): js.Array[MMOItem] = js.native
}

