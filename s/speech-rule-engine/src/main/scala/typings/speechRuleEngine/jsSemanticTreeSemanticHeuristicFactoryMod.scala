package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticHeuristicMod.SemanticHeuristic
import typings.speechRuleEngine.jsSemanticTreeSemanticHeuristicMod.SemanticHeuristicTypes
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeFactoryMod.SemanticNodeFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticHeuristicFactoryMod {
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_heuristic_factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(heuristic: SemanticHeuristic[SemanticHeuristicTypes]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(heuristic.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_heuristic_factory", "factory")
  @js.native
  def factory: SemanticNodeFactory = js.native
  inline def factory_=(x: SemanticNodeFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("factory")(x.asInstanceOf[js.Any])
  
  inline def run(name: String, root: SemanticHeuristicTypes): SemanticHeuristicTypes | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[SemanticHeuristicTypes | Unit]
  inline def run(
    name: String,
    root: SemanticHeuristicTypes,
    opt_alternative: js.Function1[/* p1 */ SemanticHeuristicTypes, SemanticHeuristicTypes]
  ): SemanticHeuristicTypes | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], root.asInstanceOf[js.Any], opt_alternative.asInstanceOf[js.Any])).asInstanceOf[SemanticHeuristicTypes | Unit]
  
  inline def updateFactory(nodeFactory: SemanticNodeFactory): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateFactory")(nodeFactory.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
