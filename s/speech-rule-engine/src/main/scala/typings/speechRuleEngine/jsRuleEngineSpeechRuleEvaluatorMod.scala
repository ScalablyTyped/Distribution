package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioAuditoryDescriptionMod.AuditoryDescription
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsRuleEngineSpeechRuleEvaluatorMod {
  
  trait SpeechRuleEvaluator extends StObject {
    
    def evaluateCharacter(str: String): AuditoryDescription
    
    def evaluateCustom(str: String): AuditoryDescription
    
    def evaluateDefault(node: Node): Unit
    
    def evaluateString(str: String): js.Array[AuditoryDescription]
    
    def evaluateWhitespace(str: String): js.Array[AuditoryDescription]
  }
  object SpeechRuleEvaluator {
    
    inline def apply(
      evaluateCharacter: String => AuditoryDescription,
      evaluateCustom: String => AuditoryDescription,
      evaluateDefault: Node => Unit,
      evaluateString: String => js.Array[AuditoryDescription],
      evaluateWhitespace: String => js.Array[AuditoryDescription]
    ): SpeechRuleEvaluator = {
      val __obj = js.Dynamic.literal(evaluateCharacter = js.Any.fromFunction1(evaluateCharacter), evaluateCustom = js.Any.fromFunction1(evaluateCustom), evaluateDefault = js.Any.fromFunction1(evaluateDefault), evaluateString = js.Any.fromFunction1(evaluateString), evaluateWhitespace = js.Any.fromFunction1(evaluateWhitespace))
      __obj.asInstanceOf[SpeechRuleEvaluator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpeechRuleEvaluator] (val x: Self) extends AnyVal {
      
      inline def setEvaluateCharacter(value: String => AuditoryDescription): Self = StObject.set(x, "evaluateCharacter", js.Any.fromFunction1(value))
      
      inline def setEvaluateCustom(value: String => AuditoryDescription): Self = StObject.set(x, "evaluateCustom", js.Any.fromFunction1(value))
      
      inline def setEvaluateDefault(value: Node => Unit): Self = StObject.set(x, "evaluateDefault", js.Any.fromFunction1(value))
      
      inline def setEvaluateString(value: String => js.Array[AuditoryDescription]): Self = StObject.set(x, "evaluateString", js.Any.fromFunction1(value))
      
      inline def setEvaluateWhitespace(value: String => js.Array[AuditoryDescription]): Self = StObject.set(x, "evaluateWhitespace", js.Any.fromFunction1(value))
    }
  }
}
