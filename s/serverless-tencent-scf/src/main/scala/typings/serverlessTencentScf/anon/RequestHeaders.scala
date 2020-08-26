package typings.serverlessTencentScf.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHeaders extends js.Object {
  var requestHeaders: StringDictionary[String] = js.native
  var requestSourceIP: String = js.native
}

object RequestHeaders {
  @scala.inline
  def apply(requestHeaders: StringDictionary[String], requestSourceIP: String): RequestHeaders = {
    val __obj = js.Dynamic.literal(requestHeaders = requestHeaders.asInstanceOf[js.Any], requestSourceIP = requestSourceIP.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestHeaders]
  }
  @scala.inline
  implicit class RequestHeadersOps[Self <: RequestHeaders] (val x: Self) extends AnyVal {
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
    def setRequestHeaders(value: StringDictionary[String]): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestSourceIP(value: String): Self = this.set("requestSourceIP", value.asInstanceOf[js.Any])
  }
  
}

