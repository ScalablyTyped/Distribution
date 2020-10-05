package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorIOSProps extends js.Object {
  /**
    * The default background color of the navigation bar.
    */
  var barTintColor: js.UndefOr[ColorValue] = js.native
  /**
    * NavigatorIOS uses "route" objects to identify child views, their props, and navigation bar configuration.
    * "push" and all the other navigation operations expect routes to be like this
    */
  var initialRoute: Route = js.native
  /**
    * Boolean value that indicates whether the interactive pop gesture is
    * enabled. This is useful for enabling/disabling the back swipe navigation
    * gesture.
    *
    * If this prop is not provided, the default behavior is for the back swipe
    * gesture to be enabled when the navigation bar is shown and disabled when
    * the navigation bar is hidden. Once you've provided the
    * `interactivePopGestureEnabled` prop, you can never restore the default
    * behavior.
    */
  var interactivePopGestureEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The default wrapper style for components in the navigator.
    * A common use case is to set the backgroundColor for every page
    */
  var itemWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * A Boolean value that indicates whether the navigation bar is hidden
    */
  var navigationBarHidden: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value that indicates whether to hide the 1px hairline shadow
    */
  var shadowHidden: js.UndefOr[Boolean] = js.native
  /**
    * NOT IN THE DOC BUT IN THE EXAMPLES
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * The color used for buttons in the navigation bar
    */
  var tintColor: js.UndefOr[ColorValue] = js.native
  /**
    * The text color of the navigation bar title
    */
  var titleTextColor: js.UndefOr[ColorValue] = js.native
  /**
    * A Boolean value that indicates whether the navigation bar is translucent
    */
  var translucent: js.UndefOr[Boolean] = js.native
}

object NavigatorIOSProps {
  @scala.inline
  def apply(initialRoute: Route): NavigatorIOSProps = {
    val __obj = js.Dynamic.literal(initialRoute = initialRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorIOSProps]
  }
  @scala.inline
  implicit class NavigatorIOSPropsOps[Self <: NavigatorIOSProps] (val x: Self) extends AnyVal {
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
    def setInitialRoute(value: Route): Self = this.set("initialRoute", value.asInstanceOf[js.Any])
    @scala.inline
    def setBarTintColor(value: ColorValue): Self = this.set("barTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarTintColor: Self = this.set("barTintColor", js.undefined)
    @scala.inline
    def setInteractivePopGestureEnabled(value: Boolean): Self = this.set("interactivePopGestureEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractivePopGestureEnabled: Self = this.set("interactivePopGestureEnabled", js.undefined)
    @scala.inline
    def setItemWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("itemWrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemWrapperStyle: Self = this.set("itemWrapperStyle", js.undefined)
    @scala.inline
    def setItemWrapperStyleNull: Self = this.set("itemWrapperStyle", null)
    @scala.inline
    def setNavigationBarHidden(value: Boolean): Self = this.set("navigationBarHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationBarHidden: Self = this.set("navigationBarHidden", js.undefined)
    @scala.inline
    def setShadowHidden(value: Boolean): Self = this.set("shadowHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowHidden: Self = this.set("shadowHidden", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setTintColor(value: ColorValue): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    @scala.inline
    def setTitleTextColor(value: ColorValue): Self = this.set("titleTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleTextColor: Self = this.set("titleTextColor", js.undefined)
    @scala.inline
    def setTranslucent(value: Boolean): Self = this.set("translucent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslucent: Self = this.set("translucent", js.undefined)
  }
  
}

