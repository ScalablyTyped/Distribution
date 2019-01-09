package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCardImgMod {
  type CardImg[T] = reactLib.reactMod.Component[CardImgProps[T], js.Object, js.Any]
  type CardImgProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_Alt with T
}
