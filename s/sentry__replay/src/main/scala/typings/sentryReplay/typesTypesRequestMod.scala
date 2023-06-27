package typings.sentryReplay

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTypesRequestMod {
  
  type JsonArray = js.Array[Any]
  
  type JsonObject = Record[String, Any]
  
  type NetworkBody = JsonObject | JsonArray | String
  
  trait NetworkMeta extends StObject {
    
    var warnings: js.UndefOr[js.Array[NetworkMetaWarning]] = js.undefined
  }
  object NetworkMeta {
    
    inline def apply(): NetworkMeta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkMeta] (val x: Self) extends AnyVal {
      
      inline def setWarnings(value: js.Array[NetworkMetaWarning]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      inline def setWarningsVarargs(value: NetworkMetaWarning*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryReplay.sentryReplayStrings.JSON_TRUNCATED
    - typings.sentryReplay.sentryReplayStrings.TEXT_TRUNCATED
    - typings.sentryReplay.sentryReplayStrings.INVALID_JSON
    - typings.sentryReplay.sentryReplayStrings.URL_SKIPPED
  */
  trait NetworkMetaWarning extends StObject
  object NetworkMetaWarning {
    
    inline def INVALID_JSON: typings.sentryReplay.sentryReplayStrings.INVALID_JSON = "INVALID_JSON".asInstanceOf[typings.sentryReplay.sentryReplayStrings.INVALID_JSON]
    
    inline def JSON_TRUNCATED: typings.sentryReplay.sentryReplayStrings.JSON_TRUNCATED = "JSON_TRUNCATED".asInstanceOf[typings.sentryReplay.sentryReplayStrings.JSON_TRUNCATED]
    
    inline def TEXT_TRUNCATED: typings.sentryReplay.sentryReplayStrings.TEXT_TRUNCATED = "TEXT_TRUNCATED".asInstanceOf[typings.sentryReplay.sentryReplayStrings.TEXT_TRUNCATED]
    
    inline def URL_SKIPPED: typings.sentryReplay.sentryReplayStrings.URL_SKIPPED = "URL_SKIPPED".asInstanceOf[typings.sentryReplay.sentryReplayStrings.URL_SKIPPED]
  }
  
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
}
