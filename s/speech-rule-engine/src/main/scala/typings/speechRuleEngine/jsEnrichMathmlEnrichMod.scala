package typings.speechRuleEngine

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsEnrichMathmlEnrichMod {
  
  @JSImport("speech-rule-engine/js/enrich_mathml/enrich", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prepareMmlString(expr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareMmlString")(expr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def semanticMathml(expr: String, callback: js.Function1[/* p1 */ Element, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("semanticMathml")(expr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def semanticMathmlNode(mml: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("semanticMathmlNode")(mml.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def semanticMathmlSync(expr: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("semanticMathmlSync")(expr.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def testTranslation(expr: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("testTranslation")(expr.asInstanceOf[js.Any]).asInstanceOf[Element]
}
