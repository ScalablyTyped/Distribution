package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailedHTMLFactory[P /* <: HTMLAttributes[T] */, T /* <: reactLib.HTMLElement */] extends DOMFactory[P, T] {
  def apply(): DetailedReactHTMLElement[P, T] = js.native
  def apply(props: ClassAttributes[T] with (P | scala.Null), children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
}

