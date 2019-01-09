package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCarouselCaptionMod {
  type CarouselCaption[T] = reactLib.reactMod.Component[CarouselCaptionProps[T], js.Object, js.Any]
  type CarouselCaptionProps[T] = reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLElement] with reactstrapLib.Anon_CaptionHeader with T
}
