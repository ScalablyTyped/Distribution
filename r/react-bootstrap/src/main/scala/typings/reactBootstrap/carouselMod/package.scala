package typings.reactBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object carouselMod {
  type CarouselProps = (typings.reactBootstrap.mod.Omit[
    typings.react.mod.HTMLProps[typings.reactBootstrap.carouselMod.Carousel], 
    typings.reactBootstrap.reactBootstrapStrings.wrap
  ]) with typings.reactBootstrap.AnonActiveIndex
}
