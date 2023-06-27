package typings.speechRuleEngine.jsSpeechRulesAlphabetMod

import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticSecondary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Base
  extends StObject
     with SemanticSecondary
@JSImport("speech-rule-engine/js/speech_rules/alphabet", "Base")
@js.native
object Base extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Base & String] = js.native
  
  @js.native
  sealed trait DIGIT
    extends StObject
       with Base
  /* "digit" */ val DIGIT: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Base.DIGIT & String = js.native
  
  @js.native
  sealed trait GREEKCAP
    extends StObject
       with Base
  /* "greekCap" */ val GREEKCAP: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Base.GREEKCAP & String = js.native
  
  @js.native
  sealed trait GREEKSMALL
    extends StObject
       with Base
  /* "greekSmall" */ val GREEKSMALL: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Base.GREEKSMALL & String = js.native
  
  @js.native
  sealed trait LATINCAP
    extends StObject
       with Base
  /* "latinCap" */ val LATINCAP: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Base.LATINCAP & String = js.native
  
  @js.native
  sealed trait LATINSMALL
    extends StObject
       with Base
  /* "latinSmall" */ val LATINSMALL: typings.speechRuleEngine.jsSpeechRulesAlphabetMod.Base.LATINSMALL & String = js.native
}
