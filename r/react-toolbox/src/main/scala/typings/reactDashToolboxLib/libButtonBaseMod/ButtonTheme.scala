package typings
package reactDashToolboxLib.libButtonBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonTheme extends js.Object {
  /**
    * Used for the root in case button is accent.
    */
  var accent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the root element in any button.
    */
  var button: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used when the button is flat for the root element.
    */
  var flat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used when the button is floating for the root element.
    */
  var floating: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For the icon inside a button.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used when colors are inverted.
    */
  var inverse: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for mini floating buttons.
    */
  var mini: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for neutral colored buttons.
    */
  var neutral: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for primary buttons when button is primary.
    */
  var primary: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used when the button is raised for root element.
    */
  var raised: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the ripple element.
    */
  var rippleWrapper: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for toggle buttons in the root element.
    */
  var toggle: js.UndefOr[java.lang.String] = js.undefined
}

object ButtonTheme {
  @scala.inline
  def apply(
    accent: java.lang.String = null,
    button: java.lang.String = null,
    flat: java.lang.String = null,
    floating: java.lang.String = null,
    icon: java.lang.String = null,
    inverse: java.lang.String = null,
    mini: java.lang.String = null,
    neutral: java.lang.String = null,
    primary: java.lang.String = null,
    raised: java.lang.String = null,
    rippleWrapper: java.lang.String = null,
    toggle: java.lang.String = null
  ): ButtonTheme = {
    val __obj = js.Dynamic.literal()
    if (accent != null) __obj.updateDynamic("accent")(accent)
    if (button != null) __obj.updateDynamic("button")(button)
    if (flat != null) __obj.updateDynamic("flat")(flat)
    if (floating != null) __obj.updateDynamic("floating")(floating)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (inverse != null) __obj.updateDynamic("inverse")(inverse)
    if (mini != null) __obj.updateDynamic("mini")(mini)
    if (neutral != null) __obj.updateDynamic("neutral")(neutral)
    if (primary != null) __obj.updateDynamic("primary")(primary)
    if (raised != null) __obj.updateDynamic("raised")(raised)
    if (rippleWrapper != null) __obj.updateDynamic("rippleWrapper")(rippleWrapper)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[ButtonTheme]
  }
}

