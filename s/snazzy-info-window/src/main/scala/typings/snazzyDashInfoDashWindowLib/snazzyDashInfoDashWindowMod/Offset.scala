package typings
package snazzyDashInfoDashWindowLib.snazzyDashInfoDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var bottom: js.UndefOr[java.lang.String] = js.undefined
  var left: js.UndefOr[java.lang.String] = js.undefined
  var right: js.UndefOr[java.lang.String] = js.undefined
  var top: js.UndefOr[java.lang.String] = js.undefined
}

object Offset {
  @scala.inline
  def apply(
    bottom: java.lang.String = null,
    left: java.lang.String = null,
    right: java.lang.String = null,
    top: java.lang.String = null
  ): Offset = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (top != null) __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[Offset]
  }
}

