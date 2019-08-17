package typings.reactDashNativeDashSnapDashCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashSnapDashCarouselMod {
  import typings.react.reactMod.Component
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.Props
  import typings.reactDashNative.reactDashNativeMod.ScrollViewProps

  type Carousel[T] = Component[CarouselProperties[T], js.Object, js.Any]
  type CarouselProperties[T] = ScrollViewProps with CarouselProps[T] with Props[CarouselStatic[T]]
  type PaginationProperties = PaginationProps with Props[PaginationStatic]
  type PaginationStatic = ComponentClass[PaginationProps, ComponentState]
  type ParallaxImageProperties = ParallaxImageProps with Props[ParallaxImageStatic]
  type ParallaxImageStatic = ComponentClass[ParallaxImageProps, ComponentState]
}
