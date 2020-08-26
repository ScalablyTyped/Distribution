package typings.raygun.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestDetails extends js.Object {
  var form: js.Object = js.native
  var headers: js.Object = js.native
  var hostName: String = js.native
  var httpMethod: String = js.native
  var ipAddress: String = js.native
  var queryString: js.Object = js.native
  var url: String = js.native
}

object RequestDetails {
  @scala.inline
  def apply(
    form: js.Object,
    headers: js.Object,
    hostName: String,
    httpMethod: String,
    ipAddress: String,
    queryString: js.Object,
    url: String
  ): RequestDetails = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDetails]
  }
  @scala.inline
  implicit class RequestDetailsOps[Self <: RequestDetails] (val x: Self) extends AnyVal {
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
    def setForm(value: js.Object): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostName(value: String): Self = this.set("hostName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryString(value: js.Object): Self = this.set("queryString", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

