package typings.restler

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("restler", JSImport.Namespace)
  @js.native
  val ^ : RestlerStatic = js.native
  
  /**
    * Interface for restler options.
    * @interface
    */
  trait RestlerOptions extends StObject {
    
    /**
      * OAuth Bearer Token.
      * @type {string}
      */
    var accessToken: js.UndefOr[String] = js.undefined
    
    /**
      *  HTTP Agent instance to use. If not defined globalAgent will be used. If false opts out of connection pooling with an Agent, defaults request to Connection: close.
      * @type {any}
      */
    var agent: js.UndefOr[js.Any] = js.undefined
    
    /**
      * A http.Client instance if you want to reuse or implement some kind of connection pooling.
      * @type {any}
      */
    var client: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Data to be added to the body of the request.
      * @type {any}
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Encoding of the response body
      * @type {string}
      */
    var decoding: js.UndefOr[String] = js.undefined
    
    /**
      * Encoding of the request body.
      * @type {string}
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * If set will recursively follow redirects.
      * @type {boolean}
      */
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A hash of HTTP headers to be sent.
      * @type {RestlerOptionsHeader}
      */
    var headers: js.UndefOr[RestlerOptionsHeader] = js.undefined
    
    /**
      * Request method
      * @type {string}
      */
    var method: js.UndefOr[String] = js.undefined
    
    /**
      * If set the data passed will be formatted as <code>multipart/form-encoded</code>.
      * @type {boolean}
      */
    var multipart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that will be called on the returned data. Use any of predefined <code>restler.parsers</code>.
      * @type {any}
      */
    var parser: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Basic auth password.
      * @type {string}
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * Query string variables as a javascript object, will override the querystring in the URL.
      * @type {any}
      */
    var query: js.UndefOr[js.Any] = js.undefined
    
    /**
      * If true, the server certificate is verified against the list of supplied CAs.
      * An 'error' event is emitted if verification fails. Verification happens at the connection level, before the HTTP request is sent.
      * @type {boolean}
      */
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Emit the timeout event when the response does not return within the said value (in ms).
      * @type {number}
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Basic auth username.
      * @type {string}
      */
    var username: js.UndefOr[String] = js.undefined
    
    /**
      * Options for xml2js.
      * @type {any}
      */
    var xml2js: js.UndefOr[js.Any] = js.undefined
  }
  object RestlerOptions {
    
    @scala.inline
    def apply(): RestlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestlerOptions]
    }
    
    @scala.inline
    implicit class RestlerOptionsMutableBuilder[Self <: RestlerOptions] (val x: Self) extends AnyVal {
      
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
  
  /**
    * Interface for the header.
    * @interface
    */
  type RestlerOptionsHeader = StringDictionary[String]
  
  /**
    * Interface for restler result.
    * @interface
    */
  trait RestlerResult extends StObject {
    
    /**
      * Adds the listener function to the end of the listeners array for the event named eventName.
      * @param {string}    eventName   The name of the event.
      * @param {Function}  listener    The callback function
      */
    def on(
      eventName: String,
      listener: js.Function2[/* data */ js.UndefOr[js.Any], /* response */ js.UndefOr[ServerResponse], Unit]
    ): RestlerResult
  }
  object RestlerResult {
    
    @scala.inline
    def apply(
      on: (String, js.Function2[/* data */ js.UndefOr[js.Any], /* response */ js.UndefOr[ServerResponse], Unit]) => RestlerResult
    ): RestlerResult = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[RestlerResult]
    }
    
    @scala.inline
    implicit class RestlerResultMutableBuilder[Self <: RestlerResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOn(
        value: (String, js.Function2[/* data */ js.UndefOr[js.Any], /* response */ js.UndefOr[ServerResponse], Unit]) => RestlerResult
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * Interface for resler class.
    * @interface
    */
  @js.native
  trait RestlerStatic extends StObject {
    
    /**
      * Create a DELETE request.
      * @param {string}          url     A url address.
      * @param {RestlerOptions}  options Options.
      * @return {RestlerResult}  Result.
      */
    def del(url: String): RestlerResult = js.native
    def del(url: String, options: js.Object): RestlerResult = js.native
    
    /**
      * Create a GET request.
      * @param {string}          url     A url address.
      * @param {RestlerOptions}  options Options.
      * @return {RestlerResult}  Result.
      */
    def get(url: String): RestlerResult = js.native
    def get(url: String, options: RestlerOptions): RestlerResult = js.native
    
    /**
      * Create a HEAD request.
      * @param {string}          url     A url address.
      * @param {RestlerOptions}  options Options.
      * @return {RestlerResult}  Result.
      */
    def head(url: String): RestlerResult = js.native
    def head(url: String, options: RestlerOptions): RestlerResult = js.native
    
    /**
      * Send json data via GET method.
      * @param {string}          url     A url address.
      * @param {any}             data    JSON body
      * @param {RestlerOptions}  options Options.
      * @return {RestlerResult}  Result.
      */
    def json(url: String): RestlerResult = js.native
    def json(url: String, data: js.Any): RestlerResult = js.native
    def json(url: String, data: js.Any, options: Unit, method: String): RestlerResult = js.native
    def json(url: String, data: js.Any, options: RestlerOptions): RestlerResult = js.native
    def json(url: String, data: js.Any, options: RestlerOptions, method: String): RestlerResult = js.native
    def json(url: String, data: Unit, options: Unit, method: String): RestlerResult = js.native
    def json(url: String, data: Unit, options: RestlerOptions): RestlerResult = js.native
    def json(url: String, data: Unit, options: RestlerOptions, method: String): RestlerResult = js.native
    
    /**
      * Create a PATCH request.
      * @param {string}          url     A url address.
      * @param {RestlerOptions}  options Options.
      * @return {RestlerResult}  Result.
      */
    def patch(url: String): RestlerResult = js.native
    def patch(url: String, options: RestlerOptions): RestlerResult = js.native
    
    /**
      * Send json  data  via PATCH method.
      * @param {string}          url     A url address.
      * @param {any}             data    JSON body
      * @param {RestlerOptions}  options Options.
      * @return {RestlerResult}  Result.
      */
    def patchJson(url: String): RestlerResult = js.native
    def patchJson(url: String, data: js.Any): RestlerResult = js.native
    def patchJson(url: String, data: js.Any, options: RestlerOptions): RestlerResult = js.native
    def patchJson(url: String, data: Unit, options: RestlerOptions): RestlerResult = js.native
    
    /**
      * Create a POST request.
      * @param {string}          url     A url address.
      * @param {RestlerOptions}  options Options.
      * @return {RestlerResult}  Result.
      */
    def post(url: String): RestlerResult = js.native
    def post(url: String, options: RestlerOptions): RestlerResult = js.native
    
    /**
      * Send json data via POST method.
      * @param {string}          url     A url address.
      * @param {any}             data    JSON body
      * @param {RestlerOptions}  options Options.
      * @return {RestlerResult}  Result.
      */
    def postJson(url: String): RestlerResult = js.native
    def postJson(url: String, data: js.Any): RestlerResult = js.native
    def postJson(url: String, data: js.Any, options: RestlerOptions): RestlerResult = js.native
    def postJson(url: String, data: Unit, options: RestlerOptions): RestlerResult = js.native
    
    /**
      * Create a PUT request.
      * @param {string}          url     A url address.
      * @param {RestlerOptions}  options Options.
      * @return {RestlerResult}  Result.
      */
    def put(url: String): RestlerResult = js.native
    def put(url: String, options: RestlerOptions): RestlerResult = js.native
    
    /**
      * Send json data via PUT method.
      * @param {string}          url     A url address.
      * @param {any}             data    JSON body
      * @param {RestlerOptions}  options Options.
      * @return {RestlerResult}  Result.
      */
    def putJson(url: String): RestlerResult = js.native
    def putJson(url: String, data: js.Any): RestlerResult = js.native
    def putJson(url: String, data: js.Any, options: RestlerOptions): RestlerResult = js.native
    def putJson(url: String, data: Unit, options: RestlerOptions): RestlerResult = js.native
    
    /**
      * Create a PUT request.
      * @param {string}          url     A url address.
      * @param {RestlerOptions}  options Options.
      * @return {RestlerResult}  Result.
      */
    def service(url: String): RestlerResult = js.native
    def service(url: String, options: RestlerOptions): RestlerResult = js.native
  }
  
  type _To = RestlerStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RestlerStatic = ^
}
