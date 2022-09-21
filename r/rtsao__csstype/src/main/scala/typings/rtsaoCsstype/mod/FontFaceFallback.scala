package typings.rtsaoCsstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFaceFallback extends StObject {
  
  var MozFontFeatureSettings: js.UndefOr[
    FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]
  ] = js.undefined
  
  var fontDisplay: js.UndefOr[FontFaceFontDisplayProperty | js.Array[FontFaceFontDisplayProperty]] = js.undefined
  
  var fontFamily: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var fontFeatureSettings: js.UndefOr[
    FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]
  ] = js.undefined
  
  var fontStretch: js.UndefOr[FontFaceFontStretchProperty | js.Array[FontFaceFontStretchProperty]] = js.undefined
  
  var fontStyle: js.UndefOr[FontFaceFontStyleProperty | js.Array[FontFaceFontStyleProperty]] = js.undefined
  
  var fontVariant: js.UndefOr[FontFaceFontVariantProperty | js.Array[FontFaceFontVariantProperty]] = js.undefined
  
  var fontVariationSettings: js.UndefOr[
    FontFaceFontVariationSettingsProperty | js.Array[FontFaceFontVariationSettingsProperty]
  ] = js.undefined
  
  var fontWeight: js.UndefOr[FontFaceFontWeightProperty | js.Array[FontFaceFontWeightProperty]] = js.undefined
  
  var src: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var unicodeRange: js.UndefOr[String | js.Array[String]] = js.undefined
}
object FontFaceFallback {
  
  inline def apply(): FontFaceFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceFallback]
  }
  
  extension [Self <: FontFaceFallback](x: Self) {
    
    inline def setFontDisplay(value: FontFaceFontDisplayProperty | js.Array[FontFaceFontDisplayProperty]): Self = StObject.set(x, "fontDisplay", value.asInstanceOf[js.Any])
    
    inline def setFontDisplayUndefined: Self = StObject.set(x, "fontDisplay", js.undefined)
    
    inline def setFontDisplayVarargs(value: FontFaceFontDisplayProperty*): Self = StObject.set(x, "fontDisplay", js.Array(value*))
    
    inline def setFontFamily(value: String | js.Array[String]): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontFamilyVarargs(value: String*): Self = StObject.set(x, "fontFamily", js.Array(value*))
    
    inline def setFontFeatureSettings(value: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
    
    inline def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
    
    inline def setFontFeatureSettingsVarargs(value: FontFaceFontFeatureSettingsProperty*): Self = StObject.set(x, "fontFeatureSettings", js.Array(value*))
    
    inline def setFontStretch(value: FontFaceFontStretchProperty | js.Array[FontFaceFontStretchProperty]): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
    
    inline def setFontStretchVarargs(value: FontFaceFontStretchProperty*): Self = StObject.set(x, "fontStretch", js.Array(value*))
    
    inline def setFontStyle(value: FontFaceFontStyleProperty | js.Array[FontFaceFontStyleProperty]): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontStyleVarargs(value: FontFaceFontStyleProperty*): Self = StObject.set(x, "fontStyle", js.Array(value*))
    
    inline def setFontVariant(value: FontFaceFontVariantProperty | js.Array[FontFaceFontVariantProperty]): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    inline def setFontVariantVarargs(value: FontFaceFontVariantProperty*): Self = StObject.set(x, "fontVariant", js.Array(value*))
    
    inline def setFontVariationSettings(value: FontFaceFontVariationSettingsProperty | js.Array[FontFaceFontVariationSettingsProperty]): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
    
    inline def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
    
    inline def setFontVariationSettingsVarargs(value: FontFaceFontVariationSettingsProperty*): Self = StObject.set(x, "fontVariationSettings", js.Array(value*))
    
    inline def setFontWeight(value: FontFaceFontWeightProperty | js.Array[FontFaceFontWeightProperty]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setFontWeightVarargs(value: FontFaceFontWeightProperty*): Self = StObject.set(x, "fontWeight", js.Array(value*))
    
    inline def setMozFontFeatureSettings(value: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]): Self = StObject.set(x, "MozFontFeatureSettings", value.asInstanceOf[js.Any])
    
    inline def setMozFontFeatureSettingsUndefined: Self = StObject.set(x, "MozFontFeatureSettings", js.undefined)
    
    inline def setMozFontFeatureSettingsVarargs(value: FontFaceFontFeatureSettingsProperty*): Self = StObject.set(x, "MozFontFeatureSettings", js.Array(value*))
    
    inline def setSrc(value: String | js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value*))
    
    inline def setUnicodeRange(value: String | js.Array[String]): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
    
    inline def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
    
    inline def setUnicodeRangeVarargs(value: String*): Self = StObject.set(x, "unicodeRange", js.Array(value*))
  }
}
