package typings
package sendmailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var debug: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var error: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var info: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var warn: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    debug: js.Function0[scala.Unit] = null,
    error: js.Function0[scala.Unit] = null,
    info: js.Function0[scala.Unit] = null,
    warn: js.Function0[scala.Unit] = null
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(debug)
    if (error != null) __obj.updateDynamic("error")(error)
    if (info != null) __obj.updateDynamic("info")(info)
    if (warn != null) __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Anon_Debug]
  }
}

