package typings.reactNativeTabNavigator

import typings.react.mod.ComponentType
import typings.reactNativeTabNavigator.mod.TabNavigator.Item
import typings.reactNativeTabNavigator.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeTabNavigatorComponents extends reactNativeTabNavigatorProps {
  @scala.inline
  def Item: ComponentType[ItemProps] = js.constructorOf[typings.reactNativeTabNavigator.mod.default.Item].asInstanceOf[ComponentType[ItemProps]]
  @scala.inline
  def ReactNativeTabNavigator: ComponentType[ReactNativeTabNavigatorProps] = js.constructorOf[default].asInstanceOf[ComponentType[ReactNativeTabNavigatorProps]]
  @scala.inline
  def TabNavigator: ComponentType[TabNavigatorProps] = js.constructorOf[typings.reactNativeTabNavigator.mod.TabNavigator].asInstanceOf[ComponentType[TabNavigatorProps]]
  @scala.inline
  def TabNavigatorItem: ComponentType[TabNavigatorItemProps] = js.constructorOf[Item].asInstanceOf[ComponentType[TabNavigatorItemProps]]
}

