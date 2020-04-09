package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelHslComponentInfo extends js.Object {
  /**
    * The HSB or HSL hue channel.
    */
  var h: Double
  /**
    * The HSL luminosity channel.
    */
  var l: Double
  /**
    * The HSB or HSL saturation channel.
    */
  var s: Double
}

object RaphaelHslComponentInfo {
  @scala.inline
  def apply(h: Double, l: Double, s: Double): RaphaelHslComponentInfo = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RaphaelHslComponentInfo]
  }
}

