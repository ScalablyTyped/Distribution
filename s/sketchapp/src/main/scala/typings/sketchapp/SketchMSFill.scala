package typings.sketchapp

import typings.sketchapp.sketchappStrings.fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSFill extends StObject {
  
  var _class: fill
  
  var color: js.UndefOr[SketchMSColor] = js.undefined
  
  var fillType: SketchMSFillTypeEnum
  
  var image: js.UndefOr[SketchMSImageDataReference] = js.undefined
  
  var isEnabled: Boolean
  
  var noiseIndex: Double
  
  var noiseIntensity: Double
  
  var patternFillType: SketchMSPatternFillTypeEnum
  
  var patternTileScale: Double
}
object SketchMSFill {
  
  inline def apply(
    fillType: SketchMSFillTypeEnum,
    isEnabled: Boolean,
    noiseIndex: Double,
    noiseIntensity: Double,
    patternFillType: SketchMSPatternFillTypeEnum,
    patternTileScale: Double
  ): SketchMSFill = {
    val __obj = js.Dynamic.literal(_class = "fill", fillType = fillType.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], noiseIndex = noiseIndex.asInstanceOf[js.Any], noiseIntensity = noiseIntensity.asInstanceOf[js.Any], patternFillType = patternFillType.asInstanceOf[js.Any], patternTileScale = patternTileScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSFill]
  }
  
  extension [Self <: SketchMSFill](x: Self) {
    
    inline def setColor(value: SketchMSColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFillType(value: SketchMSFillTypeEnum): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
    
    inline def setImage(value: SketchMSImageDataReference): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setNoiseIndex(value: Double): Self = StObject.set(x, "noiseIndex", value.asInstanceOf[js.Any])
    
    inline def setNoiseIntensity(value: Double): Self = StObject.set(x, "noiseIntensity", value.asInstanceOf[js.Any])
    
    inline def setPatternFillType(value: SketchMSPatternFillTypeEnum): Self = StObject.set(x, "patternFillType", value.asInstanceOf[js.Any])
    
    inline def setPatternTileScale(value: Double): Self = StObject.set(x, "patternTileScale", value.asInstanceOf[js.Any])
    
    inline def set_class(value: fill): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
