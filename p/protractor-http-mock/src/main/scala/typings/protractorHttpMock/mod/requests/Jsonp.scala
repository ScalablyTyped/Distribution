package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.anon.Data
import typings.protractorHttpMock.anon.PathString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSONP request mock.
  */
@js.native
trait Jsonp[TResponse] extends js.Object {
  var request: PathString = js.native
  var response: Data[TResponse] = js.native
}

object Jsonp {
  @scala.inline
  def apply[TResponse](request: PathString, response: Data[TResponse]): Jsonp[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jsonp[TResponse]]
  }
  @scala.inline
  implicit class JsonpOps[Self <: Jsonp[_], TResponse] (val x: Self with Jsonp[TResponse]) extends AnyVal {
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
    def setRequest(value: PathString): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: Data[TResponse]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

