package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.InsightsClientPayload> */
trait PartialInsightsClientPayl extends StObject {
  
  var eventName: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[String] = js.undefined
  
  var objectIDs: js.UndefOr[js.Array[String]] = js.undefined
  
  var positions: js.UndefOr[js.Array[Double]] = js.undefined
  
  var queryID: js.UndefOr[String] = js.undefined
}
object PartialInsightsClientPayl {
  
  inline def apply(): PartialInsightsClientPayl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInsightsClientPayl]
  }
  
  extension [Self <: PartialInsightsClientPayl](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setObjectIDs(value: js.Array[String]): Self = StObject.set(x, "objectIDs", value.asInstanceOf[js.Any])
    
    inline def setObjectIDsUndefined: Self = StObject.set(x, "objectIDs", js.undefined)
    
    inline def setObjectIDsVarargs(value: String*): Self = StObject.set(x, "objectIDs", js.Array(value*))
    
    inline def setPositions(value: js.Array[Double]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    
    inline def setPositionsVarargs(value: Double*): Self = StObject.set(x, "positions", js.Array(value*))
    
    inline def setQueryID(value: String): Self = StObject.set(x, "queryID", value.asInstanceOf[js.Any])
    
    inline def setQueryIDUndefined: Self = StObject.set(x, "queryID", js.undefined)
  }
}
