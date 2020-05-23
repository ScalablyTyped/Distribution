package typings.sharepoint.SPClientForms.ClientValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorSet extends js.Object {
  def RegisterValidator(validator: IValidator): Unit
}

object ValidatorSet {
  @scala.inline
  def apply(RegisterValidator: IValidator => Unit): ValidatorSet = {
    val __obj = js.Dynamic.literal(RegisterValidator = js.Any.fromFunction1(RegisterValidator))
    __obj.asInstanceOf[ValidatorSet]
  }
}

