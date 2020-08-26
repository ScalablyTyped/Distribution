package typings.protractorHttpMock.mod.requests

import typings.protractorHttpMock.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * POST request mock with payload.
  */
@js.native
trait PostData[TResponse, TPayload] extends js.Object {
  var request: typings.protractorHttpMock.anon.Method[TPayload] = js.native
  var response: Data[TResponse] = js.native
}

object PostData {
  @scala.inline
  def apply[TResponse, TPayload](request: typings.protractorHttpMock.anon.Method[TPayload], response: Data[TResponse]): PostData[TResponse, TPayload] = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostData[TResponse, TPayload]]
  }
  @scala.inline
  implicit class PostDataOps[Self <: PostData[_, _], TResponse, TPayload] (val x: Self with (PostData[TResponse, TPayload])) extends AnyVal {
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
    def setRequest(value: typings.protractorHttpMock.anon.Method[TPayload]): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: Data[TResponse]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

