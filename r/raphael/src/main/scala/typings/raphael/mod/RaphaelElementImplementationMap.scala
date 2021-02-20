package typings.raphael.mod

import typings.std.SVGCircleElement
import typings.std.SVGEllipseElement
import typings.std.SVGImageElement
import typings.std.SVGPathElement
import typings.std.SVGRectElement
import typings.std.SVGTextElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelElementImplementationMap extends StObject {
  
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
  implicit class RaphaelElementImplementationMapMutableBuilder[Self <: RaphaelElementImplementationMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircle(value: RaphaelElementByTechnologyMap[SVGCircleElement, VMLCircleElement]): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipse(value: RaphaelElementByTechnologyMap[SVGEllipseElement, VMLEllipseElement]): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: RaphaelElementByTechnologyMap[SVGImageElement, VMLImageElement]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: RaphaelElementByTechnologyMap[SVGPathElement, VMLPathElement]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRect(value: RaphaelElementByTechnologyMap[SVGRectElement, VMLRectElement]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: RaphaelElementByTechnologyMap[SVGTextElement, VMLTextElement]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
