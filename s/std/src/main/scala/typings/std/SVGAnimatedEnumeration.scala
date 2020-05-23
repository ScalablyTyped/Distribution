package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes whose value must be a constant from a particular enumeration and which can be animated. */
trait SVGAnimatedEnumeration extends js.Object {
  val animVal: Double
  var baseVal: Double
}

object SVGAnimatedEnumeration {
  @scala.inline
  def apply(animVal: Double, baseVal: Double): SVGAnimatedEnumeration = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedEnumeration]
  }
}

