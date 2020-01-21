package typings.reactNativeFirebase.mod.RNFirebase.perf

import typings.reactNativeFirebase.reactNativeFirebaseBooleans.`false`
import typings.reactNativeFirebase.reactNativeFirebaseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpMetric extends js.Object {
  /**
    * Return an attribute by name, or null if it does not exist.
    */
  def getAttribute(attribute: String): js.Promise[String | Null]
  /**
    * Return an object of key-value attributes.
    */
  def getAttributes(): js.Promise[js.Object]
  /**
    * Set an attribute. Returns true if it was set, false if it was not.
    */
  def putAttribute(attribute: String, value: String): js.Promise[`true` | `false`]
  /**
    * Remove an attribute by name.
    */
  def removeAttribute(attribute: String): js.Promise[Null]
  /**
    * Set the request HTTP response code.
    */
  def setHttpResponseCode(code: Double): js.Promise[Null]
  /**
    * Set the request payload size, in bytes.
    */
  def setRequestPayloadSize(bytes: Double): js.Promise[Null]
  /**
    * Set the response content type.
    */
  def setResponseContentType(`type`: String): js.Promise[Null]
  /**
    * Set the response payload size, in bytes.
    */
  def setResponsePayloadSize(bytes: Double): js.Promise[Null]
  /**
    * Start a HttpMetric instance.
    */
  def start(): js.Promise[Null]
  /**
    * Stop a HttpMetric instance.
    */
  def stop(): js.Promise[Null]
}

object HttpMetric {
  @scala.inline
  def apply(
    getAttribute: String => js.Promise[String | Null],
    getAttributes: () => js.Promise[js.Object],
    putAttribute: (String, String) => js.Promise[`true` | `false`],
    removeAttribute: String => js.Promise[Null],
    setHttpResponseCode: Double => js.Promise[Null],
    setRequestPayloadSize: Double => js.Promise[Null],
    setResponseContentType: String => js.Promise[Null],
    setResponsePayloadSize: Double => js.Promise[Null],
    start: () => js.Promise[Null],
    stop: () => js.Promise[Null]
  ): HttpMetric = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getAttributes = js.Any.fromFunction0(getAttributes), putAttribute = js.Any.fromFunction2(putAttribute), removeAttribute = js.Any.fromFunction1(removeAttribute), setHttpResponseCode = js.Any.fromFunction1(setHttpResponseCode), setRequestPayloadSize = js.Any.fromFunction1(setRequestPayloadSize), setResponseContentType = js.Any.fromFunction1(setResponseContentType), setResponsePayloadSize = js.Any.fromFunction1(setResponsePayloadSize), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[HttpMetric]
  }
}

