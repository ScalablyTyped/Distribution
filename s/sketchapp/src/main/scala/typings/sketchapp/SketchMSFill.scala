package typings.sketchapp

import typings.sketchapp.sketchappStrings.fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSFill extends StObject {
  
  var _class: fill = js.native
  
  var color: js.UndefOr[SketchMSColor] = js.native
  
  var fillType: SketchMSFillTypeEnum = js.native
  
  var image: js.UndefOr[SketchMSImageDataReference] = js.native
  
  var isEnabled: Boolean = js.native
  
  var noiseIndex: Double = js.native
  
  var noiseIntensity: Double = js.native
  
  var patternFillType: SketchMSPatternFillTypeEnum = js.native
  
  var patternTileScale: Double = js.native
}
object SketchMSFill {
  
  @scala.inline
  def apply(
    _class: fill,
    fillType: SketchMSFillTypeEnum,
    isEnabled: Boolean,
    noiseIndex: Double,
    noiseIntensity: Double,
    patternFillType: SketchMSPatternFillTypeEnum,
    patternTileScale: Double
  ): SketchMSFill = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], noiseIndex = noiseIndex.asInstanceOf[js.Any], noiseIntensity = noiseIntensity.asInstanceOf[js.Any], patternFillType = patternFillType.asInstanceOf[js.Any], patternTileScale = patternTileScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSFill]
  }
  
  @scala.inline
  implicit class SketchMSFillMutableBuilder[Self <: SketchMSFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: SketchMSColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFillType(value: SketchMSFillTypeEnum): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: SketchMSImageDataReference): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoiseIndex(value: Double): Self = StObject.set(x, "noiseIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoiseIntensity(value: Double): Self = StObject.set(x, "noiseIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternFillType(value: SketchMSPatternFillTypeEnum): Self = StObject.set(x, "patternFillType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternTileScale(value: Double): Self = StObject.set(x, "patternTileScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: fill): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
