package typings.raphael.mod

import typings.std.SVGCircleElement
import typings.std.SVGEllipseElement
import typings.std.SVGImageElement
import typings.std.SVGPathElement
import typings.std.SVGRectElement
import typings.std.SVGTextElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelElementImplementationMap extends js.Object {
  /** The elements that implement the {@link RaphaelPaper.circle} shape. */
  var circle: RaphaelElementByTechnologyMap[SVGCircleElement, VMLCircleElement] = js.native
  /** The elements that implement the {@link RaphaelPaper.ellipse} shape. */
  var ellipse: RaphaelElementByTechnologyMap[SVGEllipseElement, VMLEllipseElement] = js.native
  /** The elements that implement the {@link RaphaelPaper.image} shape. */
  var image: RaphaelElementByTechnologyMap[SVGImageElement, VMLImageElement] = js.native
  /** The elements that implement the {@link RaphaelPaper.path} shape. */
  var path: RaphaelElementByTechnologyMap[SVGPathElement, VMLPathElement] = js.native
  /** The elements that implement the {@link RaphaelPaper.rect} shape. */
  var rect: RaphaelElementByTechnologyMap[SVGRectElement, VMLRectElement] = js.native
  /** The elements that implement the {@link RaphaelPaper.text} shape. */
  var text: RaphaelElementByTechnologyMap[SVGTextElement, VMLTextElement] = js.native
}

object RaphaelElementImplementationMap {
  @scala.inline
  def apply(
    circle: RaphaelElementByTechnologyMap[SVGCircleElement, VMLCircleElement],
    ellipse: RaphaelElementByTechnologyMap[SVGEllipseElement, VMLEllipseElement],
    image: RaphaelElementByTechnologyMap[SVGImageElement, VMLImageElement],
    path: RaphaelElementByTechnologyMap[SVGPathElement, VMLPathElement],
    rect: RaphaelElementByTechnologyMap[SVGRectElement, VMLRectElement],
    text: RaphaelElementByTechnologyMap[SVGTextElement, VMLTextElement]
  ): RaphaelElementImplementationMap = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], ellipse = ellipse.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelElementImplementationMap]
  }
  @scala.inline
  implicit class RaphaelElementImplementationMapOps[Self <: RaphaelElementImplementationMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCircle(value: RaphaelElementByTechnologyMap[SVGCircleElement, VMLCircleElement]): Self = this.set("circle", value.asInstanceOf[js.Any])
    @scala.inline
    def setEllipse(value: RaphaelElementByTechnologyMap[SVGEllipseElement, VMLEllipseElement]): Self = this.set("ellipse", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: RaphaelElementByTechnologyMap[SVGImageElement, VMLImageElement]): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: RaphaelElementByTechnologyMap[SVGPathElement, VMLPathElement]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRect(value: RaphaelElementByTechnologyMap[SVGRectElement, VMLRectElement]): Self = this.set("rect", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: RaphaelElementByTechnologyMap[SVGTextElement, VMLTextElement]): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

