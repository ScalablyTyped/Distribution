package typings.sendmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var debug: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function0[Unit]] = js.undefined
  var info: js.UndefOr[js.Function0[Unit]] = js.undefined
  var warn: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    debug: () => Unit = null,
    error: () => Unit = null,
    info: () => Unit = null,
    warn: () => Unit = null
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction0(debug))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction0(error))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction0(info))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction0(warn))
    __obj.asInstanceOf[Anon_Debug]
  }
}

