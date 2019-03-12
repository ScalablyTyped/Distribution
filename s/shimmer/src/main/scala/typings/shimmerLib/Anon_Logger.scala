package typings
package shimmerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Logger extends js.Object {
  var logger: js.UndefOr[js.Function1[/* msg */ java.lang.String, scala.Unit]] = js.undefined
}

object Anon_Logger {
  @scala.inline
  def apply(logger: /* msg */ java.lang.String => scala.Unit = null): Anon_Logger = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(js.Any.fromFunction1(logger))
    __obj.asInstanceOf[Anon_Logger]
  }
}

