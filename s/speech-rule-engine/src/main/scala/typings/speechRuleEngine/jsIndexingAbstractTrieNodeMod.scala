package typings.speechRuleEngine

import typings.speechRuleEngine.jsIndexingTrieNodeMod.TrieNode
import typings.speechRuleEngine.jsIndexingTrieNodeMod.TrieNodeKind
import typings.speechRuleEngine.jsRuleEngineSpeechRuleMod.SpeechRule
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsIndexingAbstractTrieNodeMod {
  
  @JSImport("speech-rule-engine/js/indexing/abstract_trie_node", "AbstractTrieNode")
  @js.native
  open class AbstractTrieNode[T] protected ()
    extends StObject
       with TrieNode {
    def this(constraint: String) = this()
    def this(constraint: String, test: js.Function1[/* p1 */ T, Boolean]) = this()
    
    /* CompleteClass */
    override def addChild(node: TrieNode): TrieNode | Null = js.native
    
    /* CompleteClass */
    override def applyTest(`object`: Any): Boolean = js.native
    
    /* private */ var children_ : Any = js.native
    
    var constraint: String = js.native
    
    /* CompleteClass */
    override def findChildren(`object`: Any): js.Array[TrieNode] = js.native
    
    /* CompleteClass */
    override def getChild(constraint: String): TrieNode | Null = js.native
    
    /* CompleteClass */
    override def getChildren(): js.Array[TrieNode] = js.native
    
    /* CompleteClass */
    override def getConstraint(): String = js.native
    
    /* CompleteClass */
    override def getKind(): TrieNodeKind = js.native
    
    /* CompleteClass */
    var kind: TrieNodeKind = js.native
    
    /* CompleteClass */
    override def removeChild(constraint: String): Unit = js.native
    
    var test: (js.Function1[/* p1 */ T, Boolean]) | Null = js.native
  }
  
  @JSImport("speech-rule-engine/js/indexing/abstract_trie_node", "StaticTrieNode")
  @js.native
  open class StaticTrieNode protected () extends AbstractTrieNode[Node] {
    def this(constraint: String) = this()
    def this(constraint: String, test: js.Function1[/* p1 */ Node, Boolean]) = this()
    
    def getRule(): SpeechRule | Null = js.native
    
    /* private */ var rule_ : Any = js.native
    
    def setRule(rule: SpeechRule): Unit = js.native
  }
}
