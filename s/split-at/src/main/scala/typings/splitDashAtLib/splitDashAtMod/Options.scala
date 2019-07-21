package typings
package splitDashAtLib.splitDashAtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Remove the chosen indices.
  		Similar to the default `String#split` behaviour.
  		@default false
  		*/
  val remove: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(remove: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[Options]
  }
}

