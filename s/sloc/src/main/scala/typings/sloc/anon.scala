package typings.sloc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Record<sloc.sloc.Key, number> */
  @js.native
  trait RecordKeynumber extends StObject {
    
    var block: Double = js.native
    
    var blockEmpty: Double = js.native
    
    var comment: Double = js.native
    
    var empty: Double = js.native
    
    var mixed: Double = js.native
    
    var single: Double = js.native
    
    var source: Double = js.native
    
    var todo: Double = js.native
    
    var total: Double = js.native
  }
  object RecordKeynumber {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class RecordKeynumberMutableBuilder[Self <: RecordKeynumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: Double): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockEmpty(value: Double): Self = StObject.set(x, "blockEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment(value: Double): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmpty(value: Double): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixed(value: Double): Self = StObject.set(x, "mixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingle(value: Double): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodo(value: Double): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
