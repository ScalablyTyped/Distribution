package typings.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparqlGenerator extends StObject {
  
  def createGenerator(): js.Any
  
  def stringify(query: SparqlQuery): String
}
object SparqlGenerator {
  
  inline def apply(createGenerator: () => js.Any, stringify: SparqlQuery => String): SparqlGenerator = {
    val __obj = js.Dynamic.literal(createGenerator = js.Any.fromFunction0(createGenerator), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[SparqlGenerator]
  }
  
  extension [Self <: SparqlGenerator](x: Self) {
    
    inline def setCreateGenerator(value: () => js.Any): Self = StObject.set(x, "createGenerator", js.Any.fromFunction0(value))
    
    inline def setStringify(value: SparqlQuery => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
  }
}
