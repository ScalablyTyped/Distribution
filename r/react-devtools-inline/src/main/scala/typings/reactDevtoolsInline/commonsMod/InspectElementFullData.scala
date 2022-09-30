package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.`full-data`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectElementFullData
  extends StObject
     with InspectedElementPayload {
  
  var id: Double
  
  var responseID: Double
  
  var `type`: `full-data`
  
  var value: InspectedElement
}
object InspectElementFullData {
  
  inline def apply(id: Double, responseID: Double, value: InspectedElement): InspectElementFullData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], responseID = responseID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("full-data")
    __obj.asInstanceOf[InspectElementFullData]
  }
  
  extension [Self <: InspectElementFullData](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResponseID(value: Double): Self = StObject.set(x, "responseID", value.asInstanceOf[js.Any])
    
    inline def setType(value: `full-data`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: InspectedElement): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
