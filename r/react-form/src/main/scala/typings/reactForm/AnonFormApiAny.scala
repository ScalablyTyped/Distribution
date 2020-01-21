package typings.reactForm

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormApiAny extends js.Object {
  var formApi: Validator[_]
}

object AnonFormApiAny {
  @scala.inline
  def apply(formApi: Validator[_]): AnonFormApiAny = {
    val __obj = js.Dynamic.literal(formApi = formApi.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFormApiAny]
  }
}

