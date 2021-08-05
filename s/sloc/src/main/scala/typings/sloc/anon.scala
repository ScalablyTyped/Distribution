package typings.sloc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Record<sloc.sloc.Key, number> */
  trait RecordKeynumber extends StObject {
    
    var block: Double
    
    var blockEmpty: Double
    
    var comment: Double
    
    var empty: Double
    
    var mixed: Double
    
    var single: Double
    
    var source: Double
    
    var todo: Double
    
    var total: Double
  }
  object RecordKeynumber {
    
    inline def apply(
      block: Double,
      blockEmpty: Double,
      comment: Double,
      empty: Double,
      mixed: Double,
      single: Double,
      source: Double,
      todo: Double,
      total: Double
    ): RecordKeynumber = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], blockEmpty = blockEmpty.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], mixed = mixed.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], todo = todo.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordKeynumber]
    }
    
    extension [Self <: RecordKeynumber](x: Self) {
      
      inline def setBlock(value: Double): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockEmpty(value: Double): Self = StObject.set(x, "blockEmpty", value.asInstanceOf[js.Any])
      
      inline def setComment(value: Double): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setEmpty(value: Double): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setMixed(value: Double): Self = StObject.set(x, "mixed", value.asInstanceOf[js.Any])
      
      inline def setSingle(value: Double): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTodo(value: Double): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
