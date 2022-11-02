package typings.redisGraph.anon

import typings.redisGraph.distCommandsQueryMod.Metadata
import typings.redisGraph.distCommandsQueryMod.QueryReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers
  extends StObject
     with QueryReply {
  
  var data: typings.redisGraph.distCommandsQueryMod.Data
  
  var headers: typings.redisGraph.distCommandsQueryMod.Headers
  
  var metadata: Metadata
}
object Headers {
  
  inline def apply(
    data: typings.redisGraph.distCommandsQueryMod.Data,
    headers: typings.redisGraph.distCommandsQueryMod.Headers,
    metadata: Metadata
  ): Headers = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  
  extension [Self <: Headers](x: Self) {
    
    inline def setData(value: typings.redisGraph.distCommandsQueryMod.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.redisGraph.distCommandsQueryMod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataVarargs(value: String*): Self = StObject.set(x, "metadata", js.Array(value*))
  }
}
