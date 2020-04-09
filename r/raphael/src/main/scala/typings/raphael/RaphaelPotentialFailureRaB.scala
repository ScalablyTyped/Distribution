package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined raphael.raphael.RaphaelPotentialFailure<raphael.raphael.RaphaelRgbComponentInfo> */
trait RaphaelPotentialFailureRaB extends js.Object {
  /** The RGB blue channel */
  var b: Double
  /**
    * If present and set to `1`, indicates that the operation that produced this result failed. Other fields
    * properties in this object may not be valid.
    */
  var error: js.UndefOr[Double] = js.undefined
  /** The RGB green channel */
  var g: Double
  /** Hex string of the color, in the format `#XXXXXX`. */
  var hex: String
  /** The RGB red channel */
  var r: Double
}

object RaphaelPotentialFailureRaB {
  @scala.inline
  def apply(b: Double, g: Double, hex: String, r: Double, error: Int | Double = null): RaphaelPotentialFailureRaB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelPotentialFailureRaB]
  }
}

