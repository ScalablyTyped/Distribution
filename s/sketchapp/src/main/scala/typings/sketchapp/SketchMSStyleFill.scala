package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleFill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSStyleFill extends StObject {
  
  var _class: styleFill = js.native
  
  var color: SketchMSColor = js.native
  
  var contextSettings: SketchMSGraphicsContextSettings = js.native
  
  var fillType: Double = js.native
  
  var gradient: SketchMSGradient = js.native
  
  var isEnabled: Double = js.native
  
  var noiseIndex: Double = js.native
  
  var noiseIntensity: Double = js.native
  
  var patternFillType: Double = js.native
  
  var patternTileScale: Double = js.native
}
object SketchMSStyleFill {
  
  @scala.inline
  def apply(
    _class: styleFill,
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
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], noiseIndex = noiseIndex.asInstanceOf[js.Any], noiseIntensity = noiseIntensity.asInstanceOf[js.Any], patternFillType = patternFillType.asInstanceOf[js.Any], patternTileScale = patternTileScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleFill]
  }
  
  @scala.inline
  implicit class SketchMSStyleFillMutableBuilder[Self <: SketchMSStyleFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: SketchMSColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextSettings(value: SketchMSGraphicsContextSettings): Self = StObject.set(x, "contextSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillType(value: Double): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradient(value: SketchMSGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Double): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoiseIndex(value: Double): Self = StObject.set(x, "noiseIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoiseIntensity(value: Double): Self = StObject.set(x, "noiseIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternFillType(value: Double): Self = StObject.set(x, "patternFillType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternTileScale(value: Double): Self = StObject.set(x, "patternTileScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: styleFill): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
