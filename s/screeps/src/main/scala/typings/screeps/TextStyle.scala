package typings.screeps

import typings.screeps.screepsStrings.center
import typings.screeps.screepsStrings.left
import typings.screeps.screepsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStyle extends StObject {
  
  var align: js.UndefOr[center | left | right] = js.native
  
  /**
    * Background color in any web format, default is undefined (no background).When background is enabled, text vertical align is set to middle (default is baseline).
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Background rectangle padding, default is 0.3.
    */
  var backgroundPadding: js.UndefOr[Double] = js.native
  
  /**
    * Font color in any web format, default is #ffffff(white).
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Either a number or a string in one of the following forms:
    * 0.7 - relative size in game coordinates
    * 20px - absolute size in pixels
    * 0.7 serif
    * bold italic 1.5 Times New Roman
    */
  var font: js.UndefOr[Double | String] = js.native
  
  /**
    * Opacity value, default is 1.0.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Stroke color in any web format, default is undefined (no stroke).
    */
  var stroke: js.UndefOr[String] = js.native
  
  /**
    * Stroke width, default is 0.15.
    */
  var strokeWidth: js.UndefOr[Double] = js.native
}
object TextStyle {
  
  @scala.inline
  def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  
  @scala.inline
  implicit class TextStyleMutableBuilder[Self <: TextStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: center | left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundPadding(value: Double): Self = StObject.set(x, "backgroundPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundPaddingUndefined: Self = StObject.set(x, "backgroundPadding", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFont(value: Double | String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
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
