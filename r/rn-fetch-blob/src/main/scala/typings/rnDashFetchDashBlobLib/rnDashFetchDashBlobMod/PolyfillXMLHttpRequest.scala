package typings
package rnDashFetchDashBlobLib.rnDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolyfillXMLHttpRequest extends PolyfillXMLHttpRequestEventTarget {
  val DONE: scala.Double = js.native
  val HEADERS_RECEIVED: scala.Double = js.native
  val LOADING: scala.Double = js.native
  val OPENED: scala.Double = js.native
  val UNSENT: scala.Double = js.native
  var readyState: scala.Double = js.native
  var response: js.Any = js.native
  var responseHeaders: js.Any = js.native
  var responseText: js.Any = js.native
  var responseType: java.lang.String = js.native
  var responseURL: java.lang.String = js.native
  var status: scala.Double = js.native
  var statusText: java.lang.String = js.native
  var timeout: scala.Double = js.native
  var upload: PolyfillXMLHttpRequestEventTarget = js.native
  def abort(): scala.Unit = js.native
  def getAllResponseHeaders(): java.lang.String | scala.Null = js.native
  def getResponseHeader(field: java.lang.String): java.lang.String | scala.Null = js.native
  def onreadystatechange(e: stdLib.Event): scala.Unit = js.native
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
  def open_true(
    method: java.lang.String,
    url: java.lang.String,
    async: rnDashFetchDashBlobLib.rnDashFetchDashBlobLibNumbers.`true`,
    user: js.Any,
    password: js.Any
  ): scala.Unit = js.native
  def overrideMimeType(mime: java.lang.String): scala.Unit = js.native
  /**
    * Invoke this function to send HTTP request, and set body.
    * @param body Body in RNfetchblob flavor
    */
  def send(body: js.Any): scala.Unit = js.native
  def setRequestHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

