package typings.reactDashToolbox.componentsButtonBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonTheme extends js.Object {
  /**
    * Used for the root in case button is accent.
    */
  var accent: js.UndefOr[String] = js.undefined
  /**
    * Used for the root element in any button.
    */
  var button: js.UndefOr[String] = js.undefined
  /**
    * Used when the button is flat for the root element.
    */
  var flat: js.UndefOr[String] = js.undefined
  /**
    * Used when the button is floating for the root element.
    */
  var floating: js.UndefOr[String] = js.undefined
  /**
    * For the icon inside a button.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * Used when colors are inverted.
    */
  var inverse: js.UndefOr[String] = js.undefined
  /**
    * Used for mini floating buttons.
    */
  var mini: js.UndefOr[String] = js.undefined
  /**
    * Used for neutral colored buttons.
    */
  var neutral: js.UndefOr[String] = js.undefined
  /**
    * Used for primary buttons when button is primary.
    */
  var primary: js.UndefOr[String] = js.undefined
  /**
    * Used when the button is raised for root element.
    */
  var raised: js.UndefOr[String] = js.undefined
  /**
    * Used for the ripple element.
    */
  var rippleWrapper: js.UndefOr[String] = js.undefined
  /**
    * Used for toggle buttons in the root element.
    */
  var toggle: js.UndefOr[String] = js.undefined
}

object ButtonTheme {
  @scala.inline
  def apply(
    accent: String = null,
    button: String = null,
    flat: String = null,
    floating: String = null,
    icon: String = null,
    inverse: String = null,
    mini: String = null,
    neutral: String = null,
    primary: String = null,
    raised: String = null,
    rippleWrapper: String = null,
    toggle: String = null
  ): ButtonTheme = {
    val __obj = js.Dynamic.literal()
    if (accent != null) __obj.updateDynamic("accent")(accent.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (flat != null) __obj.updateDynamic("flat")(flat.asInstanceOf[js.Any])
    if (floating != null) __obj.updateDynamic("floating")(floating.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (inverse != null) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (mini != null) __obj.updateDynamic("mini")(mini.asInstanceOf[js.Any])
    if (neutral != null) __obj.updateDynamic("neutral")(neutral.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (raised != null) __obj.updateDynamic("raised")(raised.asInstanceOf[js.Any])
    if (rippleWrapper != null) __obj.updateDynamic("rippleWrapper")(rippleWrapper.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonTheme]
  }
}

