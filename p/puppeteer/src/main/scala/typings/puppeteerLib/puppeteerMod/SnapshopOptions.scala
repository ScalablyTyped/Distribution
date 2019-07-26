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
  /**
    * The root DOM element for the snapshot.
    * @default document.body
    */
  var root: js.UndefOr[ElementHandle[stdLib.Element]] = js.undefined
}

object SnapshopOptions {
  @scala.inline
  def apply(
    interestingOnly: js.UndefOr[scala.Boolean] = js.undefined,
    root: ElementHandle[stdLib.Element] = null
  ): SnapshopOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interestingOnly)) __obj.updateDynamic("interestingOnly")(interestingOnly)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[SnapshopOptions]
  }
}

