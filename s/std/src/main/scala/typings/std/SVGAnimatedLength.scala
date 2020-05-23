package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes of basic type <length> which can be animated. */
trait SVGAnimatedLength extends js.Object {
  val animVal: SVGLength
  val baseVal: SVGLength
}

object SVGAnimatedLength {
  @scala.inline
  def apply(animVal: SVGLength, baseVal: SVGLength): SVGAnimatedLength = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLength]
  }
}

