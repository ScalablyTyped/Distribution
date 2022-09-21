package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuredBy extends StObject {
  
  var annotations: NameString
  
  var description: NameString
  
  var is: NameString
  
  var methods: NameString
  
  var securedBy: NameString
  
  var `type`: NameString
  
  var uriParameters: NameString
}
object SecuredBy {
  
  inline def apply(
    annotations: NameString,
    description: NameString,
    is: NameString,
    methods: NameString,
    securedBy: NameString,
    `type`: NameString,
    uriParameters: NameString
  ): SecuredBy = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any], uriParameters = uriParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuredBy]
  }
  
  extension [Self <: SecuredBy](x: Self) {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NameString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIs(value: NameString): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setMethods(value: NameString): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: NameString): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
    
    inline def setType(value: NameString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUriParameters(value: NameString): Self = StObject.set(x, "uriParameters", value.asInstanceOf[js.Any])
  }
}
