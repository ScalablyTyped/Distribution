package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.center
import typings.reactNative.reactNativeStrings.fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabBarIOSProps extends ViewProps {
  /**
    * Background color of the tab bar
    */
  var barTintColor: js.UndefOr[ColorValue] = js.native
  /**
    * Specifies tab bar item positioning. Available values are:
    * - fill - distributes items across the entire width of the tab bar
    * - center - centers item in the available tab bar space
    * - auto (default) - distributes items dynamically according to the
    * user interface idiom. In a horizontally compact environment (e.g. iPhone 5)
    * this value defaults to `fill`, in a horizontally regular one (e.g. iPad)
    * it defaults to center.
    */
  var itemPositioning: js.UndefOr[fill | center | auto] = js.native
  /**
    * Color of the currently selected tab icon
    */
  var tintColor: js.UndefOr[ColorValue] = js.native
  /**
    * A Boolean value that indicates whether the tab bar is translucent
    */
  var translucent: js.UndefOr[Boolean] = js.native
  /**
    * Color of unselected tab icons. Available since iOS 10.
    */
  var unselectedItemTintColor: js.UndefOr[ColorValue] = js.native
  /**
    * Color of text on unselected tabs
    */
  var unselectedTintColor: js.UndefOr[ColorValue] = js.native
}

object TabBarIOSProps {
  @scala.inline
  def apply(): TabBarIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabBarIOSProps]
  }
  @scala.inline
  implicit class TabBarIOSPropsOps[Self <: TabBarIOSProps] (val x: Self) extends AnyVal {
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
    def setBarTintColor(value: ColorValue): Self = this.set("barTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarTintColor: Self = this.set("barTintColor", js.undefined)
    @scala.inline
    def setItemPositioning(value: fill | center | auto): Self = this.set("itemPositioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemPositioning: Self = this.set("itemPositioning", js.undefined)
    @scala.inline
    def setTintColor(value: ColorValue): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    @scala.inline
    def setTranslucent(value: Boolean): Self = this.set("translucent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslucent: Self = this.set("translucent", js.undefined)
    @scala.inline
    def setUnselectedItemTintColor(value: ColorValue): Self = this.set("unselectedItemTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectedItemTintColor: Self = this.set("unselectedItemTintColor", js.undefined)
    @scala.inline
    def setUnselectedTintColor(value: ColorValue): Self = this.set("unselectedTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectedTintColor: Self = this.set("unselectedTintColor", js.undefined)
  }
  
}

