package typings.reactNativeTabView

import typings.reactNativeTabView.pagerMod.Props
import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactNativeTabViewProps {
  type PagerProps[T /* <: Route */] = Props[T]
  type SceneViewProps[T /* <: Route */] = typings.reactNativeTabView.sceneViewMod.Props[T]
  type TabBarProps[T /* <: Route */] = typings.reactNativeTabView.tabBarMod.Props[T]
  type TabBarIndicatorProps[T /* <: Route */] = typings.reactNativeTabView.tabBarIndicatorMod.Props[T]
  @scala.inline
  def TabBarItemProps: typings.reactNativeTabView.tabBarItemMod.Props.type = typings.reactNativeTabView.tabBarItemMod.Props
  type TabBarItemProps[T /* <: Route */] = typings.reactNativeTabView.tabBarItemMod.Props[T]
  type TabViewProps[T /* <: Route */] = typings.reactNativeTabView.tabViewMod.Props[T]
  type TouchableItemProps = typings.reactNativeTabView.touchableItemMod.Props
}

