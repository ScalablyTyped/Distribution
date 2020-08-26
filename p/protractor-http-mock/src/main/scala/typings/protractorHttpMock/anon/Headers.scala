package typings.protractorHttpMock.anon

import typings.protractorHttpMock.protractorHttpMockStrings.GET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  var headers: js.UndefOr[js.Object] = js.native
  var method: GET = js.native
  var params: js.UndefOr[js.Object] = js.native
  var path: String = js.native
  var queryString: js.UndefOr[js.Object] = js.native
  var regex: js.UndefOr[Boolean] = js.native
}

object Headers {
  @scala.inline
  def apply(method: GET, path: String): Headers = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
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
    def setMethod(value: GET): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setQueryString(value: js.Object): Self = this.set("queryString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryString: Self = this.set("queryString", js.undefined)
    @scala.inline
    def setRegex(value: Boolean): Self = this.set("regex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
  }
  
}

