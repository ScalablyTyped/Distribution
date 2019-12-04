package typings.reactDashNavigationDashMaterialDashBottomDashTabs.libTypescriptSrcViewsMaterialBottomTabViewMod

import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.Anon_Color
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.Anon_RouteAnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaterialBottomTabView
  extends Component[Props, js.Object, js.Any] {
  def _getBarStyle(): js.Array[StyleProp[ViewStyle]] = js.native
  def _getColor(hasRoute: Anon_RouteAnonKey): js.UndefOr[String] = js.native
  def _getInactiveColor(): js.UndefOr[String] = js.native
  def _getactiveColor(): js.UndefOr[String] = js.native
  def _isVisible(): js.UndefOr[Boolean] = js.native
  def _renderIcon(hasRouteFocusedColor: Anon_Color): ReactNode = js.native
}

