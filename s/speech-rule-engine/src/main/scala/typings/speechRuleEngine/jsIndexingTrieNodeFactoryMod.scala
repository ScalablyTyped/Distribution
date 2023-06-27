package typings.speechRuleEngine

import typings.speechRuleEngine.jsIndexingTrieNodeMod.TrieNode
import typings.speechRuleEngine.jsIndexingTrieNodeMod.TrieNodeKind
import typings.speechRuleEngine.jsRuleEngineSpeechRuleContextMod.SpeechRuleContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsIndexingTrieNodeFactoryMod {
  
  @JSImport("speech-rule-engine/js/indexing/trie_node_factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNode(kind: TrieNodeKind, constraint: String, context: SpeechRuleContext): TrieNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNode")(kind.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[TrieNode | Null]
}
