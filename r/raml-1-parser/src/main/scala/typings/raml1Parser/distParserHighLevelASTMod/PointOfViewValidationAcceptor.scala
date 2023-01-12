package typings.raml1Parser.distParserHighLevelASTMod

import typings.raml1Parser.distParserLowLevelASTMod.ICompilationUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointOfViewValidationAcceptor
  extends StObject
     with ValidationAcceptor {
  
  def getPrimaryUnit(): ICompilationUnit
}
object PointOfViewValidationAcceptor {
  
  inline def apply(
    accept: ValidationIssue => Any,
    acceptUnique: ValidationIssue => Any,
    begin: () => Any,
    end: () => Any,
    getPrimaryUnit: () => ICompilationUnit
  ): PointOfViewValidationAcceptor = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), acceptUnique = js.Any.fromFunction1(acceptUnique), begin = js.Any.fromFunction0(begin), end = js.Any.fromFunction0(end), getPrimaryUnit = js.Any.fromFunction0(getPrimaryUnit))
    __obj.asInstanceOf[PointOfViewValidationAcceptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointOfViewValidationAcceptor] (val x: Self) extends AnyVal {
    
    inline def setGetPrimaryUnit(value: () => ICompilationUnit): Self = StObject.set(x, "getPrimaryUnit", js.Any.fromFunction0(value))
  }
}
