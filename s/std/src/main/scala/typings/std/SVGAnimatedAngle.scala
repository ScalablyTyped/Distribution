package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes of basic type <angle> which can be animated. */
trait SVGAnimatedAngle extends js.Object {
  val animVal: SVGAngle
  val baseVal: SVGAngle
}

object SVGAnimatedAngle {
  @scala.inline
  def apply(animVal: SVGAngle, baseVal: SVGAngle): SVGAnimatedAngle = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedAngle]
  }
}

