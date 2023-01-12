package typings.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Triple extends StObject {
  
  var `object`: Term
  
  var predicate: IriTerm | VariableTerm | PropertyPath
  
  var subject: IriTerm | BlankTerm | VariableTerm | QuadTerm
}
object Triple {
  
  inline def apply(
    `object`: Term,
    predicate: IriTerm | VariableTerm | PropertyPath,
    subject: IriTerm | BlankTerm | VariableTerm | QuadTerm
  ): Triple = {
    val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Triple]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Triple] (val x: Self) extends AnyVal {
    
    inline def setObject(value: Term): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPredicate(value: IriTerm | VariableTerm | PropertyPath): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: IriTerm | BlankTerm | VariableTerm | QuadTerm): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
