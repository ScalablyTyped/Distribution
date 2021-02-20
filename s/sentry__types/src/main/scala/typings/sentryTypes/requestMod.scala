package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @js.native
  trait Request extends StObject {
    
    var cookies: js.UndefOr[StringDictionary[String]] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var env: js.UndefOr[StringDictionary[String]] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var query_string: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Request {
    
    @scala.inline
    def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookies(value: StringDictionary[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setQuery_string(value: String): Self = StObject.set(x, "query_string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery_stringUndefined: Self = StObject.set(x, "query_string", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait SentryRequest extends StObject {
    
    var body: String = js.native
    
    var `type`: SentryRequestType = js.native
    
    var url: String = js.native
  }
  object SentryRequest {
    
    @scala.inline
    def apply(body: String, `type`: SentryRequestType, url: String): SentryRequest = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentryRequest]
    }
    
    @scala.inline
    implicit class SentryRequestMutableBuilder[Self <: SentryRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: SentryRequestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.sentryTypesStrings.event
    - typings.sentryTypes.sentryTypesStrings.transaction
    - typings.sentryTypes.sentryTypesStrings.session
  */
  trait SentryRequestType extends StObject
  object SentryRequestType {
    
    @scala.inline
    def event: typings.sentryTypes.sentryTypesStrings.event = "event".asInstanceOf[typings.sentryTypes.sentryTypesStrings.event]
    
    @scala.inline
    def session: typings.sentryTypes.sentryTypesStrings.session = "session".asInstanceOf[typings.sentryTypes.sentryTypesStrings.session]
    
    @scala.inline
    def transaction: typings.sentryTypes.sentryTypesStrings.transaction = "transaction".asInstanceOf[typings.sentryTypes.sentryTypesStrings.transaction]
  }
}
