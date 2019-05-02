package typings
package simplecrawlerLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupOptions extends js.Object {
  var all: js.UndefOr[scala.Boolean] = js.undefined
  var family: js.UndefOr[scala.Double] = js.undefined
  var hints: js.UndefOr[scala.Double] = js.undefined
}

object LookupOptions {
  @scala.inline
  def apply(
    all: js.UndefOr[scala.Boolean] = js.undefined,
    family: scala.Int | scala.Double = null,
    hints: scala.Int | scala.Double = null
  ): LookupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupOptions]
  }
}

