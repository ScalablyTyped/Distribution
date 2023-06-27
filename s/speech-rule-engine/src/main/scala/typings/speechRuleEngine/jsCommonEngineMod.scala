package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsAudioAuditoryDescriptionMod.AuditoryDescription
import typings.speechRuleEngine.jsCommonEngineConstMod.Markup
import typings.speechRuleEngine.jsCommonEngineConstMod.Mode
import typings.speechRuleEngine.jsCommonEngineConstMod.Speech
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.AxisMap
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.Comparator
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.DynamicCstr
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.DynamicCstrParser
import typings.std.Element
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsCommonEngineMod {
  
  @JSImport("speech-rule-engine/js/common/engine", JSImport.Default)
  @js.native
  /* private */ open class default ()
    extends StObject
       with Engine
  /* static members */
  object default {
    
    @JSImport("speech-rule-engine/js/common/engine", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/common/engine", "default.BINARY_FEATURES")
    @js.native
    def BINARY_FEATURES: js.Array[String] = js.native
    inline def BINARY_FEATURES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BINARY_FEATURES")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/common/engine", "default.STRING_FEATURES")
    @js.native
    def STRING_FEATURES: js.Array[String] = js.native
    inline def STRING_FEATURES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING_FEATURES")(x.asInstanceOf[js.Any])
    
    inline def defaultEvaluator(str: String, _cstr: DynamicCstr): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultEvaluator")(str.asInstanceOf[js.Any], _cstr.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def evaluateNode(node: Element): js.Array[AuditoryDescription] = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluateNode")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[AuditoryDescription]]
    
    inline def getInstance(): Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Engine]
    
    @JSImport("speech-rule-engine/js/common/engine", "default.instance")
    @js.native
    def instance: Any = js.native
    inline def instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
    
    inline def nodeEvaluator(node: Element): js.Array[AuditoryDescription] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeEvaluator")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[AuditoryDescription]]
  }
  
  @JSImport("speech-rule-engine/js/common/engine", "EnginePromise")
  @js.native
  open class EnginePromise () extends StObject
  /* static members */
  object EnginePromise {
    
    @JSImport("speech-rule-engine/js/common/engine", "EnginePromise")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[String]]
    inline def get(locale: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    inline def getall(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getall")().asInstanceOf[js.Promise[js.Array[String]]]
    
    @JSImport("speech-rule-engine/js/common/engine", "EnginePromise.loaded")
    @js.native
    def loaded: StringDictionary[js.Tuple2[Boolean, Boolean]] = js.native
    inline def loaded_=(x: StringDictionary[js.Tuple2[Boolean, Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loaded")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/common/engine", "EnginePromise.promises")
    @js.native
    def promises: StringDictionary[js.Promise[String]] = js.native
    inline def promises_=(x: StringDictionary[js.Promise[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("promises")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("speech-rule-engine/js/common/engine", "SREError")
  @js.native
  open class SREError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  trait Engine extends StObject {
    
    var _defaultLocale: String = js.native
    
    var aria: Boolean = js.native
    
    var automark: Boolean = js.native
    
    var cayleyshort: Boolean = js.native
    
    var character: Boolean = js.native
    
    var cleanpause: Boolean = js.native
    
    var comparator: Comparator = js.native
    
    var comparators: StringDictionary[js.Function0[Comparator]] = js.native
    
    var config: Boolean = js.native
    
    def configurate(feature: StringDictionary[Boolean | String]): Unit = js.native
    
    def customLoader(locale: String): js.Promise[String] = js.native
    
    def defaultLocale: String = js.native
    def defaultLocale_=(loc: String): Unit = js.native
    
    var defaultParser: DynamicCstrParser = js.native
    
    var delay: Boolean = js.native
    
    var domain: String = js.native
    
    var dynamicCstr: DynamicCstr = js.native
    
    def evaluator(p1: String, p2: DynamicCstr): String | Null = js.native
    
    def getRate(): Double = js.native
    
    var init: Boolean = js.native
    
    var isEdge: Boolean = js.native
    
    var isIE: Boolean = js.native
    
    var linebreaks: Boolean = js.native
    
    var locale: String = js.native
    
    var mark: Boolean = js.native
    
    var markup: Markup = js.native
    
    var modality: String = js.native
    
    var mode: Mode = js.native
    
    var parser: DynamicCstrParser = js.native
    
    var parsers: StringDictionary[DynamicCstrParser] = js.native
    
    var pprint: Boolean = js.native
    
    var prune: String = js.native
    
    var rate: String = js.native
    
    var ruleSets: js.Array[String] = js.native
    
    var rules: String = js.native
    
    def setCustomLoader(fn: Any): Unit = js.native
    
    def setDynamicCstr(): Unit = js.native
    def setDynamicCstr(opt_dynamic: AxisMap): Unit = js.native
    
    var speech: Speech = js.native
    
    var strict: Boolean = js.native
    
    var structure: Boolean = js.native
    
    var style: String = js.native
    
    var subiso: String = js.native
    
    var walker: String = js.native
  }
}
