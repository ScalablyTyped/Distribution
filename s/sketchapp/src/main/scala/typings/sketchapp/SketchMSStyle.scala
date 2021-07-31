package typings.sketchapp

import typings.sketchapp.sketchappStrings.style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSStyle extends StObject {
  
  var _class: style
  
  var blur: js.UndefOr[SketchMSStyleBlur] = js.undefined
  
  var borderOptions: js.UndefOr[SketchMSStyleBorderOptions] = js.undefined
  
  var borders: js.UndefOr[js.Array[SketchMSStyleBorder]] = js.undefined
  
  var colorControls: js.UndefOr[SketchMSStyleColorControls] = js.undefined
  
  var contextSettings: js.UndefOr[SketchMSGraphicsContextSettings] = js.undefined
  
  var do_objectID: String
  
  var endDecorationType: js.UndefOr[Double] = js.undefined
  
  var endMarkerType: Double
  
  var fills: js.UndefOr[js.Array[SketchMSStyleFill]] = js.undefined
  
  var innerShadows: js.UndefOr[js.Array[SketchMSStyleShadow]] = js.undefined
  
  var miterLimit: Double
  
  var reflection: js.UndefOr[SketchMSStyleReflection] = js.undefined
  
  var shadows: js.UndefOr[js.Array[SketchMSStyleShadow]] = js.undefined
  
  var startDecorationType: js.UndefOr[Double] = js.undefined
  
  var startMarkerType: Double
  
  var textStyle: js.UndefOr[SketchMSTextStyle] = js.undefined
  
  var windingRule: Double
}
object SketchMSStyle {
  
  @scala.inline
  def apply(
    do_objectID: String,
    endMarkerType: Double,
    miterLimit: Double,
    startMarkerType: Double,
    windingRule: Double
  ): SketchMSStyle = {
    val __obj = js.Dynamic.literal(_class = "style", do_objectID = do_objectID.asInstanceOf[js.Any], endMarkerType = endMarkerType.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], startMarkerType = startMarkerType.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyle]
  }
  
  @scala.inline
  implicit class SketchMSStyleMutableBuilder[Self <: SketchMSStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlur(value: SketchMSStyleBlur): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    @scala.inline
    def setBorderOptions(value: SketchMSStyleBorderOptions): Self = StObject.set(x, "borderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderOptionsUndefined: Self = StObject.set(x, "borderOptions", js.undefined)
    
    @scala.inline
    def setBorders(value: js.Array[SketchMSStyleBorder]): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    @scala.inline
    def setBordersVarargs(value: SketchMSStyleBorder*): Self = StObject.set(x, "borders", js.Array(value :_*))
    
    @scala.inline
    def setColorControls(value: SketchMSStyleColorControls): Self = StObject.set(x, "colorControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorControlsUndefined: Self = StObject.set(x, "colorControls", js.undefined)
    
    @scala.inline
    def setContextSettings(value: SketchMSGraphicsContextSettings): Self = StObject.set(x, "contextSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextSettingsUndefined: Self = StObject.set(x, "contextSettings", js.undefined)
    
    @scala.inline
    def setDo_objectID(value: String): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDecorationType(value: Double): Self = StObject.set(x, "endDecorationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDecorationTypeUndefined: Self = StObject.set(x, "endDecorationType", js.undefined)
    
    @scala.inline
    def setEndMarkerType(value: Double): Self = StObject.set(x, "endMarkerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFills(value: js.Array[SketchMSStyleFill]): Self = StObject.set(x, "fills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillsUndefined: Self = StObject.set(x, "fills", js.undefined)
    
    @scala.inline
    def setFillsVarargs(value: SketchMSStyleFill*): Self = StObject.set(x, "fills", js.Array(value :_*))
    
    @scala.inline
    def setInnerShadows(value: js.Array[SketchMSStyleShadow]): Self = StObject.set(x, "innerShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerShadowsUndefined: Self = StObject.set(x, "innerShadows", js.undefined)
    
    @scala.inline
    def setInnerShadowsVarargs(value: SketchMSStyleShadow*): Self = StObject.set(x, "innerShadows", js.Array(value :_*))
    
    @scala.inline
    def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflection(value: SketchMSStyleReflection): Self = StObject.set(x, "reflection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflectionUndefined: Self = StObject.set(x, "reflection", js.undefined)
    
    @scala.inline
    def setShadows(value: js.Array[SketchMSStyleShadow]): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    @scala.inline
    def setShadowsVarargs(value: SketchMSStyleShadow*): Self = StObject.set(x, "shadows", js.Array(value :_*))
    
    @scala.inline
    def setStartDecorationType(value: Double): Self = StObject.set(x, "startDecorationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDecorationTypeUndefined: Self = StObject.set(x, "startDecorationType", js.undefined)
    
    @scala.inline
    def setStartMarkerType(value: Double): Self = StObject.set(x, "startMarkerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyle(value: SketchMSTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setWindingRule(value: Double): Self = StObject.set(x, "windingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: style): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
