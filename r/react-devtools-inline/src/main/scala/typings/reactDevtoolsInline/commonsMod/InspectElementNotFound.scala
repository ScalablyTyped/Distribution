package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.`not-found`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectElementNotFound
  extends StObject
     with InspectedElementPayload {
  
  var id: Double
  
  var responseID: Double
  
  var `type`: `not-found`
}
object InspectElementNotFound {
  
  inline def apply(id: Double, responseID: Double): InspectElementNotFound = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], responseID = responseID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("not-found")
    __obj.asInstanceOf[InspectElementNotFound]
  }
  
  extension [Self <: InspectElementNotFound](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResponseID(value: Double): Self = StObject.set(x, "responseID", value.asInstanceOf[js.Any])
    
    inline def setType(value: `not-found`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
