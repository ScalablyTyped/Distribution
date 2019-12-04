package typings.reactDashToolbox.componentsButtonIconButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconButtonTheme extends js.Object {
  /**
    * Used for the root in case button is accent.
    */
  var accent: js.UndefOr[String] = js.undefined
  /**
    * Used for the root element in any button.
    */
  var button: js.UndefOr[String] = js.undefined
  /**
    * For the icon inside a button.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * Used when colors are inverted.
    */
  var inverse: js.UndefOr[String] = js.undefined
  /**
    * Used for neutral colored buttons.
    */
  var neutral: js.UndefOr[String] = js.undefined
  /**
    * Used for primary buttons when button is primary.
    */
  var primary: js.UndefOr[String] = js.undefined
  /**
    * Used for the ripple element.
    */
  var rippleWrapper: js.UndefOr[String] = js.undefined
  /**
    * Used for toggle buttons in the root element.
    */
  var toggle: js.UndefOr[String] = js.undefined
}

object IconButtonTheme {
  @scala.inline
  def apply(
    accent: String = null,
    button: String = null,
    icon: String = null,
    inverse: String = null,
    neutral: String = null,
    primary: String = null,
    rippleWrapper: String = null,
    toggle: String = null
  ): IconButtonTheme = {
    val __obj = js.Dynamic.literal()
    if (accent != null) __obj.updateDynamic("accent")(accent.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (inverse != null) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (neutral != null) __obj.updateDynamic("neutral")(neutral.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (rippleWrapper != null) __obj.updateDynamic("rippleWrapper")(rippleWrapper.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonTheme]
  }
}

