package typings.speechRuleEngine

import typings.speechRuleEngine.jsRuleEngineSpeechRuleContextMod.SpeechRuleContext
import typings.speechRuleEngine.jsRuleEngineSpeechRuleMod.SpeechRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsRuleEngineSpeechRuleStoreMod {
  
  trait SpeechRuleStore extends StObject {
    
    def addRule(rule: SpeechRule): Unit
    
    var context: SpeechRuleContext
    
    def defineRule(name: String, dynamic: String, action: String, pre: String, args: String*): SpeechRule
    
    def deleteRule(rule: SpeechRule): Unit
    
    def findAllRules(pred: js.Function1[/* rule */ SpeechRule, Boolean]): js.Array[SpeechRule]
    
    def findRule(pred: js.Function1[/* rule */ SpeechRule, Boolean]): SpeechRule
  }
  object SpeechRuleStore {
    
    inline def apply(
      addRule: SpeechRule => Unit,
      context: SpeechRuleContext,
      defineRule: (String, String, String, String, /* repeated */ String) => SpeechRule,
      deleteRule: SpeechRule => Unit,
      findAllRules: js.Function1[/* rule */ SpeechRule, Boolean] => js.Array[SpeechRule],
      findRule: js.Function1[/* rule */ SpeechRule, Boolean] => SpeechRule
    ): SpeechRuleStore = {
      val __obj = js.Dynamic.literal(addRule = js.Any.fromFunction1(addRule), context = context.asInstanceOf[js.Any], defineRule = js.Any.fromFunction5(defineRule), deleteRule = js.Any.fromFunction1(deleteRule), findAllRules = js.Any.fromFunction1(findAllRules), findRule = js.Any.fromFunction1(findRule))
      __obj.asInstanceOf[SpeechRuleStore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpeechRuleStore] (val x: Self) extends AnyVal {
      
      inline def setAddRule(value: SpeechRule => Unit): Self = StObject.set(x, "addRule", js.Any.fromFunction1(value))
      
      inline def setContext(value: SpeechRuleContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDefineRule(value: (String, String, String, String, /* repeated */ String) => SpeechRule): Self = StObject.set(x, "defineRule", js.Any.fromFunction5(value))
      
      inline def setDeleteRule(value: SpeechRule => Unit): Self = StObject.set(x, "deleteRule", js.Any.fromFunction1(value))
      
      inline def setFindAllRules(value: js.Function1[/* rule */ SpeechRule, Boolean] => js.Array[SpeechRule]): Self = StObject.set(x, "findAllRules", js.Any.fromFunction1(value))
      
      inline def setFindRule(value: js.Function1[/* rule */ SpeechRule, Boolean] => SpeechRule): Self = StObject.set(x, "findRule", js.Any.fromFunction1(value))
    }
  }
}
