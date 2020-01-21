package typings.reactForm

import typings.reactForm.mod.FormApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormApi extends js.Object {
  var formApi: FormApi
}

object AnonFormApi {
  @scala.inline
  def apply(formApi: FormApi): AnonFormApi = {
    val __obj = js.Dynamic.literal(formApi = formApi.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFormApi]
  }
}

