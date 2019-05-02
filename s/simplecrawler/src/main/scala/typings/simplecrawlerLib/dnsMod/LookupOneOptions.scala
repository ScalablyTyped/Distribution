package typings
package simplecrawlerLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupOneOptions extends LookupOptions {
  @JSName("all")
  var all_LookupOneOptions: js.UndefOr[simplecrawlerLib.simplecrawlerLibNumbers.`false`] = js.undefined
}

object LookupOneOptions {
  @scala.inline
  def apply(
    all: simplecrawlerLib.simplecrawlerLibNumbers.`false` = null,
    family: scala.Int | scala.Double = null,
    hints: scala.Int | scala.Double = null
  ): LookupOneOptions = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupOneOptions]
  }
}

