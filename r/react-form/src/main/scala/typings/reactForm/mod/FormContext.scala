package typings.reactForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormContext extends js.Object {
  var formApi: FormApi
}

object FormContext {
  @scala.inline
  def apply(formApi: FormApi): FormContext = {
    val __obj = js.Dynamic.literal(formApi = formApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormContext]
  }
}

