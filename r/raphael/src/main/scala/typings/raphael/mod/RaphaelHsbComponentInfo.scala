package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelHsbComponentInfo extends js.Object {
  /**
    * The HSB brightness channel.
    */
  var b: Double
  /**
    * The HSB or HSL hue channel.
    */
  var h: Double
  /**
    * The HSB or HSL saturation channel.
    */
  var s: Double
}

object RaphaelHsbComponentInfo {
  @scala.inline
  def apply(b: Double, h: Double, s: Double): RaphaelHsbComponentInfo = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RaphaelHsbComponentInfo]
  }
}

