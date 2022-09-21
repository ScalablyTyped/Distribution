package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SerachMatchCombination...
  */
trait ISerachMatchCombination extends StObject {
  
  /**
    * Information about the search matches.
    */
  var qFieldMatches: js.Array[ISerachFieldMatch]
  
  /**
    * Index of the search result, starting from 0.
    */
  var qId: Double
}
object ISerachMatchCombination {
  
  inline def apply(qFieldMatches: js.Array[ISerachFieldMatch], qId: Double): ISerachMatchCombination = {
    val __obj = js.Dynamic.literal(qFieldMatches = qFieldMatches.asInstanceOf[js.Any], qId = qId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISerachMatchCombination]
  }
  
  extension [Self <: ISerachMatchCombination](x: Self) {
    
    inline def setQFieldMatches(value: js.Array[ISerachFieldMatch]): Self = StObject.set(x, "qFieldMatches", value.asInstanceOf[js.Any])
    
    inline def setQFieldMatchesVarargs(value: ISerachFieldMatch*): Self = StObject.set(x, "qFieldMatches", js.Array(value*))
    
    inline def setQId(value: Double): Self = StObject.set(x, "qId", value.asInstanceOf[js.Any])
  }
}
