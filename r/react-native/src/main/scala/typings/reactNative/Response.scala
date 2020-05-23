package typings.reactNative

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response
  extends Object
     with Body {
  val headers: Headers
  val ok: Boolean
  val redirected: Boolean
  val status: Double
  val statusText: String
  val `type`: ResponseType
  val url: String
}

object Response {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    constructor: js.Function,
    formData: () => js.Promise[FormData],
    hasOwnProperty: PropertyKey => Boolean,
    headers: Headers,
    json: () => js.Promise[_],
    ok: Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    redirected: Boolean,
    status: Double,
    statusText: String,
    text: () => js.Promise[String],
    `type`: ResponseType,
    url: String
  ): Response = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

