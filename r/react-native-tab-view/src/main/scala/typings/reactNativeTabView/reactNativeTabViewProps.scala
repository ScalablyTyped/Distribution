package typings.reactNativeTabView

import typings.reactNativeTabView.pagerMod.Props
import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactNativeTabViewProps {
  @scala.inline
  def PagerProps: Props.type = typings.reactNativeTabView.pagerMod.Props
  type PagerProps[T /* <: Route */] = Props[T]
  @scala.inline
  def SceneViewProps: typings.reactNativeTabView.sceneViewMod.Props.type = typings.reactNativeTabView.sceneViewMod.Props
  type SceneViewProps[T /* <: Route */] = typings.reactNativeTabView.sceneViewMod.Props[T]
  @scala.inline
  def TabBarProps: typings.reactNativeTabView.tabBarMod.Props.type = typings.reactNativeTabView.tabBarMod.Props
  type TabBarProps[T /* <: Route */] = typings.reactNativeTabView.tabBarMod.Props[T]
  @scala.inline
  def TabBarIndicatorProps: typings.reactNativeTabView.tabBarIndicatorMod.Props.type = typings.reactNativeTabView.tabBarIndicatorMod.Props
  type TabBarIndicatorProps[T /* <: Route */] = typings.reactNativeTabView.tabBarIndicatorMod.Props[T]
  @scala.inline
  def TabBarItemProps: typings.reactNativeTabView.tabBarItemMod.Props.type = typings.reactNativeTabView.tabBarItemMod.Props
  type TabBarItemProps[T /* <: Route */] = typings.reactNativeTabView.tabBarItemMod.Props[T]
  @scala.inline
  def TabViewProps: typings.reactNativeTabView.tabViewMod.Props.type = typings.reactNativeTabView.tabViewMod.Props
  type TabViewProps[T /* <: Route */] = typings.reactNativeTabView.tabViewMod.Props[T]
  @scala.inline
  def TouchableItemProps: typings.reactNativeTabView.touchableItemMod.Props.type = typings.reactNativeTabView.touchableItemMod.Props
  type TouchableItemProps = typings.reactNativeTabView.touchableItemMod.Props
}

