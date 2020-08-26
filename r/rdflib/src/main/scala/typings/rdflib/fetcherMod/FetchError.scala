package typings.rdflib.fetcherMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchError extends Error {
  var response: js.UndefOr[ExtendedResponse] = js.native
  var status: js.UndefOr[StatusValues] = js.native
  var statusText: js.UndefOr[String] = js.native
}

object FetchError {
  @scala.inline
  def apply(message: String, name: String): FetchError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchError]
  }
  @scala.inline
  implicit class FetchErrorOps[Self <: FetchError] (val x: Self) extends AnyVal {
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
    def setResponse(value: ExtendedResponse): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setStatus(value: StatusValues): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusText: Self = this.set("statusText", js.undefined)
  }
  
}

