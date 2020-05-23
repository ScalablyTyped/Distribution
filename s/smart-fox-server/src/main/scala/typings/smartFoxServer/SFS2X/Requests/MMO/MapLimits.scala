package typings.smartFoxServer.SFS2X.Requests.MMO

import typings.smartFoxServer.SFS2X.Entities.Data.Vec3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLimits extends js.Object {
  /** @type {Entities.Data.Vec3D} Returns the higher coordinates limit of the virtual environment along the X,Y,Z axes. */
  var higherLimit: Vec3D
  /** @type {Entities.Data.Vec3D} Returns the lower coordinates limit of the virtual environment along the X,Y,Z axes. */
  var lowerLimit: Vec3D
}

object MapLimits {
  @scala.inline
  def apply(higherLimit: Vec3D, lowerLimit: Vec3D): MapLimits = {
    val __obj = js.Dynamic.literal(higherLimit = higherLimit.asInstanceOf[js.Any], lowerLimit = lowerLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLimits]
  }
}

