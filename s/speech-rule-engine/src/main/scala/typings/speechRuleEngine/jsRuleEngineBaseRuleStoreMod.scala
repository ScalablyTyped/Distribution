package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsAudioAuditoryDescriptionMod.AuditoryDescription
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.AxisOrder
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.DynamicCstr
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.DynamicCstrParser
import typings.speechRuleEngine.jsRuleEngineSpeechRuleContextMod.SpeechRuleContext
import typings.speechRuleEngine.jsRuleEngineSpeechRuleEvaluatorMod.SpeechRuleEvaluator
import typings.speechRuleEngine.jsRuleEngineSpeechRuleFunctionsMod.SpeechRuleFunction
import typings.speechRuleEngine.jsRuleEngineSpeechRuleMod.Action
import typings.speechRuleEngine.jsRuleEngineSpeechRuleMod.Precondition
import typings.speechRuleEngine.jsRuleEngineSpeechRuleMod.SpeechRule
import typings.speechRuleEngine.jsRuleEngineSpeechRuleStoreMod.SpeechRuleStore
import typings.std.Map
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsRuleEngineBaseRuleStoreMod {
  
  /* note: abstract class */ @JSImport("speech-rule-engine/js/rule_engine/base_rule_store", "BaseRuleStore")
  @js.native
  open class BaseRuleStore ()
    extends StObject
       with SpeechRuleEvaluator
       with SpeechRuleStore {
    
    /* CompleteClass */
    override def addRule(rule: SpeechRule): Unit = js.native
    
    /* CompleteClass */
    var context: SpeechRuleContext = js.native
    
    var customTranscriptions: StringDictionary[String] = js.native
    
    def defineAction(name: String, action: String): Unit = js.native
    
    def definePrecondition(name: String, dynamic: String, prec: String, args: String*): Unit = js.native
    
    /* CompleteClass */
    override def defineRule(name: String, dynamic: String, action: String, pre: String, args: String*): SpeechRule = js.native
    
    /* CompleteClass */
    override def deleteRule(rule: SpeechRule): Unit = js.native
    
    var domain: String = js.native
    
    /* CompleteClass */
    override def evaluateCharacter(str: String): AuditoryDescription = js.native
    
    /* CompleteClass */
    override def evaluateCustom(str: String): AuditoryDescription = js.native
    
    /* CompleteClass */
    override def evaluateDefault(node: Node): Unit = js.native
    
    /* CompleteClass */
    override def evaluateString(str: String): js.Array[AuditoryDescription] = js.native
    
    /* CompleteClass */
    override def evaluateWhitespace(str: String): js.Array[AuditoryDescription] = js.native
    
    /* CompleteClass */
    override def findAllRules(pred: js.Function1[/* rule */ SpeechRule, Boolean]): js.Array[SpeechRule] = js.native
    
    /* CompleteClass */
    override def findRule(pred: js.Function1[/* rule */ SpeechRule, Boolean]): SpeechRule = js.native
    
    def generateRules(generator: String): Unit = js.native
    
    def getFullPreconditions(name: String): Condition = js.native
    
    def getPreconditions(): Map[String, Condition] = js.native
    
    def getSpeechRules(): js.Array[SpeechRule] = js.native
    
    def ignoreRules(name: String, cstrs: String*): Unit = js.native
    
    def inheritRules(): Unit = js.native
    
    var inherits: BaseRuleStore = js.native
    
    def initialize(): Unit = js.native
    
    var initialized: Boolean = js.native
    
    var kind: String = js.native
    
    var locale: String = js.native
    
    var modality: String = js.native
    
    def parse(ruleSet: RulesJson): Unit = js.native
    
    def parseAction(action: String): Action = js.native
    
    def parseCstr(cstr: String): DynamicCstr = js.native
    
    var parseMethods: Any = js.native
    
    var parseOrder: AxisOrder = js.native
    
    def parsePrecondition(query: String, rest: js.Array[String]): Precondition = js.native
    
    /* private */ var parsePrecondition_ : Any = js.native
    
    def parseRules(rules: js.Array[js.Array[String]]): Unit = js.native
    
    var parser: DynamicCstrParser = js.native
    
    /* protected */ var preconditions: Map[String, Condition] = js.native
    
    /* private */ var rank: Any = js.native
    
    def removeDuplicates(rule: SpeechRule): Unit = js.native
    
    def setSpeechRules(rules: js.Array[SpeechRule]): Unit = js.native
    
    /* private */ var speechRules_ : Any = js.native
  }
  /* static members */
  object BaseRuleStore {
    
    @JSImport("speech-rule-engine/js/rule_engine/base_rule_store", "BaseRuleStore")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/rule_engine/base_rule_store", "BaseRuleStore.comparePreconditions_")
    @js.native
    def comparePreconditions_ : Any = js.native
    inline def comparePreconditions__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comparePreconditions_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/rule_engine/base_rule_store", "BaseRuleStore.compareStaticConstraints_")
    @js.native
    def compareStaticConstraints_ : Any = js.native
    inline def compareStaticConstraints__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareStaticConstraints_")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Condition extends StObject {
    
    /* private */ var _conditions: Any = js.native
    
    def addBaseCondition(cond: Precondition): Unit = js.native
    
    /* private */ var addCondition: Any = js.native
    
    def addConstraint(dynamic: DynamicCstr): Unit = js.native
    
    def addFullCondition(cond: Precondition): Unit = js.native
    
    /* private */ var allCstr: Any = js.native
    
    /* private */ var base: Any = js.native
    
    def conditions: js.Array[js.Tuple2[DynamicCstr, Precondition]] = js.native
    
    /* private */ var constraints: Any = js.native
  }
  
  trait RulesJson extends StObject {
    
    var annotators: js.UndefOr[js.Array[Any]] = js.undefined
    
    var domain: js.UndefOr[String] = js.undefined
    
    var functions: js.UndefOr[StringDictionary[SpeechRuleFunction]] = js.undefined
    
    var inherits: js.UndefOr[String] = js.undefined
    
    var kind: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var modality: js.UndefOr[String] = js.undefined
    
    var rules: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object RulesJson {
    
    inline def apply(): RulesJson = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RulesJson]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RulesJson] (val x: Self) extends AnyVal {
      
      inline def setAnnotators(value: js.Array[Any]): Self = StObject.set(x, "annotators", value.asInstanceOf[js.Any])
      
      inline def setAnnotatorsUndefined: Self = StObject.set(x, "annotators", js.undefined)
      
      inline def setAnnotatorsVarargs(value: Any*): Self = StObject.set(x, "annotators", js.Array(value*))
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setFunctions(value: StringDictionary[SpeechRuleFunction]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setInherits(value: String): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
      
      inline def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setModality(value: String): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
      
      inline def setModalityUndefined: Self = StObject.set(x, "modality", js.undefined)
      
      inline def setRules(value: js.Array[Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Any*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
}
