package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativeUri extends StObject {
  
  var annotations: NameString
  
  var description: NameString
  
  var displayName: NameString
  
  var is: NameString
  
  var methods: NameString
  
  var relativeUri: NameString
  
  var resources: NameString
  
  var securedBy: NameString
  
  var `type`: NameString
  
  var uriParameters: NameString
}
object RelativeUri {
  
  inline def apply(
    annotations: NameString,
    description: NameString,
    displayName: NameString,
    is: NameString,
    methods: NameString,
    relativeUri: NameString,
    resources: NameString,
    securedBy: NameString,
    `type`: NameString,
    uriParameters: NameString
  ): RelativeUri = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], relativeUri = relativeUri.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any], uriParameters = uriParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeUri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelativeUri] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NameString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: NameString): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIs(value: NameString): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setMethods(value: NameString): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setRelativeUri(value: NameString): Self = StObject.set(x, "relativeUri", value.asInstanceOf[js.Any])
    
    inline def setResources(value: NameString): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: NameString): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
    
    inline def setType(value: NameString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUriParameters(value: NameString): Self = StObject.set(x, "uriParameters", value.asInstanceOf[js.Any])
  }
}
