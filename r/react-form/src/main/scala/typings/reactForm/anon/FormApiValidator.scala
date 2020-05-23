package typings.reactForm.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormApiValidator extends js.Object {
  var formApi: Validator[_]
}

object FormApiValidator {
  @scala.inline
  def apply(formApi: Validator[_]): FormApiValidator = {
    val __obj = js.Dynamic.literal(formApi = formApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormApiValidator]
  }
}

