package typings.restling

import org.scalablytyped.runtime.StringDictionary
import typings.bluebird.mod.^
import typings.node.httpMod.ServerResponse
import typings.restling.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("restling", "allAsync")
  @js.native
  def allAsync(requests: js.Array[Options]): ^[js.Array[RestlingResult]] = js.native
  @JSImport("restling", "allAsync")
  @js.native
  def allAsync(requests: StringDictionary[Options]): ^[StringDictionary[RestlingResult]] = js.native
  
  @JSImport("restling", "del")
  @js.native
  def del(url: String): ^[RestlingResult] = js.native
  @JSImport("restling", "del")
  @js.native
  def del(url: String, options: RestlingOptions): ^[RestlingResult] = js.native
  
  @JSImport("restling", "get")
  @js.native
  def get(url: String): ^[RestlingResult] = js.native
  @JSImport("restling", "get")
  @js.native
  def get(url: String, options: RestlingOptions): ^[RestlingResult] = js.native
  
  @JSImport("restling", "head")
  @js.native
  def head(url: String): ^[RestlingResult] = js.native
  @JSImport("restling", "head")
  @js.native
  def head(url: String, options: RestlingOptions): ^[RestlingResult] = js.native
  
  @JSImport("restling", "json")
  @js.native
  def json(url: String): ^[RestlingResult] = js.native
  @JSImport("restling", "json")
  @js.native
  def json(url: String, data: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], method: String): ^[RestlingResult] = js.native
  @JSImport("restling", "json")
  @js.native
  def json(url: String, data: js.UndefOr[scala.Nothing], options: RestlingOptions): ^[RestlingResult] = js.native
  @JSImport("restling", "json")
  @js.native
  def json(url: String, data: js.UndefOr[scala.Nothing], options: RestlingOptions, method: String): ^[RestlingResult] = js.native
  @JSImport("restling", "json")
  @js.native
  def json(url: String, data: js.Any): ^[RestlingResult] = js.native
  @JSImport("restling", "json")
  @js.native
  def json(url: String, data: js.Any, options: js.UndefOr[scala.Nothing], method: String): ^[RestlingResult] = js.native
  @JSImport("restling", "json")
  @js.native
  def json(url: String, data: js.Any, options: RestlingOptions): ^[RestlingResult] = js.native
  @JSImport("restling", "json")
  @js.native
  def json(url: String, data: js.Any, options: RestlingOptions, method: String): ^[RestlingResult] = js.native
  
  @JSImport("restling", "patch")
  @js.native
  def patch(url: String): ^[RestlingResult] = js.native
  @JSImport("restling", "patch")
  @js.native
  def patch(url: String, options: RestlingOptions): ^[RestlingResult] = js.native
  
  @JSImport("restling", "patchJson")
  @js.native
  def patchJson(url: String): ^[RestlingResult] = js.native
  @JSImport("restling", "patchJson")
  @js.native
  def patchJson(url: String, data: js.UndefOr[scala.Nothing], options: RestlingOptions): ^[RestlingResult] = js.native
  @JSImport("restling", "patchJson")
  @js.native
  def patchJson(url: String, data: js.Any): ^[RestlingResult] = js.native
  @JSImport("restling", "patchJson")
  @js.native
  def patchJson(url: String, data: js.Any, options: RestlingOptions): ^[RestlingResult] = js.native
  
  @JSImport("restling", "post")
  @js.native
  def post(url: String): ^[RestlingResult] = js.native
  @JSImport("restling", "post")
  @js.native
  def post(url: String, options: RestlingOptions): ^[RestlingResult] = js.native
  
  @JSImport("restling", "postJson")
  @js.native
  def postJson(url: String): ^[RestlingResult] = js.native
  @JSImport("restling", "postJson")
  @js.native
  def postJson(url: String, data: js.UndefOr[scala.Nothing], options: RestlingOptions): ^[RestlingResult] = js.native
  @JSImport("restling", "postJson")
  @js.native
  def postJson(url: String, data: js.Any): ^[RestlingResult] = js.native
  @JSImport("restling", "postJson")
  @js.native
  def postJson(url: String, data: js.Any, options: RestlingOptions): ^[RestlingResult] = js.native
  
  @JSImport("restling", "put")
  @js.native
  def put(url: String): ^[RestlingResult] = js.native
  @JSImport("restling", "put")
  @js.native
  def put(url: String, options: RestlingOptions): ^[RestlingResult] = js.native
  
  @JSImport("restling", "putJson")
  @js.native
  def putJson(url: String): ^[RestlingResult] = js.native
  @JSImport("restling", "putJson")
  @js.native
  def putJson(url: String, data: js.UndefOr[scala.Nothing], options: RestlingOptions): ^[RestlingResult] = js.native
  @JSImport("restling", "putJson")
  @js.native
  def putJson(url: String, data: js.Any): ^[RestlingResult] = js.native
  @JSImport("restling", "putJson")
  @js.native
  def putJson(url: String, data: js.Any, options: RestlingOptions): ^[RestlingResult] = js.native
  
  @JSImport("restling", "request")
  @js.native
  def request(url: String): ^[RestlingResult] = js.native
  @JSImport("restling", "request")
  @js.native
  def request(url: String, options: RestlingOptions): ^[RestlingResult] = js.native
  
  @JSImport("restling", "settleAsync")
  @js.native
  def settleAsync(requests: js.Array[Options]): ^[js.Array[RestlingResult]] = js.native
  @JSImport("restling", "settleAsync")
  @js.native
  def settleAsync(requests: StringDictionary[Options]): ^[StringDictionary[RestlingResult]] = js.native
  
  type RestlerOptionsHeader = StringDictionary[String]
  
  @js.native
  trait RestlingOptions extends StObject {
    
    /**
      * OAuth Bearer Token.
      */
    var accessToken: js.UndefOr[String] = js.native
    
    /**
      *  HTTP Agent instance to use. If not defined globalAgent will be used. If false opts out of connection pooling with an Agent, defaults request to Connection: close.
      */
    var agent: js.UndefOr[js.Any] = js.native
    
    /**
      * A http.Client instance if you want to reuse or implement some kind of connection pooling.
      */
    var client: js.UndefOr[js.Any] = js.native
    
    /**
      * Data to be added to the body of the request.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /**
      * Encoding of the response body
      */
    var decoding: js.UndefOr[String] = js.native
    
    /**
      * Encoding of the request body.
      */
    var encoding: js.UndefOr[String] = js.native
    
    /**
      * If set will recursively follow redirects.
      */
    var followRedirects: js.UndefOr[Boolean] = js.native
    
    /**
      * A hash of HTTP headers to be sent.
      */
    var headers: js.UndefOr[RestlerOptionsHeader] = js.native
    
    /**
      * Request method
      */
    var method: js.UndefOr[String] = js.native
    
    /**
      * If set the data passed will be formatted as <code>multipart/form-encoded</code>.
      */
    var multipart: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that will be called on the returned data. Use any of predefined <code>restler.parsers</code>.
      */
    var parser: js.UndefOr[js.Any] = js.native
    
    /**
      * Basic auth password.
      */
    var password: js.UndefOr[String] = js.native
    
    /**
      * Query string variables as a javascript object, will override the querystring in the URL.
      */
    var query: js.UndefOr[js.Any] = js.native
    
    /**
      * If true, the server certificate is verified against the list of supplied CAs.
      * An 'error' event is emitted if verification fails. Verification happens at the connection level, before the HTTP request is sent.
      */
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    /**
      * Emit the timeout event when the response does not return within the said value (in ms).
      */
    var timeout: js.UndefOr[Double] = js.native
    
    /**
      * Basic auth username.
      */
    var username: js.UndefOr[String] = js.native
    
    /**
      * Options for xml2js.
      */
    var xml2js: js.UndefOr[js.Any] = js.native
  }
  object RestlingOptions {
    
    @scala.inline
    def apply(): RestlingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestlingOptions]
    }
    
    @scala.inline
    implicit class RestlingOptionsMutableBuilder[Self <: RestlingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setAgent(value: js.Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setClient(value: js.Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDecoding(value: String): Self = StObject.set(x, "decoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodingUndefined: Self = StObject.set(x, "decoding", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setHeaders(value: RestlerOptionsHeader): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMultipart(value: Boolean): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
      
      @scala.inline
      def setParser(value: js.Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      @scala.inline
      def setXml2js(value: js.Any): Self = StObject.set(x, "xml2js", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXml2jsUndefined: Self = StObject.set(x, "xml2js", js.undefined)
    }
  }
  
  @js.native
  trait RestlingResult extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var response: js.UndefOr[ServerResponse] = js.native
  }
  object RestlingResult {
    
    @scala.inline
    def apply(): RestlingResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestlingResult]
    }
    
    @scala.inline
    implicit class RestlingResultMutableBuilder[Self <: RestlingResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setResponse(value: ServerResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
}
