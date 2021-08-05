package typings.shellQuote

import typings.shellQuote.mod.ControlOperator
import typings.shellQuote.mod._ParseEntry
import typings.shellQuote.shellQuoteStrings.glob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Comment
    extends StObject
       with _ParseEntry {
    
    var comment: String
  }
  object Comment {
    
    inline def apply(comment: String): Comment = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    }
  }
  
  trait Op
    extends StObject
       with _ParseEntry {
    
    var op: ControlOperator
  }
  object Op {
    
    inline def apply(op: ControlOperator): Op = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
      __obj.asInstanceOf[Op]
    }
    
    extension [Self <: Op](x: Self) {
      
      inline def setOp(value: ControlOperator): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pattern
    extends StObject
       with _ParseEntry {
    
    var op: glob
    
    var pattern: String
  }
  object Pattern {
    
    inline def apply(pattern: String): Pattern = {
      val __obj = js.Dynamic.literal(op = "glob", pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pattern]
    }
    
    extension [Self <: Pattern](x: Self) {
      
      inline def setOp(value: glob): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}
