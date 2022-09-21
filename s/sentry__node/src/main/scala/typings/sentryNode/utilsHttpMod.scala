package typings.sentryNode

import typings.node.httpMod.ClientRequest
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.URL_
import typings.sentryNode.anon.Typeofhttp
import typings.sentryNode.anon.Typeofhttps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsHttpMod {
  
  @JSImport("@sentry/node/types/integrations/utils/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanSpanDescription(description: String, requestOptions: RequestOptions, request: ClientRequest): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanSpanDescription")(description.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def cleanSpanDescription(description: Unit, requestOptions: RequestOptions, request: ClientRequest): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanSpanDescription")(description.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def extractUrl(requestOptions: RequestOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractUrl")(requestOptions.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isSentryRequest(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSentryRequest")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeRequestArgs(httpModule: Typeofhttp, requestArgs: RequestMethodArgs): js.Array[RequestOptions] | (js.Tuple2[RequestOptions, RequestCallback]) = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRequestArgs")(httpModule.asInstanceOf[js.Any], requestArgs.asInstanceOf[js.Any])).asInstanceOf[js.Array[RequestOptions] | (js.Tuple2[RequestOptions, RequestCallback])]
  inline def normalizeRequestArgs(httpModule: Typeofhttps, requestArgs: RequestMethodArgs): js.Array[RequestOptions] | (js.Tuple2[RequestOptions, RequestCallback]) = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRequestArgs")(httpModule.asInstanceOf[js.Any], requestArgs.asInstanceOf[js.Any])).asInstanceOf[js.Array[RequestOptions] | (js.Tuple2[RequestOptions, RequestCallback])]
  
  inline def urlToOptions(url: URL_): RequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("urlToOptions")(url.asInstanceOf[js.Any]).asInstanceOf[RequestOptions]
  
  type RequestCallback = js.Function1[/* response */ IncomingMessage, Unit]
  
  type RequestMethod = js.Function1[/* args */ RequestMethodArgs, ClientRequest]
  
  type RequestMethodArgs = (js.Tuple2[RequestOptions | String | URL_, js.UndefOr[RequestCallback]]) | (js.Tuple3[String | URL_, RequestOptions, js.UndefOr[RequestCallback]])
  
  trait RequestOptions
    extends StObject
       with ClientRequestArgs {
    
    var hash: js.UndefOr[String] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    }
  }
}
