package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.`hydrated-path`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectElementHydratedPath
  extends StObject
     with InspectedElementPayload {
  
  var id: Double
  
  var path: js.Array[String | Double]
  
  var responseID: Double
  
  var `type`: `hydrated-path`
  
  var value: Any
}
object InspectElementHydratedPath {
  
  inline def apply(id: Double, path: js.Array[String | Double], responseID: Double, value: Any): InspectElementHydratedPath = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], responseID = responseID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hydrated-path")
    __obj.asInstanceOf[InspectElementHydratedPath]
  }
  
  extension [Self <: InspectElementHydratedPath](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setResponseID(value: Double): Self = StObject.set(x, "responseID", value.asInstanceOf[js.Any])
    
    inline def setType(value: `hydrated-path`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
