package typings.rmcTabs.defaultTabBarNativeMod

import typings.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateType extends js.Object {
  var _containerWidth: Double
  var _leftTabUnderline: Value
  var _tabContainerWidth: Double
  var _widthTabUnderline: Value
}

object StateType {
  @scala.inline
  def apply(
    _containerWidth: Double,
    _leftTabUnderline: Value,
    _tabContainerWidth: Double,
    _widthTabUnderline: Value
  ): StateType = {
    val __obj = js.Dynamic.literal(_containerWidth = _containerWidth.asInstanceOf[js.Any], _leftTabUnderline = _leftTabUnderline.asInstanceOf[js.Any], _tabContainerWidth = _tabContainerWidth.asInstanceOf[js.Any], _widthTabUnderline = _widthTabUnderline.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateType]
  }
}

