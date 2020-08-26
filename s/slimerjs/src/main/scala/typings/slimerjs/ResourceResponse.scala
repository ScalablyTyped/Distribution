package typings.slimerjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceResponse extends js.Object {
  var body: js.Any = js.native
  var bodySize: Double = js.native
  var contentCharset: String = js.native
  var contentType: js.UndefOr[String] = js.native
  var headers: StringDictionary[String] = js.native
  var httpVersion: HttpVersion = js.native
  var id: Double = js.native
  var isFileDownloading: Boolean = js.native
  var redirectURL: js.UndefOr[String] = js.native
  var referrer: String = js.native
  var stage: String = js.native
  var status: Double = js.native
  var statusText: String = js.native
  var time: Date = js.native
  var url: String = js.native
}

object ResourceResponse {
  @scala.inline
  def apply(
    body: js.Any,
    bodySize: Double,
    contentCharset: String,
    headers: StringDictionary[String],
    httpVersion: HttpVersion,
    id: Double,
    isFileDownloading: Boolean,
    referrer: String,
    stage: String,
    status: Double,
    statusText: String,
    time: Date,
    url: String
  ): ResourceResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], bodySize = bodySize.asInstanceOf[js.Any], contentCharset = contentCharset.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFileDownloading = isFileDownloading.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceResponse]
  }
  @scala.inline
  implicit class ResourceResponseOps[Self <: ResourceResponse] (val x: Self) extends AnyVal {
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
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodySize(value: Double): Self = this.set("bodySize", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentCharset(value: String): Self = this.set("contentCharset", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpVersion(value: HttpVersion): Self = this.set("httpVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFileDownloading(value: Boolean): Self = this.set("isFileDownloading", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Date): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setRedirectURL(value: String): Self = this.set("redirectURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectURL: Self = this.set("redirectURL", js.undefined)
  }
  
}

