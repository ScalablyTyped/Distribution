package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsIndexingTrieNodeMod.TrieNode
import typings.speechRuleEngine.jsRuleEngineSpeechRuleMod.SpeechRule
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsIndexingTrieMod {
  
  @JSImport("speech-rule-engine/js/indexing/trie", "Trie")
  @js.native
  open class Trie () extends StObject {
    
    /* private */ var addNode_ : Any = js.native
    
    def addRule(rule: SpeechRule): Unit = js.native
    
    def byConstraint(constraint: js.Array[String]): TrieNode = js.native
    
    def collectRules(): js.Array[SpeechRule] = js.native
    def collectRules(root: TrieNode): js.Array[SpeechRule] = js.native
    
    def enumerate(): StringDictionary[Any] = js.native
    def enumerate(opt_info: StringDictionary[Any]): StringDictionary[Any] = js.native
    
    /* private */ var enumerate_ : Any = js.native
    
    def hasSubtrie(cstrs: js.Array[String]): Boolean = js.native
    
    def lookupRules(xml: Node, dynamic: js.Array[js.Array[String]]): js.Array[SpeechRule] = js.native
    
    def order(): Double = js.native
    
    var root: TrieNode = js.native
  }
  /* static members */
  object Trie {
    
    @JSImport("speech-rule-engine/js/indexing/trie", "Trie")
    @js.native
    val ^ : js.Any = js.native
    
    inline def collectRules_(root: TrieNode): js.Array[SpeechRule] = ^.asInstanceOf[js.Dynamic].applyDynamic("collectRules_")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[SpeechRule]]
    
    @JSImport("speech-rule-engine/js/indexing/trie", "Trie.order_")
    @js.native
    def order_ : Any = js.native
    inline def order__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("order_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/indexing/trie", "Trie.printWithDepth_")
    @js.native
    def printWithDepth_ : Any = js.native
    inline def printWithDepth__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("printWithDepth_")(x.asInstanceOf[js.Any])
  }
}
