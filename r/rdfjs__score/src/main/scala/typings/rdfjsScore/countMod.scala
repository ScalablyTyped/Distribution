package typings.rdfjsScore

import org.scalablytyped.runtime.Shortcut
import typings.rdfjsScore.mod.ScoreFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countMod extends Shortcut {
  
  @JSImport("@rdfjs/score/count", JSImport.Default)
  @js.native
  val default: ScoreFn[js.Array[Any | CountCriteria]] = js.native
  
  /* Inlined std.Record<'subject' | 'predicate' | 'object' | 'graph', boolean> */
  trait CountCriteria extends StObject {
    
    var graph: Boolean
    
    var `object`: Boolean
    
    var predicate: Boolean
    
    var subject: Boolean
  }
  object CountCriteria {
    
    inline def apply(graph: Boolean, `object`: Boolean, predicate: Boolean, subject: Boolean): CountCriteria = {
      val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountCriteria]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CountCriteria] (val x: Self) extends AnyVal {
      
      inline def setGraph(value: Boolean): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Boolean): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPredicate(value: Boolean): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: Boolean): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ScoreFn[js.Array[Any | CountCriteria]]
  
  /* This means you don't have to write `default`, but can instead just say `countMod.foo` */
  override def _to: ScoreFn[js.Array[Any | CountCriteria]] = default
}
