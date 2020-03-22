package typings.reactSpinners.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderHeightWidthProps extends CommonProps {
  var height: js.UndefOr[LengthType] = js.undefined
  var width: js.UndefOr[LengthType] = js.undefined
}

object LoaderHeightWidthProps {
  @scala.inline
  def apply(
    color: String = null,
    css: String | PrecompiledCss = null,
    height: LengthType = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    width: LengthType = null
  ): LoaderHeightWidthProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderHeightWidthProps]
  }
}

