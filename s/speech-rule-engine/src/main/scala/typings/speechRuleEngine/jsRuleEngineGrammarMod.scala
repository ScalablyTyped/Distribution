package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsRuleEngineGrammarMod {
  
  @JSImport("speech-rule-engine/js/rule_engine/grammar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("speech-rule-engine/js/rule_engine/grammar", "ATTRIBUTE")
  @js.native
  val ATTRIBUTE: /* "grammar" */ String = js.native
  
  @JSImport("speech-rule-engine/js/rule_engine/grammar", "Grammar")
  @js.native
  /* private */ open class Grammar () extends StObject {
    
    @JSName("apply")
    def apply(text: String): String = js.native
    @JSName("apply")
    def apply(text: String, opt_flags: Flags): String = js.native
    
    def clear(): Unit = js.native
    
    def correct(text: String): String = js.native
    
    /* private */ var corrections_ : Any = js.native
    
    var currentFlags: Flags = js.native
    
    def getCorrection(correction: String): Correction = js.native
    
    def getParameter(parameter: String): Value = js.native
    
    def getState(): String = js.native
    
    /* private */ var parameters_ : Any = js.native
    
    def popState(): Unit = js.native
    
    def preprocess(text: String): String = js.native
    
    /* private */ var preprocessors_ : Any = js.native
    
    def processSingles(): Unit = js.native
    
    def pushState(assignment: StringDictionary[Value]): Unit = js.native
    
    /* private */ var runProcessors: Any = js.native
    
    def setAttribute(node: Element): Unit = js.native
    
    def setCorrection(correction: String, func: Correction): Unit = js.native
    
    def setParameter(parameter: String, value: Value): Value = js.native
    
    def setPreprocessor(preprocessor: String, func: Correction): Unit = js.native
    
    /* private */ var singles: Any = js.native
    
    /* private */ var stateStack_ : Any = js.native
  }
  /* static members */
  object Grammar {
    
    @JSImport("speech-rule-engine/js/rule_engine/grammar", "Grammar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/rule_engine/grammar", "Grammar.cleanUnit")
    @js.native
    def cleanUnit: Any = js.native
    inline def cleanUnit_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cleanUnit")(x.asInstanceOf[js.Any])
    
    inline def getInstance(): Grammar = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Grammar]
    
    @JSImport("speech-rule-engine/js/rule_engine/grammar", "Grammar.instance")
    @js.native
    def instance: Any = js.native
    inline def instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
    
    inline def parseInput(grammar: String): State = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInput")(grammar.asInstanceOf[js.Any]).asInstanceOf[State]
    
    inline def parseState(stateStr: String): State = ^.asInstanceOf[js.Dynamic].applyDynamic("parseState")(stateStr.asInstanceOf[js.Any]).asInstanceOf[State]
    
    @JSImport("speech-rule-engine/js/rule_engine/grammar", "Grammar.prepareUnit")
    @js.native
    def prepareUnit: Any = js.native
    inline def prepareUnit_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prepareUnit")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/rule_engine/grammar", "Grammar.translateString")
    @js.native
    def translateString: Any = js.native
    inline def translateString_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translateString")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/rule_engine/grammar", "Grammar.translateUnit")
    @js.native
    def translateUnit: Any = js.native
    inline def translateUnit_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translateUnit")(x.asInstanceOf[js.Any])
  }
  
  inline def correctFont(text: String, correction: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("correctFont")(text.asInstanceOf[js.Any], correction.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Correction = js.Function2[/* text */ String, /* parameter */ js.UndefOr[Value], String]
  
  trait Flags extends StObject {
    
    var adjust: js.UndefOr[Boolean] = js.undefined
    
    var correct: js.UndefOr[Boolean] = js.undefined
    
    var preprocess: js.UndefOr[Boolean] = js.undefined
    
    var translate: js.UndefOr[Boolean] = js.undefined
  }
  object Flags {
    
    inline def apply(): Flags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Flags]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Flags] (val x: Self) extends AnyVal {
      
      inline def setAdjust(value: Boolean): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
      
      inline def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
      
      inline def setCorrect(value: Boolean): Self = StObject.set(x, "correct", value.asInstanceOf[js.Any])
      
      inline def setCorrectUndefined: Self = StObject.set(x, "correct", js.undefined)
      
      inline def setPreprocess(value: Boolean): Self = StObject.set(x, "preprocess", value.asInstanceOf[js.Any])
      
      inline def setPreprocessUndefined: Self = StObject.set(x, "preprocess", js.undefined)
      
      inline def setTranslate(value: Boolean): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    }
  }
  
  type State = StringDictionary[Value]
  
  type Value = Boolean | String
}
