package typings.reactNativeElements.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.ButtonInformation
import typings.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.PricingCardProps>> */
trait RecursivePartialPartialPr extends js.Object {
  var button: js.UndefOr[RecursivePartial[js.UndefOr[ButtonInformation]]] = js.undefined
  var color: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var info: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[String]]]] = js.undefined
  var infoStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var onButtonPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var price: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var pricingStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var title: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var titleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  var wrapperStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
}

object RecursivePartialPartialPr {
  @scala.inline
  def apply(
    button: RecursivePartial[js.UndefOr[ButtonInformation]] = null,
    color: RecursivePartial[js.UndefOr[String]] = null,
    containerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    info: RecursivePartial[js.UndefOr[js.Array[String]]] = null,
    infoStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    onButtonPress: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    price: RecursivePartial[js.UndefOr[String]] = null,
    pricingStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    title: RecursivePartial[js.UndefOr[String]] = null,
    titleStyle: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]] = null,
    wrapperStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null
  ): RecursivePartialPartialPr = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (infoStyle != null) __obj.updateDynamic("infoStyle")(infoStyle.asInstanceOf[js.Any])
    if (onButtonPress != null) __obj.updateDynamic("onButtonPress")(onButtonPress.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (pricingStyle != null) __obj.updateDynamic("pricingStyle")(pricingStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialPartialPr]
  }
}

