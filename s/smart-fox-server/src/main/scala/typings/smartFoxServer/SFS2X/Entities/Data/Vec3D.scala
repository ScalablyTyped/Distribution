package typings.smartFoxServer.SFS2X.Entities.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vec3D extends js.Object {
  /** @type {number} Returns the position along the X axis. */
  var px: Double
  /** @type {number} Returns the position along the Y axis. */
  var py: Double
  /** @type {number} Returns the position along the Z axis. */
  var pz: Double
  /**
    * Indicates whether the position is expressed using floating point values or not.
    * @return {boolean} Returns: true if the position is expressed using floating point values.
    */
  def isFloat(): Boolean
}

object Vec3D {
  @scala.inline
  def apply(isFloat: () => Boolean, px: Double, py: Double, pz: Double): Vec3D = {
    val __obj = js.Dynamic.literal(isFloat = js.Any.fromFunction0(isFloat), px = px.asInstanceOf[js.Any], py = py.asInstanceOf[js.Any], pz = pz.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vec3D]
  }
}

