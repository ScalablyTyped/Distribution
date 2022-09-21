package typings.reactNativeSvg.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontObject extends StObject {
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontFeatureSettings: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[NumberProp] = js.undefined
  
  var fontStretch: js.UndefOr[FontStretch] = js.undefined
  
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
  
  var fontVariant: js.UndefOr[FontVariant] = js.undefined
  
  var fontVariantLigatures: js.UndefOr[FontVariantLigatures] = js.undefined
  
  var fontVariationSettings: js.UndefOr[String] = js.undefined
  
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
  
  var kerning: js.UndefOr[NumberProp] = js.undefined
  
  var letterSpacing: js.UndefOr[NumberProp] = js.undefined
  
  var textAnchor: js.UndefOr[TextAnchor] = js.undefined
  
  var textDecoration: js.UndefOr[TextDecoration] = js.undefined
  
  var wordSpacing: js.UndefOr[NumberProp] = js.undefined
}
object FontObject {
  
  inline def apply(): FontObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontObject]
  }
  
  extension [Self <: FontObject](x: Self) {
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontFeatureSettings(value: String): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
    
    inline def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
    
    inline def setFontSize(value: NumberProp): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStretch(value: FontStretch): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
    
    inline def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontVariant(value: FontVariant): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    inline def setFontVariantLigatures(value: FontVariantLigatures): Self = StObject.set(x, "fontVariantLigatures", value.asInstanceOf[js.Any])
    
    inline def setFontVariantLigaturesUndefined: Self = StObject.set(x, "fontVariantLigatures", js.undefined)
    
    inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    inline def setFontVariationSettings(value: String): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
    
    inline def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
    
    inline def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setKerning(value: NumberProp): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
    
    inline def setLetterSpacing(value: NumberProp): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setTextAnchor(value: TextAnchor): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
    
    inline def setTextDecoration(value: TextDecoration): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    
    inline def setWordSpacing(value: NumberProp): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
    
    inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
  }
}
