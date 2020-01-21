package typings.reduxImmutableStateInvariant.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait immutableStateInvariantMiddlewareOptions extends js.Object {
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  var isImmutable: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.undefined
}

object immutableStateInvariantMiddlewareOptions {
  @scala.inline
  def apply(ignore: js.Array[String] = null, isImmutable: /* value */ js.Any => Boolean = null): immutableStateInvariantMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (isImmutable != null) __obj.updateDynamic("isImmutable")(js.Any.fromFunction1(isImmutable))
    __obj.asInstanceOf[immutableStateInvariantMiddlewareOptions]
  }
}

