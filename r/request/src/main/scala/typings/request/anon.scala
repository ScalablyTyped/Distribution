package typings.request

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.Agent
import typings.node.querystringMod.ParsedUrlQuery
import typings.request.mod.MultipartBody
import typings.request.mod.NameValuePair
import typings.request.mod.PoolOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var body: MultipartBody
    
    var `content-type`: js.UndefOr[String] = js.undefined
  }
  object Body {
    
    inline def apply(body: MultipartBody): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: MultipartBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def `setContent-type`(value: String): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
      
      inline def `setContent-typeUndefined`: Self = StObject.set(x, "content-type", js.undefined)
    }
  }
  
  trait Connect extends StObject {
    
    var connect: Double
    
    var end: Double
    
    var lookup: Double
    
    var response: Double
    
    var socket: Double
  }
  object Connect {
    
    inline def apply(connect: Double, end: Double, lookup: Double, response: Double, socket: Double): Connect = {
      val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connect]
    }
    
    extension [Self <: Connect](x: Self) {
      
      inline def setConnect(value: Double): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setLookup(value: Double): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Double): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setSocket(value: Double): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dns extends StObject {
    
    var dns: Double
    
    var download: Double
    
    var firstByte: Double
    
    var tcp: Double
    
    var total: Double
    
    @JSName("wait")
    var wait_FDns: Double
  }
  object Dns {
    
    inline def apply(dns: Double, download: Double, firstByte: Double, tcp: Double, total: Double, wait_ : Double): Dns = {
      val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], firstByte = firstByte.asInstanceOf[js.Any], tcp = tcp.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dns]
    }
    
    extension [Self <: Dns](x: Self) {
      
      inline def setDns(value: Double): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
      
      inline def setDownload(value: Double): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setFirstByte(value: Double): Self = StObject.set(x, "firstByte", value.asInstanceOf[js.Any])
      
      inline def setTcp(value: Double): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    }
  }
  
  trait MimeType extends StObject {
    
    var mimeType: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[js.Array[NameValuePair]] = js.undefined
  }
  object MimeType {
    
    inline def apply(): MimeType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MimeType]
    }
    
    extension [Self <: MimeType](x: Self) {
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setParams(value: js.Array[NameValuePair]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: NameValuePair*): Self = StObject.set(x, "params", js.Array(value*))
    }
  }
  
  /* Inlined node.url.Url & {  href :string,   pathname :string} */
  trait Urlhrefstringpathnamestri extends StObject {
    
    var auth: String | Null
    
    var hash: String | Null
    
    var host: String | Null
    
    var hostname: String | Null
    
    var href: String
    
    var path: String | Null
    
    var pathname: String | Null
    
    var port: String | Null
    
    var protocol: String | Null
    
    var query: String | Null | ParsedUrlQuery
    
    var search: String | Null
    
    var slashes: Boolean | Null
  }
  object Urlhrefstringpathnamestri {
    
    inline def apply(href: String): Urlhrefstringpathnamestri = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], auth = null, hash = null, host = null, hostname = null, path = null, pathname = null, port = null, protocol = null, query = null, search = null, slashes = null)
      __obj.asInstanceOf[Urlhrefstringpathnamestri]
    }
    
    extension [Self <: Urlhrefstringpathnamestri](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashNull: Self = StObject.set(x, "hash", null)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameNull: Self = StObject.set(x, "pathname", null)
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      inline def setQuery(value: String | ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchNull: Self = StObject.set(x, "search", null)
      
      inline def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      inline def setSlashesNull: Self = StObject.set(x, "slashes", null)
    }
  }
  
  /* Inlined {[key: string] : node.http.Agent | node.https.Agent} & request.request.ExtraPoolOptions */
  trait keystringAgentAgentExtraP
    extends StObject
       with /* key */ StringDictionary[Agent | typings.node.httpsMod.Agent]
       with PoolOptions {
    
    var maxSockets: js.UndefOr[Double] = js.undefined
  }
  object keystringAgentAgentExtraP {
    
    inline def apply(): keystringAgentAgentExtraP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[keystringAgentAgentExtraP]
    }
    
    extension [Self <: keystringAgentAgentExtraP](x: Self) {
      
      inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
    }
  }
}
