package typings.react.reactMod

import typings.react.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailedHTMLFactory[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */] extends DOMFactory[P, T] {
  def apply(): DetailedReactHTMLElement[P, T] = js.native
  def apply(children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
  def apply(props: ClassAttributes[T] with P, children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
}

