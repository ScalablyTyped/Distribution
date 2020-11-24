package typings.reactNativeScreens.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import typings.reactNativeScreens.reactNativeScreensStrings.auto
import typings.reactNativeScreens.reactNativeScreensStrings.dark
import typings.reactNativeScreens.reactNativeScreensStrings.fade
import typings.reactNativeScreens.reactNativeScreensStrings.inverted
import typings.reactNativeScreens.reactNativeScreensStrings.light
import typings.reactNativeScreens.reactNativeScreensStrings.ltr
import typings.reactNativeScreens.reactNativeScreensStrings.none
import typings.reactNativeScreens.reactNativeScreensStrings.rtl
import typings.reactNativeScreens.reactNativeScreensStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenStackHeaderConfigProps extends ViewProps {
  
  /**
    * @description Whether to show the back button with a custom left side of the header.
    */
  var backButtonInCustomView: js.UndefOr[Boolean] = js.native
  
  /**
    * @host (iOS only)
    * @description Allows for controlling the string to be rendered next to back button. By default iOS uses the title of the previous screen.
    */
  var backTitle: js.UndefOr[String] = js.native
  
  /**
    * @host (iOS only)
    * @description Allows for customizing font family to be used for back button title on iOS.
    */
  var backTitleFontFamily: js.UndefOr[String] = js.native
  
  /**
    * @host (iOS only)
    * @description Allows for customizing font size to be used for back button title on iOS.
    */
  var backTitleFontSize: js.UndefOr[Double] = js.native
  
  /**
    * @description Controls the color of the navigation header.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * @host (iOS only)
    * @description Blur effect to be applied to the header. Works with backgroundColor's alpha < 1.
    */
  var blurEffect: js.UndefOr[BlurEffectTypes] = js.native
  
  /**
    * Pass HeaderLeft, HeaderRight and HeaderTitle
    */
  var children: js.UndefOr[ReactNode] = js.native
  
  /**
    * @description Controls the color of items rendered on the header. This includes back icon, back text (iOS only) and title text. If you want the title to have different color use titleColor property.
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    *@description Controls whether the stack should be in rtl or ltr form.
    */
  var direction: js.UndefOr[rtl | ltr] = js.native
  
  /**
    * @description When set to true the header will be hidden while the parent Screen is on the top of the stack. The default value is false.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * @description If set to true the back button will not be rendered as a part of navigation header.
    */
  var hideBackButton: js.UndefOr[Boolean] = js.native
  
  /**
    * @description Boolean that allows for disabling drop shadow under navigation header. The default value is true.
    */
  var hideShadow: js.UndefOr[Boolean] = js.native
  
  /**
    * @host (iOS only)
    * @description When set to true it makes the title display using the large title effect.
    */
  var largeTitle: js.UndefOr[Boolean] = js.native
  
  /**
    *@description Controls the color of the navigation header when the edge of any scrollable content reaches the matching edge of the navigation bar.
    */
  var largeTitleBackgroundColor: js.UndefOr[String] = js.native
  
  /**
    * @host (iOS only)
    * @description Customize the color to be used for the large title. By default uses the titleColor property.
    */
  var largeTitleColor: js.UndefOr[String] = js.native
  
  /**
    * @host (iOS only)
    * @description Customize font family to be used for the large title.
    */
  var largeTitleFontFamily: js.UndefOr[String] = js.native
  
  /**
    * @host (iOS only)
    * @description Customize the size of the font to be used for the large title.
    */
  var largeTitleFontSize: js.UndefOr[Double] = js.native
  
  /**
    * @description Boolean that allows for disabling drop shadow under navigation header when the edge of any scrollable content reaches the matching edge of the navigation bar.
    */
  var largeTitleHideShadow: js.UndefOr[Boolean] = js.native
  
  /**
    * @host (iOS only)
    * @description Sets the status bar animation (similar to the `StatusBar` component). Requires enabling (or deleting) `View controller-based status bar appearance` in your Info.plist file. Defaults to `fade`.
    */
  var statusBarAnimation: js.UndefOr[none | fade | slide] = js.native
  
  /**
    * @host (iOS only)
    * @description When set to true, the status bar for this screen is hidden. Requires enabling (or deleting) `View controller-based status bar appearance` in your Info.plist file. Defaults to `false`.
    */
  var statusBarHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * @host (iOS only)
    * @description Sets the status bar color (similar to the `StatusBar` component). Requires enabling (or deleting) `View controller-based status bar appearance` in your Info.plist file. Defaults to `auto`.
    */
  var statusBarStyle: js.UndefOr[inverted | auto | light | dark] = js.native
  
  /**
    * @description String that representing screen title that will get rendered in the middle section of the header. On iOS the title is centered on the header while on Android it is aligned to the left and placed next to back button (if one is present).
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * @description Allows for setting text color of the title.
    */
  var titleColor: js.UndefOr[String] = js.native
  
  /**
    * @description Customize font family to be used for the title.
    */
  var titleFontFamily: js.UndefOr[String] = js.native
  
  /**
    * @description Customize the size of the font to be used for the title.
    */
  var titleFontSize: js.UndefOr[Double] = js.native
  
  /**
    * @host (Android only)
    * @description A flag to that lets you opt out of insetting the header. You may want to set this to `false` if you use an opaque status bar. Defaults to `true`.
    */
  var topInsetEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * @description When set to true, it makes native navigation bar on iOS semi transparent with blur effect. It is a common way of presenting navigation bar introduced in iOS 11. The default value is false
    */
  var translucent: js.UndefOr[Boolean] = js.native
}
object ScreenStackHeaderConfigProps {
  
  @scala.inline
  def apply(): ScreenStackHeaderConfigProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenStackHeaderConfigProps]
  }
  
  @scala.inline
  implicit class ScreenStackHeaderConfigPropsOps[Self <: ScreenStackHeaderConfigProps] (val x: Self) extends AnyVal {
    
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
    def setBackButtonInCustomView(value: Boolean): Self = this.set("backButtonInCustomView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackButtonInCustomView: Self = this.set("backButtonInCustomView", js.undefined)
    
    @scala.inline
    def setBackTitle(value: String): Self = this.set("backTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackTitle: Self = this.set("backTitle", js.undefined)
    
    @scala.inline
    def setBackTitleFontFamily(value: String): Self = this.set("backTitleFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackTitleFontFamily: Self = this.set("backTitleFontFamily", js.undefined)
    
    @scala.inline
    def setBackTitleFontSize(value: Double): Self = this.set("backTitleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackTitleFontSize: Self = this.set("backTitleFontSize", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBlurEffect(value: BlurEffectTypes): Self = this.set("blurEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurEffect: Self = this.set("blurEffect", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDirection(value: rtl | ltr): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHideBackButton(value: Boolean): Self = this.set("hideBackButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideBackButton: Self = this.set("hideBackButton", js.undefined)
    
    @scala.inline
    def setHideShadow(value: Boolean): Self = this.set("hideShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideShadow: Self = this.set("hideShadow", js.undefined)
    
    @scala.inline
    def setLargeTitle(value: Boolean): Self = this.set("largeTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeTitle: Self = this.set("largeTitle", js.undefined)
    
    @scala.inline
    def setLargeTitleBackgroundColor(value: String): Self = this.set("largeTitleBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeTitleBackgroundColor: Self = this.set("largeTitleBackgroundColor", js.undefined)
    
    @scala.inline
    def setLargeTitleColor(value: String): Self = this.set("largeTitleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeTitleColor: Self = this.set("largeTitleColor", js.undefined)
    
    @scala.inline
    def setLargeTitleFontFamily(value: String): Self = this.set("largeTitleFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeTitleFontFamily: Self = this.set("largeTitleFontFamily", js.undefined)
    
    @scala.inline
    def setLargeTitleFontSize(value: Double): Self = this.set("largeTitleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeTitleFontSize: Self = this.set("largeTitleFontSize", js.undefined)
    
    @scala.inline
    def setLargeTitleHideShadow(value: Boolean): Self = this.set("largeTitleHideShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeTitleHideShadow: Self = this.set("largeTitleHideShadow", js.undefined)
    
    @scala.inline
    def setStatusBarAnimation(value: none | fade | slide): Self = this.set("statusBarAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBarAnimation: Self = this.set("statusBarAnimation", js.undefined)
    
    @scala.inline
    def setStatusBarHidden(value: Boolean): Self = this.set("statusBarHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBarHidden: Self = this.set("statusBarHidden", js.undefined)
    
    @scala.inline
    def setStatusBarStyle(value: inverted | auto | light | dark): Self = this.set("statusBarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBarStyle: Self = this.set("statusBarStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleColor(value: String): Self = this.set("titleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleColor: Self = this.set("titleColor", js.undefined)
    
    @scala.inline
    def setTitleFontFamily(value: String): Self = this.set("titleFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontFamily: Self = this.set("titleFontFamily", js.undefined)
    
    @scala.inline
    def setTitleFontSize(value: Double): Self = this.set("titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontSize: Self = this.set("titleFontSize", js.undefined)
    
    @scala.inline
    def setTopInsetEnabled(value: Boolean): Self = this.set("topInsetEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopInsetEnabled: Self = this.set("topInsetEnabled", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = this.set("translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslucent: Self = this.set("translucent", js.undefined)
  }
}
