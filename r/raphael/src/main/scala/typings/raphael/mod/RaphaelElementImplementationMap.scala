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

trait RaphaelElementImplementationMap extends js.Object {
  /** The elements that implement the {@link RaphaelPaper.circle} shape. */
  var circle: RaphaelElementByTechnologyMap[SVGCircleElement, VMLCircleElement]
  /** The elements that implement the {@link RaphaelPaper.ellipse} shape. */
  var ellipse: RaphaelElementByTechnologyMap[SVGEllipseElement, VMLEllipseElement]
  /** The elements that implement the {@link RaphaelPaper.image} shape. */
  var image: RaphaelElementByTechnologyMap[SVGImageElement, VMLImageElement]
  /** The elements that implement the {@link RaphaelPaper.path} shape. */
  var path: RaphaelElementByTechnologyMap[SVGPathElement, VMLPathElement]
  /** The elements that implement the {@link RaphaelPaper.rect} shape. */
  var rect: RaphaelElementByTechnologyMap[SVGRectElement, VMLRectElement]
  /** The elements that implement the {@link RaphaelPaper.text} shape. */
  var text: RaphaelElementByTechnologyMap[SVGTextElement, VMLTextElement]
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
}

