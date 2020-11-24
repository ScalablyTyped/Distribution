package typings.reactNavigationStack.stackViewMod

import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationStack.vendorTypesMod.StackCardMode
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typings.reactNavigationStack.vendorTypesMod.StackHeaderMode
import typings.reactNavigationStack.vendorTypesMod.StackNavigationHelpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackNavigationConfig & {  state :react-navigation.react-navigation.NavigationState,   navigation :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackNavigationHelpers,   descriptors :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackDescriptorMap,   screenProps :unknown} */
@js.native
trait Props extends js.Object {
  
  var descriptors: StackDescriptorMap = js.native
  
  /**
    * Whether inactive screens should be detached from the view hierarchy to save memory.
    * Make sure to call `enableScreens` from `react-native-screens` to make it work.
    * Defaults to `true` on Android, depends on the version of `react-native-screens` on iOS.
    */
  var detachInactiveScreens: js.UndefOr[Boolean] = js.native
  
  var headerMode: js.UndefOr[StackHeaderMode] = js.native
  
  /**
    * If `false`, the keyboard will NOT automatically dismiss when navigating to a new screen.
    * Defaults to `true`.
    */
  var keyboardHandlingEnabled: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[StackCardMode] = js.native
  
  var navigation: StackNavigationHelpers = js.native
  
  var screenProps: js.Any = js.native
  
  var state: NavigationState = js.native
}
object Props {
  
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    navigation: StackNavigationHelpers,
    screenProps: js.Any,
    state: NavigationState
  ): Props = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setDescriptors(value: StackDescriptorMap): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: StackNavigationHelpers): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenProps(value: js.Any): Self = this.set("screenProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: NavigationState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachInactiveScreens(value: Boolean): Self = this.set("detachInactiveScreens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetachInactiveScreens: Self = this.set("detachInactiveScreens", js.undefined)
    
    @scala.inline
    def setHeaderMode(value: StackHeaderMode): Self = this.set("headerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderMode: Self = this.set("headerMode", js.undefined)
    
    @scala.inline
    def setKeyboardHandlingEnabled(value: Boolean): Self = this.set("keyboardHandlingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardHandlingEnabled: Self = this.set("keyboardHandlingEnabled", js.undefined)
    
    @scala.inline
    def setMode(value: StackCardMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
