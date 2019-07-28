package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsTopBarLargeTitle extends js.Object {
  /**
    * Set the color of large title's text
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Set the font family of large title's text
    */
  var fontFamily: js.UndefOr[FontFamily] = js.undefined
  /**
    * Set the font size of large title's text
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    * Enable large titles
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object OptionsTopBarLargeTitle {
  @scala.inline
  def apply(
    color: Color = null,
    fontFamily: FontFamily = null,
    fontSize: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): OptionsTopBarLargeTitle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[OptionsTopBarLargeTitle]
  }
}

