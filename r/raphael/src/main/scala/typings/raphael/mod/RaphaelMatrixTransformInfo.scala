package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelMatrixTransformInfo extends js.Object {
  /** Translation in the horizontal direction. */
  var dx: Double
  /** Translation in the vertical direction. */
  var dy: Double
  /**
    * Whether the matrix can be represented via simple transformations. If this set to `false` the other properties
    * of this instance are devoid of meaning and should not be accessed.
    */
  var isSimple: Boolean
  /** Rotation in degree. */
  var rotate: Double
  /** Scaling factor in the horizontal direction. */
  var scalex: Double
  /** Scaling factor in the vertical direction. */
  var scaley: Double
  /** Shearing coefficient. */
  var shear: Double
}

object RaphaelMatrixTransformInfo {
  @scala.inline
  def apply(
    dx: Double,
    dy: Double,
    isSimple: Boolean,
    rotate: Double,
    scalex: Double,
    scaley: Double,
    shear: Double
  ): RaphaelMatrixTransformInfo = {
    val __obj = js.Dynamic.literal(dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], isSimple = isSimple.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scalex = scalex.asInstanceOf[js.Any], scaley = scaley.asInstanceOf[js.Any], shear = shear.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RaphaelMatrixTransformInfo]
  }
}

