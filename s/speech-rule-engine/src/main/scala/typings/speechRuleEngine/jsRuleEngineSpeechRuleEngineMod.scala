package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsAudioAuditoryDescriptionMod.AuditoryDescription
import typings.speechRuleEngine.jsIndexingTrieMod.Trie
import typings.speechRuleEngine.jsRuleEngineBaseRuleStoreMod.BaseRuleStore
import typings.speechRuleEngine.jsRuleEngineBaseRuleStoreMod.RulesJson
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.DynamicCstr
import typings.speechRuleEngine.jsRuleEngineGrammarMod.State
import typings.speechRuleEngine.jsRuleEngineSpeechRuleContextMod.SpeechRuleContext
import typings.speechRuleEngine.jsRuleEngineSpeechRuleMod.SpeechRule
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsRuleEngineSpeechRuleEngineMod {
  
  @JSImport("speech-rule-engine/js/rule_engine/speech_rule_engine", "SpeechRuleEngine")
  @js.native
  /* private */ open class SpeechRuleEngine () extends StObject {
    
    def addEvaluator(store: BaseRuleStore): Unit = js.native
    
    /* private */ var addExternalAttributes_ : Any = js.native
    
    /* private */ var addLayout: Any = js.native
    
    /* private */ var addPersonality_ : Any = js.native
    
    /* private */ var addRelativePersonality_ : Any = js.native
    
    def enumerate(): StringDictionary[Any] = js.native
    def enumerate(opt_info: StringDictionary[Any]): StringDictionary[Any] = js.native
    
    def evaluateNode(node: Element): js.Array[AuditoryDescription] = js.native
    
    /* private */ var evaluateNodeList_ : Any = js.native
    
    /* private */ var evaluateNode_ : Any = js.native
    
    /* private */ var evaluateTree_ : Any = js.native
    
    /* private */ var evaluators_ : Any = js.native
    
    def getEvaluator(locale: String, modality: String): js.Function1[/* p1 */ Node, js.Array[AuditoryDescription]] = js.native
    
    def lookupRule(node: Node, dynamic: DynamicCstr): SpeechRule = js.native
    
    def lookupRules(node: Node, dynamic: DynamicCstr): js.Array[SpeechRule] = js.native
    
    /* private */ var makeSet_ : Any = js.native
    
    /* private */ var pickMostConstraint_ : Any = js.native
    
    def processGrammar(context: SpeechRuleContext, node: Node, grammar: State): Unit = js.native
    
    def runInSetting(
      settings: StringDictionary[String | Boolean],
      callback: js.Function0[js.Array[AuditoryDescription]]
    ): js.Array[AuditoryDescription] = js.native
    
    var trie: Trie = js.native
    
    /* private */ var updateConstraint_ : Any = js.native
  }
  /* static members */
  object SpeechRuleEngine {
    
    @JSImport("speech-rule-engine/js/rule_engine/speech_rule_engine", "SpeechRuleEngine")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addStore(set: RulesJson): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addStore")(set.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def debugNamedSpeechRule(name: String, node: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debugNamedSpeechRule")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def debugSpeechRule(rule: SpeechRule, node: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("debugSpeechRule")(rule.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getInstance(): SpeechRuleEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[SpeechRuleEngine]
    
    @JSImport("speech-rule-engine/js/rule_engine/speech_rule_engine", "SpeechRuleEngine.instance")
    @js.native
    def instance: Any = js.native
    inline def instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
  }
}
