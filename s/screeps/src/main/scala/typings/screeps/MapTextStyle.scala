package typings.screeps

import typings.screeps.screepsStrings.center
import typings.screeps.screepsStrings.left
import typings.screeps.screepsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapTextStyle extends StObject {
  
  /**
    * Text align, either center, left, or right. Default is center.
    */
  var align: js.UndefOr[center | left | right] = js.undefined
  
  /**
    * Background color in the following format: #ffffff (hex triplet). Default is undefined (no background). When background is enabled, text vertical align is set to middle (default is baseline).
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Background rectangle padding, default is 2.
    */
  var backgroundPadding: js.UndefOr[Double] = js.undefined
  
  /**
    * Font color in the following format: #ffffff (hex triplet). Default is #ffffff.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The font family, default is sans-serif
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The font size in game coordinates, default is 10
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The font style ('normal', 'italic' or 'oblique')
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  
  /**
    * The font variant ('normal' or 'small-caps')
    */
  var fontVariant: js.UndefOr[String] = js.undefined
  
  /**
    * Opacity value, default is 0.5.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Stroke color in the following format: #ffffff (hex triplet). Default is undefined (no stroke).
    */
  var stroke: js.UndefOr[String] = js.undefined
  
  /**
    * Stroke width, default is 0.15.
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object MapTextStyle {
  
  @scala.inline
  def apply(): MapTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTextStyle]
  }
  
  @scala.inline
  implicit class MapTextStyleMutableBuilder[Self <: MapTextStyle] (val x: Self) extends AnyVal {
    
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
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
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
