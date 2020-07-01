package typings.reactVis.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Angle extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object Angle {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    className: String = null,
    label: String = null,
    radius: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null
  ): Angle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Angle]
  }
}

