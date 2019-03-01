package typings
package puppeteerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  /** Bottom margin. */
  var bottom: js.UndefOr[puppeteerLib.puppeteerMod.LayoutDimension] = js.undefined
  /** Left margin. */
  var left: js.UndefOr[puppeteerLib.puppeteerMod.LayoutDimension] = js.undefined
  /** Right margin. */
  var right: js.UndefOr[puppeteerLib.puppeteerMod.LayoutDimension] = js.undefined
  /** Top margin. */
  var top: js.UndefOr[puppeteerLib.puppeteerMod.LayoutDimension] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    bottom: puppeteerLib.puppeteerMod.LayoutDimension = null,
    left: puppeteerLib.puppeteerMod.LayoutDimension = null,
    right: puppeteerLib.puppeteerMod.LayoutDimension = null,
    top: puppeteerLib.puppeteerMod.LayoutDimension = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

