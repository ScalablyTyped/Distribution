package typings.reactNativeElements.anon

import typings.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<react-native-elements.react-native-elements.Colors> */
@js.native
trait RecursivePartialColors extends js.Object {
  
  var disabled: js.UndefOr[RecursivePartial[String]] = js.native
  
  var divider: js.UndefOr[RecursivePartial[String]] = js.native
  
  var error: js.UndefOr[RecursivePartial[String]] = js.native
  
  var grey0: js.UndefOr[RecursivePartial[String]] = js.native
  
  var grey1: js.UndefOr[RecursivePartial[String]] = js.native
  
  var grey2: js.UndefOr[RecursivePartial[String]] = js.native
  
  var grey3: js.UndefOr[RecursivePartial[String]] = js.native
  
  var grey4: js.UndefOr[RecursivePartial[String]] = js.native
  
  var grey5: js.UndefOr[RecursivePartial[String]] = js.native
  
  var greyOutline: js.UndefOr[RecursivePartial[String]] = js.native
  
  var platform: js.UndefOr[RecursivePartialiosprimar] = js.native
  
  var primary: js.UndefOr[RecursivePartial[String]] = js.native
  
  var searchBg: js.UndefOr[RecursivePartial[String]] = js.native
  
  var secondary: js.UndefOr[RecursivePartial[String]] = js.native
  
  var success: js.UndefOr[RecursivePartial[String]] = js.native
  
  var warning: js.UndefOr[RecursivePartial[String]] = js.native
}
object RecursivePartialColors {
  
  @scala.inline
  def apply(): RecursivePartialColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialColors]
  }
  
  @scala.inline
  implicit class RecursivePartialColorsOps[Self <: RecursivePartialColors] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: RecursivePartial[String]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDivider(value: RecursivePartial[String]): Self = this.set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    
    @scala.inline
    def setError(value: RecursivePartial[String]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setGrey0(value: RecursivePartial[String]): Self = this.set("grey0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrey0: Self = this.set("grey0", js.undefined)
    
    @scala.inline
    def setGrey1(value: RecursivePartial[String]): Self = this.set("grey1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrey1: Self = this.set("grey1", js.undefined)
    
    @scala.inline
    def setGrey2(value: RecursivePartial[String]): Self = this.set("grey2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrey2: Self = this.set("grey2", js.undefined)
    
    @scala.inline
    def setGrey3(value: RecursivePartial[String]): Self = this.set("grey3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrey3: Self = this.set("grey3", js.undefined)
    
    @scala.inline
    def setGrey4(value: RecursivePartial[String]): Self = this.set("grey4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrey4: Self = this.set("grey4", js.undefined)
    
    @scala.inline
    def setGrey5(value: RecursivePartial[String]): Self = this.set("grey5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrey5: Self = this.set("grey5", js.undefined)
    
    @scala.inline
    def setGreyOutline(value: RecursivePartial[String]): Self = this.set("greyOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreyOutline: Self = this.set("greyOutline", js.undefined)
    
    @scala.inline
    def setPlatform(value: RecursivePartialiosprimar): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setPrimary(value: RecursivePartial[String]): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setSearchBg(value: RecursivePartial[String]): Self = this.set("searchBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchBg: Self = this.set("searchBg", js.undefined)
    
    @scala.inline
    def setSecondary(value: RecursivePartial[String]): Self = this.set("secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
    
    @scala.inline
    def setSuccess(value: RecursivePartial[String]): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setWarning(value: RecursivePartial[String]): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
