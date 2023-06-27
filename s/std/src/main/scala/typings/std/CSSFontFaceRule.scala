package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSFontFaceRule) */
trait CSSFontFaceRule
  extends StObject
     with CSSRule {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSFontFaceRule/style) */
  /* standard dom */
  val style: CSSStyleDeclaration
}
object CSSFontFaceRule {
  
  inline def apply(cssText: java.lang.String, style: CSSStyleDeclaration, `type`: Double): CSSFontFaceRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = 2, FONT_FACE_RULE = 5, IMPORT_RULE = 3, KEYFRAMES_RULE = 7, KEYFRAME_RULE = 8, MEDIA_RULE = 4, NAMESPACE_RULE = 10, PAGE_RULE = 6, STYLE_RULE = 1, SUPPORTS_RULE = 12, cssText = cssText.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], parentRule = null, parentStyleSheet = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSFontFaceRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSFontFaceRule] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: CSSStyleDeclaration): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
