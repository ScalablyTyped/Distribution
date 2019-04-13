package typings
package reactDashNativeDashSnapDashCarouselLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashSnapDashCarouselMod {
  type Carousel[T] = reactLib.reactMod.Component[CarouselProperties[T], js.Object, js.Any]
  type CarouselProperties[T] = reactDashNativeLib.reactDashNativeMod.ScrollViewProps with CarouselProps[T] with reactLib.reactMod.Props[CarouselStatic[T]]
  type PaginationProperties = PaginationProps with reactLib.reactMod.Props[PaginationStatic]
  type PaginationStatic = reactLib.reactMod.ComponentClass[PaginationProps, reactLib.reactMod.ComponentState]
  type ParallaxImageProperties = ParallaxImageProps with reactLib.reactMod.Props[ParallaxImageStatic]
  type ParallaxImageStatic = reactLib.reactMod.ComponentClass[ParallaxImageProps, reactLib.reactMod.ComponentState]
}
