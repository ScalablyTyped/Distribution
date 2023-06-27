package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsL10nMessagesMod.Alphabets
import typings.speechRuleEngine.jsL10nMessagesMod.Functions
import typings.speechRuleEngine.jsL10nMessagesMod.Messages
import typings.speechRuleEngine.jsL10nMessagesMod.Numbers
import typings.speechRuleEngine.jsL10nMessagesMod.SubIso
import typings.speechRuleEngine.jsL10nTransformersMod.Combiner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsL10nLocaleMod {
  
  @JSImport("speech-rule-engine/js/l10n/locale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("speech-rule-engine/js/l10n/locale", "LOCALE")
  @js.native
  val LOCALE_ : Locale = js.native
  
  inline def createLocale(): Locale = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocale")().asInstanceOf[Locale]
  
  trait Locale extends StObject {
    
    var ALPHABETS: Alphabets
    
    var COMBINERS: js.UndefOr[StringDictionary[Combiner]] = js.undefined
    
    var CORRECTIONS: js.UndefOr[StringDictionary[js.Function1[/* a */ String, String]]] = js.undefined
    
    var FUNCTIONS: Functions
    
    var MESSAGES: Messages
    
    var NUMBERS: Numbers
    
    var SUBISO: SubIso
  }
  object Locale {
    
    inline def apply(ALPHABETS: Alphabets, FUNCTIONS: Functions, MESSAGES: Messages, NUMBERS: Numbers, SUBISO: SubIso): Locale = {
      val __obj = js.Dynamic.literal(ALPHABETS = ALPHABETS.asInstanceOf[js.Any], FUNCTIONS = FUNCTIONS.asInstanceOf[js.Any], MESSAGES = MESSAGES.asInstanceOf[js.Any], NUMBERS = NUMBERS.asInstanceOf[js.Any], SUBISO = SUBISO.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      inline def setALPHABETS(value: Alphabets): Self = StObject.set(x, "ALPHABETS", value.asInstanceOf[js.Any])
      
      inline def setCOMBINERS(value: StringDictionary[Combiner]): Self = StObject.set(x, "COMBINERS", value.asInstanceOf[js.Any])
      
      inline def setCOMBINERSUndefined: Self = StObject.set(x, "COMBINERS", js.undefined)
      
      inline def setCORRECTIONS(value: StringDictionary[js.Function1[/* a */ String, String]]): Self = StObject.set(x, "CORRECTIONS", value.asInstanceOf[js.Any])
      
      inline def setCORRECTIONSUndefined: Self = StObject.set(x, "CORRECTIONS", js.undefined)
      
      inline def setFUNCTIONS(value: Functions): Self = StObject.set(x, "FUNCTIONS", value.asInstanceOf[js.Any])
      
      inline def setMESSAGES(value: Messages): Self = StObject.set(x, "MESSAGES", value.asInstanceOf[js.Any])
      
      inline def setNUMBERS(value: Numbers): Self = StObject.set(x, "NUMBERS", value.asInstanceOf[js.Any])
      
      inline def setSUBISO(value: SubIso): Self = StObject.set(x, "SUBISO", value.asInstanceOf[js.Any])
    }
  }
}
