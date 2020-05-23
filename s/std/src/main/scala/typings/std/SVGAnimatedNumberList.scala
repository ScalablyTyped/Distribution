package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGAnimatedNumber interface is used for attributes which take a list of numbers and which can be animated. */
trait SVGAnimatedNumberList extends js.Object {
  val animVal: SVGNumberList
  val baseVal: SVGNumberList
}

object SVGAnimatedNumberList {
  @scala.inline
  def apply(animVal: SVGNumberList, baseVal: SVGNumberList): SVGAnimatedNumberList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedNumberList]
  }
}

