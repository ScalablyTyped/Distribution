package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var body: Domain
  
  var code: Domain
  
  var description: Domain
  
  var headers: Domain
  
  var parametrizedProperties: NameString
}
object Body {
  
  inline def apply(
    body: Domain,
    code: Domain,
    description: Domain,
    headers: Domain,
    parametrizedProperties: NameString
  ): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], parametrizedProperties = parametrizedProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Domain): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Domain): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Domain): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Domain): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setParametrizedProperties(value: NameString): Self = StObject.set(x, "parametrizedProperties", value.asInstanceOf[js.Any])
  }
}
