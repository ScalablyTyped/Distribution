package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGBoundingBoxOptions extends StObject {
  
  var clipped: js.UndefOr[scala.Boolean] = js.undefined
  
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  
  var markers: js.UndefOr[scala.Boolean] = js.undefined
  
  var stroke: js.UndefOr[scala.Boolean] = js.undefined
}
object SVGBoundingBoxOptions {
  
  @scala.inline
  def apply(): SVGBoundingBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGBoundingBoxOptions]
  }
  
  @scala.inline
  implicit class SVGBoundingBoxOptionsMutableBuilder[Self <: SVGBoundingBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipped(value: scala.Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
    
    @scala.inline
    def setFill(value: scala.Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setMarkers(value: scala.Boolean): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    @scala.inline
    def setStroke(value: scala.Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
