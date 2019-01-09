package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCarouselControlMod {
  type CarouselControl[T] = reactLib.reactMod.Component[CarouselControlProps[T], js.Object, js.Any]
  type CarouselControlProps[T] = reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLElement] with reactstrapLib.Anon_CssModule with T
}
