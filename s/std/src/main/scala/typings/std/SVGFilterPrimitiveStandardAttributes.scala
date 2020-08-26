package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFilterPrimitiveStandardAttributes extends js.Object {
  val height: SVGAnimatedLength = js.native
  val result: SVGAnimatedString = js.native
  val width: SVGAnimatedLength = js.native
  val x: SVGAnimatedLength = js.native
  val y: SVGAnimatedLength = js.native
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
  @scala.inline
  implicit class SVGFilterPrimitiveStandardAttributesOps[Self <: SVGFilterPrimitiveStandardAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: SVGAnimatedLength): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: SVGAnimatedString): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: SVGAnimatedLength): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: SVGAnimatedLength): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: SVGAnimatedLength): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

