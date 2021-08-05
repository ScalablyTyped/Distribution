package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchCharRange...
  */
trait ISearchCharRange extends StObject {
  
  /**
    * Length of the match in the search result.
    */
  var qCharCount: Double
  
  /**
    * Starting position of the match in the search result, starting from 0.
    */
  var qCharPos: Double
  
  /**
    * Position of the term in the list of search terms, starting from 0.
    */
  var qTerm: Double
}
object ISearchCharRange {
  
  inline def apply(qCharCount: Double, qCharPos: Double, qTerm: Double): ISearchCharRange = {
    val __obj = js.Dynamic.literal(qCharCount = qCharCount.asInstanceOf[js.Any], qCharPos = qCharPos.asInstanceOf[js.Any], qTerm = qTerm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchCharRange]
  }
  
  extension [Self <: ISearchCharRange](x: Self) {
    
    inline def setQCharCount(value: Double): Self = StObject.set(x, "qCharCount", value.asInstanceOf[js.Any])
    
    inline def setQCharPos(value: Double): Self = StObject.set(x, "qCharPos", value.asInstanceOf[js.Any])
    
    inline def setQTerm(value: Double): Self = StObject.set(x, "qTerm", value.asInstanceOf[js.Any])
  }
}
