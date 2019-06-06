package typings
package reduxDashImmutableDashStateDashInvariantLib.reduxDashImmutableDashStateDashInvariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait immutableStateInvariantMiddlewareOptions extends js.Object {
  var ignore: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var isImmutable: js.UndefOr[js.Function1[/* value */ js.Any, scala.Boolean]] = js.undefined
}

object immutableStateInvariantMiddlewareOptions {
  @scala.inline
  def apply(ignore: js.Array[java.lang.String] = null, isImmutable: /* value */ js.Any => scala.Boolean = null): immutableStateInvariantMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (isImmutable != null) __obj.updateDynamic("isImmutable")(js.Any.fromFunction1(isImmutable))
    __obj.asInstanceOf[immutableStateInvariantMiddlewareOptions]
  }
}

