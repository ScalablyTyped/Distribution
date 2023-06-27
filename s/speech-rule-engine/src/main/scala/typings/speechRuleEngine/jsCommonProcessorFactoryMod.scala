package typings.speechRuleEngine

import typings.speechRuleEngine.jsCommonEventUtilMod.KeyCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsCommonProcessorFactoryMod {
  
  @JSImport("speech-rule-engine/js/common/processor_factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keypress(name: String, expr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("keypress")(name.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def keypress(name: String, expr: KeyCode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("keypress")(name.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def output(name: String, expr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("output")(name.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def process[T](name: String, expr: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(name.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[T]
}
