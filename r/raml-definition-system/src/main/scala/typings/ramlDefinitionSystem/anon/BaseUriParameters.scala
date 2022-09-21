package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseUriParameters extends StObject {
  
  var baseUriParameters: Domain
  
  var description: Domain
  
  var displayName: Domain
  
  var is: Domain
  
  var methods: Domain
  
  var relativeUri: Domain
  
  var resources: Domain
  
  var securedBy: Domain
  
  var `type`: Domain
  
  var uriParameters: Domain
}
object BaseUriParameters {
  
  inline def apply(
    baseUriParameters: Domain,
    description: Domain,
    displayName: Domain,
    is: Domain,
    methods: Domain,
    relativeUri: Domain,
    resources: Domain,
    securedBy: Domain,
    `type`: Domain,
    uriParameters: Domain
  ): BaseUriParameters = {
    val __obj = js.Dynamic.literal(baseUriParameters = baseUriParameters.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], relativeUri = relativeUri.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any], uriParameters = uriParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUriParameters]
  }
  
  extension [Self <: BaseUriParameters](x: Self) {
    
    inline def setBaseUriParameters(value: Domain): Self = StObject.set(x, "baseUriParameters", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Domain): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: Domain): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIs(value: Domain): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setMethods(value: Domain): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setRelativeUri(value: Domain): Self = StObject.set(x, "relativeUri", value.asInstanceOf[js.Any])
    
    inline def setResources(value: Domain): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: Domain): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
    
    inline def setType(value: Domain): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUriParameters(value: Domain): Self = StObject.set(x, "uriParameters", value.asInstanceOf[js.Any])
  }
}
