package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPropertyRule) */
trait CSSPropertyRule
  extends StObject
     with CSSRule {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPropertyRule/inherits) */
  /* standard dom */
  val inherits: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPropertyRule/initialValue) */
  /* standard dom */
  val initialValue: java.lang.String | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPropertyRule/name) */
  /* standard dom */
  val name: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSPropertyRule/syntax) */
  /* standard dom */
  val syntax: java.lang.String
}
object CSSPropertyRule {
  
  inline def apply(
    cssText: java.lang.String,
    inherits: scala.Boolean,
    name: java.lang.String,
    syntax: java.lang.String,
    `type`: Double
  ): CSSPropertyRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = 2, FONT_FACE_RULE = 5, IMPORT_RULE = 3, KEYFRAMES_RULE = 7, KEYFRAME_RULE = 8, MEDIA_RULE = 4, NAMESPACE_RULE = 10, PAGE_RULE = 6, STYLE_RULE = 1, SUPPORTS_RULE = 12, cssText = cssText.asInstanceOf[js.Any], inherits = inherits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any], initialValue = null, parentRule = null, parentStyleSheet = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSPropertyRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSPropertyRule] (val x: Self) extends AnyVal {
    
    inline def setInherits(value: scala.Boolean): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    inline def setInitialValue(value: java.lang.String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInitialValueNull: Self = StObject.set(x, "initialValue", null)
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSyntax(value: java.lang.String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
  }
}
