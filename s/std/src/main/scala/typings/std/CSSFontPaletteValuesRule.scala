package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSFontPaletteValuesRule) */
trait CSSFontPaletteValuesRule
  extends StObject
     with CSSRule {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSFontPaletteValuesRule/basePalette) */
  /* standard dom */
  val basePalette: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSFontPaletteValuesRule/fontFamily) */
  /* standard dom */
  val fontFamily: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSFontPaletteValuesRule/name) */
  /* standard dom */
  val name: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSFontPaletteValuesRule/overrideColors) */
  /* standard dom */
  val overrideColors: java.lang.String
}
object CSSFontPaletteValuesRule {
  
  inline def apply(
    basePalette: java.lang.String,
    cssText: java.lang.String,
    fontFamily: java.lang.String,
    name: java.lang.String,
    overrideColors: java.lang.String,
    `type`: Double
  ): CSSFontPaletteValuesRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = 2, FONT_FACE_RULE = 5, IMPORT_RULE = 3, KEYFRAMES_RULE = 7, KEYFRAME_RULE = 8, MEDIA_RULE = 4, NAMESPACE_RULE = 10, PAGE_RULE = 6, STYLE_RULE = 1, SUPPORTS_RULE = 12, basePalette = basePalette.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overrideColors = overrideColors.asInstanceOf[js.Any], parentRule = null, parentStyleSheet = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSFontPaletteValuesRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSFontPaletteValuesRule] (val x: Self) extends AnyVal {
    
    inline def setBasePalette(value: java.lang.String): Self = StObject.set(x, "basePalette", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: java.lang.String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOverrideColors(value: java.lang.String): Self = StObject.set(x, "overrideColors", value.asInstanceOf[js.Any])
  }
}
