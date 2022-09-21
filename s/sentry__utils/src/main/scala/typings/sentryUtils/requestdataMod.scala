package typings.sentryUtils

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.miscMod.ExtractedNodeRequestData
import typings.sentryTypes.transactionMod.Transaction
import typings.sentryTypes.transactionMod.TransactionSource
import typings.sentryUtils.anon.Cookie
import typings.sentryUtils.anon.CustomRoute
import typings.sentryUtils.anon.Deps
import typings.sentryUtils.anon.Encrypted
import typings.sentryUtils.anon.Ip
import typings.sentryUtils.anon.Parse
import typings.sentryUtils.anon.Path
import typings.sentryUtils.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestdataMod {
  
  @JSImport("@sentry/utils/types/requestdata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addRequestDataToEvent(event: Event, req: CrossPlatformRequest): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToEvent")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def addRequestDataToEvent(event: Event, req: CrossPlatformRequest, options: AddRequestDataToEventOptions): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToEvent")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def addRequestDataToTransaction(transaction: Unit, req: CrossPlatformRequest): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToTransaction")(transaction.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addRequestDataToTransaction(transaction: Unit, req: CrossPlatformRequest, deps: InjectedNodeDeps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToTransaction")(transaction.asInstanceOf[js.Any], req.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addRequestDataToTransaction(transaction: Transaction, req: CrossPlatformRequest): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToTransaction")(transaction.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addRequestDataToTransaction(transaction: Transaction, req: CrossPlatformRequest, deps: InjectedNodeDeps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToTransaction")(transaction.asInstanceOf[js.Any], req.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extractPathForTransaction(req: CrossPlatformRequest): js.Tuple2[String, TransactionSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractPathForTransaction")(req.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, TransactionSource]]
  inline def extractPathForTransaction(req: CrossPlatformRequest, options: CustomRoute): js.Tuple2[String, TransactionSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractPathForTransaction")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, TransactionSource]]
  
  inline def extractRequestData(req: CrossPlatformRequest): ExtractedNodeRequestData = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any]).asInstanceOf[ExtractedNodeRequestData]
  inline def extractRequestData(req: CrossPlatformRequest, options: Deps): ExtractedNodeRequestData = (^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtractedNodeRequestData]
  
  trait AddRequestDataToEventOptions extends StObject {
    
    /** Injected platform-specific dependencies */
    var deps: js.UndefOr[Cookie] = js.undefined
    
    /** Flags controlling whether each type of data should be added to the event */
    var include: js.UndefOr[Ip] = js.undefined
  }
  object AddRequestDataToEventOptions {
    
    inline def apply(): AddRequestDataToEventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddRequestDataToEventOptions]
    }
    
    extension [Self <: AddRequestDataToEventOptions](x: Self) {
      
      inline def setDeps(value: Cookie): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
      
      inline def setInclude(value: Ip): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    }
  }
  
  trait BaseRequest extends StObject {
    
    var method: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object BaseRequest {
    
    inline def apply(): BaseRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseRequest]
    }
    
    extension [Self <: BaseRequest](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type BrowserRequest = BaseRequest
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sentryUtils.requestdataMod.BaseRequest because Already inherited
  - typings.sentryUtils.requestdataMod.NodeRequest because Already inherited
  - typings.sentryUtils.requestdataMod.NextjsRequest because var conflicts: headers, method, protocol, query, socket, url. Inlined cookies
  - typings.sentryUtils.requestdataMod.KoaRequest because var conflicts: headers, host, hostname, ip, method, originalUrl, protocol, socket, url. Inlined  */ trait CrossPlatformRequest
    extends StObject
       with ExpressRequest {
    
    var cookies: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object CrossPlatformRequest {
    
    inline def apply(): CrossPlatformRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossPlatformRequest]
    }
    
    extension [Self <: CrossPlatformRequest](x: Self) {
      
      inline def setCookies(value: StringDictionary[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    }
  }
  
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
    
    extension [Self <: ExpressRequest](x: Self) {
      
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
  
  trait InjectedNodeDeps extends StObject {
    
    var cookie: Parse
    
    var url: `0`
  }
  object InjectedNodeDeps {
    
    inline def apply(cookie: Parse, url: `0`): InjectedNodeDeps = {
      val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedNodeDeps]
    }
    
    extension [Self <: InjectedNodeDeps](x: Self) {
      
      inline def setCookie(value: Parse): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: `0`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
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
    
    extension [Self <: KoaRequest](x: Self) {
      
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
    
    extension [Self <: NextjsRequest](x: Self) {
      
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
    
    extension [Self <: NodeRequest](x: Self) {
      
      inline def setHeaders(value: StringDictionary[js.UndefOr[String | js.Array[String]]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setSocket(value: Encrypted): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryUtils.sentryUtilsStrings.path
    - typings.sentryUtils.sentryUtilsStrings.methodPath
    - typings.sentryUtils.sentryUtilsStrings.handler
  */
  trait TransactionNamingScheme extends StObject
  object TransactionNamingScheme {
    
    inline def handler: typings.sentryUtils.sentryUtilsStrings.handler = "handler".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.handler]
    
    inline def methodPath: typings.sentryUtils.sentryUtilsStrings.methodPath = "methodPath".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.methodPath]
    
    inline def path: typings.sentryUtils.sentryUtilsStrings.path = "path".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.path]
  }
}
