package typings.reactNativeSquareInAppPayments.mod.SQIPCardEntry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates options used to style the iOS native card entry view controller. */
@js.native
trait ThemeIOS extends js.Object {
  
  /** The background color of the card entry view controller. */
  var backgroundColor: js.UndefOr[RGBAColor] = js.native
  
  /** The text color when the text is invalid. */
  var errorColor: js.UndefOr[RGBAColor] = js.native
  
  /** The text field font. */
  var font: js.UndefOr[Font] = js.native
  
  /** The fill color for text fields. */
  var foregroundColor: js.UndefOr[RGBAColor] = js.native
  
  /** The appearance of the keyboard. */
  var keyboardAppearance: js.UndefOr[KeyboardAppearance] = js.native
  
  /** The text color used to display informational messages. */
  var messageColor: js.UndefOr[RGBAColor] = js.native
  
  /** The text field placeholder text color. */
  var placeholderTextColor: js.UndefOr[RGBAColor] = js.native
  
  /** The save button font. */
  var saveButtonFont: js.UndefOr[Font] = js.native
  
  /** The save button text color when enabled. */
  var saveButtonTextColor: js.UndefOr[RGBAColor] = js.native
  
  /** The text of the entry completion button */
  var saveButtonTitle: js.UndefOr[String] = js.native
  
  /** The text field text color. */
  var textColor: js.UndefOr[RGBAColor] = js.native
  
  /** The tint color reflected in the text field cursor and submit button background color when enabled. */
  var tintColor: js.UndefOr[RGBAColor] = js.native
}
object ThemeIOS {
  
  @scala.inline
  def apply(): ThemeIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeIOS]
  }
  
  @scala.inline
  implicit class ThemeIOSOps[Self <: ThemeIOS] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: RGBAColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setErrorColor(value: RGBAColor): Self = this.set("errorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorColor: Self = this.set("errorColor", js.undefined)
    
    @scala.inline
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setForegroundColor(value: RGBAColor): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForegroundColor: Self = this.set("foregroundColor", js.undefined)
    
    @scala.inline
    def setKeyboardAppearance(value: KeyboardAppearance): Self = this.set("keyboardAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardAppearance: Self = this.set("keyboardAppearance", js.undefined)
    
    @scala.inline
    def setMessageColor(value: RGBAColor): Self = this.set("messageColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageColor: Self = this.set("messageColor", js.undefined)
    
    @scala.inline
    def setPlaceholderTextColor(value: RGBAColor): Self = this.set("placeholderTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderTextColor: Self = this.set("placeholderTextColor", js.undefined)
    
    @scala.inline
    def setSaveButtonFont(value: Font): Self = this.set("saveButtonFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveButtonFont: Self = this.set("saveButtonFont", js.undefined)
    
    @scala.inline
    def setSaveButtonTextColor(value: RGBAColor): Self = this.set("saveButtonTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveButtonTextColor: Self = this.set("saveButtonTextColor", js.undefined)
    
    @scala.inline
    def setSaveButtonTitle(value: String): Self = this.set("saveButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveButtonTitle: Self = this.set("saveButtonTitle", js.undefined)
    
    @scala.inline
    def setTextColor(value: RGBAColor): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setTintColor(value: RGBAColor): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
  }
}
