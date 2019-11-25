package typings.recaptcha2.recaptcha2Mod

import typings.recaptcha2.recaptcha2Numbers.`true`
import typings.recaptcha2.recaptcha2Strings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions[T] extends js.Object {
  var form: T
  var json: `true`
  var method: POST
  var uri: String
}

object RequestOptions {
  @scala.inline
  def apply[T](form: T, json: `true`, method: POST, uri: String): RequestOptions[T] = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestOptions[T]]
  }
}

