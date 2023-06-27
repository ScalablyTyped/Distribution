package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsAudioAuditoryDescriptionMod.AuditoryDescription
import typings.speechRuleEngine.jsCommonEventUtilMod.KeyCode
import typings.std.Element
import typings.std.Node
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsCommonBrowserMod {
  
  object SRE {
    
    @JSImport("speech-rule-engine/js/common/browser", "SRE")
    @js.native
    val ^ : js.Any = js.native
    
    inline def engineReady(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("engineReady")().asInstanceOf[js.Promise[Any]]
    
    inline def engineSetup(): StringDictionary[Boolean | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("engineSetup")().asInstanceOf[StringDictionary[Boolean | String]]
    
    inline def exit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exit")().asInstanceOf[Unit]
    inline def exit(opt_value: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exit")(opt_value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("speech-rule-engine/js/common/browser", "SRE.file")
    @js.native
    val file: Record[String, js.Function2[/* input */ String, /* output */ js.UndefOr[String], Any]] = js.native
    
    @JSImport("speech-rule-engine/js/common/browser", "SRE.localeLoader")
    @js.native
    val localeLoader: /* import warning: importer.ImportType#apply Failed type conversion: typeof standardLoader */ js.Any = js.native
    
    @JSImport("speech-rule-engine/js/common/browser", "SRE.localePath")
    @js.native
    val localePath: /* import warning: importer.ImportType#apply Failed type conversion: typeof FileUtil.localePath */ js.Any = js.native
    
    inline def move(direction: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(direction.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    inline def move(direction: KeyCode): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(direction.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def number(expr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(expr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def numericOrdinal(expr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numericOrdinal")(expr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def ordinal(expr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ordinal")(expr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def processFile(processor: String, input: String): String | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("processFile")(processor.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[String | js.Promise[String]]
    inline def processFile(processor: String, input: String, opt_output: String): String | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("processFile")(processor.asInstanceOf[js.Any], input.asInstanceOf[js.Any], opt_output.asInstanceOf[js.Any])).asInstanceOf[String | js.Promise[String]]
    
    inline def setupEngine(feature: StringDictionary[Boolean | String]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setupEngine")(feature.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    inline def toDescription(expr: String): js.Array[AuditoryDescription] = ^.asInstanceOf[js.Dynamic].applyDynamic("toDescription")(expr.asInstanceOf[js.Any]).asInstanceOf[js.Array[AuditoryDescription]]
    
    inline def toEnriched(expr: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("toEnriched")(expr.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def toJson(expr: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(expr.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def toSemantic(expr: String): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("toSemantic")(expr.asInstanceOf[js.Any]).asInstanceOf[Node]
    
    inline def toSpeech(expr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSpeech")(expr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("speech-rule-engine/js/common/browser", "SRE.version")
    @js.native
    val version: String = js.native
    
    inline def vulgar(expr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("vulgar")(expr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def walk(expr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("walk")(expr.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
