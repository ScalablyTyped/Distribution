package typings.reactPrimitives

import typings.react.mod.ComponentType
import typings.reactNative.mod.Animated.ComponentProps
import typings.reactNative.mod.FlatList
import typings.reactNative.mod.Image
import typings.reactNative.mod.ScrollView
import typings.reactNative.mod.SectionList
import typings.reactNative.mod.Text
import typings.reactNative.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactPrimitivesComponents extends reactPrimitivesProps {
  @scala.inline
  def AnimatedFlatList: ComponentType[AnimatedFlatListProps[ComponentProps[FlatList[js.Any]]]] = typings.reactPrimitives.mod.Animated.FlatList.asInstanceOf[typings.react.mod.ComponentType[
  AnimatedFlatListProps[
    typings.reactNative.mod.Animated.ComponentProps[typings.reactNative.mod.FlatList[js.Any]]
  ]]]
  @scala.inline
  def AnimatedImage: ComponentType[AnimatedImageProps[ComponentProps[Image]]] = typings.reactPrimitives.mod.Animated.Image.asInstanceOf[typings.react.mod.ComponentType[
  AnimatedImageProps[typings.reactNative.mod.Animated.ComponentProps[typings.reactNative.mod.Image]]]]
  @scala.inline
  def AnimatedScrollView: ComponentType[AnimatedScrollViewProps[ComponentProps[ScrollView]]] = typings.reactPrimitives.mod.Animated.ScrollView.asInstanceOf[typings.react.mod.ComponentType[
  AnimatedScrollViewProps[
    typings.reactNative.mod.Animated.ComponentProps[typings.reactNative.mod.ScrollView]
  ]]]
  @scala.inline
  def AnimatedSectionList: ComponentType[AnimatedSectionListProps[ComponentProps[SectionList[js.Any]]]] = typings.reactPrimitives.mod.Animated.SectionList.asInstanceOf[typings.react.mod.ComponentType[
  AnimatedSectionListProps[
    typings.reactNative.mod.Animated.ComponentProps[typings.reactNative.mod.SectionList[js.Any]]
  ]]]
  @scala.inline
  def AnimatedText: ComponentType[AnimatedTextProps[ComponentProps[Text]]] = typings.reactPrimitives.mod.Animated.Text.asInstanceOf[typings.react.mod.ComponentType[
  AnimatedTextProps[typings.reactNative.mod.Animated.ComponentProps[typings.reactNative.mod.Text]]]]
  @scala.inline
  def AnimatedView: ComponentType[AnimatedViewProps[ComponentProps[View]]] = typings.reactPrimitives.mod.Animated.View.asInstanceOf[typings.react.mod.ComponentType[
  AnimatedViewProps[typings.reactNative.mod.Animated.ComponentProps[typings.reactNative.mod.View]]]]
  @scala.inline
  def Image: ComponentType[ImageProps] = js.constructorOf[typings.reactPrimitives.mod.Image].asInstanceOf[typings.react.mod.ComponentType[ImageProps]]
  @scala.inline
  def Text: ComponentType[TextProps] = js.constructorOf[typings.reactPrimitives.mod.Text].asInstanceOf[typings.react.mod.ComponentType[TextProps]]
  @scala.inline
  def Touchable: ComponentType[TouchableProps] = js.constructorOf[typings.reactPrimitives.mod.Touchable].asInstanceOf[typings.react.mod.ComponentType[TouchableProps]]
  @scala.inline
  def View: ComponentType[ViewProps] = js.constructorOf[typings.reactPrimitives.mod.View].asInstanceOf[typings.react.mod.ComponentType[ViewProps]]
}

