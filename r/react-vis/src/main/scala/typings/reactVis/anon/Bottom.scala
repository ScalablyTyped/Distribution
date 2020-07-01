package typings.reactVis.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bottom extends js.Object {
  var bottom: js.UndefOr[CSSProperties] = js.undefined
  var left: js.UndefOr[CSSProperties] = js.undefined
  var right: js.UndefOr[CSSProperties] = js.undefined
  var top: js.UndefOr[CSSProperties] = js.undefined
}

object Bottom {
  @scala.inline
  def apply(
    bottom: CSSProperties = null,
    left: CSSProperties = null,
    right: CSSProperties = null,
    top: CSSProperties = null
  ): Bottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
}

