package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDepGraphResponse extends StObject {
  
  var data: Data
  
  var jsonapi: JsonApi
  
  var links: Links
}
object GetDepGraphResponse {
  
  inline def apply(data: Data, jsonapi: JsonApi, links: Links): GetDepGraphResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jsonapi = jsonapi.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDepGraphResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDepGraphResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setJsonapi(value: JsonApi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Links): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
  }
}
