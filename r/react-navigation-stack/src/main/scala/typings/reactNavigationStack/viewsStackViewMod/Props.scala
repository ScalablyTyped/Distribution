package typings.reactNavigationStack.viewsStackViewMod

import typings.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typings.reactNavigationStack.vendorTypesMod.StackNavigationConfig
import typings.reactNavigationStack.vendorTypesMod.StackNavigationHelpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var descriptors: StackDescriptorMap
  var navigation: StackNavigationHelpers
  var navigationConfig: StackNavigationConfig
  var screenProps: js.Any
}

object Props {
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    navigation: StackNavigationHelpers,
    navigationConfig: StackNavigationConfig,
    screenProps: js.Any
  ): Props = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

