package typings.reactNativeElements.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.ButtonInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.PricingCardProps> */
@js.native
trait PartialPricingCardProps extends js.Object {
  
  var button: js.UndefOr[ButtonInformation] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var info: js.UndefOr[js.Array[String]] = js.native
  
  var infoStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var onButtonPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var price: js.UndefOr[String] = js.native
  
  var pricingStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object PartialPricingCardProps {
  
  @scala.inline
  def apply(): PartialPricingCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPricingCardProps]
  }
  
  @scala.inline
  implicit class PartialPricingCardPropsOps[Self <: PartialPricingCardProps] (val x: Self) extends AnyVal {
    
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
    def deleteButton: Self = this.set("button", js.undefined)
    
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
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
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
