package typings.screeps

import typings.screeps.screepsStrings.dashed
import typings.screeps.screepsStrings.dotted
import typings.screeps.screepsStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolyStyle extends StObject {
  
  /**
    * Fill color in any web format, default is #ffffff(white).
    */
  var fill: js.UndefOr[String] = js.undefined
  
  /**
    * Either undefined (solid line), dashed, or dotted.Default is undefined.
    */
  var lineStyle: js.UndefOr[dashed | dotted | solid] = js.undefined
  
  /**
    * Opacity value, default is 0.5.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Stroke color in any web format, default is undefined (no stroke).
    */
  var stroke: js.UndefOr[String] = js.undefined
  
  /**
    * Stroke line width, default is 0.1.
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object PolyStyle {
  
  @scala.inline
  def apply(): PolyStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolyStyle]
  }
  
  @scala.inline
  implicit class PolyStyleMutableBuilder[Self <: PolyStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setLineStyle(value: dashed | dotted | solid): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
