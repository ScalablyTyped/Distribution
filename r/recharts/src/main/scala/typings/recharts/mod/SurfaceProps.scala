package typings.recharts.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var viewBox: js.UndefOr[ViewBox] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SurfaceProps {
  @scala.inline
  def apply(
    children: js.Array[ReactNode] | ReactNode = null,
    className: String = null,
    height: js.UndefOr[Double] = js.undefined,
    style: js.Object = null,
    viewBox: ViewBox = null,
    width: js.UndefOr[Double] = js.undefined
  ): SurfaceProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceProps]
  }
}

