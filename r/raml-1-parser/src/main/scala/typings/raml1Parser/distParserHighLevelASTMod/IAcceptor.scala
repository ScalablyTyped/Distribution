package typings.raml1Parser.distParserHighLevelASTMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAcceptor[T] extends StObject {
  
  def acceptProposal(c: T): Any
  
  def calculationComplete(): Any
  
  def calculationStarts(): Any
}
object IAcceptor {
  
  inline def apply[T](acceptProposal: T => Any, calculationComplete: () => Any, calculationStarts: () => Any): IAcceptor[T] = {
    val __obj = js.Dynamic.literal(acceptProposal = js.Any.fromFunction1(acceptProposal), calculationComplete = js.Any.fromFunction0(calculationComplete), calculationStarts = js.Any.fromFunction0(calculationStarts))
    __obj.asInstanceOf[IAcceptor[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAcceptor[?], T] (val x: Self & IAcceptor[T]) extends AnyVal {
    
    inline def setAcceptProposal(value: T => Any): Self = StObject.set(x, "acceptProposal", js.Any.fromFunction1(value))
    
    inline def setCalculationComplete(value: () => Any): Self = StObject.set(x, "calculationComplete", js.Any.fromFunction0(value))
    
    inline def setCalculationStarts(value: () => Any): Self = StObject.set(x, "calculationStarts", js.Any.fromFunction0(value))
  }
}
