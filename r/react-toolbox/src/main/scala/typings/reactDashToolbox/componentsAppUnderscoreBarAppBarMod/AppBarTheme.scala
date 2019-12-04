package typings.reactDashToolbox.componentsAppUnderscoreBarAppBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppBarTheme extends js.Object {
  /**
    * Used for the component root element.
    */
  var appBar: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element when the app bar is fixed.
    */
  var fixed: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element when the app bar is flat.
    */
  var flat: js.UndefOr[String] = js.undefined
  /**
    * Added to the left icon app bar element.
    */
  var leftIcon: js.UndefOr[String] = js.undefined
  /**
    * Added to the right icon app bar element.
    */
  var rightIcon: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element when the app bar is hidden during scroll.
    */
  var scrollHide: js.UndefOr[String] = js.undefined
  /**
    * Used as the app bar title.
    */
  var title: js.UndefOr[String] = js.undefined
}

object AppBarTheme {
  @scala.inline
  def apply(
    appBar: String = null,
    fixed: String = null,
    flat: String = null,
    leftIcon: String = null,
    rightIcon: String = null,
    scrollHide: String = null,
    title: String = null
  ): AppBarTheme = {
    val __obj = js.Dynamic.literal()
    if (appBar != null) __obj.updateDynamic("appBar")(appBar.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (flat != null) __obj.updateDynamic("flat")(flat.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (scrollHide != null) __obj.updateDynamic("scrollHide")(scrollHide.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppBarTheme]
  }
}

