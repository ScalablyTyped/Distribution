package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes of type SVGPreserveAspectRatio which can be animated. */
trait SVGAnimatedPreserveAspectRatio extends js.Object {
  val animVal: SVGPreserveAspectRatio
  val baseVal: SVGPreserveAspectRatio
}

object SVGAnimatedPreserveAspectRatio {
  @scala.inline
  def apply(animVal: SVGPreserveAspectRatio, baseVal: SVGPreserveAspectRatio): SVGAnimatedPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedPreserveAspectRatio]
  }
}

