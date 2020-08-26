package typings.reactNativeFirebase.mod.RNFirebase.perf

import typings.reactNativeFirebase.reactNativeFirebaseBooleans.`false`
import typings.reactNativeFirebase.reactNativeFirebaseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpMetric extends js.Object {
  /**
    * Return an attribute by name, or null if it does not exist.
    */
  def getAttribute(attribute: String): js.Promise[String | Null] = js.native
  /**
    * Return an object of key-value attributes.
    */
  def getAttributes(): js.Promise[js.Object] = js.native
  /**
    * Set an attribute. Returns true if it was set, false if it was not.
    */
  def putAttribute(attribute: String, value: String): js.Promise[`true` | `false`] = js.native
  /**
    * Remove an attribute by name.
    */
  def removeAttribute(attribute: String): js.Promise[Null] = js.native
  /**
    * Set the request HTTP response code.
    */
  def setHttpResponseCode(code: Double): js.Promise[Null] = js.native
  /**
    * Set the request payload size, in bytes.
    */
  def setRequestPayloadSize(bytes: Double): js.Promise[Null] = js.native
  /**
    * Set the response content type.
    */
  def setResponseContentType(`type`: String): js.Promise[Null] = js.native
  /**
    * Set the response payload size, in bytes.
    */
  def setResponsePayloadSize(bytes: Double): js.Promise[Null] = js.native
  /**
    * Start a HttpMetric instance.
    */
  def start(): js.Promise[Null] = js.native
  /**
    * Stop a HttpMetric instance.
    */
  def stop(): js.Promise[Null] = js.native
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
  @scala.inline
  implicit class HttpMetricOps[Self <: HttpMetric] (val x: Self) extends AnyVal {
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
    def setGetAttribute(value: String => js.Promise[String | Null]): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAttributes(value: () => js.Promise[js.Object]): Self = this.set("getAttributes", js.Any.fromFunction0(value))
    @scala.inline
    def setPutAttribute(value: (String, String) => js.Promise[`true` | `false`]): Self = this.set("putAttribute", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveAttribute(value: String => js.Promise[Null]): Self = this.set("removeAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHttpResponseCode(value: Double => js.Promise[Null]): Self = this.set("setHttpResponseCode", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRequestPayloadSize(value: Double => js.Promise[Null]): Self = this.set("setRequestPayloadSize", js.Any.fromFunction1(value))
    @scala.inline
    def setSetResponseContentType(value: String => js.Promise[Null]): Self = this.set("setResponseContentType", js.Any.fromFunction1(value))
    @scala.inline
    def setSetResponsePayloadSize(value: Double => js.Promise[Null]): Self = this.set("setResponsePayloadSize", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: () => js.Promise[Null]): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => js.Promise[Null]): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

