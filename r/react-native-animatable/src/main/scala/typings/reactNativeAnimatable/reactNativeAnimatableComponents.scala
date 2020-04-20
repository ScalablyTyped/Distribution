package typings.reactNativeAnimatable

import typings.react.mod.ComponentType
import typings.reactNative.mod.ImageProperties
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextProperties
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProperties
import typings.reactNative.mod.ViewStyle
import typings.reactNativeAnimatable.mod.AnimatableProperties
import typings.reactNativeAnimatable.mod.ImageCls
import typings.reactNativeAnimatable.mod.TextCls
import typings.reactNativeAnimatable.mod.ViewCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeAnimatableComponents extends reactNativeAnimatableProps {
  @scala.inline
  def Image: ComponentType[AnimatableProperties[ImageStyle] with ImageProperties] = js.constructorOf[ImageCls].asInstanceOf[ComponentType[AnimatableProperties[ImageStyle] with ImageProperties]]
  @scala.inline
  def Text: ComponentType[AnimatableProperties[TextStyle] with TextProperties] = js.constructorOf[TextCls].asInstanceOf[ComponentType[AnimatableProperties[TextStyle] with TextProperties]]
  @scala.inline
  def View: ComponentType[AnimatableProperties[ViewStyle] with ViewProperties] = js.constructorOf[ViewCls].asInstanceOf[ComponentType[AnimatableProperties[ViewStyle] with ViewProperties]]
}

