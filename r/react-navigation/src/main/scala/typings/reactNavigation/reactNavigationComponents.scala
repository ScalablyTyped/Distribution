package typings.reactNavigation

import typings.react.mod.ComponentType
import typings.reactNavigation.mod.Themed.StatusBar
import typings.reactNavigation.mod.Themed.Text
import typings.reactNavigation.mod.Themed.TextInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNavigationComponents extends reactNavigationProps {
  @scala.inline
  def FlatList[ItemT]: ComponentType[FlatListProps[ItemT]] = js.constructorOf[typings.reactNavigation.mod.FlatList[ItemT]].asInstanceOf[ComponentType[FlatListProps[ItemT]]]
  @scala.inline
  def NavigationEvents: ComponentType[NavigationEventsProps] = js.constructorOf[typings.reactNavigation.mod.NavigationEvents].asInstanceOf[ComponentType[NavigationEventsProps]]
  @scala.inline
  def NavigationProvider: ComponentType[NavigationProviderProps] = js.constructorOf[typings.reactNavigation.mod.NavigationProvider].asInstanceOf[ComponentType[NavigationProviderProps]]
  @scala.inline
  def SafeAreaView: ComponentType[SafeAreaViewProps] = js.constructorOf[typings.reactNavigation.mod.SafeAreaView].asInstanceOf[ComponentType[SafeAreaViewProps]]
  @scala.inline
  def SceneView: ComponentType[SceneViewProps] = js.constructorOf[typings.reactNavigation.mod.SceneView].asInstanceOf[ComponentType[SceneViewProps]]
  @scala.inline
  def ScrollView: ComponentType[ScrollViewProps] = js.constructorOf[typings.reactNavigation.mod.ScrollView].asInstanceOf[ComponentType[ScrollViewProps]]
  @scala.inline
  def SectionList[SectionT]: ComponentType[SectionListProps[SectionT]] = js.constructorOf[typings.reactNavigation.mod.SectionList[SectionT]].asInstanceOf[ComponentType[SectionListProps[SectionT]]]
  @scala.inline
  def ThemedStatusBar: ComponentType[ThemedStatusBarProps] = js.constructorOf[StatusBar].asInstanceOf[ComponentType[ThemedStatusBarProps]]
  @scala.inline
  def ThemedText: ComponentType[ThemedTextProps] = js.constructorOf[Text].asInstanceOf[ComponentType[ThemedTextProps]]
  @scala.inline
  def ThemedTextInput: ComponentType[ThemedTextInputProps] = js.constructorOf[TextInput].asInstanceOf[ComponentType[ThemedTextInputProps]]
}

