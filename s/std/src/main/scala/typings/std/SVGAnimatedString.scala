package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGAnimatedString interface represents string attributes which can be animated from each SVG declaration. You need to create SVG attribute before doing anything else, everything should be declared inside this. */
trait SVGAnimatedString extends js.Object {
  val animVal: java.lang.String
  var baseVal: java.lang.String
}

object SVGAnimatedString {
  @scala.inline
  def apply(animVal: java.lang.String, baseVal: java.lang.String): SVGAnimatedString = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedString]
  }
}

