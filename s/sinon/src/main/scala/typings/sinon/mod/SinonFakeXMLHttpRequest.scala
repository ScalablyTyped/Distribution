package typings.sinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonFakeXMLHttpRequest extends js.Object {
  /**
    * Whether or not the request is asynchronous.
    */
  var async: Boolean
  /**
    * The request method as a string.
    */
  var method: String
  /**
    * Password, if any.
    */
  var password: String
  /**
    * The request body
    */
  var requestBody: String
  /**
    * An object of all request headers, i.e.:
    */
  var requestHeaders: js.Any
  /**
    * When using respond, this property is populated with a parsed document if response headers indicate as much (see the spec)
    */
  var responseXML: Document
  /**
    * The request’s status code.
    * undefined if the request has not been handled (see respond below)
    */
  var status: Double
  /**
    * Only populated if the respond method is called (see below).
    */
  var statusText: String
  var upload: SinonFakeUploadProgress
  // Properties
  /**
    * The URL set on the request object.
    */
  var url: String
  /**
    * Username, if any.
    */
  var username: String
  var withCredentials: Boolean
  def autoRespond(ms: Double): Unit
  /**
    * Simulates a network error on the request. The onerror handler will be called and the status will be 0.
    */
  def error(): Unit
  /**
    * All response headers as an object.
    */
  def getAllResponseHeaders(): js.Any
  /**
    * The value of the given response header, if the request has been responded to (see respond).
    * @param header
    */
  def getResponseHeader(header: String): String
  def onerror(): Unit
  /**
    * Calls the above three methods.
    */
  def respond(status: Double, headers: js.Any, body: String): Unit
  /**
    * Sets the respond body, updates the readyState property and fires onreadystatechange.
    * Additionally, populates responseXML with a parsed document if response headers indicate as much.
    */
  def setResponseBody(body: String): Unit
  // Methods
  /**
    * Sets response headers (e.g. { "Content-Type": "text/html", ... }, updates the readyState property and fires onreadystatechange.
    * @param headers
    */
  def setResponseHeaders(headers: js.Any): Unit
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
}

