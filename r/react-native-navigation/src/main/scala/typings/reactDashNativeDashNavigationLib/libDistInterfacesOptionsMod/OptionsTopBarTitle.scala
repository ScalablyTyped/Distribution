package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsTopBarTitle extends js.Object {
  /**
    * Title alignment
    * #### (Android specific)
    */
  var alignment: js.UndefOr[
    reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.center | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.fill
  ] = js.undefined
  /**
    * Text color
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Custom component as the title view
    */
  var component: js.UndefOr[reactDashNativeDashNavigationLib.Anon_Alignment] = js.undefined
  /**
    * Title font family
    *
    * Make sure that the font is available
    */
  var fontFamily: js.UndefOr[FontFamily] = js.undefined
  /**
    * Font size
    */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Top Bar title height in densitiy pixels
    * #### (Android specific)
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Text to display in the title area
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object OptionsTopBarTitle {
  @scala.inline
  def apply(
    alignment: reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.center | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.fill = null,
    color: Color = null,
    component: reactDashNativeDashNavigationLib.Anon_Alignment = null,
    fontFamily: FontFamily = null,
    fontSize: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    text: java.lang.String = null
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

