package typings.reactNativeElements.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.ButtonInformation
import typings.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.PricingCardProps>> */
@js.native
trait RecursivePartialPartialPr extends js.Object {
  
  var button: js.UndefOr[RecursivePartial[js.UndefOr[ButtonInformation]]] = js.native
  
  var color: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var info: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[String]]]] = js.native
  
  var infoStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  
  var onButtonPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var price: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var pricingStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  
  var title: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var titleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  
  var wrapperStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
}
object RecursivePartialPartialPr {
  
  @scala.inline
  def apply(): RecursivePartialPartialPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialPr]
  }
  
  @scala.inline
  implicit class RecursivePartialPartialPrOps[Self <: RecursivePartialPartialPr] (val x: Self) extends AnyVal {
    
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
    def setButton(value: RecursivePartial[js.UndefOr[ButtonInformation]]): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setInfo(value: RecursivePartial[js.UndefOr[js.Array[String]]]): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setInfoStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("infoStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoStyle: Self = this.set("infoStyle", js.undefined)
    
    @scala.inline
    def setOnButtonPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onButtonPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnButtonPress: Self = this.set("onButtonPress", js.undefined)
    
    @scala.inline
    def setPrice(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setPricingStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("pricingStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricingStyle: Self = this.set("pricingStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
  }
}
