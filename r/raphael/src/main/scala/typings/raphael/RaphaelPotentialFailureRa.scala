package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined raphael.raphael.RaphaelPotentialFailure<raphael.raphael.RaphaelFullComponentInfo> */
trait RaphaelPotentialFailureRa extends js.Object {
  /** The RGB blue channel */
  /**
    * The HSB brightness channel.
    */
  var b: Double
  /**
    * If present and set to `1`, indicates that the operation that produced this result failed. Other fields
    * properties in this object may not be valid.
    */
  var error: js.UndefOr[Double] = js.undefined
  /** The RGB green channel */
  var g: Double
  /**
    * The HSB or HSL hue channel.
    */
  var h: Double
  /** Hex string of the color, in the format `#XXXXXX`. */
  var hex: String
  /**
    * The HSL luminosity channel.
    */
  var l: Double
  /** The RGB red channel */
  var r: Double
  /**
    * The HSB or HSL saturation channel.
    */
  var s: Double
}

object RaphaelPotentialFailureRa {
  @scala.inline
  def apply(
    b: Double,
    g: Double,
    h: Double,
    hex: String,
    l: Double,
    r: Double,
    s: Double,
    error: Int | Double = null
  ): RaphaelPotentialFailureRa = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelPotentialFailureRa]
  }
}

