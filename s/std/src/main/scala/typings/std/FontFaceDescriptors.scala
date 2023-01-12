package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFaceDescriptors extends StObject {
  
  /* standard dom */
  var display: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var featureSettings: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var stretch: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var style: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var unicodeRange: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var variant: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var weight: js.UndefOr[java.lang.String] = js.undefined
}
object FontFaceDescriptors {
  
  inline def apply(): FontFaceDescriptors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceDescriptors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontFaceDescriptors] (val x: Self) extends AnyVal {
    
    inline def setDisplay(value: java.lang.String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setFeatureSettings(value: java.lang.String): Self = StObject.set(x, "featureSettings", value.asInstanceOf[js.Any])
    
    inline def setFeatureSettingsUndefined: Self = StObject.set(x, "featureSettings", js.undefined)
    
    inline def setStretch(value: java.lang.String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    inline def setStyle(value: java.lang.String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUnicodeRange(value: java.lang.String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
    
    inline def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
    
    inline def setVariant(value: java.lang.String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    inline def setWeight(value: java.lang.String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
