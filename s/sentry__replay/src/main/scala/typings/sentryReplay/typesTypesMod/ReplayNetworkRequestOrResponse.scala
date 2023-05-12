package typings.sentryReplay.typesTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplayNetworkRequestOrResponse extends StObject {
  
  var _meta: js.UndefOr[NetworkMeta] = js.undefined
  
  var body: js.UndefOr[NetworkBody] = js.undefined
  
  var headers: Record[String, String]
  
  var size: js.UndefOr[Double] = js.undefined
}
object ReplayNetworkRequestOrResponse {
  
  inline def apply(headers: Record[String, String]): ReplayNetworkRequestOrResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplayNetworkRequestOrResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplayNetworkRequestOrResponse] (val x: Self) extends AnyVal {
    
    inline def setBody(value: NetworkBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setBodyVarargs(value: Any*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def set_meta(value: NetworkMeta): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
  }
}
