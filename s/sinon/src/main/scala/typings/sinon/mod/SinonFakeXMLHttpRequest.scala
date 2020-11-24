package typings.sinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonFakeXMLHttpRequest extends js.Object {
  
  /**
    * Whether or not the request is asynchronous.
    */
  var async: Boolean = js.native
  
  def autoRespond(ms: Double): Unit = js.native
  
  /**
    * Simulates a network error on the request. The onerror handler will be called and the status will be 0.
    */
  def error(): Unit = js.native
  
  /**
    * All response headers as an object.
    */
  def getAllResponseHeaders(): js.Any = js.native
  
  /**
    * The value of the given response header, if the request has been responded to (see respond).
    * @param header
    */
  def getResponseHeader(header: String): String = js.native
  
  /**
    * The request method as a string.
    */
  var method: String = js.native
  
  def onerror(): Unit = js.native
  
  /**
    * Password, if any.
    */
  var password: String = js.native
  
  /**
    * The request body
    */
  var requestBody: String = js.native
  
  /**
    * An object of all request headers, i.e.:
    */
  var requestHeaders: js.Any = js.native
  
  /**
    * Calls the above three methods.
    */
  def respond(status: Double, headers: js.Any, body: String): Unit = js.native
  
  /**
    * When using respond, this property is populated with a parsed document if response headers indicate as much (see the spec)
    */
  var responseXML: Document = js.native
  
  /**
    * Sets the respond body, updates the readyState property and fires onreadystatechange.
    * Additionally, populates responseXML with a parsed document if response headers indicate as much.
    */
  def setResponseBody(body: String): Unit = js.native
  
  // Methods
  /**
    * Sets response headers (e.g. { "Content-Type": "text/html", ... }, updates the readyState property and fires onreadystatechange.
    * @param headers
    */
  def setResponseHeaders(headers: js.Any): Unit = js.native
  
  /**
    * The request’s status code.
    * undefined if the request has not been handled (see respond below)
    */
  var status: Double = js.native
  
  /**
    * Only populated if the respond method is called (see below).
    */
  var statusText: String = js.native
  
  var upload: SinonFakeUploadProgress = js.native
  
  // Properties
  /**
    * The URL set on the request object.
    */
  var url: String = js.native
  
  /**
    * Username, if any.
    */
  var username: String = js.native
  
  var withCredentials: Boolean = js.native
}
object SinonFakeXMLHttpRequest {
  
  @scala.inline
  def apply(
    async: Boolean,
    autoRespond: Double => Unit,
    error: () => Unit,
    getAllResponseHeaders: () => js.Any,
    getResponseHeader: String => String,
    method: String,
    onerror: () => Unit,
    password: String,
    requestBody: String,
    requestHeaders: js.Any,
    respond: (Double, js.Any, String) => Unit,
    responseXML: Document,
    setResponseBody: String => Unit,
    setResponseHeaders: js.Any => Unit,
    status: Double,
    statusText: String,
    upload: SinonFakeUploadProgress,
    url: String,
    username: String,
    withCredentials: Boolean
  ): SinonFakeXMLHttpRequest = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], autoRespond = js.Any.fromFunction1(autoRespond), error = js.Any.fromFunction0(error), getAllResponseHeaders = js.Any.fromFunction0(getAllResponseHeaders), getResponseHeader = js.Any.fromFunction1(getResponseHeader), method = method.asInstanceOf[js.Any], onerror = js.Any.fromFunction0(onerror), password = password.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], respond = js.Any.fromFunction3(respond), responseXML = responseXML.asInstanceOf[js.Any], setResponseBody = js.Any.fromFunction1(setResponseBody), setResponseHeaders = js.Any.fromFunction1(setResponseHeaders), status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinonFakeXMLHttpRequest]
  }
  
  @scala.inline
  implicit class SinonFakeXMLHttpRequestOps[Self <: SinonFakeXMLHttpRequest] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRespond(value: Double => Unit): Self = this.set("autoRespond", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: () => Unit): Self = this.set("error", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllResponseHeaders(value: () => js.Any): Self = this.set("getAllResponseHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResponseHeader(value: String => String): Self = this.set("getResponseHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnerror(value: () => Unit): Self = this.set("onerror", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBody(value: String): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestHeaders(value: js.Any): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespond(value: (Double, js.Any, String) => Unit): Self = this.set("respond", js.Any.fromFunction3(value))
    
    @scala.inline
    def setResponseXML(value: Document): Self = this.set("responseXML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetResponseBody(value: String => Unit): Self = this.set("setResponseBody", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetResponseHeaders(value: js.Any => Unit): Self = this.set("setResponseHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload(value: SinonFakeUploadProgress): Self = this.set("upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
  }
}
