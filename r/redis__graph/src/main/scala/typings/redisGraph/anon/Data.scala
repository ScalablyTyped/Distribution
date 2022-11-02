package typings.redisGraph.anon

import typings.redisGraph.distCommandsQueryMod.Metadata
import typings.redisGraph.distCommandsQueryMod.QueryReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data
  extends StObject
     with QueryReply {
  
  var data: Unit
  
  var headers: Unit
  
  var metadata: Metadata
}
object Data {
  
  inline def apply(data: Unit, headers: Unit, metadata: Metadata): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: Unit): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Unit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataVarargs(value: String*): Self = StObject.set(x, "metadata", js.Array(value*))
  }
}
