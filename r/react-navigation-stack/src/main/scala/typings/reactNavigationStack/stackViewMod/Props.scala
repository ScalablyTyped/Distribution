package typings.reactNavigationStack.stackViewMod

import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationStack.vendorTypesMod.StackCardMode
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typings.reactNavigationStack.vendorTypesMod.StackHeaderMode
import typings.reactNavigationStack.vendorTypesMod.StackNavigationHelpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackNavigationConfig & {  state  :react-navigation.react-navigation.NavigationState,   navigation  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackNavigationHelpers,   descriptors  :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackDescriptorMap,   screenProps  :unknown} */
trait Props extends js.Object {
  var descriptors: StackDescriptorMap
  var headerMode: js.UndefOr[StackHeaderMode] = js.undefined
  /**
    * If `false`, the keyboard will NOT automatically dismiss when navigating to a new screen.
    * Defaults to `true`.
    */
  var keyboardHandlingEnabled: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[StackCardMode] = js.undefined
  var navigation: StackNavigationHelpers
  var screenProps: js.Any
  var state: NavigationState
}

object Props {
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    navigation: StackNavigationHelpers,
    screenProps: js.Any,
    state: NavigationState,
    headerMode: StackHeaderMode = null,
    keyboardHandlingEnabled: js.UndefOr[Boolean] = js.undefined,
    mode: StackCardMode = null
  ): Props = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (headerMode != null) __obj.updateDynamic("headerMode")(headerMode.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardHandlingEnabled)) __obj.updateDynamic("keyboardHandlingEnabled")(keyboardHandlingEnabled.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

