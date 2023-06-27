package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSCounterStyleRule) */
trait CSSCounterStyleRule
  extends StObject
     with CSSRule {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSCounterStyleRule/additiveSymbols) */
  /* standard dom */
  var additiveSymbols: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSCounterStyleRule/fallback) */
  /* standard dom */
  var fallback: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSCounterStyleRule/name) */
  /* standard dom */
  var name: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSCounterStyleRule/negative) */
  /* standard dom */
  var negative: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSCounterStyleRule/pad) */
  /* standard dom */
  var pad: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSCounterStyleRule/prefix) */
  /* standard dom */
  var prefix: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSCounterStyleRule/range) */
  /* standard dom */
  var range: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSCounterStyleRule/speakAs) */
  /* standard dom */
  var speakAs: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSCounterStyleRule/suffix) */
  /* standard dom */
  var suffix: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSCounterStyleRule/symbols) */
  /* standard dom */
  var symbols: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSCounterStyleRule/system) */
  /* standard dom */
  var system: java.lang.String
}
object CSSCounterStyleRule {
  
  inline def apply(
    additiveSymbols: java.lang.String,
    cssText: java.lang.String,
    fallback: java.lang.String,
    name: java.lang.String,
    negative: java.lang.String,
    pad: java.lang.String,
    prefix: java.lang.String,
    range: java.lang.String,
    speakAs: java.lang.String,
    suffix: java.lang.String,
    symbols: java.lang.String,
    system: java.lang.String,
    `type`: Double
  ): CSSCounterStyleRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = 2, FONT_FACE_RULE = 5, IMPORT_RULE = 3, KEYFRAMES_RULE = 7, KEYFRAME_RULE = 8, MEDIA_RULE = 4, NAMESPACE_RULE = 10, PAGE_RULE = 6, STYLE_RULE = 1, SUPPORTS_RULE = 12, additiveSymbols = additiveSymbols.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], speakAs = speakAs.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], parentRule = null, parentStyleSheet = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSCounterStyleRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSCounterStyleRule] (val x: Self) extends AnyVal {
    
    inline def setAdditiveSymbols(value: java.lang.String): Self = StObject.set(x, "additiveSymbols", value.asInstanceOf[js.Any])
    
    inline def setFallback(value: java.lang.String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNegative(value: java.lang.String): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setPad(value: java.lang.String): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: java.lang.String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setRange(value: java.lang.String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setSpeakAs(value: java.lang.String): Self = StObject.set(x, "speakAs", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: java.lang.String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSymbols(value: java.lang.String): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: java.lang.String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
  }
}
