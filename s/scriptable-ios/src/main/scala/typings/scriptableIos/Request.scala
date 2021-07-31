package typings.scriptableIos

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Performs HTTP requests._
  *
  * Constructs a new request that will be sent to the provided URL. The request is not sent until an appropriate load method is called, e.g. loadImage for downloading and interpreting
  * the response as an image.
  * @see https://docs.scriptable.app/request/#-new-request
  */
@js.native
trait Request extends StObject {
  
  /**
    * _Adds a file to a multipart request._
    *
    * Converts the request to a multipart request and adds the file to the request. Be aware that the `body` property on the request is ignored for multipart requests as parameters and
    * files added to the request constitutes the body.
    *
    * Calling this function will make the request a multipart request. When the request is send, the content type will automatically be set to "multipart/form-data".
    * @param data - File data to add.
    * @param mimeType - MIME type of the file to add.
    * @param name - Name of the parameter which holds the file.
    * @param filename - Name of the file.
    * @see https://docs.scriptable.app/request/#-addfiledatatomultipart
    */
  def addFileDataToMultipart(data: Data, mimeType: String, name: String, filename: String): Unit = js.native
  
  /**
    * _Adds a file to a multipart request._
    *
    * Converts the request to a multipart request and adds the file to the request. The function will automatically determine the MIME type of the file as well as the filename. Be aware
    * that the `body` property on the request is ignored for multipart requests as parameters and files added to the request constitutes the body.
    *
    * Calling this function will make the request a multipart request. When the request is send, the content type will automatically be set to "multipart/form-data".
    * @param filePath - Path of the file to add.
    * @param name - Name of the parameter which holds the file.
    * @param filename - Optional name of the uploaded file.
    * @see https://docs.scriptable.app/request/#-addfiletomultipart
    */
  def addFileToMultipart(filePath: String, name: String): Unit = js.native
  def addFileToMultipart(filePath: String, name: String, filename: String): Unit = js.native
  
  /**
    * _Adds an image to a multipart request._
    *
    * Converts the request to a multipart request and adds the image to the request. The function will automatically determine the MIME type of the file Be aware that the `body` property
    * on the request is ignored for multipart requests as parameters and files added to the request constitutes the body.
    *
    * Calling this function will make the request a multipart request. When the request is send, the content type will automatically be set to "multipart/form-data".
    * @param image - Image to add.
    * @param name - Name of the parameter which holds the file.
    * @param filename - Optional name of the uploaded file.
    * @see https://docs.scriptable.app/request/#-addimagetomultipart
    */
  def addImageToMultipart(image: Image, name: String): Unit = js.native
  def addImageToMultipart(image: Image, name: String, filename: String): Unit = js.native
  
  /**
    * _Adds a parameter to a multipart request._
    *
    * Converts the request to a multipart request and adds a parameter with the specified name and value. Be aware that the `body` property on the request is ignored for multipart
    * requests as parameters and files added to the request constitutes the body.
    *
    * Calling this function will make the request a multipart request. When the request is send, the content type will automatically be set to "multipart/form-data".
    * @param name - Name of the parameter.
    * @param value - Value of the parameter.
    * @see https://docs.scriptable.app/request/#-addparametertomultipart
    */
  def addParameterToMultipart(name: String, value: String): Unit = js.native
  
  /**
    * _Allow the request even if it is deemed insecure._
    *
    * By default Scriptable will attempt to reject requests that are deemed insecure.
    *
    * As an example, Scriptable will reject communicating with a server that has an invalid certificate. Such servers might be malicious and may put confidentional information at risk.
    * By enabling this setting, those requests will be allowed.
    *
    * Enable this setting at your own risk.
    * @see https://docs.scriptable.app/request/#allowinsecurerequest
    */
  var allowInsecureRequest: Boolean = js.native
  
  /**
    * _Body to send with the request._
    *
    * The body will be send along the request. While this property can be any value, currently only strings and Data is supported.
    *
    * Be aware that this property is ignored if you convert the request to a multipart request using `addParameterToMultipart`, `addFileToMultipart` or `addFileDataToMultipart`.
    * @see https://docs.scriptable.app/request/#body
    */
  var body: js.Any = js.native
  
  /**
    * _HTTP headers to send with the request._
    *
    * Key value pairs where the key is the name of an HTTP header and the value will be sent as the value for the HTTP header.
    * @see https://docs.scriptable.app/request/#headers
    */
  var headers: StringDictionary[String] = js.native
  
  /**
    * _Sends request._
    *
    * Call to send the configured request to the specified URL. The raw response is provided when the returned promise is fulfilled.
    * @see https://docs.scriptable.app/request/#-load
    */
  def load(): js.Promise[Data] = js.native
  
  /**
    * _Sends request and parses response as an image._
    *
    * Call to send the configured request to the specified URL. The response is expected to be an image.
    * @see https://docs.scriptable.app/request/#-loadimage
    */
  def loadImage(): js.Promise[Image] = js.native
  
  /**
    * _Sends request and parses response as JSON._
    *
    * Call to send the configured request to the specified URL. The response is expected to be a valid JSON string and is parsed into an object.
    * @see https://docs.scriptable.app/request/#-loadjson
    */
  def loadJSON(): js.Promise[js.Any] = js.native
  
  /**
    * _Sends request and parses response as a string._
    *
    * Call to send the configured request to the specified URL. The response is parsed to a string and provided when the returned promise is fulfilled.
    * @see https://docs.scriptable.app/request/#-loadstring
    */
  def loadString(): js.Promise[String] = js.native
  
  /**
    * _HTTP method used for the request._
    *
    * Specifies the HTTP method to use when sending the request. The default is to send the request using the GET HTTP method.
    * @see https://docs.scriptable.app/request/#method
    */
  var method: String = js.native
  
  /**
    * _Function called upon redirect._
    *
    * The function determines how redirects should be handled. By default redirects are allowed. When invoked the function is supplied with the request that we're about to redirect to.
    * The function can return the request to continue redirecting or it can return another request to redirect to. Returning null will stop the redirect. Note that onRedirect will only
    * be invoked on the initial request. Consecutive redirects should be handled on the initial request.
    * @see https://docs.scriptable.app/request/#onredirect
    */
  def onRedirect(arg0: Request): Request = js.native
  
  /**
    * _Response of the request._
    *
    * The response is not populated until the request has been completed. The response is an object that looks like the following example.
    *
    *     {
    *       "url": "https://example.com/",
    *       "statusCode": 200
    *       "mimeType": "application/json",
    *       "textEncodingName": "utf-8",
    *       "headers": {
    *         "Content-Type": "application/json;charset=utf-8",
    *         "Content-Length": "17671"
    *       },
    *       "cookies": [{
    *         "path": "/",
    *         "httpOnly": true,
    *         "domain": "www.example.com",
    *         "sessionOnly": true,
    *         "name": "JSESSIONID",
    *         "value": "7616271F4878CFD05182D20C45F4CEB3"
    *       }]
    *     }
    * @see https://docs.scriptable.app/request/#response
    */
  var response: StringDictionary[js.Any] = js.native
  
  /**
    * _Timeout interval of the request._
    *
    * If a request remains idle for longer than the timeout interval, the request is considered timed out.
    *
    * The timeout interval is measured in seconds and defaults to 60 seconds.
    * @see https://docs.scriptable.app/request/#timeoutinterval
    */
  var timeoutInterval: Double = js.native
  
  /**
    * _URL to send request to._
    * @see https://docs.scriptable.app/request/#url
    */
  var url: String = js.native
}
