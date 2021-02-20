package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Colors
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CENTER
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CIRCLE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.DEFAULT
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.EMPTY
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.HORIZONTAL
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_TO_RIGHT
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LINE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.NONE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_TO_LEFT
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SQUARE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.VERTICAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartLegend extends StObject {
  
  var custom: js.UndefOr[Colors] = js.native
  
  var direction: js.UndefOr[LEFT_TO_RIGHT | RIGHT_TO_LEFT] = js.native
  
  var drawInside: js.UndefOr[Boolean] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontStyle: js.UndefOr[Double] = js.native
  
  var fontWeight: js.UndefOr[Double] = js.native
  
  var form: js.UndefOr[NONE | EMPTY | DEFAULT | SQUARE | CIRCLE | LINE] = js.native
  
  var formSize: js.UndefOr[Double] = js.native
  
  var formToTextSpace: js.UndefOr[Double] = js.native
  
  var horizontalAlignment: js.UndefOr[LEFT | CENTER | RIGHT] = js.native
  
  var maxSizePercent: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[HORIZONTAL | VERTICAL] = js.native
  
  var textColor: js.UndefOr[Color] = js.native
  
  var textSize: js.UndefOr[Double] = js.native
  
  var verticalAlignment: js.UndefOr[TOP | CENTER | BOTTOM] = js.native
  
  var wordWrapEnabled: js.UndefOr[Boolean] = js.native
  
  var xEntrySpace: js.UndefOr[Double] = js.native
  
  var yEntrySpace: js.UndefOr[Double] = js.native
}
object ChartLegend {
  
  @scala.inline
  def apply(): ChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegend]
  }
  
  @scala.inline
  implicit class ChartLegendMutableBuilder[Self <: ChartLegend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom(value: Colors): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDirection(value: LEFT_TO_RIGHT | RIGHT_TO_LEFT): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDrawInside(value: Boolean): Self = StObject.set(x, "drawInside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawInsideUndefined: Self = StObject.set(x, "drawInside", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontStyle(value: Double): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setForm(value: NONE | EMPTY | DEFAULT | SQUARE | CIRCLE | LINE): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormSize(value: Double): Self = StObject.set(x, "formSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormSizeUndefined: Self = StObject.set(x, "formSize", js.undefined)
    
    @scala.inline
    def setFormToTextSpace(value: Double): Self = StObject.set(x, "formToTextSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormToTextSpaceUndefined: Self = StObject.set(x, "formToTextSpace", js.undefined)
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: LEFT | CENTER | RIGHT): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setMaxSizePercent(value: Double): Self = StObject.set(x, "maxSizePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizePercentUndefined: Self = StObject.set(x, "maxSizePercent", js.undefined)
    
    @scala.inline
    def setOrientation(value: HORIZONTAL | VERTICAL): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setTextColor(value: Color): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setTextSize(value: Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: TOP | CENTER | BOTTOM): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    @scala.inline
    def setWordWrapEnabled(value: Boolean): Self = StObject.set(x, "wordWrapEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrapEnabledUndefined: Self = StObject.set(x, "wordWrapEnabled", js.undefined)
    
    @scala.inline
    def setXEntrySpace(value: Double): Self = StObject.set(x, "xEntrySpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXEntrySpaceUndefined: Self = StObject.set(x, "xEntrySpace", js.undefined)
    
    @scala.inline
    def setYEntrySpace(value: Double): Self = StObject.set(x, "yEntrySpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYEntrySpaceUndefined: Self = StObject.set(x, "yEntrySpace", js.undefined)
  }
}
