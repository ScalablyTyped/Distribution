package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<raphael.raphael.RaphaelAttributes> */
trait RaphaelShapeDescriptor extends StObject {
  
  var `arrow-end`: js.UndefOr[String] = js.undefined
  
  var `clip-rect`: js.UndefOr[String] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var cx: js.UndefOr[Double] = js.undefined
  
  var cy: js.UndefOr[Double] = js.undefined
  
  var fill: js.UndefOr[String] = js.undefined
  
  var `fill-opacity`: js.UndefOr[Double] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var `font-family`: js.UndefOr[String] = js.undefined
  
  var `font-size`: js.UndefOr[Double | String] = js.undefined
  
  var `font-weight`: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var r: js.UndefOr[Double] = js.undefined
  
  var rx: js.UndefOr[Double] = js.undefined
  
  var ry: js.UndefOr[Double] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var stroke: js.UndefOr[String] = js.undefined
  
  var `stroke-dasharray`: js.UndefOr[RaphaelDashArrayType] = js.undefined
  
  var `stroke-linecap`: js.UndefOr[RaphaelLineCapType] = js.undefined
  
  var `stroke-linejoin`: js.UndefOr[RaphaelLineJoinType] = js.undefined
  
  var `stroke-miterlimit`: js.UndefOr[Double] = js.undefined
  
  var `stroke-opacity`: js.UndefOr[Double] = js.undefined
  
  var `stroke-width`: js.UndefOr[Double] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var `text-anchor`: js.UndefOr[RaphaelTextAnchorType] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var transform: js.UndefOr[String | RaphaelTransformSegment | js.Array[RaphaelTransformSegment]] = js.undefined
  
  /** Type of the shape, e.g. `circle` or `rect`. Could also be a custom plugin shape. */
  var `type`: RaphaelShapeType | String
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object RaphaelShapeDescriptor {
  
  @scala.inline
  def apply(`type`: RaphaelShapeType | String): RaphaelShapeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelShapeDescriptor]
  }
  
  @scala.inline
  implicit class RaphaelShapeDescriptorMutableBuilder[Self <: RaphaelShapeDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setArrow-end`(value: String): Self = StObject.set(x, "arrow-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setArrow-endUndefined`: Self = StObject.set(x, "arrow-end", js.undefined)
    
    @scala.inline
    def `setClip-rect`(value: String): Self = StObject.set(x, "clip-rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setClip-rectUndefined`: Self = StObject.set(x, "clip-rect", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-opacity`(value: Double): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    @scala.inline
    def `setFont-size`(value: Double | String): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    @scala.inline
    def `setFont-weight`(value: String): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    @scala.inline
    def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-dasharray`(value: RaphaelDashArrayType): Self = StObject.set(x, "stroke-dasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-dasharrayUndefined`: Self = StObject.set(x, "stroke-dasharray", js.undefined)
    
    @scala.inline
    def `setStroke-linecap`(value: RaphaelLineCapType): Self = StObject.set(x, "stroke-linecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-linecapUndefined`: Self = StObject.set(x, "stroke-linecap", js.undefined)
    
    @scala.inline
    def `setStroke-linejoin`(value: RaphaelLineJoinType): Self = StObject.set(x, "stroke-linejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-linejoinUndefined`: Self = StObject.set(x, "stroke-linejoin", js.undefined)
    
    @scala.inline
    def `setStroke-miterlimit`(value: Double): Self = StObject.set(x, "stroke-miterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-miterlimitUndefined`: Self = StObject.set(x, "stroke-miterlimit", js.undefined)
    
    @scala.inline
    def `setStroke-opacity`(value: Double): Self = StObject.set(x, "stroke-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-opacityUndefined`: Self = StObject.set(x, "stroke-opacity", js.undefined)
    
    @scala.inline
    def `setStroke-width`(value: Double): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-anchor`(value: RaphaelTextAnchorType): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTransform(value: String | RaphaelTransformSegment | js.Array[RaphaelTransformSegment]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setTransformVarargs(value: RaphaelTransformSegment*): Self = StObject.set(x, "transform", js.Array(value :_*))
    
    @scala.inline
    def setType(value: RaphaelShapeType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
