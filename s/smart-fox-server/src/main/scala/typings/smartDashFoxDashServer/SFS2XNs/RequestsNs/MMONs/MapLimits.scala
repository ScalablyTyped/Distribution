package typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.MMONs

import typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.DataNs.Vec3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.MMO.MapLimits")
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

