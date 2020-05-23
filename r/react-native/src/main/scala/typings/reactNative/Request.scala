package typings.reactNative

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request
  extends Object
     with Body {
  val credentials: RequestCredentials
  val headers: Headers
  val method: String
  val mode: RequestMode
  val referrer: String
  val url: String
}

object Request {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    constructor: js.Function,
    credentials: RequestCredentials,
    formData: () => js.Promise[FormData],
    hasOwnProperty: PropertyKey => Boolean,
    headers: Headers,
    json: () => js.Promise[_],
    method: String,
    mode: RequestMode,
    propertyIsEnumerable: PropertyKey => Boolean,
    referrer: String,
    text: () => js.Promise[String],
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), referrer = referrer.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

