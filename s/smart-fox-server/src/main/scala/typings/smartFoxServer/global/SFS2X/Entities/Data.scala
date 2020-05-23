package typings.smartFoxServer.global.SFS2X.Entities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region Data
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Data.html
@JSGlobal("SFS2X.Entities.Data")
@js.native
object Data extends js.Object {
  @js.native
  class Vec3D protected ()
    extends typings.smartFoxServer.SFS2X.Entities.Data.Vec3D {
    /**
      * Creates a new Vec3D instance.
      * @param {number} px The position along the X axis.
      * @param {number} py The position along the Y axis.
      * @param {number} [pz] The position along the Z axis.
      */
    def this(px: Double, py: Double) = this()
    def this(px: Double, py: Double, pz: Double) = this()
    /** @type {number} Returns the position along the X axis. */
    /* CompleteClass */
    override var px: Double = js.native
    /** @type {number} Returns the position along the Y axis. */
    /* CompleteClass */
    override var py: Double = js.native
    /** @type {number} Returns the position along the Z axis. */
    /* CompleteClass */
    override var pz: Double = js.native
    /**
      * Indicates whether the position is expressed using floating point values or not.
      * @return {boolean} Returns: true if the position is expressed using floating point values.
      */
    /* CompleteClass */
    override def isFloat(): Boolean = js.native
  }
  
}

