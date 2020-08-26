package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.anon.Data
import typings.protractorHttpMock.anon.PathRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PUT request mock.
  */
@js.native
trait Put[TResponse] extends js.Object {
  var request: PathRegex = js.native
  var response: Data[TResponse] = js.native
}

object Put {
  @scala.inline
  def apply[TResponse](request: PathRegex, response: Data[TResponse]): Put[TResponse] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Put[TResponse]]
  }
  @scala.inline
  implicit class PutOps[Self <: Put[_], TResponse] (val x: Self with Put[TResponse]) extends AnyVal {
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
    def setRequest(value: PathRegex): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: Data[TResponse]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

