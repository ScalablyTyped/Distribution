package typings.servicenowLondon.snWs

import typings.servicenowLondon.anon.Get
import typings.servicenowLondon.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The RESTResponseV2 API allows you to use the data returned by an outbound REST message
  * in JavaScript code.
  */
@js.native
trait RESTResponseV2 extends js.Object {
  
  /**
    * Returns all headers contained in the response, including any duplicate headers.
    *
    * @returns The list of headers contained in the response. Each header is represented as a
    * GlideHTTPHeader object which contains the header `name` and `value`.
    * @example
    *
    * var r = new sn_ws.RESTMessageV2('<A REST message>', 'get');
    * var response = r.execute();
    * var headers = response.getAllHeaders();
    * for(var i in headers){
    *   gs.info(headers[i].name + ': ' + headers[i].value);
    * }
    */
  def getAllHeaders(): js.Array[Name] = js.native
  
  /**
    * Get the content of the REST response body.
    *
    * Use this function when you want to get the request body as text content. Do not use this
    * method when saving the response as a binary attachment. If a RESTMessageV2 object called
    * the `saveResponseBodyAsAttachment(...)` function, using `getBody()` on the associated
    * RESTResponseV2 object will cause an error. When saving the response as an attachment,
    * if the outbound REST message fails, call `getErrorMessage()` on the response to retrieve
    * the body content.
    *
    * @returns The REST response body.
    * @example
    *
    * // Might throw exception if message doesn't exist or not visible due to scope.
    * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
    * var response = sm.execute();
    * var responseBody = response.getBody();
    */
  def getBody(): String = js.native
  
  /**
    * Returns all cookies included in the response.
    *
    * @returns The list of cookies. Iterate through the list to perform operations on each cookie.
    * @example
    *
    * var cookies = response.getCookies();
    * var i;
    * for (var i = 0; i < cookies.size(); i++) {
    *   gs.info('cookie: ' + cookies.get(i));
    * }
    */
  def getCookies(): Get = js.native
  
  /**
    * Get the numeric error code if there was an error during the REST transaction.
    *
    * This error code is specific to the Now Platform, it is not an HTTP error code. Provide this
    * error code if you require assistance from ServiceNow Customer Support.
    *
    * @returns The numeric error code, such as 1 for socket timeout.
    * @example
    *
    * // Might throw exception if message doesn't exist or not visible due to scope.
    * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
    * var response = sm.execute();
    * var errorCode = response.getErrorCode();
    */
  def getErrorCode(): Double = js.native
  
  /**
    * Get the error message if there was an error during the REST transaction.
    *
    * @returns The error message.
    * @example
    *
    * // Might throw exception if message doesn't exist or not visible due to scope.
    * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
    * var response = sm.execute();
    * var errorMsg = response.getErrorMessage();
    */
  def getErrorMessage(): String = js.native
  
  /**
    * Get the value for a specified header.
    *
    * @param name The name of the header that you want the value for, such as Set-Cookie.
    * @returns The value of the specified header.
    * @example
    *
    * // Might throw exception if message doesn't exist or not visible due to scope.
    * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
    * var response = sm.execute();
    * var headerVal = response.getHeader('Content-Type');
    */
  def getHeader(name: String): String = js.native
  
  /**
    * Get all headers returned in the REST response and the associated values.
    *
    * **Note:** If a header is present more than once in the response, such as a Set-Cookie header,
    * this function returns only the last of the duplicate headers. To return all headers
    * including duplicates, use the `getAllHeaders()` function.
    *
    * @returns An Object that maps the name of each header to the associated value.
    * @example
    *
    * // Might throw exception if message doesn't exist or not visible due to scope.
    * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
    * var response = sm.execute();
    * var headers = response.getHeaders();
    */
  def getHeaders(): js.Object = js.native
  
  /**
    * Get the fully-resolved query sent to the REST endpoint.
    *
    * This query contains the endpoint URL as well as any values assigned to variables in the
    * REST message. Use this method only with responses to direct requests. This method is not
    * supported for requests sent asynchronously, or requests sent using a MID server.
    *
    * @returns The fully-resolved query.
    * @example
    *
    * // Might throw exception if message doesn't exist or not visible due to scope.
    * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
    * var response = sm.execute();
    * var queryString = response.getQueryString();
    */
  def getQueryString(): String = js.native
  
  /**
    * Get the sys_id value of the attachment created from the response body content.
    *
    * If the RESTMessageV2 object associated with this response called the
    * `saveResponseBodyAsAttachment(...)` function, use `getResponseAttachmentSysid()` to get the
    * sys_id of the created attachment record. Use this function when you want to perform
    * additional operations with the new attachment record.
    *
    * @returns The sys_id of the new attachment record.
    */
  def getResponseAttachmentSysid(): String = js.native
  
  /**
    * Get the numeric HTTP status code returned by the REST provider.
    *
    * @returns The numeric status code returned by the REST provider, such as 200 for a
    * successful response.
    * @example
    *
    * // Might throw exception if message doesn't exist or not visible due to scope.
    * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
    * var response = sm.execute();
    * var statusCode = response.getStatusCode();
    */
  def getStatusCode(): Double = js.native
  
  /**
    * Indicate if there was an error during the REST transaction.
    *
    * @returns Returns true if there was an error, false if there was no error.
    * @example
    *
    * // Might throw exception if message doesn't exist or not visible due to scope.
    * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
    * var response = sm.execute();
    * var error = response.haveError();
    */
  def haveError(): Boolean = js.native
  
  /**
    * Set the amount of time the instance waits for a response from the web service provider.
    *
    * This method overrides the property glide.rest.outbound.ecc_response.timeout for this REST
    * response.
    *
    * @param timeoutSecs The amount of time, in seconds, to wait for this response.
    * @example
    *
    * var sm = new sn_ws.RESTMessageV2("Yahoo Finance","get"); //Might throw exception if message doesn't exist or not visible due to scope.
    * var response = sm.executeAsync();
    * response.waitForResponse(60);
    */
  def waitForResponse(timeoutSecs: Double): Unit = js.native
}
object RESTResponseV2 {
  
  @scala.inline
  def apply(
    getAllHeaders: () => js.Array[Name],
    getBody: () => String,
    getCookies: () => Get,
    getErrorCode: () => Double,
    getErrorMessage: () => String,
    getHeader: String => String,
    getHeaders: () => js.Object,
    getQueryString: () => String,
    getResponseAttachmentSysid: () => String,
    getStatusCode: () => Double,
    haveError: () => Boolean,
    waitForResponse: Double => Unit
  ): RESTResponseV2 = {
    val __obj = js.Dynamic.literal(getAllHeaders = js.Any.fromFunction0(getAllHeaders), getBody = js.Any.fromFunction0(getBody), getCookies = js.Any.fromFunction0(getCookies), getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction0(getHeaders), getQueryString = js.Any.fromFunction0(getQueryString), getResponseAttachmentSysid = js.Any.fromFunction0(getResponseAttachmentSysid), getStatusCode = js.Any.fromFunction0(getStatusCode), haveError = js.Any.fromFunction0(haveError), waitForResponse = js.Any.fromFunction1(waitForResponse))
    __obj.asInstanceOf[RESTResponseV2]
  }
  
  @scala.inline
  implicit class RESTResponseV2Ops[Self <: RESTResponseV2] (val x: Self) extends AnyVal {
    
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
    def setGetAllHeaders(value: () => js.Array[Name]): Self = this.set("getAllHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBody(value: () => String): Self = this.set("getBody", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCookies(value: () => Get): Self = this.set("getCookies", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorCode(value: () => Double): Self = this.set("getErrorCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorMessage(value: () => String): Self = this.set("getErrorMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeader(value: String => String): Self = this.set("getHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHeaders(value: () => js.Object): Self = this.set("getHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetQueryString(value: () => String): Self = this.set("getQueryString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResponseAttachmentSysid(value: () => String): Self = this.set("getResponseAttachmentSysid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStatusCode(value: () => Double): Self = this.set("getStatusCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHaveError(value: () => Boolean): Self = this.set("haveError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWaitForResponse(value: Double => Unit): Self = this.set("waitForResponse", js.Any.fromFunction1(value))
  }
}
