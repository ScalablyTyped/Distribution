package typings
package reduxDashFormLib.libFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedFieldMetaProps extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.native
  var asyncValidating: scala.Boolean = js.native
  var autofilled: scala.Boolean = js.native
  var dirty: scala.Boolean = js.native
  @JSName("dispatch")
  var dispatch_Original: reduxLib.reduxMod.Dispatch[_] = js.native
  var error: js.UndefOr[js.Any] = js.native
  var form: java.lang.String = js.native
  var initial: js.Any = js.native
  var invalid: scala.Boolean = js.native
  var pristine: scala.Boolean = js.native
  var submitFailed: scala.Boolean = js.native
  var submitting: scala.Boolean = js.native
  var touched: scala.Boolean = js.native
  var valid: scala.Boolean = js.native
  var visited: scala.Boolean = js.native
  var warning: js.UndefOr[js.Any] = js.native
  def dispatch[T /* <: js.Any */](action: T): T = js.native
}

