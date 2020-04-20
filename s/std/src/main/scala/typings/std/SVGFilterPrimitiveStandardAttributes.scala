package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGFilterPrimitiveStandardAttributes extends js.Object {
  val height: SVGAnimatedLength
  val result: SVGAnimatedString
  val width: SVGAnimatedLength
  val x: SVGAnimatedLength
  val y: SVGAnimatedLength
}

object SVGFilterPrimitiveStandardAttributes {
  @scala.inline
  def apply(
    height: SVGAnimatedLength,
    result: SVGAnimatedString,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    y: SVGAnimatedLength
  ): SVGFilterPrimitiveStandardAttributes = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGFilterPrimitiveStandardAttributes]
  }
}

