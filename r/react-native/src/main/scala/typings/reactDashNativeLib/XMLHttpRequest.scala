package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLHttpRequest
  extends stdLib.EventTarget
     with XMLHttpRequestEventTarget {
  val DONE: scala.Double = js.native
  val HEADERS_RECEIVED: scala.Double = js.native
  val LOADING: scala.Double = js.native
  val OPENED: scala.Double = js.native
  val UNSENT: scala.Double = js.native
  //  msCaching: string;
  var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]) | scala.Null = js.native
  val readyState: scala.Double = js.native
  val response: js.Any = js.native
  val responseText: java.lang.String = js.native
  var responseType: XMLHttpRequestResponseType = js.native
  val responseURL: java.lang.String = js.native
  val responseXML: stdLib.Document | scala.Null = js.native
  val status: scala.Double = js.native
  val statusText: java.lang.String = js.native
  var timeout: scala.Double = js.native
  val upload: XMLHttpRequestUpload = js.native
  var withCredentials: scala.Boolean = js.native
  def abort(): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  def getAllResponseHeaders(): java.lang.String = js.native
  def getResponseHeader(header: java.lang.String): java.lang.String | scala.Null = js.native
  //  msCachingEnabled(): boolean;
  def open(method: java.lang.String, url: java.lang.String): scala.Unit = js.native
  def open(method: java.lang.String, url: java.lang.String, async: scala.Boolean): scala.Unit = js.native
  def open(method: java.lang.String, url: java.lang.String, async: scala.Boolean, user: java.lang.String): scala.Unit = js.native
  def open(
    method: java.lang.String,
    url: java.lang.String,
    async: scala.Boolean,
    user: java.lang.String,
    password: java.lang.String
  ): scala.Unit = js.native
  def open(
    method: java.lang.String,
    url: java.lang.String,
    async: scala.Boolean,
    user: scala.Null,
    password: java.lang.String
  ): scala.Unit = js.native
  def overrideMimeType(mime: java.lang.String): scala.Unit = js.native
  //  addEventListener(type: string, listener: EventListenerOrEventListenerObject): void;
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: reactDashNativeLib.reactDashNativeLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  def send(): scala.Unit = js.native
  def send(data: js.Any): scala.Unit = js.native
  def setRequestHeader(header: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

@JSGlobal("XMLHttpRequest")
@js.native
object XMLHttpRequest
  extends org.scalablytyped.runtime.Instantiable0[XMLHttpRequest] {
  val DONE: scala.Double = js.native
  val HEADERS_RECEIVED: scala.Double = js.native
  val LOADING: scala.Double = js.native
  val OPENED: scala.Double = js.native
  val UNSENT: scala.Double = js.native
}

