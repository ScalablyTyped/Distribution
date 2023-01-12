package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFace extends StObject {
  
  /* standard dom */
  var ascentOverride: java.lang.String
  
  /* standard dom */
  var descentOverride: java.lang.String
  
  /* standard dom */
  var display: java.lang.String
  
  /* standard dom */
  var family: java.lang.String
  
  /* standard dom */
  var featureSettings: java.lang.String
  
  /* standard dom */
  var lineGapOverride: java.lang.String
  
  /* standard dom */
  def load(): js.Promise[FontFace]
  
  /* standard dom */
  val loaded: js.Promise[FontFace]
  
  /* standard dom */
  val status: FontFaceLoadStatus
  
  /* standard dom */
  var stretch: java.lang.String
  
  /* standard dom */
  var style: java.lang.String
  
  /* standard dom */
  var unicodeRange: java.lang.String
  
  /* standard dom */
  var variant: java.lang.String
  
  /* standard dom */
  var variationSettings: java.lang.String
  
  /* standard dom */
  var weight: java.lang.String
}
object FontFace {
  
  inline def apply(
    ascentOverride: java.lang.String,
    descentOverride: java.lang.String,
    display: java.lang.String,
    family: java.lang.String,
    featureSettings: java.lang.String,
    lineGapOverride: java.lang.String,
    load: () => js.Promise[FontFace],
    loaded: js.Promise[FontFace],
    status: FontFaceLoadStatus,
    stretch: java.lang.String,
    style: java.lang.String,
    unicodeRange: java.lang.String,
    variant: java.lang.String,
    variationSettings: java.lang.String,
    weight: java.lang.String
  ): FontFace = {
    val __obj = js.Dynamic.literal(ascentOverride = ascentOverride.asInstanceOf[js.Any], descentOverride = descentOverride.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], featureSettings = featureSettings.asInstanceOf[js.Any], lineGapOverride = lineGapOverride.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loaded = loaded.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unicodeRange = unicodeRange.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], variationSettings = variationSettings.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontFace] (val x: Self) extends AnyVal {
    
    inline def setAscentOverride(value: java.lang.String): Self = StObject.set(x, "ascentOverride", value.asInstanceOf[js.Any])
    
    inline def setDescentOverride(value: java.lang.String): Self = StObject.set(x, "descentOverride", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: java.lang.String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFamily(value: java.lang.String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFeatureSettings(value: java.lang.String): Self = StObject.set(x, "featureSettings", value.asInstanceOf[js.Any])
    
    inline def setLineGapOverride(value: java.lang.String): Self = StObject.set(x, "lineGapOverride", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: () => js.Promise[FontFace]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    
    inline def setLoaded(value: js.Promise[FontFace]): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: FontFaceLoadStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStretch(value: java.lang.String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: java.lang.String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setUnicodeRange(value: java.lang.String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: java.lang.String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariationSettings(value: java.lang.String): Self = StObject.set(x, "variationSettings", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: java.lang.String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
