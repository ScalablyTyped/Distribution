package typings.reactNavigationStack

import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationStack.vendorTypesMod.StackCardMode
import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typings.reactNavigationStack.vendorTypesMod.StackHeaderMode
import typings.reactNavigationStack.vendorTypesMod.StackNavigationHelpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/views/Stack/StackView.Props> */
trait ReadonlyProps extends js.Object {
  val descriptors: StackDescriptorMap
  val headerMode: js.UndefOr[StackHeaderMode] = js.undefined
  val keyboardHandlingEnabled: js.UndefOr[Boolean] = js.undefined
  val mode: js.UndefOr[StackCardMode] = js.undefined
  val navigation: StackNavigationHelpers
  val screenProps: js.Any
  val state: NavigationState
}

object ReadonlyProps {
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    navigation: StackNavigationHelpers,
    screenProps: js.Any,
    state: NavigationState,
    headerMode: StackHeaderMode = null,
    keyboardHandlingEnabled: js.UndefOr[Boolean] = js.undefined,
    mode: StackCardMode = null
  ): ReadonlyProps = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (headerMode != null) __obj.updateDynamic("headerMode")(headerMode.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardHandlingEnabled)) __obj.updateDynamic("keyboardHandlingEnabled")(keyboardHandlingEnabled.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyProps]
  }
}

