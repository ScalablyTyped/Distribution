package typings.remixRunWebFetch

import typings.std.Blob
import typings.std.FormData
import typings.std.Headers
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Agent extends StObject {
    
    var agent: js.UndefOr[typings.node.httpMod.Agent | typings.node.httpsMod.Agent] = js.undefined
    
    var hash: String
    
    var headers: Any
    
    var hostname: String
    
    var href: String
    
    var insecureHTTPParser: Boolean
    
    var method: String
    
    var path: String
    
    var pathname: String
    
    var port: String
    
    var protocol: String
    
    var query: Any
    
    var search: String
  }
  object Agent {
    
    inline def apply(
      hash: String,
      headers: Any,
      hostname: String,
      href: String,
      insecureHTTPParser: Boolean,
      method: String,
      path: String,
      pathname: String,
      port: String,
      protocol: String,
      query: Any,
      search: String
    ): Agent = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], insecureHTTPParser = insecureHTTPParser.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[Agent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Agent] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: typings.node.httpMod.Agent | typings.node.httpsMod.Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setInsecureHTTPParser(value: Boolean): Self = StObject.set(x, "insecureHTTPParser", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Body & {  headers :std.Headers | undefined} */
  trait BodyheadersHeadersundefin extends StObject {
    
    /* standard dom */
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
    
    /* standard dom */
    def blob(): js.Promise[Blob]
    
    /* standard dom */
    val body: ReadableStream[js.typedarray.Uint8Array] | Null
    
    /* standard dom */
    val bodyUsed: Boolean
    
    /* standard dom */
    def formData(): js.Promise[FormData]
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    /* standard dom */
    def json(): js.Promise[Any]
    
    /* standard dom */
    def text(): js.Promise[String]
  }
  object BodyheadersHeadersundefin {
    
    inline def apply(
      arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
      blob: () => js.Promise[Blob],
      bodyUsed: Boolean,
      formData: () => js.Promise[FormData],
      json: () => js.Promise[Any],
      text: () => js.Promise[String]
    ): BodyheadersHeadersundefin = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text), body = null)
      __obj.asInstanceOf[BodyheadersHeadersundefin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BodyheadersHeadersundefin] (val x: Self) extends AnyVal {
      
      inline def setArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      inline def setBlob(value: () => js.Promise[Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
      
      inline def setBody(value: ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: () => js.Promise[FormData]): Self = StObject.set(x, "formData", js.Any.fromFunction0(value))
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setJson(value: () => js.Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
  
  trait GetBoundary extends StObject {
    
    def getBoundary(): String
    
    def getLengthSync(): Double | Null
    
    def hasKnownLength(): Boolean
  }
  object GetBoundary {
    
    inline def apply(getBoundary: () => String, getLengthSync: () => Double | Null, hasKnownLength: () => Boolean): GetBoundary = {
      val __obj = js.Dynamic.literal(getBoundary = js.Any.fromFunction0(getBoundary), getLengthSync = js.Any.fromFunction0(getLengthSync), hasKnownLength = js.Any.fromFunction0(hasKnownLength))
      __obj.asInstanceOf[GetBoundary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetBoundary] (val x: Self) extends AnyVal {
      
      inline def setGetBoundary(value: () => String): Self = StObject.set(x, "getBoundary", js.Any.fromFunction0(value))
      
      inline def setGetLengthSync(value: () => Double | Null): Self = StObject.set(x, "getLengthSync", js.Any.fromFunction0(value))
      
      inline def setHasKnownLength(value: () => Boolean): Self = StObject.set(x, "hasKnownLength", js.Any.fromFunction0(value))
    }
  }
  
  trait ReadableHighWaterMark extends StObject {
    
    var readableHighWaterMark: js.UndefOr[Double] = js.undefined
  }
  object ReadableHighWaterMark {
    
    inline def apply(): ReadableHighWaterMark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadableHighWaterMark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadableHighWaterMark] (val x: Self) extends AnyVal {
      
      inline def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
      
      inline def setReadableHighWaterMarkUndefined: Self = StObject.set(x, "readableHighWaterMark", js.undefined)
    }
  }
  
  trait Size extends StObject {
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object Size {
    
    inline def apply(): Size = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
