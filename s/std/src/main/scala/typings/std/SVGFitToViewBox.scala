package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGFitToViewBox extends js.Object {
  val preserveAspectRatio: SVGAnimatedPreserveAspectRatio
  val viewBox: SVGAnimatedRect
}

object SVGFitToViewBox {
  @scala.inline
  def apply(preserveAspectRatio: SVGAnimatedPreserveAspectRatio, viewBox: SVGAnimatedRect): SVGFitToViewBox = {
    val __obj = js.Dynamic.literal(preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGFitToViewBox]
  }
}

