package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing a single CSS @namespace at-rule. It implements the CSSRule interface, with a type value of 10 (CSSRule.NAMESPACE_RULE).
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNamespaceRule)
  */
trait CSSNamespaceRule
  extends StObject
     with CSSRule {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNamespaceRule/namespaceURI) */
  /* standard dom */
  val namespaceURI: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNamespaceRule/prefix) */
  /* standard dom */
  val prefix: java.lang.String
}
object CSSNamespaceRule {
  
  inline def apply(
    cssText: java.lang.String,
    namespaceURI: java.lang.String,
    prefix: java.lang.String,
    `type`: Double
  ): CSSNamespaceRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = 2, FONT_FACE_RULE = 5, IMPORT_RULE = 3, KEYFRAMES_RULE = 7, KEYFRAME_RULE = 8, MEDIA_RULE = 4, NAMESPACE_RULE = 10, PAGE_RULE = 6, STYLE_RULE = 1, SUPPORTS_RULE = 12, cssText = cssText.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], parentRule = null, parentStyleSheet = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSNamespaceRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSNamespaceRule] (val x: Self) extends AnyVal {
    
    inline def setNamespaceURI(value: java.lang.String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: java.lang.String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
