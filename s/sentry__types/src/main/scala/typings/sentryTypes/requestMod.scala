package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  trait Request extends StObject {
    
    var cookies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var env: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var query_string: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Request {
    
    inline def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setCookies(value: StringDictionary[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setQuery_string(value: String): Self = StObject.set(x, "query_string", value.asInstanceOf[js.Any])
      
      inline def setQuery_stringUndefined: Self = StObject.set(x, "query_string", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait SentryRequest extends StObject {
    
    var body: String
    
    var `type`: SentryRequestType
    
    var url: String
  }
  object SentryRequest {
    
    inline def apply(body: String, `type`: SentryRequestType, url: String): SentryRequest = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentryRequest]
    }
    
    extension [Self <: SentryRequest](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setType(value: SentryRequestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.sentryTypesStrings.event
    - typings.sentryTypes.sentryTypesStrings.transaction
    - typings.sentryTypes.sentryTypesStrings.session
  */
  trait SentryRequestType extends StObject
  object SentryRequestType {
    
    inline def event: typings.sentryTypes.sentryTypesStrings.event = "event".asInstanceOf[typings.sentryTypes.sentryTypesStrings.event]
    
    inline def session: typings.sentryTypes.sentryTypesStrings.session = "session".asInstanceOf[typings.sentryTypes.sentryTypesStrings.session]
    
    inline def transaction: typings.sentryTypes.sentryTypesStrings.transaction = "transaction".asInstanceOf[typings.sentryTypes.sentryTypesStrings.transaction]
  }
}
