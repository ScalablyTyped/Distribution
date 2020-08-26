package typings.restifyPlugins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestExpiryOptions extends js.Object {
  /**
    * Header name of the absolute time for request expiration
    */
  var absoluteHeader: js.UndefOr[String] = js.native
  /**
    * Header name for the start time of the request
    */
  var startHeader: js.UndefOr[String] = js.native
  /**
    * The header name for the time in milliseconds that should ellapse before the request is considered expired.
    */
  var timeoutHeader: js.UndefOr[String] = js.native
}

object RequestExpiryOptions {
  @scala.inline
  def apply(): RequestExpiryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestExpiryOptions]
  }
  @scala.inline
  implicit class RequestExpiryOptionsOps[Self <: RequestExpiryOptions] (val x: Self) extends AnyVal {
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
    def setAbsoluteHeader(value: String): Self = this.set("absoluteHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsoluteHeader: Self = this.set("absoluteHeader", js.undefined)
    @scala.inline
    def setStartHeader(value: String): Self = this.set("startHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartHeader: Self = this.set("startHeader", js.undefined)
    @scala.inline
    def setTimeoutHeader(value: String): Self = this.set("timeoutHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutHeader: Self = this.set("timeoutHeader", js.undefined)
  }
  
}

