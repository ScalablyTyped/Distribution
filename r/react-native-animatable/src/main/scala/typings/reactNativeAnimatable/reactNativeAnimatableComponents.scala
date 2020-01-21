package typings.reactNativeAnimatable

import typings.react.mod.ComponentType
import typings.reactNative.mod.ImageProperties
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextProperties
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProperties
import typings.reactNative.mod.ViewStyle
import typings.reactNativeAnimatable.mod.AnimatableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeAnimatableComponents extends reactNativeAnimatableProps {
  @scala.inline
  def Image: ComponentType[AnimatableProperties[ImageStyle] with ImageProperties] = js.constructorOf[typings.reactNativeAnimatable.mod.ImageCls].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactNativeAnimatable.mod.AnimatableProperties[typings.reactNative.mod.ImageStyle] with typings.reactNative.mod.ImageProperties]]
  @scala.inline
  def Text: ComponentType[AnimatableProperties[TextStyle] with TextProperties] = js.constructorOf[typings.reactNativeAnimatable.mod.TextCls].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactNativeAnimatable.mod.AnimatableProperties[typings.reactNative.mod.TextStyle] with typings.reactNative.mod.TextProperties]]
  @scala.inline
  def View: ComponentType[AnimatableProperties[ViewStyle] with ViewProperties] = js.constructorOf[typings.reactNativeAnimatable.mod.ViewCls].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactNativeAnimatable.mod.AnimatableProperties[typings.reactNative.mod.ViewStyle] with typings.reactNative.mod.ViewProperties]]
}

