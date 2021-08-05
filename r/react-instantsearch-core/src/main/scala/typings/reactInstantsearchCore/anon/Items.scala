package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items extends StObject {
  
  var currentRefinement: js.Array[String]
  
  var items: js.Array[Label]
}
object Items {
  
  inline def apply(currentRefinement: js.Array[String], items: js.Array[Label]): Items = {
    val __obj = js.Dynamic.literal(currentRefinement = currentRefinement.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  
  extension [Self <: Items](x: Self) {
    
    inline def setCurrentRefinement(value: js.Array[String]): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    inline def setCurrentRefinementVarargs(value: String*): Self = StObject.set(x, "currentRefinement", js.Array(value :_*))
    
    inline def setItems(value: js.Array[Label]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Label*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
