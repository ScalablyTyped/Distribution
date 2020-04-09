package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelRgbComponentInfo extends js.Object {
  /** The RGB blue channel */
  var b: Double
  /** The RGB green channel */
  var g: Double
  /** Hex string of the color, in the format `#XXXXXX`. */
  var hex: String
  /** The RGB red channel */
  var r: Double
}

object RaphaelRgbComponentInfo {
  @scala.inline
  def apply(b: Double, g: Double, hex: String, r: Double): RaphaelRgbComponentInfo = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RaphaelRgbComponentInfo]
  }
}

