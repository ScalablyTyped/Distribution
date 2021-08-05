package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleFill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSStyleFill extends StObject {
  
  var _class: styleFill
  
  var color: SketchMSColor
  
  var contextSettings: SketchMSGraphicsContextSettings
  
  var fillType: Double
  
  var gradient: SketchMSGradient
  
  var isEnabled: Double
  
  var noiseIndex: Double
  
  var noiseIntensity: Double
  
  var patternFillType: Double
  
  var patternTileScale: Double
}
object SketchMSStyleFill {
  
  inline def apply(
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    fillType: Double,
    gradient: SketchMSGradient,
    isEnabled: Double,
    noiseIndex: Double,
    noiseIntensity: Double,
    patternFillType: Double,
    patternTileScale: Double
  ): SketchMSStyleFill = {
    val __obj = js.Dynamic.literal(_class = "styleFill", color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], noiseIndex = noiseIndex.asInstanceOf[js.Any], noiseIntensity = noiseIntensity.asInstanceOf[js.Any], patternFillType = patternFillType.asInstanceOf[js.Any], patternTileScale = patternTileScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleFill]
  }
  
  extension [Self <: SketchMSStyleFill](x: Self) {
    
    inline def setColor(value: SketchMSColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setContextSettings(value: SketchMSGraphicsContextSettings): Self = StObject.set(x, "contextSettings", value.asInstanceOf[js.Any])
    
    inline def setFillType(value: Double): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
    
    inline def setGradient(value: SketchMSGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Double): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setNoiseIndex(value: Double): Self = StObject.set(x, "noiseIndex", value.asInstanceOf[js.Any])
    
    inline def setNoiseIntensity(value: Double): Self = StObject.set(x, "noiseIntensity", value.asInstanceOf[js.Any])
    
    inline def setPatternFillType(value: Double): Self = StObject.set(x, "patternFillType", value.asInstanceOf[js.Any])
    
    inline def setPatternTileScale(value: Double): Self = StObject.set(x, "patternTileScale", value.asInstanceOf[js.Any])
    
    inline def set_class(value: styleFill): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
