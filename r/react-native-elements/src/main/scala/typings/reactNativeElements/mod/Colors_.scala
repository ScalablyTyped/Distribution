package typings.reactNativeElements.mod

import typings.reactNativeElements.anon.Android
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Colors_ extends js.Object {
  
  val disabled: String = js.native
  
  val divider: String = js.native
  
  val error: String = js.native
  
  val grey0: String = js.native
  
  val grey1: String = js.native
  
  val grey2: String = js.native
  
  val grey3: String = js.native
  
  val grey4: String = js.native
  
  val grey5: String = js.native
  
  val greyOutline: String = js.native
  
  val platform: Android = js.native
  
  val primary: String = js.native
  
  val searchBg: String = js.native
  
  val secondary: String = js.native
  
  val success: String = js.native
  
  val warning: String = js.native
}
object Colors_ {
  
  @scala.inline
  def apply(
    disabled: String,
    divider: String,
    error: String,
    grey0: String,
    grey1: String,
    grey2: String,
    grey3: String,
    grey4: String,
    grey5: String,
    greyOutline: String,
    platform: Android,
    primary: String,
    searchBg: String,
    secondary: String,
    success: String,
    warning: String
  ): Colors_ = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], grey0 = grey0.asInstanceOf[js.Any], grey1 = grey1.asInstanceOf[js.Any], grey2 = grey2.asInstanceOf[js.Any], grey3 = grey3.asInstanceOf[js.Any], grey4 = grey4.asInstanceOf[js.Any], grey5 = grey5.asInstanceOf[js.Any], greyOutline = greyOutline.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], searchBg = searchBg.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors_]
  }
  
  @scala.inline
  implicit class Colors_Ops[Self <: Colors_] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivider(value: String): Self = this.set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrey0(value: String): Self = this.set("grey0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrey1(value: String): Self = this.set("grey1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrey2(value: String): Self = this.set("grey2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrey3(value: String): Self = this.set("grey3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrey4(value: String): Self = this.set("grey4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrey5(value: String): Self = this.set("grey5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreyOutline(value: String): Self = this.set("greyOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: Android): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary(value: String): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchBg(value: String): Self = this.set("searchBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondary(value: String): Self = this.set("secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: String): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: String): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
}
