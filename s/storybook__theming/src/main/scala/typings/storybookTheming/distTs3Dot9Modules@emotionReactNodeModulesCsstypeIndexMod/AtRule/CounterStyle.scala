package typings.storybookTheming.`distTs3Dot9Modules@emotionReactNodeModulesCsstypeIndexMod`.AtRule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterStyle[TLength, TTime] extends StObject {
  
  var additiveSymbols: js.UndefOr[String] = js.undefined
  
  var fallback: js.UndefOr[String] = js.undefined
  
  var negative: js.UndefOr[String] = js.undefined
  
  var pad: js.UndefOr[String] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var range: js.UndefOr[Range] = js.undefined
  
  var speakAs: js.UndefOr[SpeakAs] = js.undefined
  
  var suffix: js.UndefOr[String] = js.undefined
  
  var symbols: js.UndefOr[String] = js.undefined
  
  var system: js.UndefOr[System] = js.undefined
}
object CounterStyle {
  
  inline def apply[TLength, TTime](): CounterStyle[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStyle[TLength, TTime]]
  }
  
  extension [Self <: CounterStyle[?, ?], TLength, TTime](x: Self & (CounterStyle[TLength, TTime])) {
    
    inline def setAdditiveSymbols(value: String): Self = StObject.set(x, "additiveSymbols", value.asInstanceOf[js.Any])
    
    inline def setAdditiveSymbolsUndefined: Self = StObject.set(x, "additiveSymbols", js.undefined)
    
    inline def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setNegative(value: String): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    inline def setPad(value: String): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSpeakAs(value: SpeakAs): Self = StObject.set(x, "speakAs", value.asInstanceOf[js.Any])
    
    inline def setSpeakAsUndefined: Self = StObject.set(x, "speakAs", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setSymbols(value: String): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    
    inline def setSystem(value: System): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
