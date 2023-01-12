package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Is extends StObject {
  
  var baseUriParameters: Domain
  
  var description: Domain
  
  var displayName: Domain
  
  var is: Domain
  
  var methods: Domain
  
  var name: Domain
  
  var parametrizedProperties: NameString
  
  var securedBy: Domain
  
  var `type`: Domain
  
  var uriParameters: Domain
  
  var usage: Domain
}
object Is {
  
  inline def apply(
    baseUriParameters: Domain,
    description: Domain,
    displayName: Domain,
    is: Domain,
    methods: Domain,
    name: Domain,
    parametrizedProperties: NameString,
    securedBy: Domain,
    `type`: Domain,
    uriParameters: Domain,
    usage: Domain
  ): Is = {
    val __obj = js.Dynamic.literal(baseUriParameters = baseUriParameters.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parametrizedProperties = parametrizedProperties.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any], uriParameters = uriParameters.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Is]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Is] (val x: Self) extends AnyVal {
    
    inline def setBaseUriParameters(value: Domain): Self = StObject.set(x, "baseUriParameters", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Domain): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: Domain): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIs(value: Domain): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setMethods(value: Domain): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setName(value: Domain): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParametrizedProperties(value: NameString): Self = StObject.set(x, "parametrizedProperties", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: Domain): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
    
    inline def setType(value: Domain): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUriParameters(value: Domain): Self = StObject.set(x, "uriParameters", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: Domain): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
  }
}
