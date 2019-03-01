package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshopOptions extends js.Object {
  /**
    * Prune uninteresting nodes from the tree.
    * @default true
    */
  var interestingOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object SnapshopOptions {
  @scala.inline
  def apply(interestingOnly: js.UndefOr[scala.Boolean] = js.undefined): SnapshopOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interestingOnly)) __obj.updateDynamic("interestingOnly")(interestingOnly)
    __obj.asInstanceOf[SnapshopOptions]
  }
}

