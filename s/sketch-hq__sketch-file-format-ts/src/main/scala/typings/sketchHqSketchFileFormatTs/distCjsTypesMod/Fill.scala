package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fill
  extends StObject
     with AnyObject {
  
  var _class: fill
  
  var color: Color
  
  var contextSettings: GraphicsContextSettings
  
  var fillType: FillType
  
  var gradient: Gradient
  
  var image: js.UndefOr[FileRef | DataRef] = js.undefined
  
  var isEnabled: Boolean
  
  var noiseIndex: Double
  
  var noiseIntensity: Double
  
  var patternFillType: PatternFillType
  
  var patternTileScale: Double
}
object Fill {
  
  inline def apply(
    color: Color,
    contextSettings: GraphicsContextSettings,
    fillType: FillType,
    gradient: Gradient,
    isEnabled: Boolean,
    noiseIndex: Double,
    noiseIntensity: Double,
    patternFillType: PatternFillType,
    patternTileScale: Double
  ): Fill = {
    val __obj = js.Dynamic.literal(_class = "fill", color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], noiseIndex = noiseIndex.asInstanceOf[js.Any], noiseIntensity = noiseIntensity.asInstanceOf[js.Any], patternFillType = patternFillType.asInstanceOf[js.Any], patternTileScale = patternTileScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
  
  extension [Self <: Fill](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setContextSettings(value: GraphicsContextSettings): Self = StObject.set(x, "contextSettings", value.asInstanceOf[js.Any])
    
    inline def setFillType(value: FillType): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
    
    inline def setGradient(value: Gradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setImage(value: FileRef | DataRef): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setNoiseIndex(value: Double): Self = StObject.set(x, "noiseIndex", value.asInstanceOf[js.Any])
    
    inline def setNoiseIntensity(value: Double): Self = StObject.set(x, "noiseIntensity", value.asInstanceOf[js.Any])
    
    inline def setPatternFillType(value: PatternFillType): Self = StObject.set(x, "patternFillType", value.asInstanceOf[js.Any])
    
    inline def setPatternTileScale(value: Double): Self = StObject.set(x, "patternTileScale", value.asInstanceOf[js.Any])
    
    inline def set_class(value: fill): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
