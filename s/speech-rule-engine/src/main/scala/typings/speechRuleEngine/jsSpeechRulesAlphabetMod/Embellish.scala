package typings.speechRuleEngine.jsSpeechRulesAlphabetMod

import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticFont
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Embellish
  extends StObject
     with SemanticFont
@JSImport("speech-rule-engine/js/speech_rules/alphabet", "Embellish")
@js.native
object Embellish extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Embellish & String] = js.native
  
  @js.native
  sealed trait CIRCLED
    extends StObject
       with Embellish
  /* "circled" */ val CIRCLED: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Embellish.CIRCLED & String = js.native
  
  @js.native
  sealed trait CIRCLEDSANSSERIF
    extends StObject
       with Embellish
  /* "circled-sans-serif" */ val CIRCLEDSANSSERIF: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Embellish.CIRCLEDSANSSERIF & String = js.native
  
  @js.native
  sealed trait COMMA
    extends StObject
       with Embellish
  /* "comma" */ val COMMA: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Embellish.COMMA & String = js.native
  
  @js.native
  sealed trait DOUBLECIRCLED
    extends StObject
       with Embellish
  /* "double-circled" */ val DOUBLECIRCLED: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Embellish.DOUBLECIRCLED & String = js.native
  
  @js.native
  sealed trait NEGATIVECIRCLED
    extends StObject
       with Embellish
  /* "negative-circled" */ val NEGATIVECIRCLED: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Embellish.NEGATIVECIRCLED & String = js.native
  
  @js.native
  sealed trait NEGATIVECIRCLEDSANSSERIF
    extends StObject
       with Embellish
  /* "negative-circled-sans-serif" */ val NEGATIVECIRCLEDSANSSERIF: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Embellish.NEGATIVECIRCLEDSANSSERIF & String = js.native
  
  @js.native
  sealed trait NEGATIVESQUARED
    extends StObject
       with Embellish
  /* "negative-squared" */ val NEGATIVESQUARED: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Embellish.NEGATIVESQUARED & String = js.native
  
  @js.native
  sealed trait PARENTHESIZED
    extends StObject
       with Embellish
  /* "parenthesized" */ val PARENTHESIZED: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Embellish.PARENTHESIZED & String = js.native
  
  @js.native
  sealed trait PERIOD
    extends StObject
       with Embellish
  /* "period" */ val PERIOD: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Embellish.PERIOD & String = js.native
  
  @js.native
  sealed trait SQUARED
    extends StObject
       with Embellish
  /* "squared" */ val SQUARED: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Embellish.SQUARED & String = js.native
  
  @js.native
  sealed trait SUB
    extends StObject
       with Embellish
  /* "sub" */ val SUB: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Embellish.SUB & String = js.native
  
  @js.native
  sealed trait SUPER
    extends StObject
       with Embellish
  /* "super" */ val SUPER: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Embellish.SUPER & String = js.native
}
