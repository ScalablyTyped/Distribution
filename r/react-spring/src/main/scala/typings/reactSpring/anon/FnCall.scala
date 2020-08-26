package typings.reactSpring.anon

import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[T /* <: ReactType[_] */](comp: T): ForwardRefExoticComponent[ComponentPropsWithRef[T]] = js.native
}

