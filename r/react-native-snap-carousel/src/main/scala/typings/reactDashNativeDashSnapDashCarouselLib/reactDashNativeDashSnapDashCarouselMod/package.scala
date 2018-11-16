package typings
package reactDashNativeDashSnapDashCarouselLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashSnapDashCarouselMod {
  type Carousel[T] = reactLib.reactMod.Component[CarouselProperties[T], js.Object, js.Any]
  type CarouselProperties[T] = reactDashNativeLib.reactDashNativeMod.ScrollViewProps with CarouselProps[T] with reactLib.reactMod.ReactNs.Props[CarouselStatic[T]]
  type PaginationProperties = PaginationProps with reactLib.reactMod.ReactNs.Props[PaginationStatic]
  type PaginationStatic = reactLib.reactMod.ReactNs.ComponentClass[PaginationProps, reactLib.reactMod.ReactNs.ComponentState]
  type ParallaxImageProperties = ParallaxImageProps with reactLib.reactMod.ReactNs.Props[ParallaxImageStatic]
  type ParallaxImageStatic = reactLib.reactMod.ReactNs.ComponentClass[ParallaxImageProps, reactLib.reactMod.ReactNs.ComponentState]
}
