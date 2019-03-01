package typings
package prettyDashBytesLib.prettyDashBytesMod.PrettyBytesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrettyBytesOptions extends js.Object {
  var locale: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var signed: js.UndefOr[scala.Boolean] = js.undefined
}

object PrettyBytesOptions {
  @scala.inline
  def apply(locale: scala.Boolean | java.lang.String = null, signed: js.UndefOr[scala.Boolean] = js.undefined): PrettyBytesOptions = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed)
    __obj.asInstanceOf[PrettyBytesOptions]
  }
}

