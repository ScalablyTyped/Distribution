package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.anon.Encrypted
import typings.sentryTypes.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPolymorphicsMod {
  
  trait BaseRequest extends StObject {
    
    var method: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object BaseRequest {
    
    inline def apply(): BaseRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseRequest] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type BrowserRequest = BaseRequest
  
  trait ExpressRequest
    extends StObject
       with NodeRequest {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[String | StringDictionary[Any]] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var ip: js.UndefOr[String] = js.undefined
    
    var originalUrl: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var route: js.UndefOr[Path] = js.undefined
    
    var user: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object ExpressRequest {
    
    inline def apply(): ExpressRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpressRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpressRequest] (val x: Self) extends AnyVal {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setBody(value: String | StringDictionary[Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
      
      inline def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
      
      inline def setQuery(value: StringDictionary[Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRoute(value: Path): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      inline def setUser(value: StringDictionary[Any]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait KoaRequest
    extends StObject
       with NodeRequest {
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var ip: js.UndefOr[String] = js.undefined
    
    var originalUrl: js.UndefOr[String] = js.undefined
  }
  object KoaRequest {
    
    inline def apply(): KoaRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KoaRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KoaRequest] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
      
      inline def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
    }
  }
  
  trait NextjsRequest
    extends StObject
       with NodeRequest {
    
    var cookies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var query: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object NextjsRequest {
    
    inline def apply(): NextjsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NextjsRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NextjsRequest] (val x: Self) extends AnyVal {
      
      inline def setCookies(value: StringDictionary[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setQuery(value: StringDictionary[Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait NodeRequest
    extends StObject
       with BaseRequest {
    
    var headers: js.UndefOr[StringDictionary[js.UndefOr[String | js.Array[String]]]] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var socket: js.UndefOr[Encrypted] = js.undefined
  }
  object NodeRequest {
    
    inline def apply(): NodeRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeRequest] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: StringDictionary[js.UndefOr[String | js.Array[String]]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setSocket(value: Encrypted): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    }
  }
  
  trait PolymorphicEvent
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    val currentTarget: js.UndefOr[Any] = js.undefined
    
    val target: js.UndefOr[Any] = js.undefined
    
    val `type`: String
  }
  object PolymorphicEvent {
    
    inline def apply(`type`: String): PolymorphicEvent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolymorphicEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PolymorphicEvent] (val x: Self) extends AnyVal {
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sentryTypes.typesPolymorphicsMod.BaseRequest because Already inherited
  - typings.sentryTypes.typesPolymorphicsMod.NodeRequest because Already inherited
  - typings.sentryTypes.typesPolymorphicsMod.NextjsRequest because var conflicts: headers, method, protocol, query, socket, url. Inlined cookies
  - typings.sentryTypes.typesPolymorphicsMod.KoaRequest because var conflicts: headers, host, hostname, ip, method, originalUrl, protocol, socket, url. Inlined  */ trait PolymorphicRequest
    extends StObject
       with ExpressRequest {
    
    var cookies: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object PolymorphicRequest {
    
    inline def apply(): PolymorphicRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolymorphicRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PolymorphicRequest] (val x: Self) extends AnyVal {
      
      inline def setCookies(value: StringDictionary[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    }
  }
}
