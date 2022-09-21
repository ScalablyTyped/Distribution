package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchMatchCombinations...
  */
trait ISearchMatchCombinations extends StObject {
  
  /**
    * Array of search combinations.
    */
  var qSearchMatchCombinations: js.Array[ISerachMatchCombination]
}
object ISearchMatchCombinations {
  
  inline def apply(qSearchMatchCombinations: js.Array[ISerachMatchCombination]): ISearchMatchCombinations = {
    val __obj = js.Dynamic.literal(qSearchMatchCombinations = qSearchMatchCombinations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchMatchCombinations]
  }
  
  extension [Self <: ISearchMatchCombinations](x: Self) {
    
    inline def setQSearchMatchCombinations(value: js.Array[ISerachMatchCombination]): Self = StObject.set(x, "qSearchMatchCombinations", value.asInstanceOf[js.Any])
    
    inline def setQSearchMatchCombinationsVarargs(value: ISerachMatchCombination*): Self = StObject.set(x, "qSearchMatchCombinations", js.Array(value*))
  }
}
