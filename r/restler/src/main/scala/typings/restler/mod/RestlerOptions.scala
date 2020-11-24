package typings.restler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for restler options.
  * @interface
  */
@js.native
trait RestlerOptions extends js.Object {
  
  /**
    * OAuth Bearer Token.
    * @type {string}
    */
  var accessToken: js.UndefOr[String] = js.native
  
  /**
    *  HTTP Agent instance to use. If not defined globalAgent will be used. If false opts out of connection pooling with an Agent, defaults request to Connection: close.
    * @type {any}
    */
  var agent: js.UndefOr[js.Any] = js.native
  
  /**
    * A http.Client instance if you want to reuse or implement some kind of connection pooling.
    * @type {any}
    */
  var client: js.UndefOr[js.Any] = js.native
  
  /**
    * Data to be added to the body of the request.
    * @type {any}
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * Encoding of the response body
    * @type {string}
    */
  var decoding: js.UndefOr[String] = js.native
  
  /**
    * Encoding of the request body.
    * @type {string}
    */
  var encoding: js.UndefOr[String] = js.native
  
  /**
    * If set will recursively follow redirects.
    * @type {boolean}
    */
  var followRedirects: js.UndefOr[Boolean] = js.native
  
  /**
    * A hash of HTTP headers to be sent.
    * @type {RestlerOptionsHeader}
    */
  var headers: js.UndefOr[RestlerOptionsHeader] = js.native
  
  /**
    * Request method
    * @type {string}
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * If set the data passed will be formatted as <code>multipart/form-encoded</code>.
    * @type {boolean}
    */
  var multipart: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that will be called on the returned data. Use any of predefined <code>restler.parsers</code>.
    * @type {any}
    */
  var parser: js.UndefOr[js.Any] = js.native
  
  /**
    * Basic auth password.
    * @type {string}
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * Query string variables as a javascript object, will override the querystring in the URL.
    * @type {any}
    */
  var query: js.UndefOr[js.Any] = js.native
  
  /**
    * If true, the server certificate is verified against the list of supplied CAs.
    * An 'error' event is emitted if verification fails. Verification happens at the connection level, before the HTTP request is sent.
    * @type {boolean}
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  
  /**
    * Emit the timeout event when the response does not return within the said value (in ms).
    * @type {number}
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * Basic auth username.
    * @type {string}
    */
  var username: js.UndefOr[String] = js.native
  
  /**
    * Options for xml2js.
    * @type {any}
    */
  var xml2js: js.UndefOr[js.Any] = js.native
}
object RestlerOptions {
  
  @scala.inline
  def apply(): RestlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestlerOptions]
  }
  
  @scala.inline
  implicit class RestlerOptionsOps[Self <: RestlerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setAgent(value: js.Any): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setClient(value: js.Any): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDecoding(value: String): Self = this.set("decoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecoding: Self = this.set("decoding", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFollowRedirects(value: Boolean): Self = this.set("followRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowRedirects: Self = this.set("followRedirects", js.undefined)
    
    @scala.inline
    def setHeaders(value: RestlerOptionsHeader): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMultipart(value: Boolean): Self = this.set("multipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipart: Self = this.set("multipart", js.undefined)
    
    @scala.inline
    def setParser(value: js.Any): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setXml2js(value: js.Any): Self = this.set("xml2js", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXml2js: Self = this.set("xml2js", js.undefined)
  }
}
