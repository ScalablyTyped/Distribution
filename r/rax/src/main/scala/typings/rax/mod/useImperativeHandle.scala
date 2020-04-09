package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rax", "useImperativeHandle")
@js.native
object useImperativeHandle extends js.Object {
  // NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
  /**
    * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
    * `ref`. As always, imperative code using refs should be avoided in most cases.
    *
    * `useImperativeHandle` should be used with `Rax.forwardRef`.
    */
  def apply[T, R /* <: T */](ref: js.UndefOr[Ref[T]], init: js.Function0[R]): Unit = js.native
  def apply[T, R /* <: T */](ref: js.UndefOr[Ref[T]], init: js.Function0[R], deps: DependencyList): Unit = js.native
}

