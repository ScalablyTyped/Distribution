package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribedBy extends StObject {
  
  var describedBy: Domain
  
  var description: Domain
  
  var name: Domain
  
  var settings: Domain
  
  var `type`: Domain
}
object DescribedBy {
  
  inline def apply(describedBy: Domain, description: Domain, name: Domain, settings: Domain, `type`: Domain): DescribedBy = {
    val __obj = js.Dynamic.literal(describedBy = describedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedBy]
  }
  
  extension [Self <: DescribedBy](x: Self) {
    
    inline def setDescribedBy(value: Domain): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Domain): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: Domain): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Domain): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setType(value: Domain): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
