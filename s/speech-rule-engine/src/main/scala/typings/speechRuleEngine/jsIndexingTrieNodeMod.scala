package typings.speechRuleEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsIndexingTrieNodeMod {
  
  @js.native
  sealed trait TrieNodeKind extends StObject
  @JSImport("speech-rule-engine/js/indexing/trie_node", "TrieNodeKind")
  @js.native
  object TrieNodeKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TrieNodeKind & String] = js.native
    
    @js.native
    sealed trait BOOLEAN
      extends StObject
         with TrieNodeKind
    /* "boolean" */ val BOOLEAN: typings.speechRuleEngine.jsIndexingTrieNodeMod.TrieNodeKind.BOOLEAN & String = js.native
    
    @js.native
    sealed trait DYNAMIC
      extends StObject
         with TrieNodeKind
    /* "dynamic" */ val DYNAMIC: typings.speechRuleEngine.jsIndexingTrieNodeMod.TrieNodeKind.DYNAMIC & String = js.native
    
    @js.native
    sealed trait QUERY
      extends StObject
         with TrieNodeKind
    /* "query" */ val QUERY: typings.speechRuleEngine.jsIndexingTrieNodeMod.TrieNodeKind.QUERY & String = js.native
    
    @js.native
    sealed trait ROOT
      extends StObject
         with TrieNodeKind
    /* "root" */ val ROOT: typings.speechRuleEngine.jsIndexingTrieNodeMod.TrieNodeKind.ROOT & String = js.native
    
    @js.native
    sealed trait STATIC
      extends StObject
         with TrieNodeKind
    /* "static" */ val STATIC: typings.speechRuleEngine.jsIndexingTrieNodeMod.TrieNodeKind.STATIC & String = js.native
  }
  
  trait TrieNode extends StObject {
    
    def addChild(node: TrieNode): TrieNode | Null
    
    def applyTest(`object`: Any): Boolean
    
    def findChildren(`object`: Any): js.Array[TrieNode]
    
    def getChild(constraint: String): TrieNode | Null
    
    def getChildren(): js.Array[TrieNode]
    
    def getConstraint(): String
    
    def getKind(): TrieNodeKind
    
    var kind: TrieNodeKind
    
    def removeChild(constraint: String): Unit
  }
  object TrieNode {
    
    inline def apply(
      addChild: TrieNode => TrieNode | Null,
      applyTest: Any => Boolean,
      findChildren: Any => js.Array[TrieNode],
      getChild: String => TrieNode | Null,
      getChildren: () => js.Array[TrieNode],
      getConstraint: () => String,
      getKind: () => TrieNodeKind,
      kind: TrieNodeKind,
      removeChild: String => Unit
    ): TrieNode = {
      val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction1(addChild), applyTest = js.Any.fromFunction1(applyTest), findChildren = js.Any.fromFunction1(findChildren), getChild = js.Any.fromFunction1(getChild), getChildren = js.Any.fromFunction0(getChildren), getConstraint = js.Any.fromFunction0(getConstraint), getKind = js.Any.fromFunction0(getKind), kind = kind.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild))
      __obj.asInstanceOf[TrieNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrieNode] (val x: Self) extends AnyVal {
      
      inline def setAddChild(value: TrieNode => TrieNode | Null): Self = StObject.set(x, "addChild", js.Any.fromFunction1(value))
      
      inline def setApplyTest(value: Any => Boolean): Self = StObject.set(x, "applyTest", js.Any.fromFunction1(value))
      
      inline def setFindChildren(value: Any => js.Array[TrieNode]): Self = StObject.set(x, "findChildren", js.Any.fromFunction1(value))
      
      inline def setGetChild(value: String => TrieNode | Null): Self = StObject.set(x, "getChild", js.Any.fromFunction1(value))
      
      inline def setGetChildren(value: () => js.Array[TrieNode]): Self = StObject.set(x, "getChildren", js.Any.fromFunction0(value))
      
      inline def setGetConstraint(value: () => String): Self = StObject.set(x, "getConstraint", js.Any.fromFunction0(value))
      
      inline def setGetKind(value: () => TrieNodeKind): Self = StObject.set(x, "getKind", js.Any.fromFunction0(value))
      
      inline def setKind(value: TrieNodeKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setRemoveChild(value: String => Unit): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    }
  }
}
