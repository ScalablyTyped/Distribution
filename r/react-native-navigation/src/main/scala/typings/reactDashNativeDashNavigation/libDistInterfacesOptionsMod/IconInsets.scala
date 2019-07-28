package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconInsets extends js.Object {
  /**
    * Configure bottom inset
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
    * Configure left inset
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * Configure right inset
    */
  var right: js.UndefOr[Double] = js.undefined
  /**
    * Configure top inset
    */
  var top: js.UndefOr[Double] = js.undefined
}

object IconInsets {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): IconInsets = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconInsets]
  }
}

