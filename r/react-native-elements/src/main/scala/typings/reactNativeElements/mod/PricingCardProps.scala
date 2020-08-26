package typings.reactNativeElements.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PricingCardProps extends js.Object {
  /**
    * {title, icon, buttonStyle}
    * Button information
    */
  var button: ButtonInformation = js.native
  /**
    * Color scheme for button & title
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Outer component styling
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Pricing information
    */
  var info: js.UndefOr[js.Array[String]] = js.native
  /**
    * component info text style
    */
  var infoStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Function to be run when button is pressed
    */
  var onButtonPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Price
    */
  var price: String = js.native
  /**
    * component pricing text style
    */
  var pricingStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Title
    */
  var title: js.UndefOr[String] = js.native
  /**
    * component title style
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Inner wrapper component styling
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object PricingCardProps {
  @scala.inline
  def apply(button: ButtonInformation, price: String): PricingCardProps = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingCardProps]
  }
  @scala.inline
  implicit class PricingCardPropsOps[Self <: PricingCardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setButton(value: ButtonInformation): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setInfoVarargs(value: String*): Self = this.set("info", js.Array(value :_*))
    @scala.inline
    def setInfo(value: js.Array[String]): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setInfoStyle(value: StyleProp[TextStyle]): Self = this.set("infoStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoStyle: Self = this.set("infoStyle", js.undefined)
    @scala.inline
    def setInfoStyleNull: Self = this.set("infoStyle", null)
    @scala.inline
    def setOnButtonPress(value: () => Unit): Self = this.set("onButtonPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnButtonPress: Self = this.set("onButtonPress", js.undefined)
    @scala.inline
    def setPricingStyle(value: StyleProp[TextStyle]): Self = this.set("pricingStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricingStyle: Self = this.set("pricingStyle", js.undefined)
    @scala.inline
    def setPricingStyleNull: Self = this.set("pricingStyle", null)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    @scala.inline
    def setTitleStyleNull: Self = this.set("titleStyle", null)
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
    @scala.inline
    def setWrapperStyleNull: Self = this.set("wrapperStyle", null)
  }
  
}

