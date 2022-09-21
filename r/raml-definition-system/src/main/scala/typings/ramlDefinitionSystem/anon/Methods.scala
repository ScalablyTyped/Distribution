package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Methods extends StObject {
  
  var annotations: NameString
  
  var description: NameString
  
  var displayName: NameString
  
  var is: NameString
  
  var methods: NameString
  
  var name: NameString
  
  var parametrizedProperties: Domain
  
  var securedBy: NameString
  
  var `type`: NameString
  
  var uriParameters: NameString
  
  var usage: NameString
}
object Methods {
  
  inline def apply(
    annotations: NameString,
    description: NameString,
    displayName: NameString,
    is: NameString,
    methods: NameString,
    name: NameString,
    parametrizedProperties: Domain,
    securedBy: NameString,
    `type`: NameString,
    uriParameters: NameString,
    usage: NameString
  ): Methods = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parametrizedProperties = parametrizedProperties.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any], uriParameters = uriParameters.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Methods]
  }
  
  extension [Self <: Methods](x: Self) {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NameString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: NameString): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIs(value: NameString): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setMethods(value: NameString): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParametrizedProperties(value: Domain): Self = StObject.set(x, "parametrizedProperties", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: NameString): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
    
    inline def setType(value: NameString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUriParameters(value: NameString): Self = StObject.set(x, "uriParameters", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: NameString): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
  }
}
