package typings.sharepoint.SP

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseInfo extends js.Object {
  var allResponseHeaders: js.UndefOr[String] = js.native
  /** Can be string or bytearray depending on request.binaryStringResponseBody field */
  var body: js.UndefOr[String | Uint8Array] = js.native
  var contentType: js.UndefOr[String] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var responseAvailable: Boolean = js.native
  var state: js.UndefOr[js.Any] = js.native
  var statusCode: js.UndefOr[Double] = js.native
  var statusText: js.UndefOr[String] = js.native
}

object ResponseInfo {
  @scala.inline
  def apply(responseAvailable: Boolean): ResponseInfo = {
    val __obj = js.Dynamic.literal(responseAvailable = responseAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInfo]
  }
  @scala.inline
  implicit class ResponseInfoOps[Self <: ResponseInfo] (val x: Self) extends AnyVal {
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
    def setResponseAvailable(value: Boolean): Self = this.set("responseAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllResponseHeaders(value: String): Self = this.set("allResponseHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllResponseHeaders: Self = this.set("allResponseHeaders", js.undefined)
    @scala.inline
    def setBody(value: String | Uint8Array): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusText: Self = this.set("statusText", js.undefined)
  }
  
}

