package typings.psList.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Include other users' processes as well as your own.
  		On Windows this has no effect and will always be the users' own processes.
  		@default true
  		*/
  val all: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(all: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

