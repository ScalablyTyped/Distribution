package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasShadowStyles extends js.Object {
  var shadowBlur: scala.Double
  var shadowColor: java.lang.String
  var shadowOffsetX: scala.Double
  var shadowOffsetY: scala.Double
}

object CanvasShadowStyles {
  @scala.inline
  def apply(
    shadowBlur: scala.Double,
    shadowColor: java.lang.String,
    shadowOffsetX: scala.Double,
    shadowOffsetY: scala.Double
  ): CanvasShadowStyles = {
    val __obj = js.Dynamic.literal(shadowBlur = shadowBlur, shadowColor = shadowColor, shadowOffsetX = shadowOffsetX, shadowOffsetY = shadowOffsetY)
  
    __obj.asInstanceOf[CanvasShadowStyles]
  }
}

