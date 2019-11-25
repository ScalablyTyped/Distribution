package typings.ractive.ractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpts extends js.Object {
  /**
  	 * Whether or not to unwrap the value if it happens to be wrapped, returning the original value. Defaults to true.
  	 */
  var unwrap: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Whether or not to include links and computations in the output. This creates a deep copy of the data, so changing any of it directly will have no effect on the data in Ractive's models. Defaults to true for root data and false everywhere else.
  	 */
  var virtual: js.UndefOr[Boolean] = js.undefined
}

object GetOpts {
  @scala.inline
  def apply(unwrap: js.UndefOr[Boolean] = js.undefined, virtual: js.UndefOr[Boolean] = js.undefined): GetOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(unwrap)) __obj.updateDynamic("unwrap")(unwrap.asInstanceOf[js.Any])
    if (!js.isUndefined(virtual)) __obj.updateDynamic("virtual")(virtual.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpts]
  }
}

