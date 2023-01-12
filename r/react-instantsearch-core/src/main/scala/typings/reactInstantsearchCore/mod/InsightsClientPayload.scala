package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsClientPayload extends StObject {
  
  var eventName: String
  
  var index: String
  
  var objectIDs: js.Array[String]
  
  var positions: js.UndefOr[js.Array[Double]] = js.undefined
  
  var queryID: String
}
object InsightsClientPayload {
  
  inline def apply(eventName: String, index: String, objectIDs: js.Array[String], queryID: String): InsightsClientPayload = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], objectIDs = objectIDs.asInstanceOf[js.Any], queryID = queryID.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsClientPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsightsClientPayload] (val x: Self) extends AnyVal {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setObjectIDs(value: js.Array[String]): Self = StObject.set(x, "objectIDs", value.asInstanceOf[js.Any])
    
    inline def setObjectIDsVarargs(value: String*): Self = StObject.set(x, "objectIDs", js.Array(value*))
    
    inline def setPositions(value: js.Array[Double]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    
    inline def setPositionsVarargs(value: Double*): Self = StObject.set(x, "positions", js.Array(value*))
    
    inline def setQueryID(value: String): Self = StObject.set(x, "queryID", value.asInstanceOf[js.Any])
  }
}
