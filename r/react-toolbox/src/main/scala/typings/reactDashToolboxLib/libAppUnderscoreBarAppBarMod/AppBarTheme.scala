package typings
package reactDashToolboxLib.libAppUnderscoreBarAppBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppBarTheme extends js.Object {
  /**
    * Used for the component root element.
    */
  var appBar: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root element when the app bar is fixed.
    */
  var fixed: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root element when the app bar is flat.
    */
  var flat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the left icon app bar element.
    */
  var leftIcon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the right icon app bar element.
    */
  var rightIcon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root element when the app bar is hidden during scroll.
    */
  var scrollHide: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used as the app bar title.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object AppBarTheme {
  @scala.inline
  def apply(
    appBar: java.lang.String = null,
    fixed: java.lang.String = null,
    flat: java.lang.String = null,
    leftIcon: java.lang.String = null,
    rightIcon: java.lang.String = null,
    scrollHide: java.lang.String = null,
    title: java.lang.String = null
  ): AppBarTheme = {
    val __obj = js.Dynamic.literal()
    if (appBar != null) __obj.updateDynamic("appBar")(appBar)
    if (fixed != null) __obj.updateDynamic("fixed")(fixed)
    if (flat != null) __obj.updateDynamic("flat")(flat)
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon)
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon)
    if (scrollHide != null) __obj.updateDynamic("scrollHide")(scrollHide)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AppBarTheme]
  }
}

