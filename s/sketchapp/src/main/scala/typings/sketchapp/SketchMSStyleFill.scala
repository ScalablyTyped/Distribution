package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleFill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSStyleFill extends js.Object {
  
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
  implicit class SketchMSStyleFillOps[Self <: SketchMSStyleFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_class(value: styleFill): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: SketchMSColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextSettings(value: SketchMSGraphicsContextSettings): Self = this.set("contextSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillType(value: Double): Self = this.set("fillType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradient(value: SketchMSGradient): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Double): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoiseIndex(value: Double): Self = this.set("noiseIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoiseIntensity(value: Double): Self = this.set("noiseIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternFillType(value: Double): Self = this.set("patternFillType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternTileScale(value: Double): Self = this.set("patternTileScale", value.asInstanceOf[js.Any])
  }
}
