package typings.shimmer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var logger: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
}

object Logger {
  @scala.inline
  def apply(logger: /* msg */ String => Unit = null): Logger = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(js.Any.fromFunction1(logger))
    __obj.asInstanceOf[Logger]
  }
}

