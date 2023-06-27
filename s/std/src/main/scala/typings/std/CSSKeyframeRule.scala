package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing a set of style for a given keyframe. It corresponds to the contains of a single keyframe of a @keyframes at-rule. It implements the CSSRule interface with a type value of 8 (CSSRule.KEYFRAME_RULE).
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframeRule)
  */
trait CSSKeyframeRule
  extends StObject
     with CSSRule {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframeRule/keyText) */
  /* standard dom */
  var keyText: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframeRule/style) */
  /* standard dom */
  val style: CSSStyleDeclaration
}
object CSSKeyframeRule {
  
  inline def apply(cssText: java.lang.String, keyText: java.lang.String, style: CSSStyleDeclaration, `type`: Double): CSSKeyframeRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = 2, FONT_FACE_RULE = 5, IMPORT_RULE = 3, KEYFRAMES_RULE = 7, KEYFRAME_RULE = 8, MEDIA_RULE = 4, NAMESPACE_RULE = 10, PAGE_RULE = 6, STYLE_RULE = 1, SUPPORTS_RULE = 12, cssText = cssText.asInstanceOf[js.Any], keyText = keyText.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], parentRule = null, parentStyleSheet = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSKeyframeRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSKeyframeRule] (val x: Self) extends AnyVal {
    
    inline def setKeyText(value: java.lang.String): Self = StObject.set(x, "keyText", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSStyleDeclaration): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
