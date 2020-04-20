package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedPoints extends js.Object {
  val animatedPoints: SVGPointList
  val points: SVGPointList
}

object SVGAnimatedPoints {
  @scala.inline
  def apply(animatedPoints: SVGPointList, points: SVGPointList): SVGAnimatedPoints = {
    val __obj = js.Dynamic.literal(animatedPoints = animatedPoints.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedPoints]
  }
}

