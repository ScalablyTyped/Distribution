package typings.reactNativeElements.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.ButtonInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.PricingCardProps> */
trait PartialPricingCardProps extends js.Object {
  var button: js.UndefOr[ButtonInformation] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var info: js.UndefOr[js.Array[String]] = js.undefined
  var infoStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var onButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var price: js.UndefOr[String] = js.undefined
  var pricingStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object PartialPricingCardProps {
  @scala.inline
  def apply(
    button: ButtonInformation = null,
    color: String = null,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    info: js.Array[String] = null,
    infoStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    onButtonPress: () => Unit = null,
    price: String = null,
    pricingStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    title: String = null,
    titleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    wrapperStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): PartialPricingCardProps = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (!js.isUndefined(infoStyle)) __obj.updateDynamic("infoStyle")(infoStyle.asInstanceOf[js.Any])
    if (onButtonPress != null) __obj.updateDynamic("onButtonPress")(js.Any.fromFunction0(onButtonPress))
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (!js.isUndefined(pricingStyle)) __obj.updateDynamic("pricingStyle")(pricingStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleStyle)) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapperStyle)) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPricingCardProps]
  }
}

