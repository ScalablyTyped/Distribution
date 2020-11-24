package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.anon.Height
import typings.reactNativeNavigation.reactNativeNavigationStrings.always
import typings.reactNativeNavigation.reactNativeNavigationStrings.ifRoom
import typings.reactNativeNavigation.reactNativeNavigationStrings.never
import typings.reactNativeNavigation.reactNativeNavigationStrings.withText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsTopBarButton extends js.Object {
  
  /**
    * Overrides the text that's read by the screen reader when the user interacts with the element
    */
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  /**
    * (Android only) Sets a textual button to be ALL CAPS. default value is true
    */
  var allCaps: js.UndefOr[Boolean] = js.native
  
  /**
    * Set text color
    */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * Set the button as a custom component
    */
  var component: js.UndefOr[Height] = js.native
  
  /**
    * Disable icon tinting
    */
  var disableIconTint: js.UndefOr[Boolean] = js.native
  
  /**
    * Set text color in disabled state
    */
  var disabledColor: js.UndefOr[Color] = js.native
  
  /**
    * Set the button enabled or disabled
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the font family for the button's text
    */
  var fontFamily: js.UndefOr[FontFamily] = js.native
  
  /**
    * Set the font size in dp
    */
  var fontSize: js.UndefOr[Double] = js.native
  
  /**
    * Set the font style for the button's text
    */
  var fontStyle: js.UndefOr[FontStyle] = js.native
  
  /**
    * Specifies font weight. The values 'normal' and 'bold' are supported
    * for most fonts. Not all fonts have a variant for each of the numeric
    * values, in that case the closest one is chosen.
    */
  var fontWeight: js.UndefOr[FontWeight] = js.native
  
  /**
    * Set the button icon
    */
  var icon: js.UndefOr[ImageResource] = js.native
  
  /**
    * Set the button icon insets
    */
  var iconInsets: js.UndefOr[IconInsets] = js.native
  
  /**
    * Button id for reference press event
    */
  var id: String = js.native
  
  /**
    * (Android only) Set showAsAction value
    * @see {@link https://developer.android.com/guide/topics/resources/menu-resource|Android developer guide: Menu resource}
    */
  var showAsAction: js.UndefOr[ifRoom | withText | always | never] = js.native
  
  /**
    * (iOS only) Set the button as an iOS system icon
    */
  var systemItem: js.UndefOr[SystemItemIcon] = js.native
  
  /**
    * Set testID for reference in E2E tests
    */
  var testID: js.UndefOr[String] = js.native
  
  /**
    * Set the button text
    */
  var text: js.UndefOr[String] = js.native
}
object OptionsTopBarButton {
  
  @scala.inline
  def apply(id: String): OptionsTopBarButton = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTopBarButton]
  }
  
  @scala.inline
  implicit class OptionsTopBarButtonOps[Self <: OptionsTopBarButton] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAllCaps(value: Boolean): Self = this.set("allCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllCaps: Self = this.set("allCaps", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setComponent(value: Height): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setDisableIconTint(value: Boolean): Self = this.set("disableIconTint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableIconTint: Self = this.set("disableIconTint", js.undefined)
    
    @scala.inline
    def setDisabledColor(value: Color): Self = this.set("disabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledColor: Self = this.set("disabledColor", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFontFamily(value: FontFamily): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeight): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setIcon(value: ImageResource): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconInsets(value: IconInsets): Self = this.set("iconInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconInsets: Self = this.set("iconInsets", js.undefined)
    
    @scala.inline
    def setShowAsAction(value: ifRoom | withText | always | never): Self = this.set("showAsAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAsAction: Self = this.set("showAsAction", js.undefined)
    
    @scala.inline
    def setSystemItem(value: SystemItemIcon): Self = this.set("systemItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemItem: Self = this.set("systemItem", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
