package typings.rdfjsScore

import org.scalablytyped.runtime.Shortcut
import typings.rdfjsScore.mod.ScoreFn
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object existsMod extends Shortcut {
  
  @JSImport("@rdfjs/score/exists", JSImport.Default)
  @js.native
  val default: ScoreFn[js.Array[ExistsCriteria]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.rdfjsScore.existsMod.SubjectExists
    - typings.rdfjsScore.existsMod.GraphExists
    - typings.rdfjsScore.existsMod.PredicateExists
    - typings.rdfjsScore.existsMod.ObjectExists
  */
  trait ExistsCriteria extends StObject
  object ExistsCriteria {
    
    inline def GraphExists(graph: Term): typings.rdfjsScore.existsMod.GraphExists = {
      val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rdfjsScore.existsMod.GraphExists]
    }
    
    inline def ObjectExists(`object`: Term): typings.rdfjsScore.existsMod.ObjectExists = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rdfjsScore.existsMod.ObjectExists]
    }
    
    inline def PredicateExists(predicate: Term): typings.rdfjsScore.existsMod.PredicateExists = {
      val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rdfjsScore.existsMod.PredicateExists]
    }
    
    inline def SubjectExists(subject: Term): typings.rdfjsScore.existsMod.SubjectExists = {
      val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rdfjsScore.existsMod.SubjectExists]
    }
  }
  
  trait GraphExists
    extends StObject
       with ExistsCriteria {
    
    var graph: Term
  }
  object GraphExists {
    
    inline def apply(graph: Term): GraphExists = {
      val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphExists]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GraphExists] (val x: Self) extends AnyVal {
      
      inline def setGraph(value: Term): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObjectExists
    extends StObject
       with ExistsCriteria {
    
    var `object`: Term
  }
  object ObjectExists {
    
    inline def apply(`object`: Term): ObjectExists = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectExists]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectExists] (val x: Self) extends AnyVal {
      
      inline def setObject(value: Term): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
  
  trait PredicateExists
    extends StObject
       with ExistsCriteria {
    
    var predicate: Term
  }
  object PredicateExists {
    
    inline def apply(predicate: Term): PredicateExists = {
      val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any])
      __obj.asInstanceOf[PredicateExists]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PredicateExists] (val x: Self) extends AnyVal {
      
      inline def setPredicate(value: Term): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubjectExists
    extends StObject
       with ExistsCriteria {
    
    var subject: Term
  }
  object SubjectExists {
    
    inline def apply(subject: Term): SubjectExists = {
      val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubjectExists]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubjectExists] (val x: Self) extends AnyVal {
      
      inline def setSubject(value: Term): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ScoreFn[js.Array[ExistsCriteria]]
  
  /* This means you don't have to write `default`, but can instead just say `existsMod.foo` */
  override def _to: ScoreFn[js.Array[ExistsCriteria]] = default
}
