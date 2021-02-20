package typings.roads

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CacheMaxAge extends StObject {
    
    var cacheMaxAge: js.UndefOr[Double] = js.native
    
    var requestHeaders: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var responseHeaders: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var supportsCredentials: js.UndefOr[Boolean] = js.native
    
    var validMethods: js.UndefOr[js.Array[String]] = js.native
    
    var validOrigins: js.UndefOr[js.Array[String]] = js.native
  }
  object CacheMaxAge {
    
    @scala.inline
    def apply(): CacheMaxAge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheMaxAge]
    }
    
    @scala.inline
    implicit class CacheMaxAgeMutableBuilder[Self <: CacheMaxAge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheMaxAge(value: Double): Self = StObject.set(x, "cacheMaxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheMaxAgeUndefined: Self = StObject.set(x, "cacheMaxAge", js.undefined)
      
      @scala.inline
      def setRequestHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      @scala.inline
      def setResponseHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
      
      @scala.inline
      def setSupportsCredentials(value: Boolean): Self = StObject.set(x, "supportsCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsCredentialsUndefined: Self = StObject.set(x, "supportsCredentials", js.undefined)
      
      @scala.inline
      def setValidMethods(value: js.Array[String]): Self = StObject.set(x, "validMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidMethodsUndefined: Self = StObject.set(x, "validMethods", js.undefined)
      
      @scala.inline
      def setValidMethodsVarargs(value: String*): Self = StObject.set(x, "validMethods", js.Array(value :_*))
      
      @scala.inline
      def setValidOrigins(value: js.Array[String]): Self = StObject.set(x, "validOrigins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidOriginsUndefined: Self = StObject.set(x, "validOrigins", js.undefined)
      
      @scala.inline
      def setValidOriginsVarargs(value: String*): Self = StObject.set(x, "validOrigins", js.Array(value :_*))
    }
  }
}
