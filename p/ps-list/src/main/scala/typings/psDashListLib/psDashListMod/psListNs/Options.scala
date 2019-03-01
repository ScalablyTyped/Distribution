package typings
package psDashListLib.psDashListMod.psListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var all: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(all: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    __obj.asInstanceOf[Options]
  }
}

