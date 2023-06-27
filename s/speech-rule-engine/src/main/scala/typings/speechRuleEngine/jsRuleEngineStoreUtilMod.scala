package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioAuditoryDescriptionMod.AuditoryDescription
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsRuleEngineStoreUtilMod {
  
  @JSImport("speech-rule-engine/js/rule_engine/store_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contentIterator(nodes: js.Array[Element], context: String): js.Function0[js.Array[AuditoryDescription]] = (^.asInstanceOf[js.Dynamic].applyDynamic("contentIterator")(nodes.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Array[AuditoryDescription]]]
  
  inline def nodeCounter(nodes: js.Array[Node]): js.Function0[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeCounter")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Function0[String]]
  inline def nodeCounter(nodes: js.Array[Node], context: String): js.Function0[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeCounter")(nodes.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function0[String]]
  
  inline def pauseSeparator(_nodes: js.Array[Node], context: String): js.Function0[js.Array[AuditoryDescription]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pauseSeparator")(_nodes.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Array[AuditoryDescription]]]
}
