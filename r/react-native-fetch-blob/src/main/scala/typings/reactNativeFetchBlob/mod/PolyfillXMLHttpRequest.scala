package typings.reactNativeFetchBlob.mod

import typings.reactNativeFetchBlob.reactNativeFetchBlobBooleans.`true`
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolyfillXMLHttpRequest extends PolyfillXMLHttpRequestEventTarget {
  
  val DONE: Double = js.native
  
  val HEADERS_RECEIVED: Double = js.native
  
  val LOADING: Double = js.native
  
  val OPENED: Double = js.native
  
  val UNSENT: Double = js.native
  
  def abort(): Unit = js.native
  
  def getAllResponseHeaders(): String | Null = js.native
  
  def getResponseHeader(field: String): String | Null = js.native
  
  def onreadystatechange(e: Event): Unit = js.native
  
  /**
    * XMLHttpRequest.open, always async, user and password not supported. When
    * this method invoked, headers should becomes empty again.
    * @param  method Request method
    * @param  url Request URL
    * @param  async Always async
    * @param  user NOT SUPPORTED
    * @param  password NOT SUPPORTED
    */
  @JSName("open")
  def open_true(method: String, url: String, async: `true`, user: js.Any, password: js.Any): Unit = js.native
  
  def overrideMimeType(mime: String): Unit = js.native
  
  var readyState: Double = js.native
  
  var response: js.Any = js.native
  
  var responseHeaders: js.Any = js.native
  
  var responseText: js.Any = js.native
  
  var responseType: String = js.native
  
  var responseURL: String = js.native
  
  /**
    * Invoke this function to send HTTP request, and set body.
    * @param body Body in RNfetchblob flavor
    */
  def send(body: js.Any): Unit = js.native
  
  def setRequestHeader(name: String, value: String): Unit = js.native
  
  var status: Double = js.native
  
  var statusText: String = js.native
  
  var timeout: Double = js.native
  
  var upload: PolyfillXMLHttpRequestEventTarget = js.native
}
object PolyfillXMLHttpRequest {
  
  @JSImport("react-native-fetch-blob", "PolyfillXMLHttpRequest.DONE")
  @js.native
  val DONE: Double = js.native
  
  @JSImport("react-native-fetch-blob", "PolyfillXMLHttpRequest.HEADERS_RECEIVED")
  @js.native
  val HEADERS_RECEIVED: Double = js.native
  
  @JSImport("react-native-fetch-blob", "PolyfillXMLHttpRequest.LOADING")
  @js.native
  val LOADING: Double = js.native
  
  @JSImport("react-native-fetch-blob", "PolyfillXMLHttpRequest.OPENED")
  @js.native
  val OPENED: Double = js.native
  
  @JSImport("react-native-fetch-blob", "PolyfillXMLHttpRequest.UNSENT")
  @js.native
  val UNSENT: Double = js.native
  
  @JSImport("react-native-fetch-blob", "PolyfillXMLHttpRequest.addBinaryContentType")
  @js.native
  def addBinaryContentType(substr: String): Unit = js.native
  
  @JSImport("react-native-fetch-blob", "PolyfillXMLHttpRequest.binaryContentTypes")
  @js.native
  val binaryContentTypes: js.Array[String] = js.native
  
  @JSImport("react-native-fetch-blob", "PolyfillXMLHttpRequest.removeBinaryContentType")
  @js.native
  def removeBinaryContentType(): Unit = js.native
  
  @JSImport("react-native-fetch-blob", "PolyfillXMLHttpRequest.setLog")
  @js.native
  def setLog(level: Double): Unit = js.native
}
