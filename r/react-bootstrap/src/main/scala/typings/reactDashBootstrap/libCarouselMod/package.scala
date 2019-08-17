package typings.reactDashBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCarouselMod {
  import typings.react.reactMod.HTMLProps
  import typings.reactDashBootstrap.Anon_ActiveIndex
  import typings.reactDashBootstrap.reactDashBootstrapMod.Omit
  import typings.reactDashBootstrap.reactDashBootstrapStrings.wrap

  type CarouselProps = (Omit[HTMLProps[Carousel], wrap]) with Anon_ActiveIndex
}
