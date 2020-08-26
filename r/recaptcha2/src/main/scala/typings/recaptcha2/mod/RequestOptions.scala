package typings.recaptcha2.mod

import typings.recaptcha2.recaptcha2Booleans.`true`
import typings.recaptcha2.recaptcha2Strings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions[T] extends js.Object {
  var form: T = js.native
  var json: `true` = js.native
  var method: POST = js.native
  var uri: String = js.native
}

object RequestOptions {
  @scala.inline
  def apply[T](form: T, json: `true`, method: POST, uri: String): RequestOptions[T] = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions[T]]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions[_], T] (val x: Self with RequestOptions[T]) extends AnyVal {
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
    def setForm(value: T): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def setJson(value: `true`): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: POST): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

