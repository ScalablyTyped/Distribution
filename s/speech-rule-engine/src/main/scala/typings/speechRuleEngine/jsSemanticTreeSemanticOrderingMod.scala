package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticMeaning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticOrderingMod {
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_ordering", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reduce(meanings: js.Array[SemanticMeaning]): js.Array[SemanticMeaning] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(meanings.asInstanceOf[js.Any]).asInstanceOf[js.Array[SemanticMeaning]]
}
