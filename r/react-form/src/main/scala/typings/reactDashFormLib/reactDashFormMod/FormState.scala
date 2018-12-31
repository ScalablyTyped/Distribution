package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormState extends js.Object {
  var dirty: js.UndefOr[scala.Boolean] = js.undefined
  var errors: FormErrors
  var nestedErrors: NestedErrors
  var touched: Touched
  var values: FormValues
}

