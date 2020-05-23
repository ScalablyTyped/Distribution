package typings.puppeteer.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshopOptions extends js.Object {
  /**
    * Prune uninteresting nodes from the tree.
    * @default true
    */
  var interestingOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The root DOM element for the snapshot.
    * @default document.body
    */
  var root: js.UndefOr[ElementHandle[Element]] = js.undefined
}

object SnapshopOptions {
  @scala.inline
  def apply(interestingOnly: js.UndefOr[Boolean] = js.undefined, root: ElementHandle[Element] = null): SnapshopOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interestingOnly)) __obj.updateDynamic("interestingOnly")(interestingOnly.get.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshopOptions]
  }
}

