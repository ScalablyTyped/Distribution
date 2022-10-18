package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDepGraphResponse extends StObject {
  
  var data: LocationResponse
  
  var jsonapi: JsonApi
  
  var links: Links
}
object CreateDepGraphResponse {
  
  inline def apply(data: LocationResponse, jsonapi: JsonApi, links: Links): CreateDepGraphResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jsonapi = jsonapi.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDepGraphResponse]
  }
  
  extension [Self <: CreateDepGraphResponse](x: Self) {
    
    inline def setData(value: LocationResponse): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setJsonapi(value: JsonApi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Links): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
  }
}
