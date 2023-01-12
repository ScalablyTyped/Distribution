package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSFontPaletteValuesRule
  extends StObject
     with CSSRule {
  
  /* standard dom */
  val basePalette: java.lang.String
  
  /* standard dom */
  val fontFamily: java.lang.String
  
  /* standard dom */
  val name: java.lang.String
  
  /* standard dom */
  val overrideColors: java.lang.String
}
object CSSFontPaletteValuesRule {
  
  inline def apply(
    CHARSET_RULE: Double,
    FONT_FACE_RULE: Double,
    IMPORT_RULE: Double,
    KEYFRAMES_RULE: Double,
    KEYFRAME_RULE: Double,
    MEDIA_RULE: Double,
    NAMESPACE_RULE: Double,
    PAGE_RULE: Double,
    STYLE_RULE: Double,
    SUPPORTS_RULE: Double,
    basePalette: java.lang.String,
    cssText: java.lang.String,
    fontFamily: java.lang.String,
    name: java.lang.String,
    overrideColors: java.lang.String,
    `type`: Double
  ): CSSFontPaletteValuesRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = CHARSET_RULE.asInstanceOf[js.Any], FONT_FACE_RULE = FONT_FACE_RULE.asInstanceOf[js.Any], IMPORT_RULE = IMPORT_RULE.asInstanceOf[js.Any], KEYFRAMES_RULE = KEYFRAMES_RULE.asInstanceOf[js.Any], KEYFRAME_RULE = KEYFRAME_RULE.asInstanceOf[js.Any], MEDIA_RULE = MEDIA_RULE.asInstanceOf[js.Any], NAMESPACE_RULE = NAMESPACE_RULE.asInstanceOf[js.Any], PAGE_RULE = PAGE_RULE.asInstanceOf[js.Any], STYLE_RULE = STYLE_RULE.asInstanceOf[js.Any], SUPPORTS_RULE = SUPPORTS_RULE.asInstanceOf[js.Any], basePalette = basePalette.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overrideColors = overrideColors.asInstanceOf[js.Any], parentRule = null, parentStyleSheet = null)
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
