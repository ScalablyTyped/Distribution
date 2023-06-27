package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticAnnotatorMod.SemanticAnnotator
import typings.speechRuleEngine.jsSemanticTreeSemanticAnnotatorMod.SemanticVisitor
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticAnnotationsMod {
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_annotations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def activate(domain: String, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("activate")(domain.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def annotate(node: SemanticNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("annotate")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_annotations", "annotators")
  @js.native
  val annotators: Map[String, SemanticAnnotator] = js.native
  
  inline def register(annotator: SemanticAnnotator): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(annotator.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def register(annotator: SemanticVisitor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(annotator.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_annotations", "visitors")
  @js.native
  val visitors: Map[String, SemanticVisitor] = js.native
}
