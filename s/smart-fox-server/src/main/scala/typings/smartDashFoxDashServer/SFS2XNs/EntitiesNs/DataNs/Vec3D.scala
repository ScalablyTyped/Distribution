package typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.Data.Vec3D")
@js.native
class Vec3D protected () extends js.Object {
  /**
    * Creates a new Vec3D instance.
    * @param {number} px The position along the X axis.
    * @param {number} py The position along the Y axis.
    * @param {number} [pz] The position along the Z axis.
    */
  def this(px: Double, py: Double) = this()
  def this(px: Double, py: Double, pz: Double) = this()
  /** @type {number} Returns the position along the X axis. */
  var px: Double = js.native
  /** @type {number} Returns the position along the Y axis. */
  var py: Double = js.native
  /** @type {number} Returns the position along the Z axis. */
  var pz: Double = js.native
  /**
    * Indicates whether the position is expressed using floating point values or not.
    * @return {boolean} Returns: true if the position is expressed using floating point values.
    */
  def isFloat(): Boolean = js.native
}

