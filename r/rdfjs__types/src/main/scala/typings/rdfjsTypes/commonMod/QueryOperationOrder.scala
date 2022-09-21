package typings.rdfjsTypes.commonMod

import typings.rdfjsTypes.anon.Direction
import typings.rdfjsTypes.dataModelMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOperationOrder[T /* <: QuadTermName | Variable */] extends StObject {
  
  var cost: QueryOperationCost
  
  var terms: js.Array[Direction[T]]
}
object QueryOperationOrder {
  
  inline def apply[T /* <: QuadTermName | Variable */](cost: QueryOperationCost, terms: js.Array[Direction[T]]): QueryOperationOrder[T] = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOperationOrder[T]]
  }
  
  extension [Self <: QueryOperationOrder[?], T /* <: QuadTermName | Variable */](x: Self & QueryOperationOrder[T]) {
    
    inline def setCost(value: QueryOperationCost): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setTerms(value: js.Array[Direction[T]]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsVarargs(value: Direction[T]*): Self = StObject.set(x, "terms", js.Array(value*))
  }
}
