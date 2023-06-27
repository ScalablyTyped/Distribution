package typings.speechRuleEngine.jsSpeechRulesAlphabetMod

import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticFont
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Font
  extends StObject
     with SemanticFont
@JSImport("speech-rule-engine/js/speech_rules/alphabet", "Font")
@js.native
object Font extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Font & String] = js.native
  
  @js.native
  sealed trait BOLD
    extends StObject
       with Font
  /* "bold" */ val BOLD: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.BOLD & String = js.native
  
  @js.native
  sealed trait BOLDFRAKTUR
    extends StObject
       with Font
  /* "bold-fraktur" */ val BOLDFRAKTUR: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.BOLDFRAKTUR & String = js.native
  
  @js.native
  sealed trait BOLDITALIC
    extends StObject
       with Font
  /* "bold-italic" */ val BOLDITALIC: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.BOLDITALIC & String = js.native
  
  @js.native
  sealed trait BOLDSCRIPT
    extends StObject
       with Font
  /* "bold-script" */ val BOLDSCRIPT: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.BOLDSCRIPT & String = js.native
  
  @js.native
  sealed trait DOUBLESTRUCK
    extends StObject
       with Font
  /* "double-struck" */ val DOUBLESTRUCK: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.DOUBLESTRUCK & String = js.native
  
  @js.native
  sealed trait DOUBLESTRUCKITALIC
    extends StObject
       with Font
  /* "double-struck-italic" */ val DOUBLESTRUCKITALIC: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.DOUBLESTRUCKITALIC & String = js.native
  
  @js.native
  sealed trait FRAKTUR
    extends StObject
       with Font
  /* "fraktur" */ val FRAKTUR: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.FRAKTUR & String = js.native
  
  @js.native
  sealed trait FULLWIDTH
    extends StObject
       with Font
  /* "fullwidth" */ val FULLWIDTH: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.FULLWIDTH & String = js.native
  
  @js.native
  sealed trait ITALIC
    extends StObject
       with Font
  /* "italic" */ val ITALIC: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.ITALIC & String = js.native
  
  @js.native
  sealed trait MONOSPACE
    extends StObject
       with Font
  /* "monospace" */ val MONOSPACE: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.MONOSPACE & String = js.native
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with Font
  /* "normal" */ val NORMAL: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.NORMAL & String = js.native
  
  @js.native
  sealed trait SANSSERIF
    extends StObject
       with Font
  /* "sans-serif" */ val SANSSERIF: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.SANSSERIF & String = js.native
  
  @js.native
  sealed trait SANSSERIFBOLD
    extends StObject
       with Font
  /* "sans-serif-bold" */ val SANSSERIFBOLD: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.SANSSERIFBOLD & String = js.native
  
  @js.native
  sealed trait SANSSERIFBOLDITALIC
    extends StObject
       with Font
  /* "sans-serif-bold-italic" */ val SANSSERIFBOLDITALIC: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.SANSSERIFBOLDITALIC & String = js.native
  
  @js.native
  sealed trait SANSSERIFITALIC
    extends StObject
       with Font
  /* "sans-serif-italic" */ val SANSSERIFITALIC: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.SANSSERIFITALIC & String = js.native
  
  @js.native
  sealed trait SCRIPT
    extends StObject
       with Font
  /* "script" */ val SCRIPT: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Font.SCRIPT & String = js.native
}
