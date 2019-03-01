package typings
package reduxDashFormLib.reduxDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WarningOther[T] extends js.Object {
  var _warning: js.UndefOr[T] = js.undefined
}

object WarningOther {
  @scala.inline
  def apply[T](_warning: T = null): WarningOther[T] = {
    val __obj = js.Dynamic.literal()
    if (_warning != null) __obj.updateDynamic("_warning")(_warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[WarningOther[T]]
  }
}

