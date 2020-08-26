package typings.request.mod

import typings.request.anon.MimeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpArchiveRequest extends js.Object {
  var headers: js.UndefOr[js.Array[NameValuePair]] = js.native
  var method: js.UndefOr[String] = js.native
  var postData: js.UndefOr[MimeType] = js.native
  var url: js.UndefOr[String] = js.native
}

object HttpArchiveRequest {
  @scala.inline
  def apply(): HttpArchiveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpArchiveRequest]
  }
  @scala.inline
  implicit class HttpArchiveRequestOps[Self <: HttpArchiveRequest] (val x: Self) extends AnyVal {
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
    def setHeadersVarargs(value: NameValuePair*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[NameValuePair]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setPostData(value: MimeType): Self = this.set("postData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostData: Self = this.set("postData", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

