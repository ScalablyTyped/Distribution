package typings.reactPrimitives

import typings.react.mod.ComponentType
import typings.reactNative.mod.Animated.ComponentProps
import typings.reactPrimitives.mod.Animated.FlatList
import typings.reactPrimitives.mod.Animated.Image
import typings.reactPrimitives.mod.Animated.ScrollView
import typings.reactPrimitives.mod.Animated.SectionList
import typings.reactPrimitives.mod.Animated.Text
import typings.reactPrimitives.mod.Animated.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactPrimitivesComponents extends reactPrimitivesProps {
  @scala.inline
  def AnimatedFlatList: ComponentType[AnimatedFlatListProps[ComponentProps[typings.reactNative.mod.FlatList[js.Any]]]] = FlatList.asInstanceOf[ComponentType[AnimatedFlatListProps[ComponentProps[typings.reactNative.mod.FlatList[js.Any]]]]]
  @scala.inline
  def AnimatedImage: ComponentType[AnimatedImageProps[ComponentProps[typings.reactNative.mod.Image]]] = Image.asInstanceOf[ComponentType[AnimatedImageProps[ComponentProps[typings.reactNative.mod.Image]]]]
  @scala.inline
  def AnimatedScrollView: ComponentType[AnimatedScrollViewProps[ComponentProps[typings.reactNative.mod.ScrollView]]] = ScrollView.asInstanceOf[ComponentType[AnimatedScrollViewProps[ComponentProps[typings.reactNative.mod.ScrollView]]]]
  @scala.inline
  def AnimatedSectionList: ComponentType[
    AnimatedSectionListProps[ComponentProps[typings.reactNative.mod.SectionList[js.Any]]]
  ] = SectionList.asInstanceOf[ComponentType[
    AnimatedSectionListProps[ComponentProps[typings.reactNative.mod.SectionList[js.Any]]]
  ]]
  @scala.inline
  def AnimatedText: ComponentType[AnimatedTextProps[ComponentProps[typings.reactNative.mod.Text]]] = Text.asInstanceOf[ComponentType[AnimatedTextProps[ComponentProps[typings.reactNative.mod.Text]]]]
  @scala.inline
  def AnimatedView: ComponentType[AnimatedViewProps[ComponentProps[typings.reactNative.mod.View]]] = View.asInstanceOf[ComponentType[AnimatedViewProps[ComponentProps[typings.reactNative.mod.View]]]]
  @scala.inline
  def Image: ComponentType[ImageProps] = js.constructorOf[typings.reactPrimitives.mod.Image].asInstanceOf[ComponentType[ImageProps]]
  @scala.inline
  def Text: ComponentType[TextProps] = js.constructorOf[typings.reactPrimitives.mod.Text].asInstanceOf[ComponentType[TextProps]]
  @scala.inline
  def Touchable: ComponentType[TouchableProps] = js.constructorOf[typings.reactPrimitives.mod.Touchable].asInstanceOf[ComponentType[TouchableProps]]
  @scala.inline
  def View: ComponentType[ViewProps] = js.constructorOf[typings.reactPrimitives.mod.View].asInstanceOf[ComponentType[ViewProps]]
}

