package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationResponse extends StObject {
  
  var id: String
  
  var location: String
  
  var `type`: String
}
object LocationResponse {
  
  inline def apply(id: String, location: String, `type`: String): LocationResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationResponse]
  }
  
  extension [Self <: LocationResponse](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
