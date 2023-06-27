package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsAudioSpanMod.Span
import typings.speechRuleEngine.jsAudioSpanMod.SpanAttrs
import typings.speechRuleEngine.jsRuleEngineSpeechRuleFunctionsMod.ContextFunctions
import typings.speechRuleEngine.jsRuleEngineSpeechRuleFunctionsMod.CustomGenerators
import typings.speechRuleEngine.jsRuleEngineSpeechRuleFunctionsMod.CustomQueries
import typings.speechRuleEngine.jsRuleEngineSpeechRuleFunctionsMod.CustomStrings
import typings.speechRuleEngine.jsRuleEngineSpeechRuleFunctionsMod.SpeechRuleFunction
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsRuleEngineSpeechRuleContextMod {
  
  @JSImport("speech-rule-engine/js/rule_engine/speech_rule_context", "SpeechRuleContext")
  @js.native
  open class SpeechRuleContext () extends StObject {
    
    def applyConstraint(node: Node, expr: String): Boolean = js.native
    
    def applyCustomQuery(node: Node, funcName: String): js.Array[Node] = js.native
    
    def applyQuery(node: Node, expr: String): Node = js.native
    
    def applySelector(node: Node, expr: String): js.Array[Node] = js.native
    
    def constructSpan(node: Node, expr: String, `def`: SpanAttrs): js.Array[Span] = js.native
    
    def constructString(node: Node, expr: String): String = js.native
    
    /* private */ var constructString_ : Any = js.native
    
    var contextFunctions: ContextFunctions = js.native
    
    var customGenerators: CustomGenerators = js.native
    
    var customQueries: CustomQueries = js.native
    
    var customStrings: CustomStrings = js.native
    
    def parse(functions: js.Array[js.Tuple2[String, SpeechRuleFunction]]): Unit = js.native
    def parse(functions: StringDictionary[SpeechRuleFunction]): Unit = js.native
  }
}
