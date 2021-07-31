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
    
    @scala.inline
    def apply(body: MultipartBody): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: MultipartBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setContent-type`(value: String): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setContent-typeUndefined`: Self = StObject.set(x, "content-type", js.undefined)
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
    
    @scala.inline
    def apply(connect: Double, end: Double, lookup: Double, response: Double, socket: Double): Connect = {
      val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connect]
    }
    
    @scala.inline
    implicit class ConnectMutableBuilder[Self <: Connect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(value: Double): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookup(value: Double): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Double): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocket(value: Double): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(dns: Double, download: Double, firstByte: Double, tcp: Double, total: Double, wait_ : Double): Dns = {
      val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], firstByte = firstByte.asInstanceOf[js.Any], tcp = tcp.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dns]
    }
    
    @scala.inline
    implicit class DnsMutableBuilder[Self <: Dns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDns(value: Double): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownload(value: Double): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstByte(value: Double): Self = StObject.set(x, "firstByte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTcp(value: Double): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    }
  }
  
  trait MimeType extends StObject {
    
    var mimeType: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[js.Array[NameValuePair]] = js.undefined
  }
  object MimeType {
    
    @scala.inline
    def apply(): MimeType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MimeType]
    }
    
    @scala.inline
    implicit class MimeTypeMutableBuilder[Self <: MimeType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setParams(value: js.Array[NameValuePair]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setParamsVarargs(value: NameValuePair*): Self = StObject.set(x, "params", js.Array(value :_*))
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
    
    var pathname: (String | Null) & String
    
    var port: String | Null
    
    var protocol: String | Null
    
    var query: String | Null | ParsedUrlQuery
    
    var search: String | Null
    
    var slashes: Boolean | Null
  }
  object Urlhrefstringpathnamestri {
    
    @scala.inline
    def apply(href: String, pathname: (String | Null) & String): Urlhrefstringpathnamestri = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], auth = null, hash = null, host = null, hostname = null, path = null, port = null, protocol = null, query = null, search = null, slashes = null)
      __obj.asInstanceOf[Urlhrefstringpathnamestri]
    }
    
    @scala.inline
    implicit class UrlhrefstringpathnamestriMutableBuilder[Self <: Urlhrefstringpathnamestri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashNull: Self = StObject.set(x, "hash", null)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathname(value: (String | Null) & String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setQuery(value: String | ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchNull: Self = StObject.set(x, "search", null)
      
      @scala.inline
      def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlashesNull: Self = StObject.set(x, "slashes", null)
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
    
    @scala.inline
    def apply(): keystringAgentAgentExtraP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[keystringAgentAgentExtraP]
    }
    
    @scala.inline
    implicit class keystringAgentAgentExtraPMutableBuilder[Self <: keystringAgentAgentExtraP] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
    }
  }
}
