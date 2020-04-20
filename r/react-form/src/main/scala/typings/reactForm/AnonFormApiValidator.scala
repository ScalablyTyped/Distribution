package typings.reactForm

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormApiValidator extends js.Object {
  var formApi: Validator[_]
}

object AnonFormApiValidator {
  @scala.inline
  def apply(formApi: Validator[_]): AnonFormApiValidator = {
    val __obj = js.Dynamic.literal(formApi = formApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormApiValidator]
  }
}

