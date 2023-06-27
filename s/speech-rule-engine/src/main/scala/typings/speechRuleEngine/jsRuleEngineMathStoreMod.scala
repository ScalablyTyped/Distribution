package typings.speechRuleEngine

import typings.speechRuleEngine.anon.DECIMALMARK
import typings.speechRuleEngine.anon.Length
import typings.speechRuleEngine.jsRuleEngineBaseRuleStoreMod.BaseRuleStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsRuleEngineMathStoreMod {
  
  @JSImport("speech-rule-engine/js/rule_engine/math_store", "MathStore")
  @js.native
  open class MathStore () extends BaseRuleStore {
    
    /* private */ var addAlias_ : Any = js.native
    
    def annotations(): Unit = js.native
    
    var annotators: js.Array[String] = js.native
    
    def defineAlias(name: String, prec: String, args: String*): Unit = js.native
    
    def defineRulesAlias(name: String, query: String, args: String*): Unit = js.native
    
    def defineSpecialized(name: String, _old: String, dynamic: String): Unit = js.native
    
    def defineSpecializedRule(name: String, oldDynamic: String, newDynamic: String): Unit = js.native
    def defineSpecializedRule(name: String, oldDynamic: String, newDynamic: String, opt_action: String): Unit = js.native
    
    /* protected */ def matchNumber(str: String): Length | Null = js.native
  }
  /* static members */
  object MathStore {
    
    @JSImport("speech-rule-engine/js/rule_engine/math_store", "MathStore")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/rule_engine/math_store", "MathStore.regexp")
    @js.native
    def regexp: DECIMALMARK = js.native
    inline def regexp_=(x: DECIMALMARK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
  }
}
