package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscMod {
  
  trait ExtractedNodeRequestData
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    /** String representing the cookies sent along with the request */
    var cookies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** Any data sent in the request's body, as a JSON string */
    var data: js.UndefOr[String] = js.undefined
    
    /** Specific headers from the request */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**  The request's method */
    var method: js.UndefOr[String] = js.undefined
    
    /** The request's query string, without the leading '?' */
    var query_string: js.UndefOr[String] = js.undefined
    
    /** The request's URL, including query string */
    var url: js.UndefOr[String] = js.undefined
  }
  object ExtractedNodeRequestData {
    
    inline def apply(): ExtractedNodeRequestData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtractedNodeRequestData]
    }
    
    extension [Self <: ExtractedNodeRequestData](x: Self) {
      
      inline def setCookies(value: StringDictionary[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
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
  
  trait WorkerLocation extends StObject {
    
    /** The fragment identifier of the URL of the script executed in the Worker, beginning with a '#'. */
    val hash: String
    
    /** The host, that is the hostname, a ':', and the port of the URL of the script executed in the Worker. */
    val host: String
    
    /** The domain of the URL of the script executed in the Worker. */
    val hostname: String
    
    /** Stringifier that returns the whole URL of the script executed in the Worker. */
    val href: String
    
    /** The canonical form of the origin of the specific location. */
    val origin: String
    
    /** The path of the URL of the script executed in the Worker, beginning with a '/'. */
    val pathname: String
    
    /** The port number of the URL of the script executed in the Worker. */
    val port: String
    
    /** The protocol scheme of the URL of the script executed in the Worker, including the final ':'. */
    val protocol: String
    
    /** The parameters (query string) of the URL of the script executed in the Worker, beginning with a '?'. */
    val search: String
  }
  object WorkerLocation {
    
    inline def apply(
      hash: String,
      host: String,
      hostname: String,
      href: String,
      origin: String,
      pathname: String,
      port: String,
      protocol: String,
      search: String
    ): WorkerLocation = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerLocation]
    }
    
    extension [Self <: WorkerLocation](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
}
