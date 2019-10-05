package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react", "forwardRef")
@js.native
object forwardRef extends js.Object {
  def apply[T, P](Component: RefForwardingComponent[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[T]] = js.native
}

