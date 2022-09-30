package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.`no-change`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectElementNoChange
  extends StObject
     with InspectedElementPayload {
  
  var id: Double
  
  var responseID: Double
  
  var `type`: `no-change`
}
object InspectElementNoChange {
  
  inline def apply(id: Double, responseID: Double): InspectElementNoChange = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], responseID = responseID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("no-change")
    __obj.asInstanceOf[InspectElementNoChange]
  }
  
  extension [Self <: InspectElementNoChange](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResponseID(value: Double): Self = StObject.set(x, "responseID", value.asInstanceOf[js.Any])
    
    inline def setType(value: `no-change`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
