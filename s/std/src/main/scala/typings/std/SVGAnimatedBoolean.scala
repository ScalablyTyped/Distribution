package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes of type boolean which can be animated. */
trait SVGAnimatedBoolean extends js.Object {
  val animVal: scala.Boolean
  var baseVal: scala.Boolean
}

object SVGAnimatedBoolean {
  @scala.inline
  def apply(animVal: scala.Boolean, baseVal: scala.Boolean): SVGAnimatedBoolean = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedBoolean]
  }
}

