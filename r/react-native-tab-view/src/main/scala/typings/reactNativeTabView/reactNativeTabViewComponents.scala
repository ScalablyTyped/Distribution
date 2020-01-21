package typings.reactNativeTabView

import typings.react.mod.ComponentType
import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeTabViewComponents extends reactNativeTabViewProps {
  @scala.inline
  def Pager[T /* <: Route */]: ComponentType[PagerProps[T]] = js.constructorOf[typings.reactNativeTabView.pagerMod.default[T]].asInstanceOf[typings.react.mod.ComponentType[PagerProps[T]]]
  @scala.inline
  def SceneView[T /* <: Route */]: ComponentType[SceneViewProps[T]] = js.constructorOf[typings.reactNativeTabView.sceneViewMod.default[T]].asInstanceOf[typings.react.mod.ComponentType[SceneViewProps[T]]]
  @scala.inline
  def TabBar[T /* <: Route */]: ComponentType[TabBarProps[T]] = js.constructorOf[typings.reactNativeTabView.tabBarMod.default[T]].asInstanceOf[typings.react.mod.ComponentType[TabBarProps[T]]]
  @scala.inline
  def TabBarIndicator[T /* <: Route */]: ComponentType[TabBarIndicatorProps[T]] = js.constructorOf[typings.reactNativeTabView.tabBarIndicatorMod.default[T]].asInstanceOf[typings.react.mod.ComponentType[TabBarIndicatorProps[T]]]
  @scala.inline
  def TabBarItem[T /* <: Route */]: ComponentType[TabBarItemProps[T]] = js.constructorOf[typings.reactNativeTabView.tabBarItemMod.default[T]].asInstanceOf[typings.react.mod.ComponentType[TabBarItemProps[T]]]
  @scala.inline
  def TabView[T /* <: Route */]: ComponentType[TabViewProps[T]] = js.constructorOf[typings.reactNativeTabView.tabViewMod.default[T]].asInstanceOf[typings.react.mod.ComponentType[TabViewProps[T]]]
  @scala.inline
  def TouchableItem: ComponentType[TouchableItemProps] = js.constructorOf[typings.reactNativeTabView.touchableItemMod.default].asInstanceOf[typings.react.mod.ComponentType[TouchableItemProps]]
}

