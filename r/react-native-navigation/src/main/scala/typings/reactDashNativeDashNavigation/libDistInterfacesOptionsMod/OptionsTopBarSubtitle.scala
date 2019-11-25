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
    * Set the font weight, ignore fontFamily and use the iOS system fonts instead
    * #### (iOS specific)
    */
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
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
    fontWeight: FontWeight = null,
    text: String = null
  ): OptionsTopBarSubtitle = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTopBarSubtitle]
  }
}

