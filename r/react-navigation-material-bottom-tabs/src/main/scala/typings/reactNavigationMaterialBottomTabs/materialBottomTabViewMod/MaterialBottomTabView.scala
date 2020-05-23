package typings.reactNavigationMaterialBottomTabs.materialBottomTabViewMod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNavigationMaterialBottomTabs.anon.Color
import typings.reactNavigationMaterialBottomTabs.anon.RouteKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaterialBottomTabView
  extends Component[Props, js.Object, js.Any] {
  def _getBarStyle(): js.Array[StyleProp[ViewStyle]] = js.native
  def _getColor(hasRoute: RouteKey): js.UndefOr[String] = js.native
  def _getInactiveColor(): js.UndefOr[String] = js.native
  def _getactiveColor(): js.UndefOr[String] = js.native
  def _isVisible(): js.UndefOr[Boolean] = js.native
  def _renderIcon(hasRouteFocusedColor: Color): ReactNode = js.native
}

