package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rax", "forwardRef")
@js.native
object forwardRef extends js.Object {
  def apply[T, P](Component: RefForwardingComponent[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[T]] = js.native
}

