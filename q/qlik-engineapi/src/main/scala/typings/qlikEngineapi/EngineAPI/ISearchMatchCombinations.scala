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
  
  @scala.inline
  def apply(qSearchMatchCombinations: js.Array[ISerachMatchCombination]): ISearchMatchCombinations = {
    val __obj = js.Dynamic.literal(qSearchMatchCombinations = qSearchMatchCombinations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchMatchCombinations]
  }
  
  @scala.inline
  implicit class ISearchMatchCombinationsMutableBuilder[Self <: ISearchMatchCombinations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQSearchMatchCombinations(value: js.Array[ISerachMatchCombination]): Self = StObject.set(x, "qSearchMatchCombinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSearchMatchCombinationsVarargs(value: ISerachMatchCombination*): Self = StObject.set(x, "qSearchMatchCombinations", js.Array(value :_*))
  }
}
