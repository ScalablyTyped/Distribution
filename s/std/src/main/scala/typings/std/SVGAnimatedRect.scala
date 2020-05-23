package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes of basic SVGRect which can be animated. */
trait SVGAnimatedRect extends js.Object {
  val animVal: DOMRectReadOnly
  val baseVal: DOMRect
}

object SVGAnimatedRect {
  @scala.inline
  def apply(animVal: DOMRectReadOnly, baseVal: DOMRect): SVGAnimatedRect = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedRect]
  }
}

