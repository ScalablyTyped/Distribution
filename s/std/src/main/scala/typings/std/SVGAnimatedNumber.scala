package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes of basic type <Number> which can be animated. */
trait SVGAnimatedNumber extends js.Object {
  val animVal: Double
  var baseVal: Double
}

object SVGAnimatedNumber {
  @scala.inline
  def apply(animVal: Double, baseVal: Double): SVGAnimatedNumber = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedNumber]
  }
}

