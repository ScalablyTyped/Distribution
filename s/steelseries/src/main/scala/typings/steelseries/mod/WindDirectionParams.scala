package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent steelseries.steelseries.FrameStruct */
/* Inlined parent std.Omit<steelseries.steelseries.PointKnob, 'pointerType'> */
/* Inlined parent std.Omit<steelseries.steelseries.Lcd, 'lcdDecimals'> */
trait WindDirectionParams extends StObject {
  
  var area: js.UndefOr[js.Array[Section]] = js.undefined
  
  var backgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  // Omit<> in Horizon
  var backgroundVisible: js.UndefOr[Boolean] = js.undefined
  
  var customLayer: js.UndefOr[Any] = js.undefined
  
  var degreeScale: js.UndefOr[Boolean] = js.undefined
  
  var degreeScaleHalf: js.UndefOr[Boolean] = js.undefined
  
  var digitalFont: js.UndefOr[Boolean] = js.undefined
  
  // Omit<> in Horizon
  var foregroundType: js.UndefOr[ForegroundType] = js.undefined
  
  // Omit<> in Linear*
  var foregroundVisible: js.UndefOr[Boolean] = js.undefined
  
  var frameDesign: js.UndefOr[FrameDesign] = js.undefined
  
  var frameVisible: js.UndefOr[Boolean] = js.undefined
  
  var fullScaleDeflectionTime: js.UndefOr[Double] = js.undefined
  
  var knobStyle: js.UndefOr[KnobStyle] = js.undefined
  
  var knobType: js.UndefOr[KnobType] = js.undefined
  
  var lcdColor: js.UndefOr[LcdColor] = js.undefined
  
  var lcdTitleStrings: js.UndefOr[js.Array[String]] = js.undefined
  
  var lcdVisible: js.UndefOr[Boolean] = js.undefined
  
  var pointSymbols: js.UndefOr[js.Array[String]] = js.undefined
  
  var pointSymbolsVisible: js.UndefOr[Boolean] = js.undefined
  
  var pointerColor: js.UndefOr[ColorDef] = js.undefined
  
  var pointerColorAverage: js.UndefOr[ColorDef] = js.undefined
  
  var pointerTypeAverage: js.UndefOr[PointerType] = js.undefined
  
  var pointerTypeLatest: js.UndefOr[PointerType] = js.undefined
  
  var roseVisible: js.UndefOr[Boolean] = js.undefined
  
  var section: js.UndefOr[js.Array[Section]] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var titleString: js.UndefOr[String] = js.undefined
  
  var useColorLabels: js.UndefOr[Boolean] = js.undefined
}
object WindDirectionParams {
  
  inline def apply(): WindDirectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindDirectionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindDirectionParams] (val x: Self) extends AnyVal {
    
    inline def setArea(value: js.Array[Section]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setAreaVarargs(value: Section*): Self = StObject.set(x, "area", js.Array(value*))
    
    inline def setBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundVisible(value: Boolean): Self = StObject.set(x, "backgroundVisible", value.asInstanceOf[js.Any])
    
    inline def setBackgroundVisibleUndefined: Self = StObject.set(x, "backgroundVisible", js.undefined)
    
    inline def setCustomLayer(value: Any): Self = StObject.set(x, "customLayer", value.asInstanceOf[js.Any])
    
    inline def setCustomLayerUndefined: Self = StObject.set(x, "customLayer", js.undefined)
    
    inline def setDegreeScale(value: Boolean): Self = StObject.set(x, "degreeScale", value.asInstanceOf[js.Any])
    
    inline def setDegreeScaleHalf(value: Boolean): Self = StObject.set(x, "degreeScaleHalf", value.asInstanceOf[js.Any])
    
    inline def setDegreeScaleHalfUndefined: Self = StObject.set(x, "degreeScaleHalf", js.undefined)
    
    inline def setDegreeScaleUndefined: Self = StObject.set(x, "degreeScale", js.undefined)
    
    inline def setDigitalFont(value: Boolean): Self = StObject.set(x, "digitalFont", value.asInstanceOf[js.Any])
    
    inline def setDigitalFontUndefined: Self = StObject.set(x, "digitalFont", js.undefined)
    
    inline def setForegroundType(value: ForegroundType): Self = StObject.set(x, "foregroundType", value.asInstanceOf[js.Any])
    
    inline def setForegroundTypeUndefined: Self = StObject.set(x, "foregroundType", js.undefined)
    
    inline def setForegroundVisible(value: Boolean): Self = StObject.set(x, "foregroundVisible", value.asInstanceOf[js.Any])
    
    inline def setForegroundVisibleUndefined: Self = StObject.set(x, "foregroundVisible", js.undefined)
    
    inline def setFrameDesign(value: FrameDesign): Self = StObject.set(x, "frameDesign", value.asInstanceOf[js.Any])
    
    inline def setFrameDesignUndefined: Self = StObject.set(x, "frameDesign", js.undefined)
    
    inline def setFrameVisible(value: Boolean): Self = StObject.set(x, "frameVisible", value.asInstanceOf[js.Any])
    
    inline def setFrameVisibleUndefined: Self = StObject.set(x, "frameVisible", js.undefined)
    
    inline def setFullScaleDeflectionTime(value: Double): Self = StObject.set(x, "fullScaleDeflectionTime", value.asInstanceOf[js.Any])
    
    inline def setFullScaleDeflectionTimeUndefined: Self = StObject.set(x, "fullScaleDeflectionTime", js.undefined)
    
    inline def setKnobStyle(value: KnobStyle): Self = StObject.set(x, "knobStyle", value.asInstanceOf[js.Any])
    
    inline def setKnobStyleUndefined: Self = StObject.set(x, "knobStyle", js.undefined)
    
    inline def setKnobType(value: KnobType): Self = StObject.set(x, "knobType", value.asInstanceOf[js.Any])
    
    inline def setKnobTypeUndefined: Self = StObject.set(x, "knobType", js.undefined)
    
    inline def setLcdColor(value: LcdColor): Self = StObject.set(x, "lcdColor", value.asInstanceOf[js.Any])
    
    inline def setLcdColorUndefined: Self = StObject.set(x, "lcdColor", js.undefined)
    
    inline def setLcdTitleStrings(value: js.Array[String]): Self = StObject.set(x, "lcdTitleStrings", value.asInstanceOf[js.Any])
    
    inline def setLcdTitleStringsUndefined: Self = StObject.set(x, "lcdTitleStrings", js.undefined)
    
    inline def setLcdTitleStringsVarargs(value: String*): Self = StObject.set(x, "lcdTitleStrings", js.Array(value*))
    
    inline def setLcdVisible(value: Boolean): Self = StObject.set(x, "lcdVisible", value.asInstanceOf[js.Any])
    
    inline def setLcdVisibleUndefined: Self = StObject.set(x, "lcdVisible", js.undefined)
    
    inline def setPointSymbols(value: js.Array[String]): Self = StObject.set(x, "pointSymbols", value.asInstanceOf[js.Any])
    
    inline def setPointSymbolsUndefined: Self = StObject.set(x, "pointSymbols", js.undefined)
    
    inline def setPointSymbolsVarargs(value: String*): Self = StObject.set(x, "pointSymbols", js.Array(value*))
    
    inline def setPointSymbolsVisible(value: Boolean): Self = StObject.set(x, "pointSymbolsVisible", value.asInstanceOf[js.Any])
    
    inline def setPointSymbolsVisibleUndefined: Self = StObject.set(x, "pointSymbolsVisible", js.undefined)
    
    inline def setPointerColor(value: ColorDef): Self = StObject.set(x, "pointerColor", value.asInstanceOf[js.Any])
    
    inline def setPointerColorAverage(value: ColorDef): Self = StObject.set(x, "pointerColorAverage", value.asInstanceOf[js.Any])
    
    inline def setPointerColorAverageUndefined: Self = StObject.set(x, "pointerColorAverage", js.undefined)
    
    inline def setPointerColorUndefined: Self = StObject.set(x, "pointerColor", js.undefined)
    
    inline def setPointerTypeAverage(value: PointerType): Self = StObject.set(x, "pointerTypeAverage", value.asInstanceOf[js.Any])
    
    inline def setPointerTypeAverageUndefined: Self = StObject.set(x, "pointerTypeAverage", js.undefined)
    
    inline def setPointerTypeLatest(value: PointerType): Self = StObject.set(x, "pointerTypeLatest", value.asInstanceOf[js.Any])
    
    inline def setPointerTypeLatestUndefined: Self = StObject.set(x, "pointerTypeLatest", js.undefined)
    
    inline def setRoseVisible(value: Boolean): Self = StObject.set(x, "roseVisible", value.asInstanceOf[js.Any])
    
    inline def setRoseVisibleUndefined: Self = StObject.set(x, "roseVisible", js.undefined)
    
    inline def setSection(value: js.Array[Section]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSectionVarargs(value: Section*): Self = StObject.set(x, "section", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTitleString(value: String): Self = StObject.set(x, "titleString", value.asInstanceOf[js.Any])
    
    inline def setTitleStringUndefined: Self = StObject.set(x, "titleString", js.undefined)
    
    inline def setUseColorLabels(value: Boolean): Self = StObject.set(x, "useColorLabels", value.asInstanceOf[js.Any])
    
    inline def setUseColorLabelsUndefined: Self = StObject.set(x, "useColorLabels", js.undefined)
  }
}
