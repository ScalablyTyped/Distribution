package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormContext extends js.Object {
  var formApi: FormApi
}

object FormContext {
  @scala.inline
  def apply(formApi: FormApi): FormContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formApi")(formApi)
    __obj.asInstanceOf[FormContext]
  }
}

