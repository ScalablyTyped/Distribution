package typings.reactNativeSnapCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Carousel[T] = typings.react.mod.Component[typings.reactNativeSnapCarousel.mod.CarouselProperties[T], js.Object, js.Any]
  type CarouselProperties[T] = typings.reactNative.mod.ScrollViewProps with typings.reactNativeSnapCarousel.mod.CarouselProps[T] with typings.react.mod.Props[typings.reactNativeSnapCarousel.mod.CarouselStatic[T]]
  type PaginationProperties = typings.reactNativeSnapCarousel.mod.PaginationProps with typings.react.mod.Props[typings.reactNativeSnapCarousel.mod.PaginationStatic]
  type PaginationStatic = typings.react.mod.ComponentClass[
    typings.reactNativeSnapCarousel.mod.PaginationProps, 
    typings.react.mod.ComponentState
  ]
  type ParallaxImageProperties = typings.reactNativeSnapCarousel.mod.ParallaxImageProps with typings.react.mod.Props[typings.reactNativeSnapCarousel.mod.ParallaxImageStatic]
  type ParallaxImageStatic = typings.react.mod.ComponentClass[
    typings.reactNativeSnapCarousel.mod.ParallaxImageProps, 
    typings.react.mod.ComponentState
  ]
}
