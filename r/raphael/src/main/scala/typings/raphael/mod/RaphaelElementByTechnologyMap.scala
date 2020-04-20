package typings.raphael.mod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelElementByTechnologyMap[TSvg /* <: SVGElement */, TVml /* <: VMLElement */] extends js.Object {
  var SVG: TSvg
  var VML: TVml
}

object RaphaelElementByTechnologyMap {
  @scala.inline
  def apply[TSvg /* <: SVGElement */, TVml /* <: VMLElement */](SVG: TSvg, VML: TVml): RaphaelElementByTechnologyMap[TSvg, TVml] = {
    val __obj = js.Dynamic.literal(SVG = SVG.asInstanceOf[js.Any], VML = VML.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelElementByTechnologyMap[TSvg, TVml]]
  }
}

