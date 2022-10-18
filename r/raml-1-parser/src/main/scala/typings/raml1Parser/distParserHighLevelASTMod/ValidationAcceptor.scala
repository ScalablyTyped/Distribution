package typings.raml1Parser.distParserHighLevelASTMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationAcceptor extends StObject {
  
  def accept(issue: ValidationIssue): Any
  
  def acceptUnique(issue: ValidationIssue): Any
  
  def begin(): Any
  
  def end(): Any
}
object ValidationAcceptor {
  
  inline def apply(
    accept: ValidationIssue => Any,
    acceptUnique: ValidationIssue => Any,
    begin: () => Any,
    end: () => Any
  ): ValidationAcceptor = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), acceptUnique = js.Any.fromFunction1(acceptUnique), begin = js.Any.fromFunction0(begin), end = js.Any.fromFunction0(end))
    __obj.asInstanceOf[ValidationAcceptor]
  }
  
  extension [Self <: ValidationAcceptor](x: Self) {
    
    inline def setAccept(value: ValidationIssue => Any): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
    
    inline def setAcceptUnique(value: ValidationIssue => Any): Self = StObject.set(x, "acceptUnique", js.Any.fromFunction1(value))
    
    inline def setBegin(value: () => Any): Self = StObject.set(x, "begin", js.Any.fromFunction0(value))
    
    inline def setEnd(value: () => Any): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
  }
}
