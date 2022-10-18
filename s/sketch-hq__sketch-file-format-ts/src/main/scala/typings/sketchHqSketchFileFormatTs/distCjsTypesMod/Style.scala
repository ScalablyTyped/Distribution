package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style
  extends StObject
     with AnyObject {
  
  var _class: style
  
  var blur: js.UndefOr[Blur] = js.undefined
  
  var borderOptions: BorderOptions
  
  var borders: js.UndefOr[js.Array[Border]] = js.undefined
  
  var colorControls: ColorControls
  
  var contextSettings: js.UndefOr[GraphicsContextSettings] = js.undefined
  
  var do_objectID: Uuid
  
  var endMarkerType: MarkerType
  
  var fills: js.UndefOr[js.Array[Fill]] = js.undefined
  
  var innerShadows: js.Array[InnerShadow]
  
  var miterLimit: Double
  
  var shadows: js.UndefOr[js.Array[Shadow]] = js.undefined
  
  var startMarkerType: MarkerType
  
  var textStyle: js.UndefOr[TextStyle] = js.undefined
  
  var windingRule: WindingRule
}
object Style {
  
  inline def apply(
    borderOptions: BorderOptions,
    colorControls: ColorControls,
    do_objectID: Uuid,
    endMarkerType: MarkerType,
    innerShadows: js.Array[InnerShadow],
    miterLimit: Double,
    startMarkerType: MarkerType,
    windingRule: WindingRule
  ): Style = {
    val __obj = js.Dynamic.literal(_class = "style", borderOptions = borderOptions.asInstanceOf[js.Any], colorControls = colorControls.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], endMarkerType = endMarkerType.asInstanceOf[js.Any], innerShadows = innerShadows.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], startMarkerType = startMarkerType.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  extension [Self <: Style](x: Self) {
    
    inline def setBlur(value: Blur): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    inline def setBorderOptions(value: BorderOptions): Self = StObject.set(x, "borderOptions", value.asInstanceOf[js.Any])
    
    inline def setBorders(value: js.Array[Border]): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    inline def setBordersVarargs(value: Border*): Self = StObject.set(x, "borders", js.Array(value*))
    
    inline def setColorControls(value: ColorControls): Self = StObject.set(x, "colorControls", value.asInstanceOf[js.Any])
    
    inline def setContextSettings(value: GraphicsContextSettings): Self = StObject.set(x, "contextSettings", value.asInstanceOf[js.Any])
    
    inline def setContextSettingsUndefined: Self = StObject.set(x, "contextSettings", js.undefined)
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setEndMarkerType(value: MarkerType): Self = StObject.set(x, "endMarkerType", value.asInstanceOf[js.Any])
    
    inline def setFills(value: js.Array[Fill]): Self = StObject.set(x, "fills", value.asInstanceOf[js.Any])
    
    inline def setFillsUndefined: Self = StObject.set(x, "fills", js.undefined)
    
    inline def setFillsVarargs(value: Fill*): Self = StObject.set(x, "fills", js.Array(value*))
    
    inline def setInnerShadows(value: js.Array[InnerShadow]): Self = StObject.set(x, "innerShadows", value.asInstanceOf[js.Any])
    
    inline def setInnerShadowsVarargs(value: InnerShadow*): Self = StObject.set(x, "innerShadows", js.Array(value*))
    
    inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    inline def setShadows(value: js.Array[Shadow]): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    inline def setShadowsVarargs(value: Shadow*): Self = StObject.set(x, "shadows", js.Array(value*))
    
    inline def setStartMarkerType(value: MarkerType): Self = StObject.set(x, "startMarkerType", value.asInstanceOf[js.Any])
    
    inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setWindingRule(value: WindingRule): Self = StObject.set(x, "windingRule", value.asInstanceOf[js.Any])
    
    inline def set_class(value: style): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
