package typings.restling

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.restling.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("restling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allAsync(requests: js.Array[Options]): typings.bluebird.mod.^[js.Array[RestlingResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allAsync")(requests.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[js.Array[RestlingResult]]]
  inline def allAsync(requests: StringDictionary[Options]): typings.bluebird.mod.^[StringDictionary[RestlingResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allAsync")(requests.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[StringDictionary[RestlingResult]]]
  
  inline def del(url: String): typings.bluebird.mod.^[RestlingResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def del(url: String, options: RestlingOptions): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  
  inline def get(url: String): typings.bluebird.mod.^[RestlingResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def get(url: String, options: RestlingOptions): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  
  inline def head(url: String): typings.bluebird.mod.^[RestlingResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def head(url: String, options: RestlingOptions): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  
  inline def json(url: String): typings.bluebird.mod.^[RestlingResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(url.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def json(url: String, data: Any): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def json(url: String, data: Any, options: Unit, method: String): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def json(url: String, data: Any, options: RestlingOptions): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def json(url: String, data: Any, options: RestlingOptions, method: String): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def json(url: String, data: Unit, options: Unit, method: String): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def json(url: String, data: Unit, options: RestlingOptions): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def json(url: String, data: Unit, options: RestlingOptions, method: String): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  
  inline def patch(url: String): typings.bluebird.mod.^[RestlingResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def patch(url: String, options: RestlingOptions): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  
  inline def patchJson(url: String): typings.bluebird.mod.^[RestlingResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("patchJson")(url.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def patchJson(url: String, data: Any): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("patchJson")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def patchJson(url: String, data: Any, options: RestlingOptions): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("patchJson")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def patchJson(url: String, data: Unit, options: RestlingOptions): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("patchJson")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  
  inline def post(url: String): typings.bluebird.mod.^[RestlingResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def post(url: String, options: RestlingOptions): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  
  inline def postJson(url: String): typings.bluebird.mod.^[RestlingResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("postJson")(url.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def postJson(url: String, data: Any): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("postJson")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def postJson(url: String, data: Any, options: RestlingOptions): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("postJson")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def postJson(url: String, data: Unit, options: RestlingOptions): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("postJson")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  
  inline def put(url: String): typings.bluebird.mod.^[RestlingResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def put(url: String, options: RestlingOptions): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  
  inline def putJson(url: String): typings.bluebird.mod.^[RestlingResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("putJson")(url.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def putJson(url: String, data: Any): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("putJson")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def putJson(url: String, data: Any, options: RestlingOptions): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("putJson")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def putJson(url: String, data: Unit, options: RestlingOptions): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("putJson")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  
  inline def request(url: String): typings.bluebird.mod.^[RestlingResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  inline def request(url: String, options: RestlingOptions): typings.bluebird.mod.^[RestlingResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[RestlingResult]]
  
  inline def settleAsync(requests: js.Array[Options]): typings.bluebird.mod.^[js.Array[RestlingResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("settleAsync")(requests.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[js.Array[RestlingResult]]]
  inline def settleAsync(requests: StringDictionary[Options]): typings.bluebird.mod.^[StringDictionary[RestlingResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("settleAsync")(requests.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[StringDictionary[RestlingResult]]]
  
  type RestlerOptionsHeader = StringDictionary[String]
  
  trait RestlingOptions extends StObject {
    
    /**
      * OAuth Bearer Token.
      */
    var accessToken: js.UndefOr[String] = js.undefined
    
    /**
      *  HTTP Agent instance to use. If not defined globalAgent will be used. If false opts out of connection pooling with an Agent, defaults request to Connection: close.
      */
    var agent: js.UndefOr[Any] = js.undefined
    
    /**
      * A http.Client instance if you want to reuse or implement some kind of connection pooling.
      */
    var client: js.UndefOr[Any] = js.undefined
    
    /**
      * Data to be added to the body of the request.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * Encoding of the response body
      */
    var decoding: js.UndefOr[String] = js.undefined
    
    /**
      * Encoding of the request body.
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * If set will recursively follow redirects.
      */
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A hash of HTTP headers to be sent.
      */
    var headers: js.UndefOr[RestlerOptionsHeader] = js.undefined
    
    /**
      * Request method
      */
    var method: js.UndefOr[String] = js.undefined
    
    /**
      * If set the data passed will be formatted as <code>multipart/form-encoded</code>.
      */
    var multipart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that will be called on the returned data. Use any of predefined <code>restler.parsers</code>.
      */
    var parser: js.UndefOr[Any] = js.undefined
    
    /**
      * Basic auth password.
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * Query string variables as a javascript object, will override the querystring in the URL.
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /**
      * If true, the server certificate is verified against the list of supplied CAs.
      * An 'error' event is emitted if verification fails. Verification happens at the connection level, before the HTTP request is sent.
      */
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Emit the timeout event when the response does not return within the said value (in ms).
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Basic auth username.
      */
    var username: js.UndefOr[String] = js.undefined
    
    /**
      * Options for xml2js.
      */
    var xml2js: js.UndefOr[Any] = js.undefined
  }
  object RestlingOptions {
    
    inline def apply(): RestlingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestlingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RestlingOptions] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setAgent(value: Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setClient(value: Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDecoding(value: String): Self = StObject.set(x, "decoding", value.asInstanceOf[js.Any])
      
      inline def setDecodingUndefined: Self = StObject.set(x, "decoding", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      inline def setHeaders(value: RestlerOptionsHeader): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMultipart(value: Boolean): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
      
      inline def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
      
      inline def setParser(value: Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setXml2js(value: Any): Self = StObject.set(x, "xml2js", value.asInstanceOf[js.Any])
      
      inline def setXml2jsUndefined: Self = StObject.set(x, "xml2js", js.undefined)
    }
  }
  
  trait RestlingResult extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var response: js.UndefOr[ServerResponse[IncomingMessage]] = js.undefined
  }
  object RestlingResult {
    
    inline def apply(): RestlingResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestlingResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RestlingResult] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setResponse(value: ServerResponse[IncomingMessage]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
}
