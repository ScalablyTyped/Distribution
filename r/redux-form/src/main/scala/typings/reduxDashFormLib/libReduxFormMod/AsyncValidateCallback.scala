package typings
package reduxDashFormLib.libReduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncValidateCallback[FormData, ErrorType] extends js.Object {
  var asyncErrors: js.UndefOr[reduxDashFormLib.reduxDashFormMod.FormErrors[FormData, ErrorType]] = js.undefined
  var blurredField: js.UndefOr[java.lang.String] = js.undefined
  var initialized: scala.Boolean
  var pristine: scala.Boolean
  var syncValidationPasses: scala.Boolean
  var trigger: reduxDashFormLib.reduxDashFormLibStrings.blur | reduxDashFormLib.reduxDashFormLibStrings.submit
}

