package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioAuditoryDescriptionMod.AuditoryDescription
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSpeechGeneratorSpeechGeneratorUtilMod {
  
  @JSImport("speech-rule-engine/js/speech_generator/speech_generator_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addModality(mml: Element, semantic: SemanticNode, modality: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addModality")(mml.asInstanceOf[js.Any], semantic.asInstanceOf[js.Any], modality.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addPrefix(mml: Element, semantic: SemanticNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPrefix")(mml.asInstanceOf[js.Any], semantic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addSpeech(mml: Element, semantic: SemanticNode, snode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSpeech")(mml.asInstanceOf[js.Any], semantic.asInstanceOf[js.Any], snode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def computeMarkup(tree: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMarkup")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def computeSpeech(xml: Element): js.Array[AuditoryDescription] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSpeech")(xml.asInstanceOf[js.Any]).asInstanceOf[js.Array[AuditoryDescription]]
  
  inline def connectAllMactions(mml: Element, stree: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectAllMactions")(mml.asInstanceOf[js.Any], stree.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def connectMactions(node: Element, mml: Element, stree: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectMactions")(node.asInstanceOf[js.Any], mml.asInstanceOf[js.Any], stree.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def recomputeMarkup(semantic: SemanticNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recomputeMarkup")(semantic.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def retrievePrefix(semantic: SemanticNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("retrievePrefix")(semantic.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def retrieveSummary(node: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSummary")(node.asInstanceOf[js.Any]).asInstanceOf[String]
}
