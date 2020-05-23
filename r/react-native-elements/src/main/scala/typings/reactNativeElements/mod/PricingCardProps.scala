package typings.reactNativeElements.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PricingCardProps extends js.Object {
  /**
    * {title, icon, buttonStyle}
    * Button information
    */
  var button: ButtonInformation
  /**
    * Color scheme for button & title
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Outer component styling
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Pricing information
    */
  var info: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * component info text style
    */
  var infoStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Function to be run when button is pressed
    */
  var onButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Price
    */
  var price: String
  /**
    * component pricing text style
    */
  var pricingStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Title
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * component title style
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Inner wrapper component styling
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object PricingCardProps {
  @scala.inline
  def apply(
    button: ButtonInformation,
    price: String,
    color: String = null,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    info: js.Array[String] = null,
    infoStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    onButtonPress: () => Unit = null,
    pricingStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    title: String = null,
    titleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    wrapperStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): PricingCardProps = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (!js.isUndefined(infoStyle)) __obj.updateDynamic("infoStyle")(infoStyle.asInstanceOf[js.Any])
    if (onButtonPress != null) __obj.updateDynamic("onButtonPress")(js.Any.fromFunction0(onButtonPress))
    if (!js.isUndefined(pricingStyle)) __obj.updateDynamic("pricingStyle")(pricingStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleStyle)) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapperStyle)) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingCardProps]
  }
}

