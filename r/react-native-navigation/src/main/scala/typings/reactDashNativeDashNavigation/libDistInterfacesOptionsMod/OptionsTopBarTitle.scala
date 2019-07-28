package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import typings.reactDashNativeDashNavigation.Anon_Alignment
import typings.reactDashNativeDashNavigation.reactDashNativeDashNavigationStrings.center
import typings.reactDashNativeDashNavigation.reactDashNativeDashNavigationStrings.fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsTopBarTitle extends js.Object {
  /**
    * Title alignment
    * #### (Android specific)
    */
  var alignment: js.UndefOr[center | fill] = js.undefined
  /**
    * Text color
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Custom component as the title view
    */
  var component: js.UndefOr[Anon_Alignment] = js.undefined
  /**
    * Title font family
    *
    * Make sure that the font is available
    */
  var fontFamily: js.UndefOr[FontFamily] = js.undefined
  /**
    * Font size
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    * Top Bar title height in densitiy pixels
    * #### (Android specific)
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Text to display in the title area
    */
  var text: js.UndefOr[String] = js.undefined
}

object OptionsTopBarTitle {
  @scala.inline
  def apply(
    alignment: center | fill = null,
    color: Color = null,
    component: Anon_Alignment = null,
    fontFamily: FontFamily = null,
    fontSize: Int | Double = null,
    height: Int | Double = null,
    text: String = null
  ): OptionsTopBarTitle = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (component != null) __obj.updateDynamic("component")(component)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[OptionsTopBarTitle]
  }
}

