package typings.reactNativeSnapCarousel

import typings.react.mod.ComponentType
import typings.reactNativeSnapCarousel.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeSnapCarouselComponents extends reactNativeSnapCarouselProps {
  @scala.inline
  def Pagination: ComponentType[PaginationProps] = js.constructorOf[typings.reactNativeSnapCarousel.mod.Pagination].asInstanceOf[ComponentType[PaginationProps]]
  @scala.inline
  def ParallaxImage: ComponentType[ParallaxImageProps] = js.constructorOf[typings.reactNativeSnapCarousel.mod.ParallaxImage].asInstanceOf[ComponentType[ParallaxImageProps]]
  @scala.inline
  def ReactNativeSnapCarousel[T]: ComponentType[ReactNativeSnapCarouselProps[T]] = js.constructorOf[default[T]].asInstanceOf[ComponentType[ReactNativeSnapCarouselProps[T]]]
}

