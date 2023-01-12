package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSCounterStyleRule
  extends StObject
     with CSSRule {
  
  /* standard dom */
  var additiveSymbols: java.lang.String
  
  /* standard dom */
  var fallback: java.lang.String
  
  /* standard dom */
  var name: java.lang.String
  
  /* standard dom */
  var negative: java.lang.String
  
  /* standard dom */
  var pad: java.lang.String
  
  /* standard dom */
  var prefix: java.lang.String
  
  /* standard dom */
  var range: java.lang.String
  
  /* standard dom */
  var speakAs: java.lang.String
  
  /* standard dom */
  var suffix: java.lang.String
  
  /* standard dom */
  var symbols: java.lang.String
  
  /* standard dom */
  var system: java.lang.String
}
object CSSCounterStyleRule {
  
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
    val __obj = js.Dynamic.literal(CHARSET_RULE = CHARSET_RULE.asInstanceOf[js.Any], FONT_FACE_RULE = FONT_FACE_RULE.asInstanceOf[js.Any], IMPORT_RULE = IMPORT_RULE.asInstanceOf[js.Any], KEYFRAMES_RULE = KEYFRAMES_RULE.asInstanceOf[js.Any], KEYFRAME_RULE = KEYFRAME_RULE.asInstanceOf[js.Any], MEDIA_RULE = MEDIA_RULE.asInstanceOf[js.Any], NAMESPACE_RULE = NAMESPACE_RULE.asInstanceOf[js.Any], PAGE_RULE = PAGE_RULE.asInstanceOf[js.Any], STYLE_RULE = STYLE_RULE.asInstanceOf[js.Any], SUPPORTS_RULE = SUPPORTS_RULE.asInstanceOf[js.Any], additiveSymbols = additiveSymbols.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], speakAs = speakAs.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], parentRule = null, parentStyleSheet = null)
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
