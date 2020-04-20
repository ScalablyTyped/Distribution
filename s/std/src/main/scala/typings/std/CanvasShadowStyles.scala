package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasShadowStyles extends js.Object {
  var shadowBlur: Double
  var shadowColor: java.lang.String
  var shadowOffsetX: Double
  var shadowOffsetY: Double
}

object CanvasShadowStyles {
  @scala.inline
  def apply(shadowBlur: Double, shadowColor: java.lang.String, shadowOffsetX: Double, shadowOffsetY: Double): CanvasShadowStyles = {
    val __obj = js.Dynamic.literal(shadowBlur = shadowBlur.asInstanceOf[js.Any], shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffsetX = shadowOffsetX.asInstanceOf[js.Any], shadowOffsetY = shadowOffsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasShadowStyles]
  }
}

