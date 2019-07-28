package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import typings.reactDashNativeDashNavigation.reactDashNativeDashNavigationStrings.center
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsTopBarSubtitle extends js.Object {
  /**
    * Set subtitle alignment
    */
  var alignment: js.UndefOr[center] = js.undefined
  /**
    * Set subtitle color
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Set subtitle font family
    */
  var fontFamily: js.UndefOr[FontFamily] = js.undefined
  /**
    * Set subtitle font size
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    * Set subtitle text
    */
  var text: js.UndefOr[String] = js.undefined
}

object OptionsTopBarSubtitle {
  @scala.inline
  def apply(
    alignment: center = null,
    color: Color = null,
    fontFamily: FontFamily = null,
    fontSize: Int | Double = null,
    text: String = null
  ): OptionsTopBarSubtitle = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[OptionsTopBarSubtitle]
  }
}

