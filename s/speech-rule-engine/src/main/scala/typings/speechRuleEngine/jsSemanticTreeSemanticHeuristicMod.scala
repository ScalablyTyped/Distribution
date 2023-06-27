package typings.speechRuleEngine

import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSemanticTreeSemanticHeuristicMod {
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_heuristic", "SemanticMultiHeuristic")
  @js.native
  open class SemanticMultiHeuristic ()
    extends StObject
       with SemanticAbstractHeuristic[js.Array[SemanticNode]] {
    
    /* CompleteClass */
    override def applicable(node: js.Array[SemanticNode]): Boolean = js.native
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(node: js.Array[SemanticNode]): Unit = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("speech-rule-engine/js/semantic_tree/semantic_heuristic", "SemanticTreeHeuristic")
  @js.native
  open class SemanticTreeHeuristic ()
    extends StObject
       with SemanticAbstractHeuristic[SemanticNode] {
    
    /* CompleteClass */
    override def applicable(node: SemanticNode): Boolean = js.native
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(node: SemanticNode): Unit = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait SemanticAbstractHeuristic[T /* <: SemanticHeuristicTypes */]
    extends StObject
       with SemanticHeuristic[T]
  object SemanticAbstractHeuristic {
    
    inline def apply[T /* <: SemanticHeuristicTypes */](applicable: T => Boolean, apply: T => Unit, name: String): SemanticAbstractHeuristic[T] = {
      val __obj = js.Dynamic.literal(applicable = js.Any.fromFunction1(applicable), apply = js.Any.fromFunction1(apply), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticAbstractHeuristic[T]]
    }
  }
  
  trait SemanticHeuristic[T] extends StObject {
    
    def applicable(node: T): Boolean
    
    @JSName("apply")
    def apply(node: T): Unit
    
    var name: String
  }
  object SemanticHeuristic {
    
    inline def apply[T](applicable: T => Boolean, apply: T => Unit, name: String): SemanticHeuristic[T] = {
      val __obj = js.Dynamic.literal(applicable = js.Any.fromFunction1(applicable), apply = js.Any.fromFunction1(apply), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticHeuristic[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SemanticHeuristic[?], T] (val x: Self & SemanticHeuristic[T]) extends AnyVal {
      
      inline def setApplicable(value: T => Boolean): Self = StObject.set(x, "applicable", js.Any.fromFunction1(value))
      
      inline def setApply(value: T => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type SemanticHeuristicTypes = SemanticNode | js.Array[SemanticNode]
}
