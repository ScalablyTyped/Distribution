package typings.shellQuote

import typings.shellQuote.mod.ControlOperator
import typings.shellQuote.mod._ParseEntry
import typings.shellQuote.shellQuoteStrings.glob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Comment extends _ParseEntry {
    
    var comment: String = js.native
  }
  object Comment {
    
    @scala.inline
    def apply(comment: String): Comment = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    @scala.inline
    implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Op extends _ParseEntry {
    
    var op: ControlOperator = js.native
  }
  object Op {
    
    @scala.inline
    def apply(op: ControlOperator): Op = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
      __obj.asInstanceOf[Op]
    }
    
    @scala.inline
    implicit class OpMutableBuilder[Self <: Op] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: ControlOperator): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pattern extends _ParseEntry {
    
    var op: glob = js.native
    
    var pattern: String = js.native
  }
  object Pattern {
    
    @scala.inline
    def apply(op: glob, pattern: String): Pattern = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pattern]
    }
    
    @scala.inline
    implicit class PatternMutableBuilder[Self <: Pattern] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: glob): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}
