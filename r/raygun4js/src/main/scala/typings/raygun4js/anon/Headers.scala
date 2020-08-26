package typings.raygun4js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  var Headers: Host = js.native
  var QueryString: String = js.native
  var Url: String = js.native
}

object Headers {
  @scala.inline
  def apply(Headers: Host, QueryString: String, Url: String): Headers = {
    val __obj = js.Dynamic.literal(Headers = Headers.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
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
    def setHeaders(value: Host): Self = this.set("Headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryString(value: String): Self = this.set("QueryString", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
  }
  
}

