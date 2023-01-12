package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var annotations: NameString
  
  var body: NameString
  
  var code: NameString
  
  var description: NameString
  
  var headers: NameString
  
  var parametrizedProperties: Domain
}
object Code {
  
  inline def apply(
    annotations: NameString,
    body: NameString,
    code: NameString,
    description: NameString,
    headers: NameString,
    parametrizedProperties: Domain
  ): Code = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], parametrizedProperties = parametrizedProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setBody(value: NameString): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCode(value: NameString): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NameString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: NameString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setParametrizedProperties(value: Domain): Self = StObject.set(x, "parametrizedProperties", value.asInstanceOf[js.Any])
  }
}
