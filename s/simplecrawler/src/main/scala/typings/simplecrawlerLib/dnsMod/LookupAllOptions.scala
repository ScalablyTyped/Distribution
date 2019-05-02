package typings
package simplecrawlerLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupAllOptions extends LookupOptions {
  @JSName("all")
  var all_LookupAllOptions: simplecrawlerLib.simplecrawlerLibNumbers.`true`
}

object LookupAllOptions {
  @scala.inline
  def apply(
    all: simplecrawlerLib.simplecrawlerLibNumbers.`true`,
    family: scala.Int | scala.Double = null,
    hints: scala.Int | scala.Double = null
  ): LookupAllOptions = {
    val __obj = js.Dynamic.literal(all = all)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupAllOptions]
  }
}

