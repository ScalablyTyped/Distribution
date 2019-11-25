package typings.ractive.ractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOpts extends js.Object {
  /**
  	 * Whether or not to include attached children when searching.j
  	 */
  var remote: js.UndefOr[Boolean] = js.undefined
}

object FindOpts {
  @scala.inline
  def apply(remote: js.UndefOr[Boolean] = js.undefined): FindOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(remote)) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindOpts]
  }
}

