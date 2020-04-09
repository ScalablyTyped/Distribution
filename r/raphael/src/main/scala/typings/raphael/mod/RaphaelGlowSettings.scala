package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelGlowSettings extends js.Object {
  /** The glow color, default is `black`. */
  var color: String
  /** Whether the glow effect will be filled, default is `false`. */
  var fill: Boolean
  /** Horizontal offset, default is `0`. */
  var offsetx: Double
  /** Vertical offset, default is `0`. */
  var offsety: Double
  /** Opacity of the glow effect, default is `0.5`. */
  var opacity: Double
  /** size of the glow, default is `10`. */
  var width: Double
}

object RaphaelGlowSettings {
  @scala.inline
  def apply(color: String, fill: Boolean, offsetx: Double, offsety: Double, opacity: Double, width: Double): RaphaelGlowSettings = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], offsetx = offsetx.asInstanceOf[js.Any], offsety = offsety.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RaphaelGlowSettings]
  }
}

