package typings
package psDashListLib.psDashListMod.psListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Include other users' processes as well as your own.
  		On Windows this has no effect and will always be the users' own processes.
  		@default true
  		*/
  val all: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(all: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    __obj.asInstanceOf[Options]
  }
}

