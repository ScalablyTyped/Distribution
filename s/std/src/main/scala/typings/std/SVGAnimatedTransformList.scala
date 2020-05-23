package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes which take a list of numbers and which can be animated. */
trait SVGAnimatedTransformList extends js.Object {
  val animVal: SVGTransformList
  val baseVal: SVGTransformList
}

object SVGAnimatedTransformList {
  @scala.inline
  def apply(animVal: SVGTransformList, baseVal: SVGTransformList): SVGAnimatedTransformList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedTransformList]
  }
}

