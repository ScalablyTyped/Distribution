package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes of basic type <integer> which can be animated. */
trait SVGAnimatedInteger extends js.Object {
  val animVal: Double
  var baseVal: Double
}

object SVGAnimatedInteger {
  @scala.inline
  def apply(animVal: Double, baseVal: Double): SVGAnimatedInteger = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedInteger]
  }
}

