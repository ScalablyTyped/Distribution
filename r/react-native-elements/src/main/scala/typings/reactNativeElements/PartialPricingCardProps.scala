package typings.reactNativeElements

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
    containerStyle: StyleProp[ViewStyle] = null,
    info: js.Array[String] = null,
    infoStyle: StyleProp[TextStyle] = null,
    onButtonPress: () => Unit = null,
    price: String = null,
    pricingStyle: StyleProp[TextStyle] = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null,
    wrapperStyle: StyleProp[ViewStyle] = null
  ): PartialPricingCardProps = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (infoStyle != null) __obj.updateDynamic("infoStyle")(infoStyle.asInstanceOf[js.Any])
    if (onButtonPress != null) __obj.updateDynamic("onButtonPress")(js.Any.fromFunction0(onButtonPress))
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (pricingStyle != null) __obj.updateDynamic("pricingStyle")(pricingStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPricingCardProps]
  }
}

