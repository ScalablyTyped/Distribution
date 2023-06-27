package typings.std

import typings.std.stdInts.`10`
import typings.std.stdInts.`12`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import typings.std.stdInts.`5`
import typings.std.stdInts.`6`
import typings.std.stdInts.`7`
import typings.std.stdInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single CSS rule. There are several types of rules, listed in the Type constants section below.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule)
  */
trait CSSRule extends StObject {
  
  /* standard dom */
  val CHARSET_RULE: `2`
  
  /* standard dom */
  val FONT_FACE_RULE: `5`
  
  /* standard dom */
  val IMPORT_RULE: `3`
  
  /* standard dom */
  val KEYFRAMES_RULE: `7`
  
  /* standard dom */
  val KEYFRAME_RULE: `8`
  
  /* standard dom */
  val MEDIA_RULE: `4`
  
  /* standard dom */
  val NAMESPACE_RULE: `10`
  
  /* standard dom */
  val PAGE_RULE: `6`
  
  /* standard dom */
  val STYLE_RULE: `1`
  
  /* standard dom */
  val SUPPORTS_RULE: `12`
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/cssText) */
  /* standard dom */
  var cssText: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/parentRule) */
  /* standard dom */
  val parentRule: CSSRule | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/parentStyleSheet) */
  /* standard dom */
  val parentStyleSheet: CSSStyleSheet | Null
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRule/type)
    */
  /* standard dom */
  val `type`: Double
}
object CSSRule {
  
  inline def apply(cssText: java.lang.String, `type`: Double): CSSRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = 2, FONT_FACE_RULE = 5, IMPORT_RULE = 3, KEYFRAMES_RULE = 7, KEYFRAME_RULE = 8, MEDIA_RULE = 4, NAMESPACE_RULE = 10, PAGE_RULE = 6, STYLE_RULE = 1, SUPPORTS_RULE = 12, cssText = cssText.asInstanceOf[js.Any], parentRule = null, parentStyleSheet = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSRule] (val x: Self) extends AnyVal {
    
    inline def setCHARSET_RULE(value: `2`): Self = StObject.set(x, "CHARSET_RULE", value.asInstanceOf[js.Any])
    
    inline def setCssText(value: java.lang.String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    inline def setFONT_FACE_RULE(value: `5`): Self = StObject.set(x, "FONT_FACE_RULE", value.asInstanceOf[js.Any])
    
    inline def setIMPORT_RULE(value: `3`): Self = StObject.set(x, "IMPORT_RULE", value.asInstanceOf[js.Any])
    
    inline def setKEYFRAMES_RULE(value: `7`): Self = StObject.set(x, "KEYFRAMES_RULE", value.asInstanceOf[js.Any])
    
    inline def setKEYFRAME_RULE(value: `8`): Self = StObject.set(x, "KEYFRAME_RULE", value.asInstanceOf[js.Any])
    
    inline def setMEDIA_RULE(value: `4`): Self = StObject.set(x, "MEDIA_RULE", value.asInstanceOf[js.Any])
    
    inline def setNAMESPACE_RULE(value: `10`): Self = StObject.set(x, "NAMESPACE_RULE", value.asInstanceOf[js.Any])
    
    inline def setPAGE_RULE(value: `6`): Self = StObject.set(x, "PAGE_RULE", value.asInstanceOf[js.Any])
    
    inline def setParentRule(value: CSSRule): Self = StObject.set(x, "parentRule", value.asInstanceOf[js.Any])
    
    inline def setParentRuleNull: Self = StObject.set(x, "parentRule", null)
    
    inline def setParentStyleSheet(value: CSSStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    inline def setParentStyleSheetNull: Self = StObject.set(x, "parentStyleSheet", null)
    
    inline def setSTYLE_RULE(value: `1`): Self = StObject.set(x, "STYLE_RULE", value.asInstanceOf[js.Any])
    
    inline def setSUPPORTS_RULE(value: `12`): Self = StObject.set(x, "SUPPORTS_RULE", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
