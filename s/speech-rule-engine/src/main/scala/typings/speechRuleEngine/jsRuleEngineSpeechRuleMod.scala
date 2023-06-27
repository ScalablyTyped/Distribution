package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsCommonEngineMod.SREError
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.DynamicCstr
import typings.speechRuleEngine.jsRuleEngineGrammarMod.State
import typings.speechRuleEngine.jsRuleEngineSpeechRuleContextMod.SpeechRuleContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsRuleEngineSpeechRuleMod {
  
  @JSImport("speech-rule-engine/js/rule_engine/speech_rule", "Action")
  @js.native
  open class Action protected () extends StObject {
    def this(components: js.Array[Component]) = this()
    
    var components: js.Array[Component] = js.native
  }
  /* static members */
  object Action {
    
    @JSImport("speech-rule-engine/js/rule_engine/speech_rule", "Action")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/rule_engine/speech_rule", "Action.addNaiveSpan")
    @js.native
    def addNaiveSpan: Any = js.native
    inline def addNaiveSpan_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addNaiveSpan")(x.asInstanceOf[js.Any])
    
    inline def fromString(input: String): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(input.asInstanceOf[js.Any]).asInstanceOf[Action]
    
    @JSImport("speech-rule-engine/js/rule_engine/speech_rule", "Action.naiveSpan")
    @js.native
    def naiveSpan: Any = js.native
    inline def naiveSpan_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("naiveSpan")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait ActionType extends StObject
  @JSImport("speech-rule-engine/js/rule_engine/speech_rule", "ActionType")
  @js.native
  object ActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ActionType & String] = js.native
    
    @js.native
    sealed trait MULTI
      extends StObject
         with ActionType
    /* "MULTI" */ val MULTI: typings.speechRuleEngine.jsRuleEngineSpeechRuleMod.ActionType.MULTI & String = js.native
    
    @js.native
    sealed trait NODE
      extends StObject
         with ActionType
    /* "NODE" */ val NODE: typings.speechRuleEngine.jsRuleEngineSpeechRuleMod.ActionType.NODE & String = js.native
    
    @js.native
    sealed trait PERSONALITY
      extends StObject
         with ActionType
    /* "PERSONALITY" */ val PERSONALITY: typings.speechRuleEngine.jsRuleEngineSpeechRuleMod.ActionType.PERSONALITY & String = js.native
    
    @js.native
    sealed trait TEXT
      extends StObject
         with ActionType
    /* "TEXT" */ val TEXT: typings.speechRuleEngine.jsRuleEngineSpeechRuleMod.ActionType.TEXT & String = js.native
  }
  
  @JSImport("speech-rule-engine/js/rule_engine/speech_rule", "Component")
  @js.native
  open class Component protected () extends StObject {
    def this(param0: ComponentType) = this()
    
    var attributes: Attributes = js.native
    
    def attributesToString(): String = js.native
    
    var content: String = js.native
    
    def getAttributes(): js.Array[String] = js.native
    
    def getGrammar(): js.Array[String] = js.native
    
    var grammar: State = js.native
    
    def grammarToString(): String = js.native
    
    var `type`: ActionType = js.native
  }
  /* static members */
  object Component {
    
    @JSImport("speech-rule-engine/js/rule_engine/speech_rule", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attributesFromString(attrs: String): StringDictionary[String | State] = ^.asInstanceOf[js.Dynamic].applyDynamic("attributesFromString")(attrs.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String | State]]
    
    inline def fromString(input: String): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(input.asInstanceOf[js.Any]).asInstanceOf[Component]
    
    inline def grammarFromString(grammar: String): State = ^.asInstanceOf[js.Dynamic].applyDynamic("grammarFromString")(grammar.asInstanceOf[js.Any]).asInstanceOf[State]
  }
  
  @JSImport("speech-rule-engine/js/rule_engine/speech_rule", "OutputError")
  @js.native
  open class OutputError protected () extends SREError {
    def this(msg: String) = this()
  }
  
  @JSImport("speech-rule-engine/js/rule_engine/speech_rule", "Precondition")
  @js.native
  open class Precondition protected () extends StObject {
    def this(query: String, cstr: String*) = this()
    
    /* private */ var calculatePriority: Any = js.native
    
    var constraints: js.Array[String] = js.native
    
    /* private */ var presetPriority: Any = js.native
    
    var priority: Double = js.native
    
    var query: String = js.native
    
    var rank: Double = js.native
  }
  /* static members */
  object Precondition {
    
    @JSImport("speech-rule-engine/js/rule_engine/speech_rule", "Precondition")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/rule_engine/speech_rule", "Precondition.attributePriorities")
    @js.native
    def attributePriorities: Any = js.native
    inline def attributePriorities_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attributePriorities")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/rule_engine/speech_rule", "Precondition.constraintValue")
    @js.native
    def constraintValue: Any = js.native
    inline def constraintValue_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("constraintValue")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/rule_engine/speech_rule", "Precondition.queryPriorities")
    @js.native
    def queryPriorities: Any = js.native
    inline def queryPriorities_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryPriorities")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("speech-rule-engine/js/rule_engine/speech_rule", "SpeechRule")
  @js.native
  open class SpeechRule protected () extends StObject {
    def this(name: String, dynamicCstr: DynamicCstr, precondition: Precondition, action: Action) = this()
    
    var action: Action = js.native
    
    var context: SpeechRuleContext = js.native
    
    var dynamicCstr: DynamicCstr = js.native
    
    var name: String = js.native
    
    var precondition: Precondition = js.native
  }
  
  type Attributes = StringDictionary[String]
  
  trait ComponentType extends StObject {
    
    var attributes: js.UndefOr[Attributes] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var grammar: js.UndefOr[State] = js.undefined
    
    var `type`: ActionType
  }
  object ComponentType {
    
    inline def apply(`type`: ActionType): ComponentType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentType] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setGrammar(value: State): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
      
      inline def setGrammarUndefined: Self = StObject.set(x, "grammar", js.undefined)
      
      inline def setType(value: ActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
