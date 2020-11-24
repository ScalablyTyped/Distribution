package typings.reactNativeWindows.appThemeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHighContrastColors extends js.Object {
  
  var ButtonFaceColor: String = js.native
  
  var ButtonTextColor: String = js.native
  
  var GrayTextColor: String = js.native
  
  var HighlightColor: String = js.native
  
  var HighlightTextColor: String = js.native
  
  var HotlightColor: String = js.native
  
  var WindowColor: String = js.native
  
  var WindowTextColor: String = js.native
}
object IHighContrastColors {
  
  @scala.inline
  def apply(
    ButtonFaceColor: String,
    ButtonTextColor: String,
    GrayTextColor: String,
    HighlightColor: String,
    HighlightTextColor: String,
    HotlightColor: String,
    WindowColor: String,
    WindowTextColor: String
  ): IHighContrastColors = {
    val __obj = js.Dynamic.literal(ButtonFaceColor = ButtonFaceColor.asInstanceOf[js.Any], ButtonTextColor = ButtonTextColor.asInstanceOf[js.Any], GrayTextColor = GrayTextColor.asInstanceOf[js.Any], HighlightColor = HighlightColor.asInstanceOf[js.Any], HighlightTextColor = HighlightTextColor.asInstanceOf[js.Any], HotlightColor = HotlightColor.asInstanceOf[js.Any], WindowColor = WindowColor.asInstanceOf[js.Any], WindowTextColor = WindowTextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHighContrastColors]
  }
  
  @scala.inline
  implicit class IHighContrastColorsOps[Self <: IHighContrastColors] (val x: Self) extends AnyVal {
    
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
    def setButtonFaceColor(value: String): Self = this.set("ButtonFaceColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTextColor(value: String): Self = this.set("ButtonTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrayTextColor(value: String): Self = this.set("GrayTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightColor(value: String): Self = this.set("HighlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightTextColor(value: String): Self = this.set("HighlightTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotlightColor(value: String): Self = this.set("HotlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowColor(value: String): Self = this.set("WindowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTextColor(value: String): Self = this.set("WindowTextColor", value.asInstanceOf[js.Any])
  }
}
