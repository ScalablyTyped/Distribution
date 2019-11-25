package typings.reactDashSpinners.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderSizeProps extends CommonProps {
  var size: js.UndefOr[Double] = js.undefined
  var sizeUnit: js.UndefOr[String] = js.undefined
}

object LoaderSizeProps {
  @scala.inline
  def apply(
    color: String = null,
    css: String | PrecompiledCss = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    sizeUnit: String = null
  ): LoaderSizeProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeUnit != null) __obj.updateDynamic("sizeUnit")(sizeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderSizeProps]
  }
}

